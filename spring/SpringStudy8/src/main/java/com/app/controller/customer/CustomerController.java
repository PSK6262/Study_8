package com.app.controller.customer;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.app.common.ApiCommonCode;
import com.app.common.CommonCode;
import com.app.dto.api.ApiResponse;
import com.app.dto.api.ApiResponseHeader;
import com.app.dto.file.FileInfo;
import com.app.dto.user.User;
import com.app.dto.user.UserDupCheck;
import com.app.dto.user.UserProfileImage;
import com.app.dto.user.UserProfileRequestForm;
import com.app.dto.user.UserValidError;
import com.app.service.file.FileService;
import com.app.service.user.UserService;
import com.app.util.FileManager;
import com.app.util.LoginManager;
import com.app.util.SHA256Encryptor;
import com.app.validator.UserCustomValidator;
import com.app.validator.UserValidator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CustomerController {

	//일반 고객 사용자가 접근하는 관련 서비스 
	
	@Autowired
	UserService userService; 
	//사용자 계정정보 관련 서비스 로직
	
	@Autowired
	FileService fileService;
	
	@GetMapping("/customer/signup")
	public String signup() {
		
		log.info("/customer/signup 경로 접근 확인");
		
		return "/customer/signup";
	}
	
	@PostMapping("/customer/signup") // BindingResult br
	public String signupAction(@Valid @ModelAttribute User user, Model model) { // 유효성 검증 실패시 BindingResult에 담아진다.
		//유효성 검증
//		if(br.hasErrors()) {
//			//true면 뭔가 잘못된게 있다
//			List<ObjectError> errorList = br.getAllErrors();
//			for(ObjectError er : errorList) {
//				System.out.println(er.getObjectName());
//				System.out.println(er.getDefaultMessage());
//				System.out.println(er.getCode());
//				System.out.println(er.getCodes()[0]);
//			}
//			return "/customer/signup";
//		}
		UserValidError userValidError = new UserValidError();
		boolean validResult = UserCustomValidator.validate(user, userValidError);
		if(validResult == false) {
			model.addAttribute(userValidError);
			return "/customer/signup";
		}
		// 사용자 입력값 그대로 저장하지 말고, 암호화된 pw형태로 저장 (hash,SHA256)
		String encPw = null;
		try {
			encPw = SHA256Encryptor.encrypt(user.getPw());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "/customer/signup";
		}
		user.setPw(encPw);
		
		int result = userService.saveCustomerUser(user);
		if(result > 0) return "redirect:/main";
		else return "/customer/signup";
	}
	
	@ResponseBody
	@PostMapping("/customer/checkDupId")
	public String checkDupId(@RequestBody String data) {
		// 클라이언트가 전달한 값 받고 중복인지 아닌지 DB에서 조회 확인
		// 중복 Y , 아니면 N
		System.out.println("/customer/checkDupId");
		System.out.println(data);
		
		log.info("/customer/checkDupId 아이디 중복체크 요청 값 {}",data);
		boolean result = userService.isDuplicatedId(data);
		System.out.println(result);
		
		if(result) {
			return "Y";
		} else {
			return "N";
		}
	}
	
	@ResponseBody
	@PostMapping("/customer/checkDupIdJson")
	public ApiResponse<String> checkDupIdJson(@RequestBody UserDupCheck userDupCheck) {
		
		System.out.println(userDupCheck);
		//System.out.println(data); // 기본 텍스트(String)로 들어오는 경우 추가적인 parsing 필요

		log.info("/customer/checkDupIdJson 아이디 중복체크 요청 값 {}",userDupCheck);
		
		boolean result = userService.isDuplicatedId( userDupCheck.getId() );
		System.out.println(result);
		
		ApiResponse<String> apiResponse = new ApiResponse<>();
		
		// header
		ApiResponseHeader header = new ApiResponseHeader();
		header.setResultCode( ApiCommonCode.API_RESULT_SUCCESS );
		header.setResultMessage( ApiCommonCode.API_RESULT_SUCCESS_MSG);
		apiResponse.setHeader(header);
		
		//body
		if(result) {
			apiResponse.setBody("Y");
		} else {
			apiResponse.setBody("N");
		}
		
		return apiResponse;
	}
	
	@GetMapping("/customer/signin")
	public String signin() {
		return "customer/signin";
	}
	
	@InitBinder("user")
	public void initUserBinder(WebDataBinder binder) {
		UserValidator userValidator = new UserValidator();
		binder.setValidator(userValidator);
	}
	
	@PostMapping("/customer/signin")
	public String signinAction(User user, HttpSession session) {
		user.setUserType( CommonCode.USER_USERTYPE_CUSTOMER );
		User loginUser = userService.checkUserLogin(user);
		if(loginUser ==  null) { // 실패
			System.out.println("로그인 실패");
			return "customer/signin";
		} else { // 성공
			System.out.println("로그인 성공");
			System.out.println(loginUser);
			//session.setAttribute("loginUserId", loginUser.getId());
			LoginManager.setSessionLoginUserId(session, loginUser.getId());
			
			return "redirect:/customer/mypage";
		}
	}
	
	@GetMapping("/customer/mypage")
	public String mypage(HttpSession session , Model model) {
		// 로그인 되어있는 사용자의 정보 표시
		// session -> loginUserId
				
		if(session.getAttribute("loginUserId") != null) {
			//String loginUserId = session.getAttribute("loginUserId").toString();
			String loginUserId = LoginManager.getLoginUserId(session);
			User user = userService.findUserById(loginUserId);
			model.addAttribute("user", user);
			
			UserProfileImage userProfileImage = userService.findUserProfileImageById(loginUserId);
			if(userProfileImage != null) { // 등록됨
				FileInfo fileInfo = fileService.findFileInfoByFileName(userProfileImage.getFileName());
				System.out.println(fileInfo);
				model.addAttribute("fileInfo",fileInfo);
			}
			System.out.println("mypage");
			return "customer/mypage";
		}
		// 로그인 X
		return "redirect:/customer/signin";
	}
	
	@GetMapping("/customer/signout")
	public String signout(HttpSession session) {
		//session.invalidate();
		LoginManager.logout(session);
		
		return "redirect:/main";
	}
	
	@GetMapping("/customer/modifyPw")
	public String modifyPw(HttpSession session, Model model) {
		if(!LoginManager.isLogin(session)) {
			System.out.println("login 정보 없음");
			return "redirect:/main";
		}
		String userId = LoginManager.getLoginUserId(session);
		model.addAttribute("userId",userId);
		
		return "/customer/modifyPw";
	}
	
	@PostMapping("/customer/modifyPw")
	public String modifyPwAction(HttpServletRequest request) {
		String password = request.getParameter("pw");
		System.out.println(password);
		User user = userService.findUserById(LoginManager.getLoginUserId(request));
		try {
			user.setPw(SHA256Encryptor.encrypt(password));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "redirect:/customer/modifyPw";
		}
		
		int result = userService.modifyPassword(user);
		
		if(result < 0 ) {
			System.out.println("오류 발생, 재시도 해주세요");
			return "redirect:/customer/modifyPw";
		}
		
		System.out.println("비밀번호 : " +password + "로 변경 완료");
		System.out.println(user);
		LoginManager.logout(request);
		System.out.println("다시 로그인 해주세요");
		
		return "redirect:/customer/signin";
	}
	
	@PostMapping("/customer/profile")
	public String profileAction(HttpServletRequest request, MultipartRequest multipartRequest) {
		System.out.println( request.getParameter("id"));
		System.out.println( request.getParameter("name"));
		
		MultipartFile file = multipartRequest.getFile("profileImage");
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.isEmpty());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		
		return "redirect:/customer/mypage";
	}
	
	@PostMapping("/customer/profiledto")
	public String profiledtoAction(UserProfileRequestForm userProfileRequestForm) {
		System.out.println( userProfileRequestForm.getId());
		System.out.println( userProfileRequestForm.getName());
		
		//dto에 담음
		MultipartFile file = userProfileRequestForm.getProfileImage();
		
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.isEmpty());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		
		// 첨부파일 처리
		
		// 파일명 겹치면 문제됨 -> DB로해결
//		try {
//			file.transferTo( new File("d:/fileStorage/" + file.getOriginalFilename()));
//		} catch (IllegalStateException | IOException e) {
//			e.printStackTrace();
//		}
		
		//첨부파일 처리 FileManage 유틸 활용
		FileInfo fileInfo = null;
		try {
			fileInfo= FileManager.storeFile(file);
			System.out.println(fileInfo);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
			log.warn(e.getMessage());
		}
		// DB저장
		int result = fileService.saveFileInfo(fileInfo);
		
		if(result < 0) { // 저장 X
			System.out.println("파일 db에 추가중 오류발생");
			return "redirect:/customer/mypage";
		}
		// 저장 O
		System.out.println("DB에 저장 완료");
		// DB연결
		
		UserProfileImage userProfileImage = new UserProfileImage();
		userProfileImage.setId(userProfileRequestForm.getId());
		userProfileImage.setFileName(fileInfo.getFileName());
		int result2 = userService.saveUserProfileImage(userProfileImage);
		
		if( result2 < 0) { // 실패
			System.out.println("프로필 사진 변경중 오류발생");
			return "redirect:/customer/mypage";
		}
		
		System.out.println("프로필 사진 변경 완료");
		
		return "redirect:/customer/mypage";
	}
}

package com.app.controller.customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.ApiCommonCode;
import com.app.common.CommonCode;
import com.app.dto.api.ApiResponse;
import com.app.dto.api.ApiResponseHeader;
import com.app.dto.user.User;
import com.app.dto.user.UserDupCheck;
import com.app.service.user.UserService;
import com.app.util.LoginManager;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CustomerController {

	//일반 고객 사용자가 접근하는 관련 서비스 
	
	@Autowired
	UserService userService; 
	//사용자 계정정보 관련 서비스 로직
	
	@GetMapping("/customer/signup")
	public String signup() {
		
		log.info("/customer/signup 경로 접근 확인");
		
		return "/customer/signup";
	}
	
	@PostMapping("/customer/signup")
	public String signup(User user) {
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
	
	@PostMapping("/customer/signin")
	public String signinAction(User user, HttpSession session) {
		System.out.println("로그인 시 입력한 값");
		System.out.println(user);
		
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
		user.setPw(password);
		
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
}

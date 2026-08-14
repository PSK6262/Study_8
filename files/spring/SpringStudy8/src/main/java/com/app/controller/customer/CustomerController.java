package com.app.controller.customer;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.common.CommonCode;
import com.app.dto.user.User;
import com.app.service.user.UserService;

@Controller
public class CustomerController {

	//일반 고객 사용자가 접근하는 관련 서비스 
	
	@Autowired
	UserService userService; 
	//사용자 계정정보 관련 서비스 로직
	
	@GetMapping("/customer/signup")
	public String signup() {
		return "/customer/signup";
	}
	
	@PostMapping("/customer/signup")
	public String signup(User user) {
		int result = userService.saveCustomerUser(user);
		if(result > 0) return "redirect:/main";
		else return "/customer/signup";
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
			session.setAttribute("loginUserId", loginUser);
			return "redirect:/customer/mypage";
		}
	}
	
	@GetMapping("/customer/mypage")
	public String mypage(HttpSession session , Model model) {
		// 로그인 되어있는 사용자의 정보 표시
		// session -> loginUserId
		
		if(session.getAttribute("loginUserId") != null) {
			String loginUserId = session.getAttribute("loginUserId").toString();
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
		session.invalidate();
		return "redirect:/main";
	}
}

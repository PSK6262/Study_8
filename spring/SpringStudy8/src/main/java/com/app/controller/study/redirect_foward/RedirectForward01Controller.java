package com.app.controller.study.redirect_foward;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/re")
public class RedirectForward01Controller {
	@GetMapping("/re1")
	public String re1() {
		return "re/re1";
	}
	
	// localhost:8080/re/re2?msg=abc
	@GetMapping("/re2")
	public String re2(HttpServletRequest request) {
		System.out.println(request.getParameter("msg"));
		
		request.setAttribute("msg", request.getParameter("msg"));
		
		return "re/re2";
	}
	// 3으로 받지만 2로 redirect
	@GetMapping("/re3")
	public String re3(HttpServletRequest request) {
		System.out.println(request.getParameter("msg"));
		
		request.setAttribute("msg", request.getParameter("msg"));
		
		return "re/re2";
	}
	@GetMapping("/re4")
	public String re4(HttpServletRequest request) {
		System.out.println(request.getParameter("msg"));
		
		request.setAttribute("msg", request.getParameter("msg"));
		
		return "re/re4"; // 요청 -> 응답 (re4 끝) // 별개의 요청 -> 응답 (re2 끝) 
	}
	@GetMapping("/re5")
	public String re5(HttpServletRequest request) {
		System.out.println(request.getParameter("msg"));
		
		request.setAttribute("msg", request.getParameter("msg"));
		
		return "redirect:/re/re2"; // 경로를 return, View 이름을 return하는것이 아니다
		// return view -> /WEB-INF/views/ ....
		// return redirect -> localhost:8080/re/re2 .. 
	}
	@GetMapping("/re6")
	public String re6(HttpServletRequest request) {
		System.out.println(request.getParameter("msg"));
		request.setAttribute("msg", request.getParameter("msg"));
		
		// server에서 바로 forward 처리 // 사용자한테 response 이후 request하는것이 아니다.
		// server에서 forward 확인후 바로 re/re2로 return
		return "forward:/re/re2";
		// redirect 처럼 주소로 연결
	}
	
	@GetMapping("/re7")
	public String re7(HttpServletRequest request , RedirectAttributes ra) {
		
		System.out.println("/re7");
		System.out.println(request.getParameter("msg"));
		request.setAttribute("msg", request.getParameter("msg"));
		// 1. 직접적으로 redirect
		// return "redirect:/re/re2" + request.getParameter("msg");
		// 2. RedirectAttributes , redirect시 경로 뒤에 알아서 추가해준다.
		// ra.addAttribute("msg","too_hot");
		// ra.addAttribute("status", "hungry");
		// redirect 를 요청받은 측에서도 경로에 포함된 parameter 인식
		// 3. addFlashAttribute 주소에는 표시 X
		// 화면에서 확인할 수 있도록 전달됨
		// request.getParameter()로는 확인 X , model에 저장
		ra.addFlashAttribute("msg","flashHello");
		return "redirect:/re/re2";
	}
}

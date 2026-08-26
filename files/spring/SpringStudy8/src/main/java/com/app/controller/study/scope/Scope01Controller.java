package com.app.controller.study.scope;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Scope01Controller {
	
	@GetMapping("/scope1")
	public String scope1(Model model) {
		model.addAttribute("msg1", "model에 추가한것");
		model.addAttribute("msg2", "request scope에 추가한것");
		return "scope/scope1";
	}
	@GetMapping("/scope2")
	public String scope2(HttpServletRequest request) {
		// request scope
		request.setAttribute("requestMsg","request scope msg");
		// session scope
		HttpSession session = request.getSession();
		session.setAttribute("sessionMsg", "session scope msg");
		
		ServletContext app = request.getServletContext();
		app.setAttribute("appMsg","application scope msg");
		
		return "scope/scope2";
	}
	
	@GetMapping("/scope3")
	public String scope3() {
		return "scope/scope3";
	}
	
	@GetMapping("/scope4")
	public String scope4(HttpSession session) {
		session.setAttribute("newMsg", "session 매개변수로 set");
		session.removeAttribute("sessionMsg");
		session.invalidate(); // 세션 초기화 - (session scope)
		
		return "scope/scope4";
	}
}

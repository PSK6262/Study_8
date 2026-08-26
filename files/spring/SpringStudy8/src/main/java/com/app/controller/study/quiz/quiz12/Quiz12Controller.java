package com.app.controller.study.quiz.quiz12;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz12")
public class Quiz12Controller {
	
	@GetMapping("/login")
	public String login() {
		return "quiz/quiz12/login";
	}
	
	@PostMapping("/login")
	public String login(HttpServletRequest request) {

		HttpSession session = request.getSession();
		session.setAttribute("loginId", request.getParameter("id"));
		session.setAttribute("count", 0);
		
		return "redirect:count";
	}
	
	@RequestMapping("/count")
	public String count(Model model , HttpServletRequest request , HttpServletResponse response){
		HttpSession session = request.getSession();
		session.setAttribute("count", (int)session.getAttribute("count")+1);
		request.setAttribute("id", session.getAttribute("loginId"));
		request.setAttribute("count", session.getAttribute("count"));
		
		return "quiz/quiz12/count";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.invalidate();
		return "quiz/quiz12/logout";
	}
}

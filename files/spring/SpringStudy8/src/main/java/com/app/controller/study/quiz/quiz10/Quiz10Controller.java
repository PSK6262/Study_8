package com.app.controller.study.quiz.quiz10;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz10")
public class Quiz10Controller {
	
	@RequestMapping("/A")
	public String a(HttpServletRequest request) {
		request.setAttribute("msg1", "FromA");
		request.setAttribute("msg2", "OriginalA");
		return "quiz/quiz10/A";
	}
	@RequestMapping("/B")
	public String b(HttpServletRequest request) {
		request.setAttribute("msg1", "FromB");
		request.setAttribute("msg2", "OriginalB");
		HttpSession session = request.getSession();
		session.setAttribute("msgOptional", "FromB");
		return "quiz/quiz10/B";
	}
}

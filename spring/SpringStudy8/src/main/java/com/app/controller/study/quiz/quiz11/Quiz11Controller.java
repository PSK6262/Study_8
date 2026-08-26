package com.app.controller.study.quiz.quiz11;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/quiz11")
public class Quiz11Controller {
	
	@RequestMapping("/first")
	public String first(Model model , HttpSession session) {
		if(session.getAttribute("accessUrl") == null) {
			model.addAttribute("accessUrl","/first");
		} else {
			model.addAttribute("accessUrl",session.getAttribute("accessUrl"));
			session.removeAttribute("accessUrl");
		}
		return "quiz/quiz11/targetPage";
//      내가 푼 방식 
//		model.addAttribute("accessUrl", "/"+url);
//		ra.addFlashAttribute("type","url");
//		return "quiz/quiz11/targetPage";
	}

	@RequestMapping("/firsthide1")
	public String firstHide1(Model model) {
		model.addAttribute("accessUrl","/firsthide1");
		return "redirect:/quiz11/targetPage";
	}
	@RequestMapping("/firsthide2")
	public String firstHide2(Model model) {
		model.addAttribute("accessUrl","/first");
		return "redirect:/quiz11/first";
	}
	
	@RequestMapping("/firsthide3")
	public String firstHide3(HttpSession session , Model model) {
		session.setAttribute("accessUrl", "/firsthide3");
		
//		session.setAttribute("fromHide3", "hide3");
//		ra.addFlashAttribute("type","redirect");
		return"redirect:/quiz11/first";
	}
}
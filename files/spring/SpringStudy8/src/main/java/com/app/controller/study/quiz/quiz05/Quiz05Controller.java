package com.app.controller.study.quiz.quiz05;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.controller.study.quiz.quiz03.TempProduct;

@Controller
@RequestMapping("/quiz05")
public class Quiz05Controller {
	
	// localhost:8080/quiz05/pathA
	@RequestMapping("/pathA")
	public String pathA() {	
		return "/quiz/quiz05/page_A";
	}
	// localhost:8080/quiz05/pathB
	@RequestMapping("/pathB")
	public String pathB() {
		return "/quiz/quiz05/page_B";
	}
	// localhost:8080/quiz05/pathA
	@RequestMapping("/pathCommon/{item}")
	public String pathCommon(@PathVariable String item) {
		if("A".equals(item)) {
			return "/quiz/quiz05/page_A";
		} else if("B".equals(item)) {
			return "/quiz/quiz05/page_B";
		} else {
			return null;
		}
	}
}

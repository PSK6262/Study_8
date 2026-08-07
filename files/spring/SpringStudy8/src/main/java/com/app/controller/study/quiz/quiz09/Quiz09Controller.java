package com.app.controller.study.quiz.quiz09;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz09")
public class Quiz09Controller {

	@GetMapping("/temp")
	public String temp() {
		
		return "temp";
	}
}

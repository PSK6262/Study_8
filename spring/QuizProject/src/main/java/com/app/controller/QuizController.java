package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class QuizController {

	@GetMapping("/main")
	public String main() {
		return "main";
	}
	@GetMapping("/product")
	public String product() {
		return "product";
	}
	@GetMapping("/mypage")
	public String mypage() {
		return "mypage";
	}
}
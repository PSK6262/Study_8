package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//annotation
@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		
		
		//servlet-context의 ViewResolver 속성으로 인해서 경로 prefix suffix를 붙여준다.
		// /WEB-INF/views/home.jsp로 알아서 출력됨.
		//return "home";
		return "mainpage";
	}
}

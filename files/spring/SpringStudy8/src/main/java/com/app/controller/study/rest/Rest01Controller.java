package com.app.controller.study.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rest01Controller {
	
	@GetMapping("/rest/rest01")
	public String rest01() {
		return "rest/rest01";
	}
	
	//responsebody는 , 그 자체가 body가 된다..
	// return의 내용이 그대로 body로 들어감
	@ResponseBody
	@GetMapping("/rest/rest02")
	public String rest02() {
		return "rest/rest02";
	}
	
	@ResponseBody
	@GetMapping("/rest/rest03")
	public String rest03() {
		return "<h1> h1 rest03 </h1>";
	}
}

package com.app.controller.study.request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * 컴포넌트 등록 (컨트롤러)
 *  - 스프링이 내부에 객체를 생성해서 알아서 관리
 *  (Annotation 추가 + servlet-context.xml 컴포넌트 스캔 설정시 , base-package 하위경로)
 * */

@Controller
public class Request01Controller {
	
	@RequestMapping("/url1")
	public String url1() {
		return "url1";
	}
	@RequestMapping("/url2")
	public String url2() {
		return "home";
	}
	
	@RequestMapping("/url3")
	public String url3() { // view 없음.
		return "url3";
	}
	
	@RequestMapping("/url4")
	public String url4() {
		return "/req/url4";
	}
	
	// HTTP
	// GET POST | DELETE PUT PATCH
	// GET 조회 / 내용 보임
	// POST 저장 / 내용 안보임
	// localhost:8080/url4 <- GET
	
	// GET POST 요청 구분
	@RequestMapping(value="/url5", method = RequestMethod.GET)
	public String url5() {
		return "req/url4";
	}

	// localhost:8080/url6로는 안된다.
	@RequestMapping(value="/url6", method = RequestMethod.POST)
	public String url6() {
		return "req/url4";
	}	
	@GetMapping("/url7")
	public String url7() {
		return "req/url4";
	}
	@PostMapping("/url8")
	public String url8() {
		return "req/url4";
	}
	@GetMapping("/req/main")
	public String main() {
		return "req/main";
	}
}

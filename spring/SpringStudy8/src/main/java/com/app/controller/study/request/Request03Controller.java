package com.app.controller.study.request;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.study.request.Product;

@Controller
@RequestMapping("/request03")
public class Request03Controller {
	//localhost:8080/request03/param1?msg=hi&page=1&level=5
	
	@GetMapping("/param1")
	public String param1(HttpServletRequest request) {
		System.out.println("/request03/param1");
		System.out.println(request.getParameter("msg"));
		System.out.println(request.getParameter("page"));
		System.out.println(request.getParameter("level"));
		return "req/param/param1";
	}
	
	// localhost:8080/request03/param2?name=abc&count=123
	@PostMapping("/param2")
	public String param2(HttpServletRequest request) {
		System.out.println("/request03/param2");
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("count"));
		return "req/param/param2";
	}
	
	// localhost:8080/request03/param3?p1=10&p2=20&p3=30
	@GetMapping("/param3")
	public String param3(HttpServletRequest request) {
		System.out.println("/request03/param3");
		System.out.println(request.getParameter("p1"));
		System.out.println(request.getParameter("p2"));
		System.out.println(request.getParameter("p3"));
		//localhost:8080/request03/param3?p1=10&p2=20&p3=30&p3=40 일 시
		String[] p3Values = request.getParameterValues("p3");
		for(String s : p3Values) {
			System.out.println(s);
		}
		
		return "req/param/param2";
	}
	
	@RequestMapping("/param4")
	public String param4(@RequestParam String p1, @RequestParam String p2) {
		System.out.println("/request03/param4");
		System.out.println(p1);
		System.out.println(p2);
		return "req/param/param2";
	}
	
	@RequestMapping("/param5")
	public String param5(@RequestParam String p1, @RequestParam(required = false) String p2) {
		// (required = false) => optional parameter //  
		System.out.println("/request03/param5");
		System.out.println(p1);
		System.out.println(p2);
		return "req/param/param2";
	}
	
	@RequestMapping("/param6")
	public String param6(@RequestParam String p1
								  , @RequestParam(required = false , defaultValue = "p2Default") String p2) {
		// defaultValue // 기본값
		System.out.println("/request03/param6");
		System.out.println(p1);
		System.out.println(p2);
		return "req/param/param2";
	}
	
	@RequestMapping("/param7")
	public String param7(@RequestParam Map<String, String> paramMap) {
		// Map => Key-Value
		// localhost:8080/request03/param7?p1=10&p2=20&count=9999
		
		System.out.println("/param7");
		System.out.println(paramMap.get("p1"));
		System.out.println(paramMap.get("p2"));
		System.out.println(paramMap.get("count"));
		System.out.println("------");
		for(String s : paramMap.keySet()) {
			System.out.println(s + " : " +paramMap.get(s));
		}
		return "req/param/param2";
	}
	
	// GET  조회/읽기 -> 데이터 조회
	// POST 쓰기/저장 -> 데이터 전달
	
	@GetMapping("/param8")
	public String param8() {
		System.out.println("param8요청 [GET] -> 화면전달");
		return "req/param/param8";
	}
	@PostMapping("/param8")
	public String param8(@ModelAttribute Product product) {		
		//DTO 객체로 전달받기 Getter, Setter 필요
		System.out.println(product);
		// ex) ProductRequestForm으로 전달받고 
		// Product 객체는 따로 DB저장, PRF는 데이터 검증용으로 사용 가능
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		
		return "req/param/param8after";
	}
	
	// localhost:8080/request03/param9/1234
	@RequestMapping("/param9/{itemId}")
	public String param9(@PathVariable String itemId) {
		System.out.println("/request03/param9/{itemId}");
		System.out.println(itemId);
		
		return "req/param/param2";
	}
}

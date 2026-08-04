package com.app.controller.study.viewdata;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.request.Product;

@Controller
public class viewData01Controller {
	/*
	 * Client -> request -> Server <-> DB 
	 * 
	 */
	@GetMapping("/viewData1")
	public String viewData1(HttpServletRequest request) {
		
		// localhost:8080/viewData1?p1=abc
		
		//System.out.println(request.getParameter("p1"));
		
		request.setAttribute("store", "맘스터치");
		request.setAttribute("menu", "싸이버거");
		return "viewData/viewData1";
	}
	
	@GetMapping("/viewData2")
	public String viewData2(Model model) {
		
		System.out.println("/viewData2 요청");
		model.addAttribute("store","달식당");
		model.addAttribute("menu","달돈까스");
		
		return "viewData/viewData1";
	}
	
	@GetMapping("/viewData3")
	public ModelAndView viewData3() {
		System.out.println("/viewData3 요청");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/viewData/viewData1");
		mav.addObject("store", "김밥천국");
		mav.addObject("menu", "참치김밥");
		return mav;
	}
	
	@GetMapping("/viewData4")
	public ModelAndView viewData4(ModelAndView mav) {
		System.out.println("/viewData4 요청");
		
		mav.setViewName("/viewData/viewData1");
		mav.addObject("store", "김밥천국");
		mav.addObject("menu", "돌솥비빔밥");
		return mav;
	}

	@GetMapping("/viewData5")
	public String viewData5(Model model) { // model은 파라미터 전달 X
		System.out.println("/viewData5 요청");

		model.addAttribute("store","달식당");
		model.addAttribute("menu","김치우동");
		
		Product product = new Product();
		product.setId("상품ID");
		product.setName("상품Name");
		product.setPrice(10000);
		
		model.addAttribute("product",product);
		
		return "viewData/viewData5";
	}
	
	@GetMapping("/viewData6")
	public String viewData6(HttpServletRequest request) { // 파라미터 전달  + view 데이터 전달
		System.out.println("/viewData6 요청");
		//localhost:8080/viewData6?search=음료
		String search = request.getParameter("search");

		request.setAttribute("store", "오늘카페");
		request.setAttribute("menu", "다양한음료");
		
		if(search.equals("커피")) {
			Product p = new Product();
			p.setId("coffee");
			p.setName("아메리카노");
			p.setPrice(4000);
			
			request.setAttribute("product", p);
		} else {
			Product p = new Product();
			p.setId("tea");
			p.setName("아이스티");
			p.setPrice(4800);
			
			request.setAttribute("product", p);
		}
		return "viewData/viewData5";
	}
	
	@GetMapping("/viewData7")
	public String viewData7(@RequestParam(required = false) String search, Model model) {
		System.out.println("/viewData7 요청");

		model.addAttribute("store", "오늘카페");
		model.addAttribute("menu", "다양한음료");
		
		if(search.equals("커피")) {
			Product p = new Product();
			p.setId("coffee");
			p.setName("카페라떼");
			p.setPrice(4000);

			model.addAttribute("product", p);
		} else {
			Product p = new Product();
			p.setId("tea");
			p.setName("아이스티");
			p.setPrice(4800);

			model.addAttribute("product", p);
		}
		return "viewData/viewData5";
	}
}

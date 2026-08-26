package com.app.controller.study.quiz.quiz03;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.request.Product;

@Controller
@RequestMapping("/quiz03")
public class Quiz03Controller {
	// localhost:8080/quiz03/request1-x?item=americano&type=coffee

	@RequestMapping("/request1-1")
	public String request1_1(HttpServletRequest request){
		System.out.println(request.getParameter("item"));
		System.out.println(request.getParameter("type"));
		return "/quiz/quiz03/request";
	}
	
	@RequestMapping("/request1-2")
	public String request1_2(@RequestParam String item , @RequestParam String type){
		System.out.println(item);
		System.out.println(type);
		return "/quiz/quiz03/request";
	}
	
	@RequestMapping("/request1-3")
	public String request1_3(@RequestParam Map<String, String> paramMap){
		for(String s : paramMap.keySet())	System.out.println(paramMap.get(s));
		return "/quiz/quiz03/request";
	}
	
	@RequestMapping("/request1-4")
	public String request1_4(@ModelAttribute TempProduct tempProduct){
		System.out.println(tempProduct.getItem());
		System.out.println(tempProduct.getType());
		return "/quiz/quiz03/request";
	}
	
	@RequestMapping("/sendDTO")
	public String sendDTO() {
		return "/quiz/quiz03/sendDTO";
	}
	
	@RequestMapping("/viewData1-1")
	public String viewData1_1(HttpServletRequest request) {
		request.setAttribute("item", "아메리카노");
		request.setAttribute("type", "커피");
		return "/quiz/quiz03/viewData1";
	}
	@RequestMapping("/viewData1-2")
	public String viewData1_2(Model model) {
		model.addAttribute("item", "카페라떼");
		model.addAttribute("type", "커피");
		return "/quiz/quiz03/viewData1";
	}
	@RequestMapping("/viewData1-3")
	public ModelAndView viewData1_3() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/quiz/quiz03/viewData1");
		mav.addObject("item","오렌지주스");
		mav.addObject("type","주스");
		return mav;
	}
	@RequestMapping("/viewData1-4")
	public String viewData1_4(Model model) {

		model.addAttribute("item", "콜라");
		model.addAttribute("type", "탄산");
		
		TempProduct tProduct = new TempProduct();
		tProduct.setItem("콜라");
		tProduct.setType("탄산");
		model.addAttribute("drinkItem", tProduct);
		
		return "/quiz/quiz03/viewData2";
	}
}

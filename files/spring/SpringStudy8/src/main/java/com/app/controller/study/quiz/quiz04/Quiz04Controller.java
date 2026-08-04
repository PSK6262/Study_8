package com.app.controller.study.quiz.quiz04;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.controller.study.quiz.quiz03.TempProduct;

@Controller
@RequestMapping("/quiz04")
public class Quiz04Controller {
	// localhost:8080/quiz04/request1-1?category=100&product=4000
	@RequestMapping("/request1-1")
	public String request1_1(HttpServletRequest request) {
		System.out.println(request.getParameter("category"));
		System.out.println(request.getParameter("product"));
		return "/quiz/quiz04/request";
	}
	@RequestMapping("/request1-2")
	public String request1_2(@RequestParam int category , @RequestParam int product) {
		System.out.println(category);
		System.out.println(product);
		return "/quiz/quiz04/request";
	}
	@RequestMapping("/request1-3")
	public String request1_3(@ModelAttribute Group group) {
		System.out.println(group.getCategory());
		System.out.println(group.getProduct());
		return "/quiz/quiz04/request";
	}
	@RequestMapping("/request1-4")
	public String request1_4(@RequestParam Map<Integer , Integer> groupMap) {
		for(int i : groupMap.keySet()) System.out.println(groupMap.get(i));
		return "/quiz/quiz04/request";
	}
	
	@RequestMapping("/viewData1-1")
	public String viewData1_1(HttpServletRequest request) {
		request.setAttribute("response001", "100");
		request.setAttribute("response099", "200");
		return "/quiz/quiz04/viewData";
	}

	@RequestMapping("/viewData1-2")
	public String viewData1_2(Model model) {
		model.addAttribute("response001", "999");
		model.addAttribute("response099", "888");
		return "/quiz/quiz04/viewData";
	}

	@RequestMapping("/viewData1-3")
	public ModelAndView viewData1_3() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/quiz/quiz04/viewData");
		mav.addObject("response001","555");
		mav.addObject("response099","444");
		return mav;
	}
	
	@RequestMapping("/viewData1-4")
	public String viewData1_4(Model model) {
		
		model.addAttribute("response001","333");
		model.addAttribute("response099","777");
		
		TransferItem t = new TransferItem();
		t.setValue001(666);
		t.setValue099(888);
		
		model.addAttribute("transferItem", t);
		
		return "/quiz/quiz04/viewData";
	}
}

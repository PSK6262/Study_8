package com.app.controller.study.quiz.quiz14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.controller.study.quiz.quiz14.dao.CupDAO;
import com.app.controller.study.quiz.quiz14.dao.PlateDAO;

@Controller
@RequestMapping("/quiz14")
public class Quiz14Controller {

	@Autowired
	CupBean cupBean;
	
	@Autowired
	PlateBean plateBean;
	
	@Autowired
	CupDAO cupDAO;
	
	@Autowired
	PlateDAO plateDAO;
	
	@GetMapping("/{url}")
	public String fullOrder(@PathVariable String url) {
		String coffeeName = null;
		String dessertName = null;
		
		if("fullOrder".equals(url)) {
			coffeeName = cupDAO.findName(cupBean);
			dessertName = plateDAO.findName(plateBean);		
		} else if("orderCoffee".equals(url)) {
			coffeeName = cupDAO.findName(cupBean);
		} else if("orderDessert".equals(url)) {
			dessertName = plateDAO.findName(plateBean);			
		}
		System.out.println("현재의 접속경로 : localhost:8080/quiz14/" + url );
		if(coffeeName != null) System.out.println("컵에 담긴 음료의 이름 - " + coffeeName);
		if(dessertName != null) System.out.println("접시에 담긴 디저트의 이름 - " + dessertName);
		
		return "quiz/quiz14/order";
	}
}

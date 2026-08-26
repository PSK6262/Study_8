package com.app.controller.study.quiz.quiz15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.controller.study.quiz.quiz15.dto.Account;
import com.app.controller.study.quiz.quiz15.dto.Hotel;
import com.app.controller.study.quiz.quiz15.service.AddRoomService;
import com.app.controller.study.quiz.quiz15.service.CreateAccountService;

@Controller
@RequestMapping("/quiz15")
public class Quiz15Controller {

	@Autowired
	Hotel hotel;
	
	@Autowired
	Account account;
	
	@Autowired
	AddRoomService addRoomService;
	
	@Autowired
	CreateAccountService createAccountService;
	
	@GetMapping("/createAccount")
	public String CreateAccount() {
		System.out.println("CreateAccountController 통과");
		createAccountService.CreateAccount(account);
		return "quiz/quiz15/temp";
	}
	@GetMapping("/addRoom")
	public String AddRoom() {
		System.out.println("AddRoomController 통과");
		addRoomService.AddRoom(hotel);
		return "quiz/quiz15/temp";
	}
}

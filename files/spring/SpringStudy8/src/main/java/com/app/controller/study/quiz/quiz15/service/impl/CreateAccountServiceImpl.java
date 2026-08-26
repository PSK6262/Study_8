package com.app.controller.study.quiz.quiz15.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.controller.study.quiz.quiz15.dao.CreateAccountDAO;
import com.app.controller.study.quiz.quiz15.dto.Account;
import com.app.controller.study.quiz.quiz15.service.CreateAccountService;

@Service
public class CreateAccountServiceImpl implements CreateAccountService{

	@Autowired
	CreateAccountDAO createAccountDAO;
	
	@Override
	public int CreateAccount(Account account) {
		System.out.println("CreateAccountService 통과");
		createAccountDAO.CreateAccount(account);
		return 0;
	}
	
}

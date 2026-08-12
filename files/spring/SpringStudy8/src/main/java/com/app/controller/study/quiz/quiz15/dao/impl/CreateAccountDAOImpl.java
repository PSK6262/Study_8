package com.app.controller.study.quiz.quiz15.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.controller.study.quiz.quiz15.dao.CreateAccountDAO;
import com.app.controller.study.quiz.quiz15.dto.Account;

@Repository
public class CreateAccountDAOImpl implements CreateAccountDAO {

	@Override
	public int CreateAccount(Account account) {
		System.out.println("CreateAccountDAO 통과");
		System.out.println("계정명 : " + account.getName());	
		return 0;
	}
}

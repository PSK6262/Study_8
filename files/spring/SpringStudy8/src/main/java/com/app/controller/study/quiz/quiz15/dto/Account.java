package com.app.controller.study.quiz.quiz15.dto;

import lombok.Data;

@Data
public class Account {
	String name;
	
	public Account(String name) {
		this.name = name;
	}
}

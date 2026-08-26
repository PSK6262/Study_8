package com.app.controller.study.quiz.quiz15.dto;

import lombok.Data;

@Data
public class Hotel {
	String name;
	
	public Hotel(String name) {
		this.name = name;
	}
}

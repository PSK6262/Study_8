package com.app.controller.study.quiz.quiz15.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.controller.study.quiz.quiz15.dto.Account;
import com.app.controller.study.quiz.quiz15.dto.Hotel;


@Configuration
public class Quiz15BeanConfig {
	
	@Bean
	public Hotel hotel() {
		return new Hotel("ABC호텔");
	}
	
	@Bean
	public Account account() {
		return new Account("사용자1");
	}
	
}

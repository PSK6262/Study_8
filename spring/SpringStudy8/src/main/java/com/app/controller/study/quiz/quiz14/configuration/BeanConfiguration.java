package com.app.controller.study.quiz.quiz14.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.controller.study.quiz.quiz14.controller.CoffeeBean;
import com.app.controller.study.quiz.quiz14.controller.CupBean;
import com.app.controller.study.quiz.quiz14.controller.DessertBean;
import com.app.controller.study.quiz.quiz14.controller.PlateBean;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public CoffeeBean coffeeBean() {
		return new CoffeeBean("초코프라페");
	}
	
	@Bean
	public DessertBean dessertBean() {
		return new DessertBean("케이크");
	}
	
	@Bean
	public CupBean cupBean() {
		return new CupBean(coffeeBean());
	}
	
	@Bean
	public PlateBean plateBean() {
		return new PlateBean(dessertBean());
	}
}

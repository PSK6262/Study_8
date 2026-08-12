package com.app.controller.study.quiz.quiz14.controller;

import lombok.Data;

@Data
public class PlateBean {
	DessertBean dessertBean;
	
	public PlateBean(DessertBean dessertBean) {
		this.dessertBean = dessertBean;
	}
}

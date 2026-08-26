package com.app.controller.study.quiz.quiz14.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.controller.study.quiz.quiz14.controller.PlateBean;
import com.app.controller.study.quiz.quiz14.dao.PlateDAO;

@Repository
public class PlateDAOImpl implements PlateDAO {

	@Override
	public String findName(PlateBean plateBean) {
		return plateBean.getDessertBean().getName();
	}
	
}

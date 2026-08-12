package com.app.controller.study.quiz.quiz14.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.controller.study.quiz.quiz14.controller.CupBean;
import com.app.controller.study.quiz.quiz14.dao.CupDAO;

@Repository
public class CupDAOImpl implements CupDAO {

	@Override
	public String findName(CupBean cupBean) {
		return cupBean.getCoffeeBean().getName();
	}
	
}

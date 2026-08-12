package com.app.controller.study.quiz.quiz15.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.controller.study.quiz.quiz15.dao.AddRoomDAO;
import com.app.controller.study.quiz.quiz15.dto.Hotel;

@Repository
public class AddRoomDAOImpl implements AddRoomDAO {

	@Override
	public int AddRoom(Hotel hotel) {
		System.out.println("AddRoomDAO 통과");
		System.out.println("호텔명 : " + hotel.getName());
		return 0;
	}
	
}

package com.app.controller.study.quiz.quiz15.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.controller.study.quiz.quiz15.dao.AddRoomDAO;
import com.app.controller.study.quiz.quiz15.dto.Hotel;
import com.app.controller.study.quiz.quiz15.service.AddRoomService;

@Service
public class AddRoomServiceImpl implements AddRoomService {

	@Autowired
	AddRoomDAO addRoomDAO;
	
	@Override
	public int AddRoom(Hotel hotel) {
		System.out.println("AddRoomService 통과");
		addRoomDAO.AddRoom(hotel);
		return 0;
	}
}

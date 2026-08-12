package com.app.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.dao.room.RoomDAO;
import com.app.dao.room.impl.RoomDAOImpl;
import com.app.dto.room.Room;
import com.app.service.room.RoomService;
import com.app.service.room.impl.RoomServiceImpl;

@Configuration
public class BeanConfiguration {
	//bean 설정 관련 클래스
	//dao , service

	RoomDAO roomDAO = new RoomDAOImpl();
	
	@Bean
	public RoomDAO roomDAO() {
		return new RoomDAOImpl();
	}
	
	@Bean
	public RoomService roomService() {
		RoomService roomService = new RoomServiceImpl(roomDAO);
		return roomService;
	}
	
}

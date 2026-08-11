package com.app.controller.service.room.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.controller.service.room.RoomService;
import com.app.dao.room.RoomDAO;
import com.app.dto.room.Room;

@Service
public class RoomServiceImpl implements RoomService {
	
	private final RoomDAO roomDAO;
	public RoomServiceImpl(RoomDAO roomDAO) {
		this.roomDAO = roomDAO;
	}
	
//	@Autowired
//	RoomDAO roomDAO;
	

	@Override
	public List<Room> findRoomList() {
		System.out.println("RoomServicfeImpl findRoomList");
		// 핵심 Business logic
		// DAO 활용 -> 실제 DB에서 데이터 조회, 받아와서 해결
		List<Room> roomList = roomDAO.findRoomList();
		return roomList;
	}

}

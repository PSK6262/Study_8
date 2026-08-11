package com.app.dao.room.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.dao.room.RoomDAO;
import com.app.dto.room.Room;

@Repository
public class RoomDAOImpl implements RoomDAO {

	@Override
	public List<Room> findRoomList() {
		System.out.println("RoomDAOImp1 findRoomList");
		
		return null;
	}

}

package com.app.dao.room;

import java.util.List;

import com.app.dto.room.Room;

public interface RoomDAO {
	List<Room> findRoomList();
	int saveRoom(Room room);
	int removeRoom(int roomId);
	Room findRoomByRoomId(int roomId);
	int modifyRoom(Room room);
}

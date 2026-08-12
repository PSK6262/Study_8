package com.app.service.room.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.room.RoomDAO;
import com.app.dto.room.Room;
import com.app.service.room.RoomService;

@Service
public class RoomServiceImpl implements RoomService {
	
//	private final RoomDAO roomDAO;
//	public RoomServiceImpl(RoomDAO roomDAO) {
//		this.roomDAO = roomDAO;
//	}
	
	@Autowired
	RoomDAO roomDAO;
	
	@Override
	public List<Room> findRoomList() {
		System.out.println("RoomServicfeImpl findRoomList");
		// 핵심 Business logic
		// DAO 활용 -> 실제 DB에서 데이터 조회, 받아와서 해결
		List<Room> roomList = roomDAO.findRoomList();
		return roomList;
	}

}


/*
 * 영업일 정보 -> 업장정보(DTO)에 포함.
 * 업장정보 - 이름 , 여는시간 , 닫는시간 , 장소 , 전화번호 , 영업일( ex)월~금 )
 * 예약시 객실 가격정보 -> ReserveRoom =( Room , 가격 , 시간 등) 
 * 게시판 글 DTO -> 작성자명,글 제목, 글 작성시간 , 글 번호(pk), 이미지주소, 글 내용  
 * 
 *  reservationService => 예약이 잘 완료되었음을 리턴
 *  예약을 시도했으니 출력되는건 예약이 잘 되었다 or ErrorCode
 * 
 * 
 * 
 */

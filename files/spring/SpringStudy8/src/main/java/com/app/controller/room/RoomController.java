package com.app.controller.room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.dao.room.RoomDAO;
import com.app.dto.room.Room;
import com.app.service.room.RoomService;

@Controller
public class RoomController {
	
//	RoomDAO roomDAO;
	
// 생성자 이용 의존성 주입
//	private final RoomService roomService;
//	public RoomController(RoomService roomService) {
//		this.roomService = roomService;
//	}
 // setter 이용 의존성 주입
//	public void setRoomDAO(RoomDAO roomDAO) {
//		this.roomDAO = roomDAO;
//	}
	@Autowired // 의존성 주입
	RoomService roomService;
//	// Spring이 객체 관리 -> RoomService 찾아서 (Singleton 패턴으로 생성) 주입해준다.
	
	// 보유한 모든 호실 정보 조회
	@GetMapping("/rooms")
	public String rooms(Model model) {
		
		System.out.println("[Controller] /rooms 호출");
		
		// 호실 정보
		// Controller -> Service 호출 , Service-> DAO 호출 , DAO <-> DB

		//-- roomList의 내용을 받아올 business logic
		List<Room> roomList = roomService.findRoomList();
		//--
		model.addAttribute("roomList", roomList);
		
		// view에 호실 목록 전달
		return "room/rooms";
	}
}

package com.app.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.dto.user.User;
import com.app.dto.room.Room;
import com.app.service.room.RoomService;
import com.app.service.user.UserService;

@Controller
public class AdminController {
	//관리자 접근 페이지   (전체 관리자) or (판매자측/호텔측 사용자)
	//			운영회사측 전체관리자
	
	@Autowired
	RoomService roomService;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/admin/registerRoom")
	public String registerRoom() {
		return "admin/registerRoom";
	}
	
	@PostMapping("/admin/registerRoom")
	public String registerRoomAction(@ModelAttribute Room room) {
		
		//화면으로부터 입력한 값이 잘 넘어왔는지 체크
		System.out.println(room); 
		
		int result = roomService.saveRoom(room);
		
		// result 값 확인 -> 성공/실패 -> 진행
		System.out.println("Insert 처리결과 : " + result);
		
		if(result > 0) {
			return "redirect:/admin/rooms";
		}
		return "admin/registerRoom";
	}
	@GetMapping("/admin/rooms")
	public String rooms(Model model) {
		// roomss 페이지
		// t_room 테이블 객실 데이터 -> 조회 -> view 전달 -> 표시
		List<Room> roomList = roomService.findRoomList();
		model.addAttribute("roomList",roomList);
		
		return "admin/rooms";
	}
	
	//PK 기준 조회 - roomId => PK
	@GetMapping("/admin/room/{roomId}")
	public String room(@PathVariable String roomId , Model model) {
		int roomIdPK = Integer.parseInt(roomId);
		Room room = roomService.findRoomByRoomId(roomIdPK);
		
		if(room == null) {
			//예외처리
		}
		model.addAttribute("room",room);
		
		return "admin/room";
	}
	
	
	
	
	
	// 관리자가 사용자 계정관리 -> 사용자 계정 임의 추가
	
	@GetMapping("/admin/users/add")
	public String addUser() {
		return "admin/addUser";
	}

	@PostMapping("/admin/users/add")
	public String addUserAction(User user) {
			// user 정보를 DB에 저장
		/*
		 * 1) Controller에서 바로 처리.
		 * user.setUserType("CUS");
		 * userService.saveUser(user);
		 * 
		 * 2) 서비스 계층 /레이어 / 레벨 에서 사용자를 지정하는 메소드 형태로 사용
		 * "비지니스 로직" << 이게 Service의 존재 이유
		 * userService.saveCustomerUser(user);
		 */
		int result = userService.saveCustomerUser(user);
		if(result > 0) {
			return "redirect:/admin/users";
		} else {
			return "admin/addUser";
		}
	}
	
	@GetMapping("/admin/users")
	public String users(Model model) {
		List<User> userList = userService.findUserList();
		model.addAttribute("userList",userList);
		
		return "admin/users";
	}
	//객실정보 삭제
	@GetMapping("/admin/removeRoom")
	public String removeRoom(HttpServletRequest request) {
		String roomId = request.getParameter("roomId");
		
		if(roomId == null) {
			return "redirect:/admin/rooms";
			// 예외처리
		}
		
		int roomIdPk = Integer.parseInt(roomId);
		int result = roomService.removeRoom(roomIdPk);
		
		if(result > 0) {}
		
		return "redirect:/admin/rooms";
		
	}
}
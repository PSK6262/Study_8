package com.app.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.dto.user.User;
import com.app.dto.user.UserSearchCondition;
import com.app.common.CommonCode;
import com.app.dto.room.Room;
import com.app.dto.room.RoomSearchCondition;
import com.app.service.room.RoomService;
import com.app.service.user.UserService;
import com.app.util.LoginManager;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class AdminController {
	//관리자 접근 페이지   (전체 관리자) or (판매자측/호텔측 사용자)
	//			운영회사측 전체관리자
	
	@Autowired
	RoomService roomService;
	
	@Autowired
	UserService userService;

	private static final Logger log = LogManager.getLogger(AdminController.class);
	
	@GetMapping("/admin/registerRoom")
	public String registerRoom() {
		
		System.out.println("println");
		log.info("log level info 기본 사항");
		log.error("심각한 에러 발생");
		log.warn("경고");
		log.debug("디버그");

		log.trace("trace level 메세지 1");
		log.trace("trace level 메세지 2");
		log.trace("trace level 메세지 3");
		
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
	public String rooms(Model model, RoomSearchCondition roomSearchCondition) {
		
		List<Room> roomList = roomService.findRoomListBySearchCondition(roomSearchCondition);
		model.addAttribute("roomList",roomList);
		model.addAttribute("roomSearchCondition",roomSearchCondition);
		
//		// rooms 페이지
//		// t_room 테이블 객실 데이터 -> 조회 -> view 전달 -> 표시
//		List<Room> roomList = roomService.findRoomList();
//		model.addAttribute("roomList",roomList);
//		
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
	public String users(Model model , UserSearchCondition userSearchCondition) {
		System.out.println(userSearchCondition);
		List<User> userList = userService.findUserListBySearchCondition(userSearchCondition);
		model.addAttribute("userList",userList);
		model.addAttribute("userSearchCondition",userSearchCondition);
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
	
	// localhost:8080/admin/modifyRoom?roomId=5
	@GetMapping("/admin/modifyRoom")
	public String modifyRoom(HttpServletRequest request) {
		//수정화면 진입 시 기존값들 세팅
		String roomId = request.getParameter("roomId");
		if(roomId == null) {
			return "redirect:/admin/rooms";
		}
		
		//PK값으로 객실정보 조회
		int roomIdPk = Integer.parseInt(roomId);
		Room room = roomService.findRoomByRoomId(roomIdPk);
		System.out.println(room);
		request.setAttribute("room", room);
		return "admin/modifyRoom";
	}
	
	@PostMapping("/admin/modifyRoom")
	public String modifyRoomAction(Room room) {
	
		// Modify value
		System.out.println("수정하려는 객실 정보");
		System.out.println(room);
		
		int result = roomService.modifyRoom(room);
		
		if(result > 0) { // 성공시
			return "redirect:/admin/room/" + room.getRoomId();
		} else {
			return "redirect:/admin/modifyRoom?roomId=" + room.getRoomId();
		}
	}
	
	@GetMapping("/admin/user/{id}")
	public String user(@PathVariable String id, Model model) {
		
		User user = userService.findUserById(id);
		model.addAttribute("user",user);
		
		return "admin/user";
	}
	
	@GetMapping("/admin/modifyUser/{id}")
	public String modifyUser(@PathVariable String id, Model model) {
		User user = userService.findUserById(id);
		model.addAttribute("user",user);
		
		return "admin/modifyUser";
	}
	
	@PostMapping("/admin/modifyUser")
	public String modifyUserAction(User user) {
		System.out.println("modifyUser에 요청 들어온 값");
		System.out.println(user);
		
		int result = userService.modifyUser(user);
		
		if(result > 0) { // 성공
			return "redirect:/admin/user/" + user.getId();
		} else { // 수정실패
			return "redirect:/admin/modifyUser/" + user.getId();
		}
	}
	
	@GetMapping("/admin/signin")
	public String signin() {
		return "admin/signin";
	}
	
	@PostMapping("/admin/signin")
	public String signinAction(User user, HttpSession session) {
		log.info("관리자페이지 로그인 시도");
		log.info(user);
		
		user.setUserType(CommonCode.USER_USERTYPE_ADMIN);
		System.out.println(user);
		User loginUser = userService.checkUserLogin(user);
		System.out.println(loginUser);
		if(loginUser == null) {
			System.out.println("관리자가 아닙니다");
			return "admin/signin";
		} else {
			log.info("관리자 계정 로그인 성공 {}",loginUser);
			LoginManager.setSessionLoginUserId(session, loginUser.getId());
			System.out.println("로그인 성공");
			return "redirect:/main";
		}
	}
	@GetMapping("/admin/signout")
	public String signout(HttpSession session) {
		//session.invalidate();
		LoginManager.logout(session);
		
		return "redirect:/main";
	}
}
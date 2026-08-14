package com.app.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.common.CommonCode;
import com.app.dao.user.UserDAO;
import com.app.dto.room.Room;
import com.app.dto.user.User;
import com.app.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Override
	public int saveUser(User user) {

		int result = userDAO.saveUser(user);
		
		return result;
	}

	@Override
	public int saveCustomerUser(User user) {

		//사용자 계정 추가시 사용 메소드
		//고객계정으로 추가!
		user.setUserType(CommonCode.USER_USERTYPE_CUSTOMER);
		
		int result = userDAO.saveUser(user);
		
		return result;
	}

	@Override
	public int saveAdminUser(User user) {
		//관리자 계정 추가시 사용 메소드
		//관리자계정으로 추가!
		user.setUserType(CommonCode.USER_USERTYPE_ADMIN);
		
		int result = userDAO.saveUser(user);
		
		return result;
	}

	@Override
	public List<User> findUserList() {
		
		List<User> userList = userDAO.findUserList();
		
		return userList;
	}

	@Override
	public User checkUserLogin(User user) {
		/*
		// 1) DB에서 User정보 조회 -> 서비스 계층에서 상태 비교 수행
		
		User loginUser = userDAO.findUserById(user.getId());
		if(loginUser != null 
				&& user.getPw().equals(loginUser.getPw())
				&& user.getUserType().equals(loginUser.getUserType())) {
			return loginUser;
		}
		//로그인 실패
		return null;
		*/
		// 2) DB Query상에서 정보 일치 여부 비교 수행
		User loginUser = userDAO.checkUserLogin(user); // object or null
		return loginUser;
	}

	@Override
	public User findUserById(String id) {
		User user = userDAO.findUserById(id);
		return user;
	}
}

package com.app.dto.user;

import lombok.Data;

@Data
public class UserValidError {
	// 유효성 검증 결과
	// 결과에 오류 -> 화면에 표시 (FE message)
	// 값 O => 검증실패
	// 값 X => 검증통과
	
	String id; // 실패시 오류메세지
	String pw;
	String name;
	String userType;
}

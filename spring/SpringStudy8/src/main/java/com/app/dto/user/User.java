package com.app.dto.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {
	@NotBlank(message = "아이디 필수")
	String id;
	
	@Size(min = 8 , max = 12 , message = "비번길이 확인 (8~12)")
	String pw;
	
	String name;
	String userType;
}

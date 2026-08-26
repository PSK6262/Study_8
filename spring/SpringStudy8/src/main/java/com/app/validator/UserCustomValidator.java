package com.app.validator;

import com.app.dto.user.User;
import com.app.dto.user.UserValidError;

public class UserCustomValidator {
	public static boolean validate(User user , UserValidError userValidError) {
		boolean result = true;
		// 검증 logic
		if(user.getId() == null || "".equals(user.getId().trim())) {
			userValidError.setId("아이디 입력 필요");
			result = false;
		}
		if(user.getId().length() < 4 || user.getId().length() > 12) {
			userValidError.setId("아이디 길이는 4 - 12");
			result = false;
		}
		if(user.getPw().length() < 8 || user.getPw().length() > 12) {
			userValidError.setPw("비밀번호 길이는 8 - 12");
			result = false;
		}
		if(user.getName() == null || "".equals(user.getName().trim())) {
			userValidError.setName("이름 작성 필수");
			result = false;
		}
		return result;
	}
}

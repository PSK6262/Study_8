package com.app.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.dto.user.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User)target;
		
		if(user.getId() == null || "".equals(user.getId().trim())) {
			errors.rejectValue("id","EmptyUserId","아이디 입력 필요");
		}
		if(user.getId().length() < 4 || user.getId().length() > 12) {
			errors.rejectValue("id","LengthUserId","아이디 길이 체크");
		}
		if(user.getPw().length() < 8 || user.getPw().length() > 12) {
			errors.rejectValue("pw","LengthUserPw","비밀번호 길이 체크");
		}
	}
	
}

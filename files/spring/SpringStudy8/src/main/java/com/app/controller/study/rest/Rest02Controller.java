package com.app.controller.study.rest;

import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.common.CommonCode;
import com.app.dto.user.User;
import com.fasterxml.jackson.databind.ObjectMapper;

// default가 Object이기 때문에 view를 return하지 못한다. // @Controller는 기본 return이 view이다.
@RestController
public class Rest02Controller {

	@GetMapping("/rest/rest04")
	public String rest04() {
		return "rest/rest04"; // text
	}
	
	@GetMapping("/rest/rest05")
	public String rest05() {
		
		return "";
	}
	
	@GetMapping("/rest/rest06")
	public String rest06() {
		// 직접 text로 json format 제작
		
		/*
		{
			"id":"abc",
			"name":"abname",
			"userType:"CUS",
			"pw":"pwpw"
		}
		*/
		String result = "			\"id\":\"abc\",\r\n"
				+ "			\"name\":\"abname\",\r\n"
				+ "			\"userType:\"CUS\",\r\n"
				+ "			\"pw\":\"pwpw\"";
		
		return result; // text
	}
	@GetMapping("/rest/rest07")
	public String rest07() {
		// json-simple 이용
		JSONObject obj = new JSONObject();
		obj.put("id", "abc");
		obj.put("name", "abcname");
		String result = obj.toJSONString();
		return result;
	}
	@GetMapping("/rest/rest08")
	public String rest08() {
		// jackson 이용
		User user = new User();
		user.setId("abc");
		user.setName("abcname");
		user.setPw("abcpw");
		user.setUserType( CommonCode.USER_USERTYPE_CUSTOMER );
		
		// 객체 -> JSON
		ObjectMapper mapper = new ObjectMapper();
		String result = null;
		try {
			result = mapper.writeValueAsString(user);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	@GetMapping("/rest/rest09")
	public User rest09() {
		// "jackson 이용 하는 상태에서"
		// REST API 통신 -> text반환 (@ResponseBody or @RestController)
		// 객체 리턴 -> 알아서 객체 구성 JSON으로 변환후 리턴함

		User user = new User();
		user.setId("abc09");
		user.setName("abc09name");
		user.setPw("abc09pw");
		user.setUserType( CommonCode.USER_USERTYPE_CUSTOMER );
		
		return user;
	}
	
	@GetMapping("/rest/rest10")
	public String rest10() {
		return "텍스트 리턴";
	}
	
}

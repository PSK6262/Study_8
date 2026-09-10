package com.app.controller.study.rs;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.common.ApiCommonCode;
import com.app.dto.api.ApiResponse;
import com.app.dto.api.ApiResponseHeader;
import com.app.util.LoginManager;

@RestController
//@CrossOrigin(origins = "http://localhost:5173")
public class ReactSpringAPIController {

	
	@GetMapping("/api/getMsg")
	public String getMsg() {
		System.out.println("/api/getMsg");
		return "Spring RESTAPI getMsg";
	}
	
	@GetMapping("/api/getDrinks")
	public List<DrinkItem> getDrinks(){
		List<DrinkItem> drinkList = new ArrayList<>();
		drinkList.add(new DrinkItem("쿠키프라페","프라페"));
		drinkList.add(new DrinkItem("유자차","차"));
		drinkList.add(new DrinkItem("율무차","차"));
		return drinkList;
	}
	
	@GetMapping("/api/getDrinksDiv")
	public List<DrinkItem> getDrinksDiv(@RequestParam String type){
		List<DrinkItem> drinkList = new ArrayList<>();
		if("차".equals(type)) {
			drinkList.add(new DrinkItem("커피1","커피"));
			drinkList.add(new DrinkItem("커피2","커피"));
			drinkList.add(new DrinkItem("커피3","커피"));
		} 
		if("커피".equals(type)) {
			drinkList.add(new DrinkItem("차1","차"));
			drinkList.add(new DrinkItem("차2","차"));
			drinkList.add(new DrinkItem("차3","차"));
		}
		return drinkList;
	}
	
	@PostMapping("/api/getDrinksNum")
	public List<DrinkItem> getDrinksNum(@RequestBody DrinksNum drinksNum){
		
		System.out.println("/api/getDrinksNum");
		//System.out.println(num);
		
		// { num : num , type:'jsontext' }
		System.out.println(drinksNum);
		
		List<DrinkItem> drinkList = new ArrayList<>();
		drinkList.add(new DrinkItem("name"+drinksNum.getNum(),"type"+drinksNum.getNum()));
		
		return drinkList;
	}
	
	// 요청 body 데이터 -> json formatted 
	@PostMapping("/api/login")
	public ApiResponse<String> login(@RequestBody APILogin apiLogin, HttpServletRequest request) {
		String id = apiLogin.getId();
		String pw = apiLogin.getPw();
		
		System.out.println(id);
		System.out.println(pw);
		
		// 검사 후 
		// 단순 텍스트 return , resultCode return 등
		LoginManager.setSessionLoginUserId(request, id);
		
		// 로그인 성공했다치고
		//return "loginOK";
		
		//apiResponse json format으로 return
		ApiResponse<String> apiResponse = new ApiResponse<String>();
		
		ApiResponseHeader header = new ApiResponseHeader();
		header.setResultCode(ApiCommonCode.API_LOGIN_SUCCESS);
		header.setResultMessage(ApiCommonCode.API_LOGIN_SUCCESS_MSG);
		apiResponse.setHeader(header);
		apiResponse.setBody("loginOK");
		
		return apiResponse;
	}
	
	@PostMapping("/api/loginCheck")
	public String loginCheck(HttpSession session) {
		if(LoginManager.isLogin(session)) {
			String loginId = LoginManager.getLoginUserId(session);
			System.out.println("/api/loginCheck 로그인 인식");
			System.out.println(loginId);
			return "login user : " + loginId;
		} else {
			return "not login";
		}
	}
}

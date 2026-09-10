package com.app.controller.study.rs;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}

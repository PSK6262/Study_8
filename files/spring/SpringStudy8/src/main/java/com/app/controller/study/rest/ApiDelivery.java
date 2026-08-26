package com.app.controller.study.rest;

import java.util.List;
import lombok.Data;

@Data
public class ApiDelivery {
	String staffName; // 배달기사
	String destination; 
	String phone;
	List<ApiMenu> menuList;
	ApiStore apiStore;
}

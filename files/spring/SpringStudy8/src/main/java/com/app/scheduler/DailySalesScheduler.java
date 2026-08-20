package com.app.scheduler;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.app.service.room.RoomService;
import com.app.service.user.UserService;

public class DailySalesScheduler {

		@Autowired
		UserService userService;
		
		@Autowired
		RoomService roomService;
	
		@Scheduled(cron = "0/5 * * * * *")
		public void test1() {
			System.out.println("DailySalesScheduler test1() " + LocalDateTime.now());
		}
		
		//@Scheduled(cron ="0 0 2 * * *")
		@Scheduled(cron = " 0/10 * * * * *")
		public void dailySales() {
			
			System.out.println("every 10 secs");
			userService.findUserById("qq");
			roomService.findRoomList();
			//userService
			//roomService
		}
}

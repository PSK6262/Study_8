package com.app.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.app.common.CommonCode;
import com.app.dto.user.User;
import com.app.service.user.UserService;
import com.app.util.LoginManager;

public class AdminInterceptor implements HandlerInterceptor {
	
		@Autowired
		UserService userService;
	
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
			
			// /admin으로 시작하는 경로에 인터셉터를 적용
			
			// 로그인여부 + 관리자 계정여부 (userType ADM)
			
			if(LoginManager.isLogin(request)) {
				// 관리자 계정 맞는지 ( userType = ADM )
				String userId = LoginManager.getLoginUserId(request);
				User user = userService.findUserById(userId);
				if(CommonCode.USER_USERTYPE_ADMIN.equals( user.getUserType()) ) {
					return HandlerInterceptor.super.preHandle(request, response, handler);
				} else {
					response.sendRedirect("/main");
					return false;	
				}
			} else {
				response.sendRedirect("/error/badAccess"); // 처리경로가 있다는 가정
				return false;
			}
		}
}

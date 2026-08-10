package com.app.util;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class MyCookieUtil {
	
	public static String getCookieValue(Cookie[] cookies, String cookieName) {
		
		String value = null;
		
		for( Cookie ck : cookies ) {
			if(ck.getName().equals(cookieName)) {
				try {
					value = URLDecoder.decode(ck.getValue(), "UTF-8");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return value;
	}
	public static String getCookieValue(HttpServletRequest request, String cookieName) {
		Cookie[] cookies = request.getCookies();
		return getCookieValue(cookies, cookieName);
	}
	
	public static Cookie createCookie(String name, String value) {
		// 시간제한이 없으면 Session Cookie가 된다 // 생략 == maxAge(-1).
		return new Cookie(name, encodeValue(value));
	}
	public static Cookie createCookie(String name, String value , int maxAge) {
		Cookie ck = new Cookie(name, encodeValue(value));
		ck.setMaxAge(maxAge);
		return ck;
	}
	public static Cookie createCookieForRemove(String name) {
		// Cookie의 maxAge를 0으로 바꿔서 삭제시키기 위함
		// 쿠키는 사용자의 브라우저에서 삭제하는것이기 때문
		Cookie ck = new Cookie(name,"");
		ck.setMaxAge(0);
		return ck;
	}
	public static String encodeValue(String value) {
		String result = null;
		try {
			result = URLEncoder.encode(value, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}

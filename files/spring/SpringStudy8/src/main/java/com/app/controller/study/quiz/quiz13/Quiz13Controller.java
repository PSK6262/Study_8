package com.app.controller.study.quiz.quiz13;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.util.MyCookieUtil;

@Controller
@RequestMapping("/quiz13")
public class Quiz13Controller {

	@GetMapping("/hideAd")
	public String hideAd(HttpServletRequest request) {
		Cookie[] cks = request.getCookies();
		for(Cookie c : cks) {
			if(c.getName().equals("hide")) {
				request.setAttribute(c.getName(), c.getValue());
			}
		}
		return "quiz/quiz13/hideAd";
	}
	@PostMapping("/hideAd")
	public String hideAdPost(HttpServletRequest request, HttpServletResponse response) {
		String remember = request.getParameter("remember");
		if("on".equals(remember)) { // 24시간 안보기 체크 후 클릭이면 24시간
			Cookie ck = MyCookieUtil.createCookie("hide", "on" , 60*60*24);
			response.addCookie(ck);
		}
		return "redirect:hideAd";
	}
	@RequestMapping("/showAd")
	public String showAd(HttpServletRequest request, HttpServletResponse response) {
		response.addCookie(MyCookieUtil.createCookieForRemove("hide"));
		return "redirect:hideAd";
	}
}

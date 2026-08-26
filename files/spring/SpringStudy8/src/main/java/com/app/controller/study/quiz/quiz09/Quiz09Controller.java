package com.app.controller.study.quiz.quiz09;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Quiz09Controller {

	@RequestMapping("/quiz09/listTest")
	public String quiz09(@RequestParam String type) {
		if("str".equals(type)) {
			return "forward:/quiz07/listTest/str";
		} else {
			return "redirect:/quiz07/listTest/member";
		}
	}
}
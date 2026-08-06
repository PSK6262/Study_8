package com.app.controller.study.quiz.quiz07;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz07")
public class Quiz07Controller {

	@RequestMapping("/listTest")
	public String listTest(Model model , HttpServletRequest request) {
		String req = request.getParameter("type");
		model.addAttribute("type", req);
		if(req.equals("member")) {
			ArrayList<Member> memList = new ArrayList<>();
			for(int i = 0 ; i < 5 ; i ++) {
				Member m = new Member();
				m.setId("아이디" + (i+1));
				m.setName("비번" + (i+1));
				m.setPw("이름" + (i+1));
				memList.add(m);
			}
			model.addAttribute("memList",memList);
		}
		return "/quiz/quiz07/listTest";
	}
}

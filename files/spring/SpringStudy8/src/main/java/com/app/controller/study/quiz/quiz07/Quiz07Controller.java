package com.app.controller.study.quiz.quiz07;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/quiz07")
public class Quiz07Controller {

	@RequestMapping("/listTest/{itemId}")
	public String listTest(Model model , @PathVariable String itemId ) {
		model.addAttribute("type", itemId);
		if("member".equals(itemId)) {
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
		return "quiz/quiz07/listTest";
	}
}

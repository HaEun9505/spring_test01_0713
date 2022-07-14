package com.haeun.test01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@RequestMapping("/login")
	public String index() {
		return "login";
	}
	
	@RequestMapping("/loginOk")
	public String loginOk() {
		return "loginOk";
	}
	
	@RequestMapping("/loginNg")
	public String loginNg() {
		return "loginNg";
	}
	
	@RequestMapping(value = "/loginOk", method = RequestMethod.POST)
	public String loginOk(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if(id.equals("tiger") && pw.equals("12345")){
			model.addAttribute("id", id);
			return "loginOk";
		}
		else {
			model.addAttribute("id", id);
			return "loginNg";
		}
	}
	
}

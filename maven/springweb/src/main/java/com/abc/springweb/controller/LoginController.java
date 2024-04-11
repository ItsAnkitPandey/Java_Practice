package com.abc.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value ="/loginForm", method=RequestMethod.GET)
	public String getLoginForm() {
		return "login-form";
	}

	@RequestMapping("/login")
	public String LoginProcess(@RequestParam("uname") String name, @RequestParam("pwd") String pwd, Model model) {

		if (pwd.equals("1234")) {
			String msg = "Welcome" + name;
			model.addAttribute("message", msg);
			return "login-success";
		} else {
			String msg = "Welcome" + name + "you typed wrong password";
			model.addAttribute("message", msg);
			return "login-faild";
		}
	}
}

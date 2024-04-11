package com.abc.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "greetings";
	}
	
	@RequestMapping("/home")
	public ModelAndView handle() {
		String data = "Employee Details:" ;
		
		return new ModelAndView("home-page","mydata",data);
	}
	
}

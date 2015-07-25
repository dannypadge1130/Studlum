package com.studlum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String viewApplication() {
		return "index";
	}	
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String viewRegistration() {
		return "registration";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String viewLogin() {
		return "login";
	}
}
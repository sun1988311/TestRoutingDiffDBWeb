package com.sun.diff.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginUserController {
	
	private final static String LOGIN_CONST = "login"; 
	
	@RequestMapping("/login")
	public String loginUser(){
		return "index";
	}

}

package com.rohith.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeEndPoint {

	@RequestMapping("/hello")
	public String hello() {
		return "Welcome";
	}
}

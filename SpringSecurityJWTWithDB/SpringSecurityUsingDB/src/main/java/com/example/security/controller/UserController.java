package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.repository.UserCredentialRepository;

@RestController
public class UserController {

	@Autowired
	private UserCredentialRepository userCredentialRepository;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hai";
	}
}

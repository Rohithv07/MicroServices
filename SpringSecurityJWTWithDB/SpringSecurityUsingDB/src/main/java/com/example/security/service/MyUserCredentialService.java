package com.example.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.security.model.UserCredentials;
import com.example.security.repository.UserCredentialRepository;

public class MyUserCredentialService {
	
	@Autowired
	private UserCredentialRepository userCredentialRepository;
	
	public UserCredentials loadByUsername(String name) throws UsernameNotFoundException {
		List<UserCredentials> userCredentialsList = userCredentialRepository.findAll();
		for (UserCredentials u : userCredentialsList) {
			if (u.getUsername().equals(name)) {
				return new UserCredentials(u.getId(), u.getUsername(), u.getPassword());
			}
		}
		throw new UsernameNotFoundException(name);
	}

}

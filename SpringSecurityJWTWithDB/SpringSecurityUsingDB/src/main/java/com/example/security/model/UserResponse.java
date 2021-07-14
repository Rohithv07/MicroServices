package com.example.security.model;

public class UserResponse {
	private String jwt;

	public UserResponse() {
		super();
	}

	public UserResponse(String jwt) {
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

}

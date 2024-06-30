package com.springboot.web_app.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("Akshata");
		boolean isValidPassword = password.equalsIgnoreCase("akshata");
		return isValidPassword && isValidUserName;
	}
}

package com.casestudy.models;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {


    private String email;
    private String password;

    
    
  
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//need default constructor for JSON Parsing
    public AuthenticationRequest()
    {

    }

    public AuthenticationRequest(String username, String password) {
        this.setEmail(email);
        this.setPassword(password);
    }
}
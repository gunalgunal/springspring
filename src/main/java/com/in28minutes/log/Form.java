package com.in28minutes.log;

import org.springframework.stereotype.Service;

@Service
public class Form {
	private String email;
	private String password;
	public void setEmail(String name)
	{
		email=name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setPassword(String name)
	{
		password=name;
	}
	public String getPassword()
	{
		return password;
	}

}

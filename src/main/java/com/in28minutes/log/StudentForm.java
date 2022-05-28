package com.in28minutes.log;

import org.springframework.stereotype.Service;

@Service
public class StudentForm {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	public StudentForm()
	{
		
	}
	public StudentForm(String firstname,String lastname,String email,String pass)
	{
		firstName=firstname;
		lastName=lastname;
		this.email=email;
		password=pass;
	}
	public void setFirstName(String name)
	{
		firstName=name;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String name)
	{
		lastName=name;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setEmail(String name)
	{
		email=name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setPassword(String pass)
	{
		password=pass;
	}
	public String getPassword()
	{
		return password;
	}

}

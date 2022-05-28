package com.in28minutes.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginForm {
	
	@Autowired
	StudentForm student;
	@Autowired
    Storage store;
	@Autowired
	Form login;
	@RequestMapping(value="/log",method=RequestMethod.GET)
	public String method(ModelMap model)
	{
		model.put("student",new StudentForm("gunal","","",""));
		return "loggy";
	}
	
	@RequestMapping(value="/log",method=RequestMethod.POST)
	public String method2(ModelMap model,StudentForm stu) throws Exception
	{
	    store.connect();
		store.insert("INSERT INTO login(firstname,lastname,email,password)VALUES(?,?,?,?)", stu.getFirstName(),stu.getLastName(),stu.getEmail(), stu.getPassword());
		
		return "redirect:loglin";
	}
	@RequestMapping(value="/loglin",method=RequestMethod.GET)
	public String method3(ModelMap model)
	{
		model.put("login", new Form());
		return "login-form";
	}
	@RequestMapping(value="/loglin",method=RequestMethod.POST)
	public String method4(Form form) throws Exception
	{
		
		boolean bol=store.check(form.getEmail(),form.getPassword());
		if(bol==true)
			return "success";
					
		return "redirect:loglin";
	}
	

}

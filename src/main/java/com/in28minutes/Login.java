package com.in28minutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.next.LoginService;
import java.sql.*;
@Controller
@SessionAttributes("var")
public class Login {
	@Autowired
	LoginService login;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	
	public String method()
	{
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String method1(@RequestParam String email,@RequestParam String password,ModelMap model)throws Exception
	{

		 Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/doubt", "postgres", "123");
		   PreparedStatement st=con.prepareStatement("INSERT INTO web(email,password)VALUES(?,?)");
		    st.setString(1, email);
		    st.setString(2, password);
		    st.executeUpdate();
		    con.close();
		    st.close();
		    
			model.put("var",email);
			model.put("var1", password);
			return "welcome";
		
		
	}

}

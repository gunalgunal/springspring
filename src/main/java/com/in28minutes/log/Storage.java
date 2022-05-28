package com.in28minutes.log;

import java.sql.*;

import org.springframework.stereotype.Service;
@Service
public class Storage {
	public Connection con=null;
	public void connect() throws Exception
	{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/eclipse", "postgres", "123");
	}
	public void insert(String query,String firstname,String lastname,String email,String pass) throws Exception
	{
		connect();
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1,firstname);
		st.setString(2, lastname);
		st.setString(3, email);
		st.setString(4, pass);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public boolean check(String email,String password) throws Exception
	{
		connect();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT email,password FROM login");
		while(rs.next())
		{
			if(rs.getString("email").equals(email)&&rs.getString("password").equals(password))
			{
				con.close();
				st.close();
				 return true;
			}
		}
		
		     
		return false;
		
		
	}

}

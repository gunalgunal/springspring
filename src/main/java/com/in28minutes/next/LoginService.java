package com.in28minutes.next;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class LoginService {
	
	public boolean check(String name)
	{
		if(name.equals("gunal"))
			return true;
		return false;
	}

}

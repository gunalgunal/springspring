package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Component;
@Component
public class TodoService {
	private static ArrayList<Todo> num=new ArrayList<>();
	 static int count=3;
	public TodoService()
	{
		num.add(new Todo("gunal",1,true));
		num.add(new Todo("gunal",2,true));
		num.add(new Todo("gunal",3,true));
	}
	public void add(String name)
	{
		num.add(new Todo(name,++count,false));
	}
	public void delete(int id)
	{
		Iterator<Todo> it=num.iterator();
		while(it.hasNext())
		{
			Todo todo=it.next();
			if(todo.getId()==id)
			{
				it.remove();
			}
		}
	}
	public ArrayList<Todo> retrieve(String user)
	{
		ArrayList<Todo> num1=new ArrayList<>();
		for(Todo todo:num)
		{
			if(todo.getName().equals(user))
			{
				num1.add(todo);
			}
		}
		return num1;
	}

}

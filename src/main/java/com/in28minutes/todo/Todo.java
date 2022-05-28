package com.in28minutes.todo;

public class Todo {
	private String name;
	private int id;
	private boolean value;
	public Todo(String a,int b,boolean c)
	{
		name=a;
		id=b;
		value=c;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return name+" "+id+" "+value;
	}

}

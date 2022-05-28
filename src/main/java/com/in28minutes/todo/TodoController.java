package com.in28minutes.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("var")
public class TodoController {
	@Autowired
	TodoService todo;
	@RequestMapping(value="/list")
   public String method(ModelMap model)
   {
	   model.put("todos", todo.retrieve("gunal"));
	   return "list-todo";
   }
	@RequestMapping(value="/add-todo",method=RequestMethod.GET)
	public String method1()
	{
		return "add";
	}
	@RequestMapping(value="/add-todo",method=RequestMethod.POST)
	public String method2(@RequestParam String desc,ModelMap model)
	{
		todo.add(desc);
		return "redirect:/list";
	}
}

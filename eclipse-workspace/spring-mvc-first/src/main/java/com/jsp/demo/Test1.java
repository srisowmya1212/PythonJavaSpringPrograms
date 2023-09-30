package com.jsp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Test1 {
	@RequestMapping("/test1")
	public ModelAndView test1() {
		ModelAndView mv=new ModelAndView("index.jsp");
		mv.addObject("msg", "hello");
		return mv ;
		
	}
	
	@RequestMapping("/test2")
	public ModelAndView test2() {
		
		Student student=new Student();
		
		
		student.setId(1);
		student.setName("arun");
		student.setAge(22);
		ModelAndView mv1=new ModelAndView("student.jsp");
		mv1.addObject("obj", student);
		return mv1;
	}
	

}

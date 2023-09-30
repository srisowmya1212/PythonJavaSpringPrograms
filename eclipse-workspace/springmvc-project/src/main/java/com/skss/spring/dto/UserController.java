package com.skss.spring.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class UserController {
	@Autowired
	UserDaoImpl userDaoImpl;
	@RequestMapping("createUser")
	public ModelAndView createUser() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("user",new UserModel());
		mv.setViewName("createuser.jsp");
		return mv;
	}
	
	
		@RequestMapping("saveUser")
		public ModelAndView saveUser(@ModelAttribute UserModel user) {
			String message=userDaoImpl.saveUser(user);
			ModelAndView mv=new ModelAndView();
			mv.addObject("result",message);
			mv.setViewName("message.jsp");
			return mv;
		}
  
}

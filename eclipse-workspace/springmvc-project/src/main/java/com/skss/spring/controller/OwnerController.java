package com.skss.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skss.spring.dto.OwnerModel;

@Controller
public class OwnerController {
	@RequestMapping("createOwner")
	public ModelAndView createOwner() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("owner", new OwnerModel());
		mv.setViewName("createowner.jsp");
		return mv;
	}

	@RequestMapping("saveOwner")
	public ModelAndView saveOwner() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("result", "Data is saved");
		mv.setViewName("ownermessage.jsp");
		return mv;
	}
}


package com.jsp.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Hospital;

@Controller
public class HospitalDao {
	@RequestMapping("/loadhospital")
	public ModelAndView load() {
		ModelAndView mv=new ModelAndView("registerhospital.jsp");
		mv.addObject("hospital", new Hospital());
		return mv;
		
	}
	@RequestMapping("/savehospital")
	public ModelAndView save(@ModelAttribute Hospital hospital) {
		
		ModelAndView mv=new ModelAndView("index.jsp");
		mv.addObject("savedata",hospital);
		return mv;
	}
	
	public ModelAndView display() {
		List<Hospital> list=new ArrayList<Hospital>();
		
		Hospital hospital=new Hospital();
		hospital.setId(1);
		hospital.setName("srisowmya");
		hospital.setWebsite("sri@bjsqjh");
		
		hospital.setId(2);
		hospital.setName("gatee");
		hospital.setWebsite("guhhi@ghgj");
		
		ModelAndView mv=new ModelAndView("display.jsp");
		mv.addObject("listhospital",list);
		return mv;
		
		
	}
	

}

package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;

@Controller

public class HospitalController {
	@Autowired
	HospitalService service;

	@RequestMapping("/loadhospital")
	public ModelAndView load() {
		ModelAndView mv = new ModelAndView("registerhospital.jsp");
		mv.addObject("hospital", new Hospital());
		return mv;

	}

	@RequestMapping("/savehospital")
	public ModelAndView save(@ModelAttribute Hospital hospital) {
//first the loadhospital create the object of hospital.so we have to call loadhospital and form is opened 
//and in action attribute present in register.jsp we have to pass the url of "savehospital" to save the data into database
		Hospital hospital2 = service.saveService(hospital);
		if (hospital2 != null) {
			ModelAndView mv = new ModelAndView("index.jsp");
			mv.addObject("savedata", hospital);
			mv.addObject("msg", "data is saved");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("/loadhospital");
			return mv;
		}
	}

	@RequestMapping("/deletehospital")
	public ModelAndView delete(@ModelAttribute Hospital hospital) {
		Hospital hospital2 = service.deleteService(2);
		if (hospital2 != null) {
			ModelAndView mv = new ModelAndView("delete.jsp");
			mv.addObject("deletedata", hospital);
			mv.addObject("msg", "data is deleted");

			return mv;
		} else {
			ModelAndView mv = new ModelAndView("/loadhospital");
			return mv;
		}
	}

	@RequestMapping("/updatehospital")
	public ModelAndView update(@ModelAttribute Hospital hospital) {
		// first loadhospital and in the register.jsp change the path of action
		// attritube from savehospital to updatehospital url
		// so that the data present in database is updated
		Hospital hospital2 = service.updateService(hospital);
		if (hospital2 != null) {
			ModelAndView mv = new ModelAndView("update.jsp");
			mv.addObject("updatedata", hospital);
			mv.addObject("msg", "data updated");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("/loadhospital");
			return mv;
		}

	}

	@RequestMapping("/getall")
	public ModelAndView getAll() {
		List<Hospital> list = service.getAllService();
		if (list != null) {
			ModelAndView mv = new ModelAndView("getall.jsp");
			mv.addObject("list", list);
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("/loadhospital");
			return mv;
		}
	}

	@RequestMapping("/getbyid")
	public ModelAndView getById() {
		Hospital hospital = service.getByIdService(1);
		if (hospital != null) {
			ModelAndView mv = new ModelAndView("getbyid.jsp");
			mv.addObject("getdata", hospital);
			return mv;

		} else {
			ModelAndView mv = new ModelAndView("/loadhospital");
			return mv;
		}
	}
}

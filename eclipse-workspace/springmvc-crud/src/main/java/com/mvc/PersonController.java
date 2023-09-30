package com.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //3 job to create controller
public class PersonController {
   @Autowired
   PersonDaoImpl personDaoImpl; //field injection
  
   @RequestMapping("createperson")
   public ModelAndView createPerson() {
	   ModelAndView mv=new ModelAndView();
	   mv.addObject("person", new PersonModel());
	   mv.setViewName("createperson.jsp");
	   return mv;
   }
   
   @RequestMapping("saveperson")
   public ModelAndView savePerson(@ModelAttribute PersonModel person) {//it is used to collect entire object data
	   String message=personDaoImpl.savePerson(person);
	   ModelAndView mv=new ModelAndView();
	   mv.addObject("result",message);
	   mv.setViewName("personmessage.jsp");
	   return mv;
   }
   
}

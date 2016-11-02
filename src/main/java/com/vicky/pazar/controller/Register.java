package com.vicky.pazar.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.vicky.pazar.model.Registermodel;



@Controller
@RequestMapping(value="/register")

public class Register {
	
	
		@RequestMapping(method=RequestMethod.GET)
		 public String viewRegistration(ModelMap m) {
	         
	      m.addAttribute("regForm",new Registermodel());
	      m.addAttribute("clickregsss",1);  
			  List<String> gendertype = new ArrayList<>();
	        gendertype.add("Male");
	        gendertype.add("Female");
	        
	        m.addAttribute("gendertype", gendertype);
	         
			     
			return "index";
		}

		@RequestMapping(method=RequestMethod.POST)
		public String loginsucces(@ModelAttribute("regForm")Registermodel reg)
		{
			System.out.println(reg.getEmail());
			System.out.println(reg.getPassword());
			System.out.println(reg.getUsername());
			System.out.println(reg.getBirthdate());
			System.out.println(reg.getGender());
			
			return "index";
			
		}
		
		
}

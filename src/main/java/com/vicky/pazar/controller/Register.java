package com.vicky.pazar.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vicky.pazar.model.Registermodel;



@Controller
@RequestMapping(value="/register")

public class Register {
	
	
		@RequestMapping(method=RequestMethod.GET)
		 public String viewRegistration(Map<String, Object> model) {
	      Registermodel   regForm = new Registermodel();    
	       
			model.put("regForm", regForm);
	         
			  List<String> gendertype = new ArrayList<>();
	        gendertype.add("Developer");
	        gendertype.add("Designer");
	        
	        model.put("gendertype", gendertype);
	         
			         
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

package com.vicky.pazar.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vicky.pazar.dao.RegDAO;
import com.vicky.pazar.model.Register;



@Controller
@Transactional
@RequestMapping(value="/register")

public class Registercontroller {
	@Autowired
	RegDAO rgs;
		@RequestMapping(method=RequestMethod.GET)
		 public String viewRegistration(ModelMap m) {
	         
	      m.addAttribute("regForm",new Register());
	      m.addAttribute("clickregsss",1);  
			  List<String> gendertype = new ArrayList<>();
	        gendertype.add("Male");
	        gendertype.add("Female");
	        
	        m.addAttribute("gendertype", gendertype);
	    	return "index";
		}


		@RequestMapping(method=RequestMethod.POST)
		public String loginsucces(@ModelAttribute("regForm")Register reg,  Map<String, Object> model)
		{
			//System.out.println(reg.getEmail());
			rgs.save(reg);
		
		
			return "index";
			
		}
		
		
}

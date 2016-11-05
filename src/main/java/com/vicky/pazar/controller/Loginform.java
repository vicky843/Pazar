package com.vicky.pazar.controller;



import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vicky.pazar.model.LoginFormmodel;
import com.vicky.pazar.model.Registermodel;

@Controller
@RequestMapping(value="/loginpage")
public class Loginform {
	@RequestMapping(method=RequestMethod.GET)
	public String logins(ModelMap m)
	{ 
		m.addAttribute("loginForm",new LoginFormmodel());
			m.addAttribute("clickloginsss",1);
		return "index";
			
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String loginsucces(@ModelAttribute("loginForm")LoginFormmodel login)
	{
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		return "index";
		
	}
	@RequestMapping("/register")
	 public String viewRegistration(ModelMap m) {
        
     
     m.addAttribute("clickregsss",1);  
return "index";
	}
}
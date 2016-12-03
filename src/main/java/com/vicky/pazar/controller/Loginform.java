package com.vicky.pazar.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vicky.pazar.dao.RegDAO;
import com.vicky.pazar.model.LoginFormmodel;
import com.vicky.pazar.model.Register;

@Controller
@RequestMapping(value="/loginpage")

public class Loginform {
@Autowired
RegDAO rgs;
	

	@RequestMapping(method=RequestMethod.GET)
	public String logins(ModelMap m)
	{ 
		m.addAttribute("loginForm",new LoginFormmodel());
			m.addAttribute("clickloginsss",1);
		return "index";
			
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String loginsucces(@ModelAttribute("loginForm")LoginFormmodel login,ModelMap m, String username, String password)
	{
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		rgs.loginvalidate(login);
	
				return "index";
	}}


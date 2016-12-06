package com.vicky.pazar.controller;



import javax.servlet.http.HttpSession;

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
	public String loginsucces(@ModelAttribute("loginForm")LoginFormmodel login,ModelMap m,HttpSession sess)
	{
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		rgs.loginvalidate(login);
		boolean valid = rgs.loginvalidate(login);
		if(valid && rgs.userrole().equals("user"))
		{
		String uname=rgs.usernames();
		m.addAttribute("role",rgs.usernames());
	m.addAttribute("Checking","Welcome to user");
		System.out.println(uname);
		return "index";
	}
		else if(valid && rgs.userrole().equals("admin"))
		{
			
			return "adminindex";
		}
		else if(rgs.userrole().equals(""))
		{
			m.addAttribute("message","InvalidUser");
			m.addAttribute("clickloginsss",1);
			return "index";
			
		}
		else
		{
			return "index";
		}
	
	}
	
}

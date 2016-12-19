package com.vicky.pazar.controller;



import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vicky.pazar.dao.CatDAO;
import com.vicky.pazar.dao.RegDAO;
import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.LoginFormmodel;
import com.vicky.pazar.model.Register;


@Controller


public class Loginform {
@Autowired
RegDAO rgs;
@Autowired
CatDAO cats;

	@RequestMapping(value="/loginpage",method=RequestMethod.GET)
	public String logins(ModelMap m,HttpSession session)
	{ 
		m.addAttribute("loginForm",new LoginFormmodel());
		String catlist=cats.getcatList(new Categorymodel());
		session.setAttribute("catlist",catlist);
			m.addAttribute("clickloginsss",1);
		return "index";
			
	}
	
	@RequestMapping(value="/loginsucces",method=RequestMethod.POST)
	public String loginsucces(@ModelAttribute("loginForm")LoginFormmodel login,ModelMap m,HttpSession sess)
	{
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		rgs.loginvalidate(login);
		boolean valid = rgs.loginvalidate(login);
String userid = SecurityContextHolder.getContext().getAuthentication().getName();
		

		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		for (GrantedAuthority authority : authorities) 
		{
			String g=authority.getAuthority();//it return role
			System.out.println("this is role"+g+"userid"+userid);
		
		if(g.equals("ROLE_USER"))
		{
		String uname=rgs.usernames();
		m.addAttribute("role",rgs.usernames());
	m.addAttribute("Checking","Welcome to user");
	sess.setAttribute("name",rgs.usernames());
		System.out.println("login"+uname);
		
		
	}
		else if(g.equals("ROLE_ADMIN"))
		{
			
			return "adminindex";
		}
		else 
		{
			m.addAttribute("message","InvalidUser");
			m.addAttribute("clickloginsss",1);
			return "index";
			
		}
		
		}
		return "index";
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logoutprocess(HttpServletRequest request,HttpServletResponse response,ModelMap m)
	{
		System.out.println("logouting babay");
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		if(auth!=null){
		new SecurityContextLogoutHandler().logout(request, response, auth);
		m.addAttribute("clickloginsss",1);
		}
		
		return "index";
	}	
}

package com.vicky.pazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vicky.pazar.dao.CartDAO;
import com.vicky.pazar.dao.ProDAO;

@Controller
public class Cartcontroller {
	@Autowired
	CartDAO car;
	@Autowired
	ProDAO pros;
	@RequestMapping(value="/addtocart",method=RequestMethod.GET)
	public String addcart(@RequestParam("proid") String pid,ModelMap m)
	{
		m.addAttribute("cart",1);
		System.out.println("this is in cart controller");
		System.out.println(pid);
		
return "index";
	}
}

package com.vicky.pazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vicky.pazar.dao.ProDAO;

import com.vicky.pazar.model.Productmodel;

@Controller
@Transactional
@RequestMapping(value="/product")
public class Adminproduct {
	
	@Autowired
	ProDAO pros;
	@RequestMapping(method=RequestMethod.GET)
	public String pro(ModelMap m)
	{
		m.addAttribute("proForm",new Productmodel());
		return "product";
	}
	@Transactional
	@RequestMapping(method=RequestMethod.POST)
	public String prods(@ModelAttribute("proForm")Productmodel pro){
		pros.save(pro);
		return "product";
	}	
}

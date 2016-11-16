package com.vicky.pazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vicky.pazar.dao.SupDAO;
import com.vicky.pazar.model.Suppliermodel;

@Controller
@Transactional
@RequestMapping("/supplier")
public class Adminsupplier {
@Autowired
SupDAO supes;
@RequestMapping(method=RequestMethod.GET)
public String sup(ModelMap m){
	
	m.addAttribute("supForm",new Suppliermodel());
	m.addAttribute("clicksup",1);
	return "adminindex";
}
	@Transactional
	@RequestMapping(method=RequestMethod.POST)
	public String suppost(@ModelAttribute("supForm")Suppliermodel supess)
	{
		
		supes.save(supess);
		return "adminindex";
	}
}

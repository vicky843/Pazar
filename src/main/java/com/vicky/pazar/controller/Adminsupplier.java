package com.vicky.pazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vicky.pazar.dao.SupDAO;
import com.vicky.pazar.model.Suppliermodel;

@Controller


public class Adminsupplier {
@Autowired
SupDAO supes;
@RequestMapping(value="/supplier",method=RequestMethod.GET)
public String sup(ModelMap m){
	
	m.addAttribute("supForm",new Suppliermodel());
	m.addAttribute("clicksup",1);
	String supid=supes.getsupList(new Suppliermodel());
	m.addAttribute("getsupid",supid);
	return "adminindex";
}
	
	@RequestMapping(value="/supplierpost",method=RequestMethod.POST)
	public String suppost(@ModelAttribute("supForm")Suppliermodel supess,ModelMap m)
	{
		
		supes.save(supess);
		m.addAttribute("clicksup",1);
		String supid=supes.getsupList(new Suppliermodel());
	    m.addAttribute("getsupid",supid);
		return "adminindex";
	}
	@RequestMapping(value="/deleting",method=RequestMethod.GET)
	public String deletings (@RequestParam("supid")String sid,ModelMap m)
	{
		supes.delete(sid);
		m.addAttribute("supForm",new Suppliermodel());
		m.addAttribute("clicksup",1);
	
		  String supid=supes.getsupList(new Suppliermodel());
		    m.addAttribute("getsupid",supid);
		return "adminindex";
	}	
}

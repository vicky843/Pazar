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
	m.addAttribute("savesup",1);
	m.addAttribute("supForm",new Suppliermodel());
	m.addAttribute("clicksup",1);
	String supid=supes.getsupList(new Suppliermodel());
	m.addAttribute("getsupid",supid);
	return "adminindex";
}
	
	@RequestMapping(value="/supplierpost",method=RequestMethod.POST)
	public String suppost(@ModelAttribute("supForm")Suppliermodel supess,ModelMap m)
	{
		m.addAttribute("savesup",1);
		supes.save(supess);
		m.addAttribute("clicksup",1);
		String supid=supes.getsupList(new Suppliermodel());
	    m.addAttribute("getsupid",supid);
		return "adminindex";
	}
	@RequestMapping(value="/deleting",method=RequestMethod.GET)
	public String deletings (@RequestParam("supid")String sid,ModelMap m)
	{
		m.addAttribute("savesup",1);
		supes.delete(sid);
		m.addAttribute("supForm",new Suppliermodel());
		m.addAttribute("clicksup",1);
	
		  String supid=supes.getsupList(new Suppliermodel());
		    m.addAttribute("getsupid",supid);
		return "adminindex";
	}	
	@RequestMapping(value="/updated",method=RequestMethod.GET)
	public String update(@RequestParam("supid")String sid,ModelMap m)
	{
		
	    Suppliermodel supl=supes.getsup(sid);
		m.addAttribute("clicksup",1);
		m.addAttribute("updatesup",1);
		 String supid=supes.getsupList(new Suppliermodel());
		    m.addAttribute("getsupid",supid);
	m.addAttribute("supForm",supl);
		return "adminindex";
	}
	
	@RequestMapping(value="/supplierupdate",method=RequestMethod.POST)
	public String updatsup(@ModelAttribute("supForm")Suppliermodel sid,ModelMap m)
	{
		supes.update(sid);

		m.addAttribute("savesup",1);
		 m.addAttribute("clicksup",1);
		String supid=supes.getsupList(new Suppliermodel());
	    m.addAttribute("getsupid",supid);
	   
		return "adminindex";
		
	}
}

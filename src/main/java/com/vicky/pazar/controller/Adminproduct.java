package com.vicky.pazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vicky.pazar.dao.ProDAO;
import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.Productmodel;
import com.vicky.pazar.model.Suppliermodel;

@Controller
@Transactional

public class Adminproduct {
	
	@Autowired
	ProDAO pros;
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String pro(ModelMap m)
	{
		m.addAttribute("proForm",new Productmodel());
	    m.addAttribute("clickpro",1);
	    String catid=pros.getcatList(new Categorymodel());
	    m.addAttribute("getcatid",catid);
	    String supid=pros.getsupList(new Suppliermodel());
	    m.addAttribute("getsupid",supid);
	    String proid=pros.getprolist(new Productmodel());
	    m.addAttribute("getproid",proid);
		return "adminindex";
	}
	@Transactional
	@RequestMapping(value="/productpost",method=RequestMethod.POST)
	public String prods(@ModelAttribute("proForm")Productmodel pro){
		pros.save(pro);
		return "adminindex";
	}
	@Transactional
	@RequestMapping(value="/delete",method=RequestMethod.GET)
public String delprods(@ModelAttribute("proForm")Productmodel pro){
	pros.delete(pro);
	return "adminindex";

}
	
}

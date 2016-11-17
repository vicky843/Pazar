package com.vicky.pazar.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vicky.pazar.dao.CatDAO;
import com.vicky.pazar.dao.ProDAO;
import com.vicky.pazar.dao.SupDAO;
import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.Productmodel;
import com.vicky.pazar.model.Suppliermodel;

@Controller
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
	
	@RequestMapping(value="/productpost",method=RequestMethod.POST)
	public String prod(@ModelAttribute("proForm")Productmodel pro,ModelMap m){
		pros.save(pro);
		m.addAttribute("clickpro",1);
		//m.addAttribute("clicksup",1); this is used to navigate to supplier
	//	m.addAttribute("supForm",new Suppliermodel()); this is used to navigat to supplier if we execute to this line
		  String catid=pros.getcatList(new Categorymodel());
		    m.addAttribute("getcatid",catid);
		    String supid=pros.getsupList(new Suppliermodel());
		    m.addAttribute("getsupid",supid);
		    String proid=pros.getprolist(new Productmodel());
		    m.addAttribute("getproid",proid);
		return "adminindex";
	}

	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String del(@RequestParam("proid") String pid,ModelMap m)
	{
		pros.delete(pid);//pros is defined as productdao.
		m.addAttribute("proForm",new Productmodel());
	    m.addAttribute("clickpro",1);
	    String catid=pros.getcatList(new Categorymodel());
	    m.addAttribute("getcatid",catid);
	    String supid=pros.getsupList(new Suppliermodel());
	    m.addAttribute("getsupid",supid);
	    String proid=pros.getprolist(new Productmodel());
	    m.addAttribute("getproid",proid);
		
		System.out.println("this is done");
		return "adminindex";//this will return to adminindex.
	}
	@RequestMapping(value="/update")
	public String upda(@RequestParam("proid") String pid,ModelMap m)
	{
		System.out.println("this is controller");
		pros.update(pid);
		System.out.println("this is controller");
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
	}


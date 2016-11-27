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
import com.vicky.pazar.model.Product;
import com.vicky.pazar.model.Suppliermodel;

@Controller
public class Adminproduct {
	
	@Autowired
	ProDAO pros;
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String pro(ModelMap m)
	{
		m.addAttribute("Saveprocess",1);
		m.addAttribute("proForm",new Product());
		System.out.println("this is product table");
	    m.addAttribute("clickpro",1);
	    String catid=pros.getcatList(new Categorymodel());
	    m.addAttribute("getcatid",catid);
	    String supid=pros.getsupList(new Suppliermodel());
	    m.addAttribute("getsupid",supid);
	    String proid=pros.getprolist(new Product());
	    m.addAttribute("getproid",proid);
		return "adminindex";
	}
	
	@RequestMapping(value="/productpost",method=RequestMethod.POST)
	public String prod(@ModelAttribute("proForm")Product pro,ModelMap m){
		m.addAttribute("Saveprocess",1);
		pros.save(pro);
		m.addAttribute("clickpro",1);
		//m.addAttribute("clicksup",1); this is used to navigate to supplier
	//	m.addAttribute("supForm",new Suppliermodel()); this is used to navigat to supplier if we execute to this line
		  String catid=pros.getcatList(new Categorymodel());
		    m.addAttribute("getcatid",catid);
		    String supid=pros.getsupList(new Suppliermodel());
		    m.addAttribute("getsupid",supid);
		    String proid=pros.getprolist(new Product());
		    m.addAttribute("getproid",proid);
		return "adminindex";
	}

	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String del(@RequestParam("proid") String pid,ModelMap m)
	{
		m.addAttribute("Saveprocess",1);
		pros.delete(pid);//pros is defined as productdao.
		m.addAttribute("proForm",new Product());
	    m.addAttribute("clickpro",1);
	    String catid=pros.getcatList(new Categorymodel());
	    m.addAttribute("getcatid",catid);
	    String supid=pros.getsupList(new Suppliermodel());
	    m.addAttribute("getsupid",supid);
	    String proid=pros.getprolist(new Product());
	    m.addAttribute("getproid",proid);
		
		System.out.println("this is done");
		return "adminindex";//this will return to adminindex.
	}
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String upda(@RequestParam("proid") String pid,ModelMap m)//from requestpara
	{
		
		Product po=pros.getpro(pid);//it wil store address with value.
		//if we use new it will store only address but not values.
		 m.addAttribute("clickpro",1);
		m.addAttribute("Updateprocess",1);
		 		System.out.println("this is getcontroller");
 			    String catid=pros.getcatList(new Categorymodel());
		    String supid=pros.getsupList(new Suppliermodel());
	  	    String proid=pros.getprolist(new Product());
	    m.addAttribute("getcatid",catid);
	    m.addAttribute("getsupid",supid);
	    m.addAttribute("getproid",proid);
	    m.addAttribute("proForm",po);
		return "adminindex";
		
	}
	@RequestMapping(value="/updateproduct",method=RequestMethod.POST)
	public String updaprod(@ModelAttribute("proForm")Product pro,ModelMap m)
	{
		pros.update(pro);
		
		m.addAttribute("Saveprocess",1);
		m.addAttribute("clickpro",1);
		System.out.println("this is update");
	    String catid=pros.getcatList(new Categorymodel());
	    m.addAttribute("getcatid",catid);
	    String supid=pros.getsupList(new Suppliermodel());
	    m.addAttribute("getsupid",supid);
	    String proid=pros.getprolist(new Product());
	    m.addAttribute("getproid",proid);
	    m.addAttribute("proForm",new Product());
		return "adminindex";
	}
	}


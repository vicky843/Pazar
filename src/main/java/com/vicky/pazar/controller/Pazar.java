package com.vicky.pazar.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vicky.pazar.dao.CatDAO;
import com.vicky.pazar.dao.ProDAO;
import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.Productmodel;
import com.vicky.pazar.model.Suppliermodel;

@Controller
public class Pazar {
	@Autowired  //creates object automatically for proDAO.
	ProDAO pros;
	@Autowired
	CatDAO cats;
	
@RequestMapping("/")//this is displaying header and footer.
public String home( ModelMap m,HttpSession session)
{
	
	String catlist=cats.getcatList();
	session.setAttribute("catlist",catlist);
	System.out.println("this is productdisplay"+catlist);
	return "index";//it indicates index.jsp.
	}

	
@RequestMapping("/aboutus")
public String aboutt(Model m)//it will navigate to aboutus
{
	m.addAttribute("about", 1);
return "index";
}
@RequestMapping("/contactus")
public String contact(Model m)//it will navigate to contactus
{
m.addAttribute("contact", 1);
return "index";
}
@RequestMapping("/home")
public String homes(Model m)//it will navigate to carousel(home).
{
	m.addAttribute("home", 1);
return "index";
}
@RequestMapping(value="/userproduct",method=RequestMethod.GET)
public String userp(ModelMap m)//it will get values from database & retrieve value to userend
{
	m.addAttribute("proForm",new Productmodel());
m.addAttribute("userpro",1);
String catid=pros.getcatList(new Categorymodel());
m.addAttribute("getcatid",catid);
String supid=pros.getsupList(new Suppliermodel());
m.addAttribute("getsupid",supid);
String proid=pros.getprolist(new Productmodel());
m.addAttribute("getproid",proid);
return "index";
}

@RequestMapping(value="/displaycat",method=RequestMethod.GET)
public String getcatlist(@RequestParam("catid") String catlist)
{

	 catlist=cats.getcatList();
	
	System.out.println("this is productdisplayss"+catlist);
	return "index";//it indicates index.jsp.
	}
/*	 
	String cat_list=cats.getcatList();
	m.addAttribute("getcatList",cat_list);
	System.out.println("this is productdisplaysss"+cat_list);
	return "index";
}*/
}

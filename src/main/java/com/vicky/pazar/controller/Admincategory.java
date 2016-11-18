package com.vicky.pazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vicky.pazar.dao.CatDAO;
import com.vicky.pazar.model.Categorymodel;

@Controller

public class Admincategory {
@Autowired
CatDAO cats;
@RequestMapping(value="/category",method=RequestMethod.GET)
public String adminget(ModelMap m){
	m.addAttribute("catForm",new Categorymodel());
	m.addAttribute("clickcat",1);
	
	String catid=cats.getcatList(new Categorymodel());//instation
    m.addAttribute("getcatid",catid);
	return "adminindex";
	
}

@RequestMapping( value="/categorypost",method=RequestMethod.POST)
public String admin(@ModelAttribute("catForm")Categorymodel cat,ModelMap m){
	cats.save(cat);
	m.addAttribute("clickcat",1);//it will navigate to same page.
	String catid=cats.getcatList(new Categorymodel());
    m.addAttribute("getcatid",catid);
	return "adminindex";
	
}
@RequestMapping(value="/deleted",method=RequestMethod.GET)
public String delts(@RequestParam("catid")String cid,ModelMap m)
{
	cats.delete(cid);
	m.addAttribute("catForm",new Categorymodel());
m.addAttribute("clickcat",1);
String catid=cats.getcatList(new Categorymodel());
m.addAttribute("getcatid",catid);
return "adminindex";
}

}

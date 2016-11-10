package com.vicky.pazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vicky.pazar.dao.CatDAO;
import com.vicky.pazar.model.Categorymodel;

@Controller
@Transactional
@RequestMapping(value="/category")
public class Admincategory {
@Autowired
CatDAO cats;
@RequestMapping(method=RequestMethod.GET)
public String adminget(ModelMap m){
	m.addAttribute("catForm",new Categorymodel());
	m.addAttribute("clickcat",1);
	return "category";
	
}
@Transactional
@RequestMapping(method=RequestMethod.POST)
public String admin(@ModelAttribute("catForm")Categorymodel cat){
	cats.save(cat);
	return "category";
	
}
}

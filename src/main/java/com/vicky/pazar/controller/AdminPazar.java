package com.vicky.pazar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vicky.pazar.dao.RegDAO;
import com.vicky.pazar.model.Product;
import com.vicky.pazar.model.Registermodel;

@Controller
public class AdminPazar {

	@Autowired
	RegDAO rgs;
@RequestMapping("/adminindex")//this is displaying header and footer.
public String home()
{
	return "adminindex";//it indicates index.jsp.
	}

@RequestMapping(value="/registervalues",method=RequestMethod.GET)
public String viewRegi(ModelMap m) {
    
    m.addAttribute("regForm",new Registermodel());
    m.addAttribute("clickregtrs",1); 
      String username=rgs.getreglist(new Registermodel());
      m.addAttribute("getusername",username);
      System.out.println("this is working");
  	return "adminindex";
	}

}

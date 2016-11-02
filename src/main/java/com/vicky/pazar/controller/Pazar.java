package com.vicky.pazar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pazar {
@RequestMapping("/")//this is displaying header and footer.
public String home()
{
	return "index";//it indicates index.jsp.
	}

	
@RequestMapping("/aboutus")
public String aboutt(Model m)//it will navigate to aboutus
{
	m.addAttribute("about", 1);
return "index";
}
@RequestMapping("/contactus")
public String contact(Model m)
{
m.addAttribute("contact", 1);
return "index";
}
@RequestMapping("/home")
public String homes(Model m)//it will navigate to aboutus
{
	m.addAttribute("home", 1);
return "index";
}
}

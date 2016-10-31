package com.vicky.pazar;

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
@RequestMapping("/loginpage")
public String login(Model m)//it will move to login page
{
	m.addAttribute("clickloginsss", 1);
return "index";	
}
@RequestMapping("/register")
public String reg(Model m)//it will move register page
{
	m.addAttribute("clickregsss", 1);
	return "index";
	}
@RequestMapping("/aboutus")
public String aboutt(Model m)//it will navigate to aboutus
{
	m.addAttribute("about", 1);
return "index";
}
@RequestMapping("/home")
public String homes(Model m)//it will navigate to aboutus
{
	m.addAttribute("home", 1);
return "index";
}
}

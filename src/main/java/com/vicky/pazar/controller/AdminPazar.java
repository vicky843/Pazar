package com.vicky.pazar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminPazar {

@RequestMapping("/category")//this is displaying header and footer.
public String home()
{
	return "adminindex";//it indicates index.jsp.
	}

	
}

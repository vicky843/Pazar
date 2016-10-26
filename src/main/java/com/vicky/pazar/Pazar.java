package com.vicky.pazar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pazar {
@RequestMapping("/")//this is displaying header and footer.//
public String home()
{
	return "index";//it indicates index.jsp.
	}

}

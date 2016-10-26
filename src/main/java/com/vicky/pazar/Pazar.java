package com.vicky.pazar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pazar {
@RequestMapping("/")
public String home()
{
	return "index";
	}

}

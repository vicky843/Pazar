package com.vicky.pazar.controller;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vicky.pazar.dao.CartDAO;
import com.vicky.pazar.dao.ProDAO;
import com.vicky.pazar.model.Cartmodel;
import com.vicky.pazar.model.Product;

@Controller
public class Cartcontroller {
	@Autowired
	CartDAO car;
	@Autowired
	ProDAO pros;
	/*@Autowired
	Cartmodel cart;*/
	
	@RequestMapping(value="/displaycat",method=RequestMethod.GET)
	public String getcatlist(@RequestParam("proid") String prods,ModelMap m)
	{
	m.addAttribute("userprods",1);
	List<Product> prod=pros.getprodlist(prods);

	System.out.println(prod);
	m.addAttribute("getprodlist",prod);//this is used to get list from prodaoimp.

		return "index";//it indicates index.jsp.
		}
	@RequestMapping(value="/addtocart",method=RequestMethod.GET)
	public String addcart(@RequestParam("proid") String pid,ModelMap m)
	{
          m.addAttribute("cart",new Cartmodel());		
		/*m.addAttribute("cart",1);*/
		System.out.println("this is in cart controller");
		Product pro=new Product();
	System.out.println(pid);
	Cartmodel cart=new Cartmodel();
/*	cart.setCartid("dssdc");*/
	cart.setCartid(ThreadLocalRandom.current().nextLong(100,10000 +1));
cart.setProid(pro.getProid());
cart.setProprice(pro.getProprice());
cart.setQuantity("1");
cart.setStatus("N");

System.out.println("cartid"+ThreadLocalRandom.current().nextLong(100,10000 +1));
System.out.println("this is available for cart"+pro.getProprice());
car.save(cart);
System.out.println("cartview"+pro.getProprice());
System.out.println("cartview2"+cart.getQuantity());
return "index";
	}
}

package com.vicky.pazar.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vicky.pazar.dao.CartDAO;
import com.vicky.pazar.dao.ProDAO;
import com.vicky.pazar.model.Cart;
import com.vicky.pazar.model.Product;

@Controller
public class Cartcontroller {
	@Autowired
	CartDAO car;
	@Autowired
	ProDAO pros;
	/*@Autowired
	Cartmodel cart;*/
	@Autowired
	Product pro;
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
	public String addcart(@RequestParam("proid") String pid,ModelMap m,HttpSession sess)
	{
		String pattern="yyyy-MM-dd ";
          m.addAttribute("cart",new Cart());		
		/*m.addAttribute("cart",1);*/
		System.out.println("this is in cart controller");
//		/*Product pro=new Product();*/this will pass only address
		List<Product> prod=pros.getprodlist(pid);
		m.addAttribute("getprodlist",prod);
	System.out.println(pid);
	Cart cart=new Cart();

	pro=pros.getpro(pid);

	String randomid = UUID.randomUUID().toString();

	Date dates = new Date();

	SimpleDateFormat currentdate = new SimpleDateFormat(pattern);
	String cartdate = currentdate.format(dates);
	/*cart.setCartid(ThreadLocalRandom.current().nextLong(100,10000 +1));*/
cart.setCartid(randomid);
	cart.setProid(pro.getProid());
cart.setProprice(pro.getProprice());
cart.setQuantity("1");
cart.setStatus("N");
cart.setDate_added(cartdate);
cart.setUsername((String) sess.getAttribute("name"));
cart.setProname(pro.getProname());
System.out.println("cartid"+ThreadLocalRandom.current().nextLong(100,10000 +1));
System.out.println("this is available for cart"+pro.getProprice());
car.save(cart);
m.addAttribute("cart",1);
/*m.addAttribute("userprods",1);*/
System.out.println("username"+(String) sess.getAttribute("name"));
System.out.println("cartview"+pro.getProprice());
System.out.println("cartview2"+cart.getQuantity());
return "index";
	}
	@RequestMapping(value="/addcart",method=RequestMethod.GET)
	public String getcartlist(HttpSession sess,ModelMap m)
	{
		m.addAttribute("cart",1);
		String s=(String) sess.getAttribute("name");
	List<Cart>cartslist=car.getcartlist(s);
		System.out.println("this is cartdisplay");
		m.addAttribute("getcartlist",cartslist);
		
		return "index";
		
	}
@RequestMapping("/del")
public String del(@RequestParam("cartid")Cart cd,ModelMap m)
{
	System.out.println("in del1");
	car.delete(cd);
	System.out.println("in del2");
return "index";	
}
}

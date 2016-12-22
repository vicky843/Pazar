package com.vicky.pazar.webflow;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.webflow.execution.RequestContext;

import com.google.gson.Gson;
import com.vicky.pazar.dao.CartDAO;
import com.vicky.pazar.dao.OrderDAO;
import com.vicky.pazar.model.Billingmodel;
import com.vicky.pazar.model.Cart;
import com.vicky.pazar.model.Ordermodel;
import com.vicky.pazar.model.Shippingmodel;

@Component
public class CheckOutFlow {
@Autowired
OrderDAO ordi;
@Autowired
CartDAO cart;
	
	public Ordermodel initFlow() {
		Ordermodel orders=new Ordermodel();
		return orders;
	}
	public String addShipdetails(Ordermodel order,Shippingmodel shipaddress,RequestContext context )
	{
		Gson gson=new Gson();
		String shipaddressng=gson.toJson(shipaddress);
		System.out.println("this is shipng"+shipaddress);
		order.setShippingaddress(shipaddressng);
		HttpSession session = ((HttpServletRequest)context.getExternalContext().getNativeRequest()).getSession();
		  session.setAttribute("shipaddress",shipaddress);
	
		String	userid= SecurityContextHolder.getContext().getAuthentication().getName();
		 
			String randomid = UUID.randomUUID().toString();
			List<Cart>  car=cart.getcartlist(userid);
			System.out.println("randomid"+randomid);
			System.out.println("userid"+userid);
			order.setOrderid(randomid);
			order.setUsername(userid);
			
 ordi.save(order);
			return "buyingprocess";
		
	}
public String addBilldetails(Ordermodel order,Billingmodel billaddress,RequestContext context)
{
	
	Gson gson=new Gson();
	String jobson=gson.toJson(billaddress);

	HttpSession session = ((HttpServletRequest)context.getExternalContext().getNativeRequest()).getSession();
	order.setBillingaddress(jobson);
/*	String	userid= SecurityContextHolder.getContext().getAuthentication().getName();*/
	session.setAttribute("billaddress",billaddress);

	/*session.setAttribute("userid",userid);*/
return"buyingprocess";
}
public String saveorder(Ordermodel order)
{
	System.out.println("it is in saving order process");
	ordi.save(order);
return "buyingprocess";	
}

}


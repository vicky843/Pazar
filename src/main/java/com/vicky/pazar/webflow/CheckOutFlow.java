package com.vicky.pazar.webflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.vicky.pazar.dao.OrderDAO;
import com.vicky.pazar.model.Billingmodel;
import com.vicky.pazar.model.Ordermodel;
import com.vicky.pazar.model.Shippingmodel;

@Component
public class CheckOutFlow {
@Autowired
OrderDAO ordi;
	
	public Ordermodel initFlow() {
		Ordermodel orders=new Ordermodel();
		return orders;
	}
	public String addShipdetails(Ordermodel order,Shippingmodel shipaddress )
	{
		Gson gson=new Gson();
		String shipaddressng=gson.toJson(shipaddress);
		System.out.println("this is shipng"+shipaddress);
order.setShippingaddress(shipaddressng);
		return "buyingprocess";
		
	}
public String addBilldetails(Ordermodel order,Billingmodel billaddress)
{
	
	Gson gson=new Gson();
	String jobson=gson.toJson(billaddress);
	order.setBillingaddress(jobson);
return"buyingprocess";
}
/*public String saveorder(Ordermodel order)
{
	System.out.println("it is in saving order process");
	ordi.save(order);
return "buyingprocess";	
}*/

}


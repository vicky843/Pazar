package com.vicky.pazar.webflow;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.vicky.pazar.model.Ordermodel;
import com.vicky.pazar.model.Shippingmodel;

@Component
public class CheckOutFlow {

	
	public Ordermodel initFlow() {
		Ordermodel orders=new Ordermodel();
		return orders;
	}
	/*public String addshipdetails(Ordermodel order,Shippingmodel shipaddress )
	{
		Gson gson=new Gson();
		String shipaddressng=gson.toJson(shipaddress);
		System.out.println("this is shipng"+shipaddress);
order.setShippingaddress(shipaddressng);
		return "buyingprocess";
		
	}*/
}

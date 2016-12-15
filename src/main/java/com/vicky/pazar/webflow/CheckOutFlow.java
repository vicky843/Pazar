package com.vicky.pazar.webflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vicky.pazar.model.Ordermodel;

@Component
public class CheckOutFlow {

	
	public Ordermodel initFlow() {
		Ordermodel orders=new Ordermodel();
		return orders;
	}
}

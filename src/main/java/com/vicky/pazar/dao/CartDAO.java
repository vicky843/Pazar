package com.vicky.pazar.dao;

import java.util.List;

import com.vicky.pazar.model.Cart;



public interface CartDAO {

	public boolean save(Cart cart);
	
	public List<Cart>getcartlist(String username);
	//this is used to display list
	public boolean delete(String carid);
	
	public boolean update(String  cartid);
	

}

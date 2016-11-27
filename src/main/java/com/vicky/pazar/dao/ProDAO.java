package com.vicky.pazar.dao;


import java.util.List;

import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.Product;
import com.vicky.pazar.model.Suppliermodel;


public interface ProDAO {
	
	
	
public boolean save(Product product);

public boolean update(Product product);

public boolean delete(String pid);//we create String because we need to store in it

public String getcatList(Categorymodel category);

public String getsupList(Suppliermodel supplier);

public String getprolist(Product product);

public Product getpro(String id);

public List<Product> getprodlist(String prodid);//this is used to get products by category
}

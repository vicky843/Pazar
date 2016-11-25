package com.vicky.pazar.dao;


import java.util.List;

import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.Productmodel;
import com.vicky.pazar.model.Suppliermodel;


public interface ProDAO {
	
	
	
public boolean save(Productmodel product);

public boolean update(Productmodel product);

public boolean delete(String pid);//we create String because we need to store in it

public String getcatList(Categorymodel category);

public String getsupList(Suppliermodel supplier);

public String getprolist(Productmodel product);

public Productmodel getpro(String id);

public List<Productmodel> getprodlist(String prodid);//this is used to get products by category
}

package com.vicky.pazar.dao;


import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.Productmodel;
import com.vicky.pazar.model.Suppliermodel;


public interface ProDAO {
public boolean save(Productmodel product);
//public boolean update(Productmodel product);
//public boolean delete(Productmodel product);
public String getcatList(Categorymodel category);
public String getsupList(Suppliermodel supplier);

}

package com.vicky.pazar.dao;


import com.vicky.pazar.model.Registermodel;


public interface RegDAO {
	public boolean save(Registermodel register);

public String getreglist(Registermodel register);

//public Registermodel getreg(String id);

}

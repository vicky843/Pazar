package com.vicky.pazar.dao;


import com.vicky.pazar.model.LoginFormmodel;
import com.vicky.pazar.model.Register;


public interface RegDAO {
	public boolean save(Register register);

public String getreglist(Register register);

//public Registermodel getreg(String id);
public String loginvalidate(LoginFormmodel login);
}

package com.vicky.pazar.dao;


import java.util.List;


import com.vicky.pazar.model.Productmodel;

public interface ProDAO {
public boolean save(Productmodel product);
public boolean update(Productmodel product);
public boolean delete(Productmodel product);

public Productmodel get(String id);
public List<Productmodel> list();
}

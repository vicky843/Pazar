package com.vicky.pazar.dao;

import java.util.List;

import com.vicky.pazar.model.Categorymodel;

public interface CatDAO {
public boolean save(Categorymodel category);
public boolean update(Categorymodel category);
public boolean delete(Categorymodel category);

public Categorymodel get(String id);
public List<Categorymodel> list();
}

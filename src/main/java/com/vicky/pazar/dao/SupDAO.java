package com.vicky.pazar.dao;

import java.util.List;


import com.vicky.pazar.model.Suppliermodel;

public interface SupDAO {
public boolean save(Suppliermodel supplier);
public boolean update(Suppliermodel supplier);
public boolean delete(Suppliermodel supplier);
public Suppliermodel get(String id);
public List<Suppliermodel> list();
}

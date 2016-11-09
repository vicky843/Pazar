package com.vicky.pazar.daoimpl;

import java.util.List;
import java.util.function.Supplier;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vicky.pazar.dao.CatDAO;
import com.vicky.pazar.dao.SupDAO;
import com.vicky.pazar.model.Suppliermodel;

@Repository
public class SupDAOImpl implements SupDAO{
private SessionFactory sessionFactory;
 public SupDAOImpl(SessionFactory sessionFactory) {
	// TODO Auto-generated constructor stub
	this.sessionFactory=sessionFactory;
}

@Transactional
public boolean save(Suppliermodel supplier) {
try {
	sessionFactory.getCurrentSession().save(supplier);
	return true;
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	return false;
}
}

@Transactional
public boolean update(Suppliermodel supplier) {
	try {
		sessionFactory.getCurrentSession().update(supplier);
		return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}
@Transactional
public boolean delete(Suppliermodel supplier) {
	try {
		sessionFactory.getCurrentSession().delete(supplier);
		return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}

@Transactional
public Suppliermodel get(String id) {
return(Suppliermodel)sessionFactory.getCurrentSession().get(Supplier.class, id);
}

@Transactional
public List<Suppliermodel> list() {
	String k="from Supplier";
	Query query=(Query) sessionFactory.getCurrentSession().createQuery(k);
	return ((SupDAO) query).list();
}
}

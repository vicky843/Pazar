package com.vicky.pazar.daoimpl;

import java.util.List;
import java.util.function.Supplier;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
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
	sessionFactory.getCurrentSession().save(supplier);//save purpose
	return true;
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	return false;
}
}

@Transactional
public boolean delete(String sid) {//delete purpose
	try {
		Suppliermodel s=(Suppliermodel) sessionFactory.getCurrentSession().get(Suppliermodel.class, sid);
		sessionFactory.getCurrentSession().delete(s);
		return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}



@Transactional
public String getsupList(Suppliermodel supplier) {//to get whole list
@SuppressWarnings("unchecked")
List<Suppliermodel> sup_list=(List<Suppliermodel>)sessionFactory.getCurrentSession().createCriteria(Suppliermodel.class).list();
Gson gson=new Gson();
 String sup_json=gson.toJson(sup_list);
	return sup_json;
}

@Transactional
public boolean update(Suppliermodel supplier) {
	try {
		sessionFactory.getCurrentSession().update(supplier);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	
}

@Transactional
public Suppliermodel getSupplier(String sid) {
	return(Suppliermodel)sessionFactory.getCurrentSession().get(Supplier.class, sid);
	
}


}

package com.vicky.pazar.daoimpl;


import java.util.List;
import java.util.Locale.Category;
import java.util.function.Supplier;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import com.vicky.pazar.dao.ProDAO;
import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.Productmodel;
import com.vicky.pazar.model.Suppliermodel;
@Repository
public class ProDAOImpl implements ProDAO{
private SessionFactory sessionFactory;
 public ProDAOImpl(SessionFactory sessionFactory) {
	this.sessionFactory=sessionFactory;
}
	@Transactional
	public boolean save(Productmodel product) {
      try {
		sessionFactory.getCurrentSession().save(product);
		return true;
	} catch (Exception e) {
		
		e.printStackTrace();
		return false;
	}
		
	}
    
	
	@Transactional
	public String getcatList(Categorymodel category) {
	
		@SuppressWarnings("unchecked")
		List<Categorymodel> cat_list=(List<Categorymodel>)sessionFactory.getCurrentSession().createCriteria(Categorymodel.class).list();
				Gson gson=new Gson();
			String cat_json=gson.toJson(cat_list);
		return cat_json;
	}
	@Transactional
	public String getsupList(Suppliermodel supplier) {
		@SuppressWarnings("unchecked")
		List<Suppliermodel> sup_list=(List<Suppliermodel>)sessionFactory.getCurrentSession().createCriteria(Suppliermodel.class).list();
		Gson gson =new Gson();
		String sup_json=gson.toJson(sup_list);
		return sup_json;
	}
	@Transactional
	public String getprolist(Productmodel product) {
	
		@SuppressWarnings("unchecked")
		List<Productmodel> pro_list=(List<Productmodel>)sessionFactory.getCurrentSession().createCriteria(Productmodel.class).list();
		Gson gson =new Gson();
		String pro_json=gson.toJson(pro_list);//gson is stored in String json.
	return pro_json;
	}
	@Transactional
	public boolean delete(String pid) {
		Productmodel p =(Productmodel) sessionFactory.getCurrentSession().get(Productmodel.class,pid);//modelclass reference name
		sessionFactory.getCurrentSession().delete(p);
		return true;
	}
	@Transactional
	public boolean update(Productmodel product) {
		sessionFactory.getCurrentSession().update(product);
		return true;
	}

}

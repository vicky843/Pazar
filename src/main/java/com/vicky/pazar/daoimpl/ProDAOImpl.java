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
      /* @Transactional
	public boolean update(Productmodel product) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean delete(Productmodel product) {
		// TODO Auto-generated method stub
		return false;
	}*/
	@Transactional
	public String getcatList(Categorymodel category) {
	
		@SuppressWarnings("unchecked")
		List<Category> cat_list=(List<Category>)sessionFactory.getCurrentSession().createCriteria(Categorymodel.class).list();
				Gson gson=new Gson();
			String cat_json=gson.toJson(cat_list);
		return cat_json;
	}
	@Override
	public String getsupList(Suppliermodel supplier) {
		@SuppressWarnings("unchecked")
		List<Supplier> sup_list=(List<Supplier>)sessionFactory.getCurrentSession().createCriteria(Suppliermodel.class).list();
		Gson gson =new Gson();
		String sup_json=gson.toJson(sup_list);
		return sup_json;
	}

	}

	



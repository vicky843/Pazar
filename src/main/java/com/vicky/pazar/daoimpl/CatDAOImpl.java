package com.vicky.pazar.daoimpl;

import java.util.List;
import java.util.Locale.Category;
import java.util.function.Supplier;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.vicky.pazar.dao.CatDAO;
import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.Product;
import com.vicky.pazar.model.Suppliermodel;

@Repository
public class CatDAOImpl implements CatDAO {
	private SessionFactory sessionFactory;

	public CatDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(Categorymodel category) {

		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public String getcatList(Categorymodel category) {
		@SuppressWarnings("unchecked")
		List<Categorymodel> cat_list = (List<Categorymodel>) sessionFactory.getCurrentSession()
				.createCriteria(Categorymodel.class).list();
		Gson gson = new Gson();
		String cat_json = gson.toJson(cat_list);
		return cat_json;
	}

	@Transactional
	public boolean delete(String cid) {
		
			Categorymodel c = (Categorymodel) sessionFactory.getCurrentSession().get(Categorymodel.class,cid);
			sessionFactory.getCurrentSession().delete(c);
			return true;
		

	}

@Transactional
	public boolean update(Categorymodel category) {
	try {
		sessionFactory.getCurrentSession().update(category);
			return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	}

	@Transactional
	public Categorymodel getcat(String id) {
		
		Categorymodel cat=(Categorymodel) sessionFactory.getCurrentSession().get(Categorymodel.class, id);
	return cat;
	}

}

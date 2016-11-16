package com.vicky.pazar.daoimpl;

import java.util.List;
import java.util.Locale.Category;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.vicky.pazar.dao.CatDAO;
import com.vicky.pazar.model.Categorymodel;
@Repository
public class CatDAOImpl implements CatDAO{
private SessionFactory sessionFactory;
public CatDAOImpl( SessionFactory sessionFactory){
	this.sessionFactory=sessionFactory;
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
	public boolean update(Categorymodel category) {
		try {
			sessionFactory.getCurrentSession().update(category);
	return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(Categorymodel category) {
		try {
			sessionFactory.getCurrentSession().delete(category);
	return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public Categorymodel get(String id) {
		return(Categorymodel) sessionFactory.getCurrentSession().get(Category.class,id);
	}

	@Transactional
	

	public String getcatList(Categorymodel category) {
		@SuppressWarnings("unchecked")
		List<Categorymodel> cat_list=(List<Categorymodel>)sessionFactory.getCurrentSession().createCriteria(Categorymodel.class).list();
		Gson gson=new Gson();
		String cat_json=gson.toJson(cat_list);
		return cat_json;
	}

}

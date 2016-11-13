package com.vicky.pazar.daoimpl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vicky.pazar.dao.ProDAO;
import com.vicky.pazar.model.Productmodel;
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
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
		
	}

	@Transactional
	public boolean update(Productmodel product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean delete(Productmodel product) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Productmodel get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public List<Productmodel> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

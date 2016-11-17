package com.vicky.pazar.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vicky.pazar.dao.RegDAO;
import com.vicky.pazar.model.Registermodel;
@Repository
public class RegDAOImpl implements RegDAO {
	private SessionFactory sessionFactory;//instance variable
	public RegDAOImpl(SessionFactory sessionFactory)//local variable
	{
	this.sessionFactory=sessionFactory;		
	}
@Transactional
	public boolean save(Registermodel register) {
		try {
			sessionFactory.getCurrentSession().save(register);
	return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
			return false;
		}
	
	}

}

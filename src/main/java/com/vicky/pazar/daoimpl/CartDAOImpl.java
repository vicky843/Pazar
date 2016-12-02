package com.vicky.pazar.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vicky.pazar.dao.CartDAO;
import com.vicky.pazar.model.Cartmodel;
@Repository
public class CartDAOImpl implements CartDAO {

	private SessionFactory sessionFactory;

	public CartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(Cartmodel cart) {
		try {
			sessionFactory.getCurrentSession().save(cart);
			return true;
		} 
		catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

}

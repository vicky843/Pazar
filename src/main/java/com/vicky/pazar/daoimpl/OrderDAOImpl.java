package com.vicky.pazar.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vicky.pazar.dao.OrderDAO;
import com.vicky.pazar.model.Ordermodel;
@Repository
public class OrderDAOImpl implements OrderDAO {
	private SessionFactory sessionFactory;
	 public OrderDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(Ordermodel order) {
		try {
			sessionFactory.getCurrentSession().save(order);
			return false;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
		}
	}

}

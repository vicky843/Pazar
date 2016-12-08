package com.vicky.pazar.daoimpl;


import java.io.Serializable;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vicky.pazar.dao.CartDAO;
import com.vicky.pazar.model.Cart;
@Repository
public class CartDAOImpl implements CartDAO {

	private SessionFactory sessionFactory;

	public CartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(Cart cart) {
		try {
			sessionFactory.getCurrentSession().save(cart);
			return true;
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Transactional
	public List<Cart> getcartlist(String username) {
		String hql="from Cart where username='"+username+"'";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);

	System.out.println("query"+hql);
	List<Cart> carid=query.list();
	System.out.println(hql+"this is cartimp"+carid);
		return carid;
	}

	@Transactional
	public boolean delete(String carid) {
		System.out.println("deletecartimp");
 Cart c=(Cart)sessionFactory.getCurrentSession().get(Cart.class,  carid);
sessionFactory.getCurrentSession().delete(c);	
return true;
	}

	@Transactional
	public boolean update(Cart cart) {
		sessionFactory.getCurrentSession().update(cart);
		System.out.println("update cart");
		return false;
	}

}

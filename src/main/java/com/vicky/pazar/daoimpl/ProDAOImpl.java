package com.vicky.pazar.daoimpl;


import java.util.List;
import java.util.Locale.Category;
import java.util.function.Supplier;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import com.vicky.pazar.dao.ProDAO;
import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.Product;
import com.vicky.pazar.model.Suppliermodel;
@Repository
public class ProDAOImpl implements ProDAO{
private SessionFactory sessionFactory;
 public ProDAOImpl(SessionFactory sessionFactory) {
	this.sessionFactory=sessionFactory;
}
	@Transactional
	public boolean save(Product product) {
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
	public String getprolist(Product product) {
	
		@SuppressWarnings("unchecked")
		List<Product> pro_list=(List<Product>)sessionFactory.getCurrentSession().createCriteria(Product.class).list();
		Gson gson =new Gson();
		String pro_json=gson.toJson(pro_list);//gson is stored in String json.
	return pro_json;
	}
	
	
	@Transactional
	public boolean delete(String pid) {
		Product p =(Product) sessionFactory.getCurrentSession().get(Product.class,pid);//modelclass reference name
		sessionFactory.getCurrentSession().delete(p);
		return true;
	}
	@Transactional
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	@Transactional
	public Product getpro(String id) {
		Product prod=(Product) sessionFactory.getCurrentSession().get(Product.class, id);//bring data from productmodel

	
		return prod;
	}
	@Transactional
	public List<Product> getprodlist(String prodid) {
		String hql="from Product where proscatid='"+prodid+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
	
		List<Product> prodisp =query.list();
		System.out.println(hql+""+prodisp);
		System.out.println("this is prodaoimp"+hql);
		return prodisp;
	}
	


}

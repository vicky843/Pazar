package com.vicky.pazar.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.vicky.pazar.dao.RegDAO;
import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.Registermodel;
import com.vicky.pazar.model.Suppliermodel;
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
@Transactional
public String getreglist(Registermodel register) {

	@SuppressWarnings("unchecked")
	List<Registermodel> reg_list= (List<Registermodel>)sessionFactory.getCurrentSession().createCriteria(Registermodel.class ).list();
	Gson gson =new Gson();
String cat_json=gson.toJson(reg_list);
System.out.println("this is regimpl");
return cat_json;
}/*@Transactional
public Registermodel getreg(String id) {
	Registermodel reg=(Registermodel) sessionFactory.getCurrentSession().get(Registermodel.class, id);
	return reg;yy
}*/


}


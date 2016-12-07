package com.vicky.pazar.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.vicky.pazar.dao.RegDAO;
import com.vicky.pazar.model.Categorymodel;
import com.vicky.pazar.model.LoginFormmodel;
import com.vicky.pazar.model.Product;
import com.vicky.pazar.model.Register;
import com.vicky.pazar.model.Suppliermodel;
@Repository
public class RegDAOImpl implements RegDAO {
	@Autowired
	SessionFactory seFactory;
	
	String urole;
	String username;
	private SessionFactory sessionFactory;//instance variable
	public RegDAOImpl(SessionFactory sessionFactory)//local variable
	{
	this.sessionFactory=sessionFactory;		
	}
@Transactional
	public boolean save(Register register) {
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
public String getreglist(Register register) {

	@SuppressWarnings("unchecked")
	List<Register> reg_list= (List<Register>)sessionFactory.getCurrentSession().createCriteria(Register.class ).list();
	Gson gson =new Gson();
String cat_json=gson.toJson(reg_list);
System.out.println("this is regimpl");
return cat_json;
}/*@Transactional
public Registermodel getreg(String id) {
	Registermodel reg=(Registermodel) sessionFactory.getCurrentSession().get(Registermodel.class, id);
	return reg;yy
}*/
@Transactional
public boolean loginvalidate(LoginFormmodel login) {
	String username=login.getUsername();
	String password=login.getPassword();
			String hql="from Register where username='"+username+"' and password='"+password+"'";//map tablename with DO class name.
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	List<Register> reg=query.list();//reg will DO address.
	System.out.println("this is loginvalidate"+hql);
System.out.println("register"+reg);
if(reg!=null)
{
for(Register t:reg)//this contains datatype :array name
{
	
	
		urole=t.getRole();
	this.username=t.getUsername();
		
	}
return true;
}
	else{
		return false;
	}
	

	

}
@Override
public String userrole() {
	// TODO Auto-generated method stub
	return urole;
}
@Override
public String usernames() {
	// TODO Auto-generated method stub
	return username;
}


}


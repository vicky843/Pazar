package com.vicky.pazar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="product")
@Component
public class Product {
	@Id
public String proid;
	
	@Column
public String proname;
	
	@Column
public String proprice;
	
	@Column
public String proscatid;
	
	@Column
	public String prossupid;
	
	@Column
	public String prostock;
	
	@Column
	public String prodesc;
	
public String getProstock() {
		return prostock;
	}
	public void setProstock(String prostock) {
		this.prostock = prostock;
	}
	public String getProdesc() {
		return prodesc;
	}
	public void setProdesc(String prodesc) {
		this.prodesc = prodesc;
	}
public String getProid() {
	return proid;
}
public void setProid(String proid) {
	this.proid = proid;
}
public String getProname() {
	return proname;
}
public void setProname(String proname) {
	this.proname = proname;
}
public String getProprice() {
	return proprice;
}
public void setProprice(String proprice) {
	this.proprice = proprice;
}
public String getProscatid() {
	return proscatid;
}
public void setProscatid(String proscatid) {
	this.proscatid = proscatid;
}
public String getProssupid() {
	return prossupid;
}
public void setProssupid(String prossupid) {
	this.prossupid = prossupid;
}
}
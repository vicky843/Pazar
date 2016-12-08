package com.vicky.pazar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="product")
@Component
public class Product {
	@Id
public String proid;
	
	@Column
public String proname;
	
	@Column
public int proprice;
	
	@Column
public String proscatid;
	
	@Column
	public String prossupid;
	
	@Column
	public String prostock;
	
	@Column
	public String prodesc;
	
	@Transient
	public MultipartFile image;
	
public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
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
public int getProprice() {
	return proprice;
}
public void setProprice(int proprice) {
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
package com.vicky.pazar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table
@Component
public class Cart {

	@Id
	public String cartid;
	@Column
	public String proid;
	@Column
	public String proprice;
	@Column
	public String status;
	@Column
	public String quantity;
	@Column
    public String 	date_added;
	@Column
	public String proname;
	@Column
	public String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public String getCartid() {
		return cartid;
	}
	public void setCartid(String randomid) {
		this.cartid = randomid;
	}
	public String getProid() {
		return proid;
	}
	public void setProid(String proid) {
		this.proid = proid;
	}
	public String getProprice() {
		return proprice;
	}
	public void setProprice(String proprice) {
		this.proprice = proprice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getDate_added() {
		return date_added;
	}
	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}
	
}

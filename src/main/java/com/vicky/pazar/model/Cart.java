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
	public int proprice;
	@Column
	public String status;
	@Column
	public int quantity;
	@Column
    public String 	date_added;
	@Column
	public String proname;
	@Column
	public String username;
	@Column
	public int totalprice;
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
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
	public int getProprice() {
		return proprice;
	}
	public void setProprice(int i) {
		this.proprice = i;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDate_added() {
		return date_added;
	}
	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}
	
}

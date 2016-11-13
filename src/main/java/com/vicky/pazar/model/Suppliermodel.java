package com.vicky.pazar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Supplier")
@Component
public class Suppliermodel {
	@Id
	public String supid;
	@Column
	public String supname;
	@Column
	public String supaddress;
	@Column
	public String supemail;
	@Column
	public String supnumber;
	
	public String getSupid() {
		return supid;
	}
	public void setSupid(String supid) {
		this.supid = supid;
	}
	public String getSupname() {
		return supname;
	}
	public void setSupname(String supname) {
		this.supname = supname;
	}
	public String getSupaddress() {
		return supaddress;
	}
	public void setSupaddress(String supaddress) {
		this.supaddress = supaddress;
	}
	public String getSupemail() {
		return supemail;
	}
	public void setSupemail(String supemail) {
		this.supemail = supemail;
	}
	public String getSupnumber() {
		return supnumber;
	}
	public void setSupnumber(String supnumber) {
		this.supnumber = supnumber;
	}
	
	
	
}

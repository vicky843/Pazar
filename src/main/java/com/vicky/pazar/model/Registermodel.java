package com.vicky.pazar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="register")
@Component
public class Registermodel {
@Id
	public String username;
@Column
	public String password;
@Column
	public String email;
@Column	
public String birthdate;
@Column	
public String gender;
    
@Column
public String location;
	
	public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
}

package com.bitlabs.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	private String full_name;
	private String username;    // email id
 	private String password;
	private Date created_at;
	private String created_by="Admin";
	
	
	@PrePersist
	public void onCreate() {
		created_at=new java.util.Date();
	}


	public String getFull_name() {
		return full_name;
	}


	public void setFull_name(String full_name) {
		this.full_name = full_name;
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


	public int getId() {
		return id;
	}


	public Date getCreated_at() {
		return created_at;
	}


	public String getCreated_by() {
		return created_by;
	}
	
	
	
}

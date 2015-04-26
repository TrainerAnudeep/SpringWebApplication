package com.examples.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer", schema="test")
public class Customer {

	public Customer() {
		super();		
		// TODO Auto-generated constructor stub
	}
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Id
	@Column(name="id")
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", password=" + password + ", id="
				+ id + "]";
	}
	
	
}

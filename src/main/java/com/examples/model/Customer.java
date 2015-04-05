package com.examples.model;

public class Customer {

	public Customer() {
		super();		
		// TODO Auto-generated constructor stub
	}
	private String username;
	private String pwd;
	private int userId;
	
	public Customer(String username, String pwd, int userId) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}

package com.momo.springbootdemo.bean;

public class User {
	
	private int id;
	private String name;
	private String pass;
	
	public User() {
		
	}
	
	public User(String username, String password) {
		this.name = username;
		this.pass = password;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return name;
	}
	public void setUsername(String username) {
		this.name = username;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String password) {
		this.pass = password;
	}
	
	
	

}

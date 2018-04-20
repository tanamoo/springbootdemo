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
	
	public String getName() {
		return name;
	}
	public void setName(String username) {
		this.name = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String password) {
		this.pass = password;
	}
	
	
	

}

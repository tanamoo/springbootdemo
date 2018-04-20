package com.momo.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.springbootdemo.bean.User;
import com.momo.springbootdemo.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper usermapper;
	
	//通过id查找用户
	public User getUserById(int id) throws Exception {
		return usermapper.getUserById(id);
		
	}
	
	//用户注册
	public void addUser(User user) throws Exception{
		usermapper.addUser(user);
	}
	
	//通过用户名和密码查找用户，用于用户登录验证
	public User getUser(String name, String pass) throws Exception{
		return usermapper.getUser(name, pass);
	}
	
	
	

}



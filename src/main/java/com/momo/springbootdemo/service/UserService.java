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
	
	public User getUserById(int id) throws Exception {
		return usermapper.getUserById(id);
		
	}
	
	public void addUser(User user) throws Exception{
		usermapper.addUser(user);
	}
	
	

}



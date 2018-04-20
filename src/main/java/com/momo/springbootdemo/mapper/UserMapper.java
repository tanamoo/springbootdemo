package com.momo.springbootdemo.mapper;

import com.momo.springbootdemo.bean.User;

public interface UserMapper {
	
	public User getUserById(int id) throws Exception;
	public void addUser(User user) throws Exception;

}

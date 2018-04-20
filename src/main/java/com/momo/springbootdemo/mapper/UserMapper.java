package com.momo.springbootdemo.mapper;

import org.apache.ibatis.annotations.Param;

import com.momo.springbootdemo.bean.User;

public interface UserMapper {
	
	//根据id进行查找用户
	public User getUserById(int id) throws Exception;
	
	//添加用户，用户注册功能
	public void addUser(User user) throws Exception;
	
	//根据用户名和密码查找用户，用于登录验证
	public User getUser(@Param(value="name") String username, 
			@Param(value="pass") String pass) throws Exception;
	

}

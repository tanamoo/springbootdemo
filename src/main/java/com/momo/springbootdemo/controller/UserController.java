package com.momo.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.momo.springbootdemo.bean.User;
import com.momo.springbootdemo.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/getById")
	@ResponseBody
	public User getUserById() throws Exception {
		User user = userservice.getUserById(1002);
		return user;
		
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addUser(@RequestBody User user) throws Exception {
		userservice.addUser(user);
	}

}

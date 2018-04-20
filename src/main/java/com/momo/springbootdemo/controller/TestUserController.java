package com.momo.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.momo.springbootdemo.bean.User;
import com.momo.springbootdemo.service.TestInterFace;

@Controller
@RequestMapping("testuser")
public class TestUserController {
	
	@Autowired
	private TestInterFace testinterface;
	
	@RequestMapping("/get")
	@ResponseBody
	User getUser() {
		return testinterface.testUser();
	}
	

}

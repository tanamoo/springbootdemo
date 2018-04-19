package com.momo.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.momo.springbootdemo.bean.User;
import com.momo.springbootdemo.service.TestInterFace;

@Controller
@RequestMapping("test")
public class TestBootController {
	
	@Autowired
	private TestInterFace testinterface;
	
	@RequestMapping("/num")
	@ResponseBody
	int home() {
		int i = testinterface.testNum();
		return i;
	}
	
	@RequestMapping("/get")
	@ResponseBody
	User getUser() {
		return testinterface.testUser();
	}
}

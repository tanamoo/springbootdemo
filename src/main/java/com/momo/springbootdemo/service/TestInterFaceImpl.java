package com.momo.springbootdemo.service;

import org.springframework.stereotype.Service;

import com.momo.springbootdemo.bean.User;

@Service
public class TestInterFaceImpl implements TestInterFace {

	@Override
	public int testNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User testUser() {
		// TODO Auto-generated method stub
		return new User("tanamo","123456");
	}

}

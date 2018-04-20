package com.momo.springbootdemo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.momo.springbootdemo.bean.User;
import com.momo.springbootdemo.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	/*
	@RequestMapping("/getById")
	@ResponseBody
	public User getUserById() throws Exception {
		User user = userservice.getUserById(1);
		return user;
		
	}
	*/
	
	/*
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addUser(@RequestBody User user) throws Exception {
		userservice.addUser(user);
	}
	*/
	
	
	//前往登录
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
	
	//登录验证
	@RequestMapping("/login")
	public String login(@RequestParam String name,
			            @RequestParam String pass,
			            HttpSession session,
			            RedirectAttributes attributes) throws Exception {
		//判断用户名是否为空
		boolean checkName = (name == null || name.equals(""));
		//判断密码是否为空
		boolean checkPassword = (pass == null || pass.equals(""));
		if(checkName||checkPassword) {
			attributes.addFlashAttribute("nullNameAndPassword", "用户名或密码不能为空");
			
			return "redirect:toLogin";
		}
		
		//在数据库中查找
		User user = userservice.getUser(name, pass);
		if(user == null) {
			attributes.addFlashAttribute("message", "用户名或密码错误");
			//session.setAttribute("errormsg", "账号或密码错误!请重新输入");
			return "redirect:toLogin";
		}
		session.setAttribute("user", user);
		return "index";
	}
	
	
	//前往注册
	@RequestMapping("/toRegist")
	public String toRegist() {
		return "regist";
	}
	
	//用户注册
	@RequestMapping("/regist")
	public String regist(@RequestParam String name,
            @RequestParam String pass, RedirectAttributes attributes) throws Exception {
		
		User user = new User();
		user.setName(name);
		user.setPass(pass);
		userservice.addUser(user);
		return "success";
		
	}
}

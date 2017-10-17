package com.flymvc.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flymvc.anno.ResponseBody;
import com.flymvc.demo.model.User;

public class UserController {

	public String list() {
		System.out.println("user:list");
		return "user/list";
	}

	public void add() {

		System.out.println("user:add");
	}
	
	@ResponseBody
	public User json() {
		System.out.println("user:json");
		return new User("1","zhangsan","123456");
	}
	
	@ResponseBody
	public User test(String name,float age) {
		System.out.println("user:json");
		System.out.println(age);
		return new User("1",name,"123456",10);
	}
	
	@ResponseBody
	public User test2(HttpServletRequest request,HttpServletResponse response,String name) {
		System.out.println(request);
		System.out.println(response);
		return new User("2",name,"xxxxx",20);
	}
}

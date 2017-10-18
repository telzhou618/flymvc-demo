package com.flymvc.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flymvc.anno.ResponsJson;
import com.flymvc.config.Fly;
import com.flymvc.demo.model.User;

public class UserController {

	public String list(HttpServletRequest request) {
		request.setAttribute("name","zhangsanxxx");
		return "user/list";
	}

	public void add() {

		System.out.println("user:add");
	}
	
	@ResponsJson
	public User json() {
		System.out.println("user:json");
		return new User("1","zhangsan","123456");
	}
	
	@ResponsJson
	public User test(String name,float age) {
		System.out.println("user:json");
		System.out.println(age);
		return new User("1",name,"123456",10);
	}
	
	@ResponsJson
	public User test2(HttpServletRequest request,HttpServletResponse response,String name) {
		System.out.println(request);
		System.out.println(response);
		return new User("2",name,"xxxxx",20);
	}
	
	@ResponsJson
	public String st() {
		return Fly.me().getConfig().getViewPath();
	}
}

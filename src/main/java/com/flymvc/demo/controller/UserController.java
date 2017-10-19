package com.flymvc.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flymvc.Req;
import com.flymvc.anno.RespJson;
import com.flymvc.demo.model.User;
import com.flymvc.demo.render.JavaScriptRender;

public class UserController {

	/**
	 * 接收参数
	 * @param name
	 * @param age
	 * @return
	 */
	public String test(String name,Integer age){
		System.out.println(name);
		System.out.println(age);
		return "user/test";
	}
	/**
	 * 第二种接收参数的方法
	 * @param name
	 * @param age
	 * @return
	 */
	public String test2(Req req){
		System.out.println(req.getPara("name"));
		System.out.println(req.getParaToInt("age"));
		return "user/test";
	}
	/**
	 * 第三种接收参数的方法
	 * @param name
	 * @param age
	 * @return
	 */
	public String test3(HttpServletRequest request){
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("age"));
		return "user/test";
	}
	/**
	 * 返回Json数据
	 */
	@RespJson
	public User json(){
		return new User("1", "zhangsan", "xxxxx", 18);
	}
	
	/**
	 * 响应自定义视图 javascript
	 */
	public void javascript(HttpServletRequest request,HttpServletResponse response){
		new JavaScriptRender().render(request, response, "hello world");
	}
}

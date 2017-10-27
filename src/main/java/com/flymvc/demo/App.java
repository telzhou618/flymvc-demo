package com.flymvc.demo;

import com.flymvc.BootStrap;
import com.flymvc.config.Config;
import com.flymvc.demo.controller.IndexController;
import com.flymvc.demo.controller.UserController;
import com.flymvc.demo.interceptor.LoginInterceptor;
import com.flymvc.demo.interceptor.PayInterceptor;
import com.flymvc.interceptor.Interceptors;
import com.flymvc.plugin.Plugins;
import com.flymvc.route.Routes;

public class App extends BootStrap{

	/**
	 * 默认配置
	 */
	@Override
	public void config(Config config) {
		
	}

	/**
	 * 路由
	 */
	@Override
	public void route(Routes routes) {
		routes.addRoute("/user",UserController.class);
		routes.addRoute("/", IndexController.class);
		routes.addRoute("/", IndexController.class,"index");
	}

	/**
	 * 插件
	 */
	@Override
	public void plugin(Plugins plugins) {
		
	}

	@Override
	public void interceptor(Interceptors interceptors) {
		
		interceptors.add(new LoginInterceptor());
		interceptors.add(new PayInterceptor());
		
	}
	
	
}

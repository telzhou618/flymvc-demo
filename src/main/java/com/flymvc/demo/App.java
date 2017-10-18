package com.flymvc.demo;

import java.util.List;

import com.flymvc.core.BootStrap;
import com.flymvc.demo.controller.RoleController;
import com.flymvc.demo.controller.UserController;
import com.flymvc.plugin.DbPlugin;
import com.flymvc.plugin.Plugin;
import com.flymvc.render.JspRender;
import com.flymvc.render.Render;
import com.flymvc.route.RouteMatcher;

public class App extends BootStrap{

	@Override
	public void route(RouteMatcher routeMatcher) {
		// TODO Auto-generated method stub
		routeMatcher.addRoute("/user", new UserController());
		routeMatcher.addRoute("/", new UserController(),"test");
		routeMatcher.addRoute("/role", new RoleController());
	}

	@Override
	public void plugin(List<Plugin> plugins) {
		// TODO Auto-generated method stub
		plugins.add(new DbPlugin("com.mysql.jdbc.Driver", "root", "root", "jdbc:mysql://127.0.0.1:3306/adminlte-admin?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull"));
	}
	
	@Override
	public Render render() {
		// TODO Auto-generated method stub
		return new JspRender();
	}
}

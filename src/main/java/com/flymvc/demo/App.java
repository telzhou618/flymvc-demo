package com.flymvc.demo;

import com.flymvc.core.BootStrap;
import com.flymvc.demo.controller.RoleController;
import com.flymvc.demo.controller.UserController;
import com.flymvc.plugin.Plugins;
import com.flymvc.render.JspRender;
import com.flymvc.render.Render;
import com.flymvc.route.Routes;

public class App extends BootStrap{

	@Override
	public void route(Routes routes) {
		// TODO Auto-generated method stub
		routes.addRoute("/user", new UserController());
		routes.addRoute("/", new UserController(),"test");
		routes.addRoute("/role", new RoleController());
	}

	@Override
	public void plugin(Plugins plugins) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public Render render() {
		// TODO Auto-generated method stub
		return new JspRender();
	}
}

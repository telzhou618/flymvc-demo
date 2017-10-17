package com.flymvc.demo;

import com.flymvc.config.Fly;
import com.flymvc.config.FlyConfig;
import com.flymvc.core.BootStrap;
import com.flymvc.demo.controller.RoleController;
import com.flymvc.demo.controller.UserController;

public class App extends BootStrap{

	
	@Override
	public void config(FlyConfig config) {
		// TODO Auto-generated method stub
	}

	@Override
	public void start(Fly fly) {
		// TODO Auto-generated method stub
		fly.addRoute("/user", new UserController());
		fly.addRoute("/", new UserController(),"test");
		fly.addRoute("/role", new RoleController());
	}
	
	
}

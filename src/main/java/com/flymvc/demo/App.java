package com.flymvc.demo;

import com.flymvc.core.BootStrap;
import com.flymvc.core.Fly;
import com.flymvc.demo.controller.RoleController;
import com.flymvc.demo.controller.UserController;

public class App implements BootStrap{

	@Override
	public void init(Fly fly) {
		// TODO Auto-generated method stub
		fly.addRoute("/user", new UserController());
		fly.addRoute("/", new UserController(),"test");
		fly.addRoute("/role", new RoleController());
	}

}

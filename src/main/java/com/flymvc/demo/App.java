package com.flymvc.demo;

import com.flymvc.core.BootStrap;
import com.flymvc.core.Fly;
import com.flymvc.demo.controller.RoleController;
import com.flymvc.demo.controller.UserController;

public class App implements BootStrap{

	@Override
	public void init(Fly fly) {
		// TODO Auto-generated method stub
		fly.addRoute("/user/list", UserController.class, "list");
		fly.addRoute("/user/add", UserController.class, "add");
		fly.addRoute("/user/json", UserController.class, "json");
		fly.addRoute("/user/test", UserController.class, "test");
		fly.addRoute("/user/test2", UserController.class, "test2");
		
		
		fly.addRoute("/role/list", RoleController.class, "list");
		fly.addRoute("/role/add", RoleController.class, "add");
	}

}

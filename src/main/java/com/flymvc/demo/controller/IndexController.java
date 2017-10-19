package com.flymvc.demo.controller;

import com.flymvc.Req;

public class IndexController {

	public String index(Req req) {
		req.addAttr("str", "hello World");
		return "index";
	}
}

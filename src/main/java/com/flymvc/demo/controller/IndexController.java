package com.flymvc.demo.controller;

import com.flymvc.bean.Req;

public class IndexController {

	public String index(Req req) {
		req.addAttr("str", "hello World");
		return "index";
	}
}

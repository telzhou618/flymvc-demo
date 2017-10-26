package com.flymvc.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flymvc.exception.InterceptorException;
import com.flymvc.interceptor.AbstractInterceptor;
import com.flymvc.interceptor.ModelRender;

public class LoginInterceptor extends AbstractInterceptor{

	@Override
	public boolean before(HttpServletRequest request, HttpServletResponse response, Object object)
			throws InterceptorException {
		
		System.out.println("Login interceptor before");
		
		if(object instanceof ModelRender){
			
			ModelRender modelRender = (ModelRender) object;
			
			System.out.println("Controller:"+modelRender.getController());
			System.out.println("Method:"+modelRender.getMethod());
			System.out.println("Render:"+modelRender.getRender());
			
		}
		
		return true;
	}

	@Override
	public boolean after(HttpServletRequest request, HttpServletResponse response, Object object)
			throws InterceptorException {
		
		System.out.println("Login interceptor after");
		return true;
	}
	
}

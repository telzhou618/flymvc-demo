package com.flymvc.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flymvc.exception.InterceptorException;
import com.flymvc.interceptor.AbstractInterceptor;

public class PayInterceptor extends AbstractInterceptor{

	@Override
	public boolean before(HttpServletRequest request, HttpServletResponse response, Object object)
			throws InterceptorException {
		
		System.out.println("Pay interceptor before");
		return true;
	}

	@Override
	public boolean after(HttpServletRequest request, HttpServletResponse response, Object object)
			throws InterceptorException {
		// TODO Auto-generated method stub
		System.out.println("Pay interceptor after");
		return true;
	}

	
	
}

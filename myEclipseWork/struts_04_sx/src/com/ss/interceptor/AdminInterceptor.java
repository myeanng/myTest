package com.ss.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class AdminInterceptor extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("拦截器起作用了...");
		if(ServletActionContext.getRequest().getSession().getAttribute("admin")==null){
			System.out.println("没有admin...");
			return "cuo";
		}else{
			System.out.println("执行action...");
			return arg0.invoke();
		}
		
		
	}

}

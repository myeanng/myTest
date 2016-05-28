package com.ss.interceptor;

import java.util.Calendar;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Time1Interceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void destroy() {
		
	}

	public void init() {
		
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		Calendar cale=Calendar.getInstance();
		int curr=cale.get(Calendar.HOUR_OF_DAY);
		if(curr>7&&curr<12){
			return "error";
		}
		return arg0.invoke();
	}

}

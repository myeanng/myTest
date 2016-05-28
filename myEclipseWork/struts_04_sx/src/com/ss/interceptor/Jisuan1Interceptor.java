package com.ss.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.sx4.action.JisuanAction;

public class Jisuan1Interceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void destroy() {
		
	}

	public void init() {
		
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		JisuanAction ja=(JisuanAction)arg0.getAction();
		if(arg0.getProxy().getMethod().equals("chu")&&ja.getCal().getNum2()==0){
			return "error";
		}
		return arg0.invoke();
	}

}

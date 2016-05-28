package com.ss.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.sx4.action.WordAction;

public class Text1Interceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void destroy() {
		
	}

	public void init() {
		
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		WordAction wa=(WordAction)arg0.getAction();
		if(wa.getTitle().indexOf("ВиµД")!=-1||wa.getContext().indexOf("ВиµД")!=-1){
			return "error";
		}
		return arg0.invoke();
	}

}

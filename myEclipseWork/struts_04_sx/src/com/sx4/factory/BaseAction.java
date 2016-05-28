package com.sx4.factory;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class BaseAction {
	public HttpServletRequest getRequest(){
		return ServletActionContext.getRequest();
	}
	public HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	public HttpSession getSession(){
		return ServletActionContext.getRequest().getSession();
	}
	public ServletContext getServletContext(){
		return ServletActionContext.getServletContext();
	}
}

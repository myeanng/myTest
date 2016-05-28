package com.sx4.action;

import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class WordAction extends ActionSupport {
	private String title;
	private String context;
	public String execute(){
		System.out.println("wordAction÷¥––¡À...");
		return null;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
}

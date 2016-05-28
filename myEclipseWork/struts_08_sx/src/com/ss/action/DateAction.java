package com.ss.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DateAction extends ActionSupport {
	private Date day;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(day);
		return "dui";
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}
	
}

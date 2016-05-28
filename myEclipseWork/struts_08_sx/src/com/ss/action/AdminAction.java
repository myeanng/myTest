package com.ss.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AdminAction extends ActionSupport {
	private String uname;
	private String pw;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("validate...");
		if(uname==null||uname.equals("")){
			addFieldError("uname", "用户名不能为空");
		}
		
	}
	public String reg() throws Exception {
		System.out.println("reg...");
		return "dui";
	}
	

}

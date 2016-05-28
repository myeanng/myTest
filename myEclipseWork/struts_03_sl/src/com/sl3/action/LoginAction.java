package com.sl3.action;
import com.sl3.factory.BaseAction;

import struts.sl3.dao.AdminDao;
import struts.sl3.dao.impl.AdminDaoImpl;
import struts.sl3.entity.Admin;


public class LoginAction extends BaseAction {
	private String name;
	private String pwd;
	
	public String execute(){
		AdminDao ad=new AdminDaoImpl();
		Admin a=ad.checkLogin(name, pwd);
		if(a!=null){
			this.getRequest().setAttribute("admin", a);
			return "dui";
		}
		return "cuo";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}

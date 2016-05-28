package com.sl3.action;

import struts.sl3.dao.AdminDao;
import struts.sl3.dao.impl.AdminDaoImpl;
import struts.sl3.entity.Admin;

import com.sl3.factory.BaseAction;

public class AddAdminAction extends BaseAction {
	private String name;
	private String pwd;
	public String execute(){
		AdminDao ad=new AdminDaoImpl();
		Admin admin=new Admin(name,pwd);
		int row=ad.addAdmin(admin);
		if(row>0){
			System.out.println("add...");
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

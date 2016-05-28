package com.sx4.action;

import java.util.List;

import com.sx4.dao.AdminDao;
import com.sx4.dao.impl.AdminDaoImpl;

import com.opensymphony.xwork2.ModelDriven;
import com.sx4.entity.Admin;
import com.sx4.factory.BaseAction;

public class AdminAction extends BaseAction implements ModelDriven<Admin> {

	private Admin admin = new Admin();
	public String add(){
		AdminDao ad=new AdminDaoImpl();
		int row=ad.addAdmin(admin);
		if(row>0){
			return this.findall();
		}
		return "cuo";
	}
	
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String del(){
		AdminDao ad=new AdminDaoImpl();
		int row=ad.delAdmin(admin.getId());
		if(row>0){
			return this.findall();
		}
		return "cuo";
	}
	public String findall(){
		AdminDao ad=new AdminDaoImpl();
		List<Admin> list=ad.findAll();
		if(list!=null){
			this.getRequest().setAttribute("adminList", list);
			return "dui";
		}
		return "cuo";
	}
	public String login(){
		AdminDao ad=new AdminDaoImpl();
		Admin a=ad.checkLogin(admin.getName(),admin.getPwd());
		if(a!=null){
			this.getSession().setAttribute("admin", a);
			return this.findall();
		}
		return "cuo";
	}

	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}
	
}

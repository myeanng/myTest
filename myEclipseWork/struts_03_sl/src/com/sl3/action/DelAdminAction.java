package com.sl3.action;

import struts.sl3.dao.AdminDao;
import struts.sl3.dao.impl.AdminDaoImpl;

import com.sl3.factory.BaseAction;

public class DelAdminAction extends BaseAction {
	private int id;
	public String execute(){
		AdminDao ad=new AdminDaoImpl();
		int row=ad.delAdmin(id);
		System.out.println(row);
		if(row>0){
			return "dui";
		}
		return "cuo";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}

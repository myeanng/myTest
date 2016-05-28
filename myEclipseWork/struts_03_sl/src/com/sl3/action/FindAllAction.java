package com.sl3.action;

import java.util.List;

import struts.sl3.dao.AdminDao;
import struts.sl3.dao.impl.AdminDaoImpl;
import struts.sl3.entity.Admin;

import com.sl3.factory.BaseAction;

public class FindAllAction extends BaseAction {
	public String execute(){
		AdminDao ad=new AdminDaoImpl();
		List<Admin> list=ad.findAll();
		if(list!=null){
			System.out.println("show...");
			this.getRequest().setAttribute("adminList", list);
			return "dui";
		}
		return "cuo";
	}
}

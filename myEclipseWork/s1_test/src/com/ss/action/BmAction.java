package com.ss.action;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.entity.BM;
import com.ss.entity.BmDaoImpl;
import com.ss.factory.BaseAction;
import com.ss.service.ServiceImpl;

@SuppressWarnings("serial")
public class BmAction extends ActionSupport implements ModelDriven<BM> {
	private BM bm=new BM();
	BaseAction ba=new BaseAction();
	
	public String add(){
		BmDaoImpl bd=new BmDaoImpl();
		bd.add(bm);
		return "add";
	}
	
	public String find(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceImpl si=(ServiceImpl)context.getBean("service");
		ba.getRequest().setAttribute("list",si.find());
		return "list";
	}
	public BM getModel() {
		// TODO Auto-generated method stub
		return bm;
	}
	
	public BmAction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

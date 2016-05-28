package com.ss.action;


import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.biz.EmpBiz;
import com.ss.entity.Emp;
import com.ss.factory.BaseAction;
@Controller("empaction")
@Scope("prototype")
@Results({@Result(location="/list.jsp"),@Result(name="index",location="/index.jsp")})
@SuppressWarnings("serial")

public class EmpAction extends ActionSupport implements ModelDriven<Emp> {
	private Emp emp=new Emp();
	@Autowired
	private EmpBiz eb;
	private BaseAction ba=new BaseAction();
	
	public String findEmp(){
		ba.getSession().setAttribute("list", eb.findAllEmp());
		return SUCCESS;
	}
	public String addEmp(){
		eb.addEmp(emp);
		return "index";
	}
	public Emp getModel() {
		// TODO Auto-generated method stub
		return emp;
	}

	public EmpBiz getEb() {
		return eb;
	}

	public void setEb(EmpBiz eb) {
		this.eb = eb;
	}
	
}

package com.ss.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ss.biz.S5Biz;
import com.ss.entity.Demp;
import com.ss.entity.Emp;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("s5action")
@Scope("prototype")
@Results({@Result(location="/list.jsp"),@Result(name="add",location="/index.jsp")})
@SuppressWarnings("serial")
public class S5Action extends ActionSupport implements ModelDriven<Emp> {
	private Emp emp =new Emp();
	private Demp demp=new Demp();
	@Autowired
	private S5Biz s5biz;
	private List<Emp> list;
	private List<Demp> dlist;
	public String findByPage() {
		// TODO Auto-generated method stub
		list = s5biz.findAllEmpByPage(1, 5);
		return SUCCESS;
	}
	public String addEmp() {
		// TODO Auto-generated method stub
		s5biz.addEmp(emp);
		return "add";
	}
	
	public String addDemp() {
		// TODO Auto-generated method stub
		s5biz.addDemp(demp);
		return "add";
	}
	
	public String findDemp() {
		// TODO Auto-generated method stub
		dlist = s5biz.findAllDemp();
		return "addEmp";
	}
	public S5Biz getS5biz() {
		return s5biz;
	}
	public void setS5biz(S5Biz s5biz) {
		this.s5biz = s5biz;
	}
	public List<Emp> getList() {
		return list;
	}
	public void setList(List<Emp> list) {
		this.list = list;
	}
	public Emp getModel() {
		// TODO Auto-generated method stub
		return emp;
	}
	public Demp getDemp() {
		return demp;
	}
	public void setDemp(Demp demp) {
		this.demp = demp;
	}
	public List<Demp> getDlist() {
		return dlist;
	}
	public void setDlist(List<Demp> dlist) {
		this.dlist = dlist;
	}
	
	
}

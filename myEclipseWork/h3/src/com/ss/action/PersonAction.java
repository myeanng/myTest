package com.ss.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.entity.Person;
import com.ss.factory.BaseAction;
import com.ss.service.ForumService;
import com.ss.service.impl.ForumServiceImpl;

@SuppressWarnings("serial")
public class PersonAction extends ActionSupport implements ModelDriven<Person> {
	private Person p=new Person();
	ForumService fs=new ForumServiceImpl();
	BaseAction ba=new BaseAction();
	//登陆
	public String login(){
		Person person=fs.findPerson(p);
		ba.getSession().setAttribute("person", person);
		//查到集合跳转
		ba.getSession().setAttribute("categoryList", fs.findAllCategory());
		return "listCategory";
	}
	//添加用户
	public String add(){
		fs.addPerson(p);
		System.out.println("添加成功...");
		return SUCCESS;
	}
	public Person getModel() {
		// TODO Auto-generated method stub
		return p;
	}

}

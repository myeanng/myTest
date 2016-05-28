package com.forum.action;

import com.forum.service.ForumService;
import com.forum.service.impl.ForumServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.forum.entity.Person;
import com.forum.util.BaseAction;

@SuppressWarnings("serial")
public class PersonAction extends ActionSupport implements ModelDriven<Person> {
	private Person person=new Person();
	ForumService fs=new ForumServiceImpl();
	BaseAction ba=new BaseAction();
	//登陆
	public String login(){
		Person person2=fs.findPerson(person);
		ba.getSession().setAttribute("person", person2);
		//查到集合跳转
		ba.getRequest().setAttribute("categoryList", fs.findAllCategory());
		return "dui";
	}
	//添加用户
	public String add(){
		fs.addPerson(person);
		return SUCCESS;
	}
	public Person getModel() {
		// TODO Auto-generated method stub
		return person;
	}

}

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
	//��½
	public String login(){
		Person person2=fs.findPerson(person);
		ba.getSession().setAttribute("person", person2);
		//�鵽������ת
		ba.getRequest().setAttribute("categoryList", fs.findAllCategory());
		return "dui";
	}
	//����û�
	public String add(){
		fs.addPerson(person);
		return SUCCESS;
	}
	public Person getModel() {
		// TODO Auto-generated method stub
		return person;
	}

}

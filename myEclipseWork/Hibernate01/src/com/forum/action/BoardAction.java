package com.forum.action;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.forum.entity.Board;
import com.forum.entity.Person;
import com.forum.service.ForumService;
import com.forum.service.impl.ForumServiceImpl;
import com.forum.util.BaseAction;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class BoardAction extends ActionSupport implements ModelDriven<Board> {
	private Board b=new Board();
	ForumService fs=new ForumServiceImpl();
	BaseAction ba=new BaseAction();
	private Set<Person> personSet=new HashSet<Person>();
	private String[] pid;
	public String[] getPid() {
		return pid;
	}
	public void setPid(String[] pid) {
		this.pid = pid;
	}
	//���
	public String add(){
		fs.addBoard(b);
		List<Person> pList=fs.findPerson();
		b=fs.findBoard(b.getId());
		ba.getRequest().setAttribute("board", b);
		ba.getRequest().setAttribute("pList", pList);
		return SUCCESS;
	}
	//���ð�����ת
	public String enter(){
		Board board=fs.findBoard(b.getId());
		ba.getSession().setAttribute("board", board);
		List<Person> pList=fs.findPerson();
		ba.getRequest().setAttribute("personList", pList);
		return "setAdmin";
	}
	public String addBP(){
		System.out.println("addBP��ʼ...");
		for(int i=0;i<pid.length;i++){
			Person person=new Person();
			int id=Integer.parseInt(pid[i]);
			person.setId(id);
			personSet.add(person);
			System.out.println(pid[i]);
		}
		b=fs.findBoard(b.getId());
		b.setPersons(personSet);
		fs.upBoard(b);
		System.out.println("addBP�ɹ�...");
		return SUCCESS;
	}
	public String find(){
		List<Person> pList=fs.findPerson();
		b=fs.findBoard(b.getId());
		ba.getRequest().setAttribute("board", b);
		ba.getRequest().setAttribute("personList", pList);
		return "setAdmin";
	}
	public Board getModel() {
		// TODO Auto-generated method stub
		return b;
	}

}

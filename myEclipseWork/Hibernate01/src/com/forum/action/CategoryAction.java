package com.forum.action;


import com.forum.service.ForumService;
import com.forum.service.impl.ForumServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.forum.entity.Category;
import com.forum.util.BaseAction;

@SuppressWarnings("serial")
public class CategoryAction extends ActionSupport implements ModelDriven<Category> {
	private Category c=new Category();
	BoardAction baction=new BoardAction();
	ForumService fs=new ForumServiceImpl();
	BaseAction ba=new BaseAction();
	//添加后跳到AddBoard页面
	public String add(){
		fs.addCategory(c);
		return baction.find();
	}
	public Category getModel() {
		// TODO Auto-generated method stub
		return c;
	}

}

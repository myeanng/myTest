package com.ss.action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.entity.Category;
import com.ss.factory.BaseAction;
import com.ss.service.ForumService;
import com.ss.service.impl.ForumServiceImpl;

@SuppressWarnings("serial")
public class CategoryAction extends ActionSupport implements ModelDriven<Category> {
	private Category c=new Category();
	BoardAction baction=new BoardAction();
	ForumService fs=new ForumServiceImpl();
	BaseAction ba=new BaseAction();
	//���Ӻ�����AddBoardҳ��
	public String add(){
		fs.addCategory(c);
		return baction.find();
	}
	public Category getModel() {
		// TODO Auto-generated method stub
		return c;
	}

}

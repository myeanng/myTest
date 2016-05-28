package com.ss.action;


import java.util.List;

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
	//添加后跳到AddBoard页面
	public String add(){
		fs.addCategory(c);
		ba.getSession().setAttribute("categoryList", fs.findCategory());
		return SUCCESS;
	}
	public String find(){
		List<Category> listCategory=fs.findCategory();
		if(listCategory==null){
			return "addCategory";
		}else{
			ba.getSession().setAttribute("categoryList", listCategory);
			return "addBoard";
		}
	}
	public Category getModel() {
		// TODO Auto-generated method stub
		return c;
	}

}

package com.ss.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.dao.CategoryDao;
import com.ss.dao.impl.CategoryDaoImpl;
import com.ss.entity.Category;
import com.ss.factory.BaseAction;

@SuppressWarnings("serial")
public class CategoryAction extends ActionSupport implements ModelDriven<Category> {
	private Category c=new Category();
	CategoryDao pd= new CategoryDaoImpl();
	BaseAction ba=new BaseAction();
	public String add(){
		pd.add(c);
		List<Category> categoryList=pd.findAll();
		System.out.println("���ҳɹ�...");
		ba.getRequest().setAttribute("categoryList", categoryList);
		return SUCCESS;
	}
	public String find(){
		Category category=pd.sel(c.getId());
		ba.getSession().setAttribute("category", category);
		return "dui";
	}
	public String del(){
		pd.del(c.getId());
		return SUCCESS;
	}
	public String upd(){
		pd.upd(c);
		return find();
	}
	public Category getModel() {
		// TODO Auto-generated method stub
		return c;
	}

}

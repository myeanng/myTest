package com.ss.action;

import java.io.IOException;
import java.io.PrintWriter;
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
	private BaseAction ba=new BaseAction();
	private CategoryDao cd=new CategoryDaoImpl();
	//查找
	public String findAll(){
		List<Category> list=cd.queAll();
		if(list!=null){
			ba.getSession().setAttribute("CategoryList", list);
			return "list";
		}
		return "error";
	}
	//判断类别名称是否存在
	public void ajaxName() throws IOException{
		PrintWriter out=ba.getResponse().getWriter();
		boolean b=cd.queName(c.getCategoryname());
		if(b){
			out.print(true);
		}else{
			out.print(false);
		}	
	}
	//添加
	public String add(){
		int i=cd.add(c);
		if(i>0){
			return this.findAll();
		}
		return "error";
	}
	//删除
	public String del(){
		int i=cd.del(c.getCategoryid());
		if(i>0){
			return this.findAll();
		}
		return "error";
	}
	public Category getModel() {
		// TODO Auto-generated method stub
		return c;
	}
	public Category getC() {
		return c;
	}
	public void setC(Category c) {
		this.c = c;
	}
	

}

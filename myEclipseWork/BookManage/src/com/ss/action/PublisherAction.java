package com.ss.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.dao.PublisherDao;
import com.ss.dao.impl.PublisherDaoImpl;
import com.ss.entity.Publisher;
import com.ss.factory.BaseAction;

@SuppressWarnings("serial")
public class PublisherAction extends ActionSupport implements ModelDriven<Publisher> {
	private Publisher p=new Publisher();
	private BaseAction ba=new BaseAction();
	private PublisherDao pd=new PublisherDaoImpl();
	//查找
	public String findAll(){
		List<Publisher> list=pd.queAll();
		if(list!=null){
			ba.getSession().setAttribute("publisherList", list);
			return "list";
		}
		return "error";
	}
	//判断出版社名称是否存在
	public void ajaxName() throws IOException{
		PrintWriter out=ba.getResponse().getWriter();
		boolean b=pd.queName(p.getPublishername());
		if(b){
			out.print(true);
		}else{
			out.print(false);
		}	
	}
	//添加
	public String add(){
		int i=pd.add(p);
		if(i>0){
			return this.findAll();
		}
		return "error";
	}
	//删除
	public String del(){
		int i=pd.del(p.getPublisherid());
		if(i>0){
			return this.findAll();
		}
		return "error";
	}

	public Publisher getP() {
		return p;
	}
	public void setP(Publisher p) {
		this.p = p;
	}
	public Publisher getModel() {
		// TODO Auto-generated method stub
		return p;
	}

}

package com.ss.action;



import java.sql.Timestamp;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.entity.Admin;
import com.ss.factory.BaseAction;
import com.ss.service.H8Service;
import com.ss.service.impl.H8ServiceImpl;

@SuppressWarnings("serial")
public class H8AdminAction extends ActionSupport implements ModelDriven<Admin> {
	private Admin admin=new Admin();
	BaseAction ba=new BaseAction();
	H8Service h8s=new H8ServiceImpl();
	
	public String add(){
		h8s.add(admin);
		return "login";
	}
	public String login(){
		admin=h8s.login(admin);
		ba.getSession().setAttribute("admin", admin);
		ba.getSession().setAttribute("logintime", admin.getLogintime());
		admin.setLogintime(new Timestamp(new Date().getTime()));

		h8s.update(admin);
		//获取投票信息
		Byte b=0;
		ba.getSession().setAttribute("vtype0", h8s.findType(b));
		b=1;
		ba.getSession().setAttribute("vtype1", h8s.findType(b));
		return "main";
		
		
		//获取当前时间并转换成Timestamp格式
		/*
		 * Date date = new Date();
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = df1.format(date);
		Timestamp CreateDate = Timestamp.valueOf(time);*/
		
		//转换后放入admin中
		
		/*DateFormat dateFormat;
	    dateFormat = new SimpleDateFormat("yyyy-MM-dd");//设定格式
	    String dateStr = dateFormat.format(new Date());

	    dateFormat.setLenient(false);
	    Date timeDate=null;
		  try {
		   timeDate = dateFormat.parse(dateStr);
		  } catch (Exception e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }//util类型
		    Timestamp dateTime = new Timestamp(timeDate.getTime());
		    //Timestamp类型,timeDate.getTime()返回一个long型
		   //System.out.println(dateTime.toString());
		*/
		
	}
	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}

}

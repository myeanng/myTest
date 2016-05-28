package com.ss.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.entity.Message;
import com.ss.factory.BaseAction;
import com.ss.service.H7Service;
import com.ss.service.impl.H7ServiceImpl;

@SuppressWarnings("serial")
public class H7Action extends ActionSupport implements ModelDriven<Message> {
	private Message message=new Message();
	private Double maxMoney;
	private Double minMoney;
	
	BaseAction ba=new BaseAction();
	H7Service h7s=new H7ServiceImpl();
	
	//添加Message
	public String add(){
		h7s.add(message);
		return findAllType();
	}
	//查找Type列表
	public String findType(){
		
		ba.getRequest().setAttribute("typeList",h7s.findType());
		return "add";
	}
	public String findMessageType(){
		ba.getRequest().setAttribute("typeList",h7s.findType());
		return "find";
	}
	/**
	 * 需要合成ＨＱＬ语句进行查询
	 * 判断条件是否为空
	 * 
	 * */
	//组合查询Message
	public String findMessage(){
		String hql="select m from Message m where 1=1 ";
		if(message.getTitle()!=null&&!"".equals(message.getTitle())){
			hql+="and m.title like %"+message.getTitle()+"% ";
		}
		if(message.getType().getId()!=null&&!"".equals(message.getType().getId())){
			hql+="and m.type.id ="+message.getType().getId()+" ";
		}
		if(message.getTel()!=null&&!"".equals(message.getTel())){
			hql+="and m.tel like %"+message.getTel()+"% ";
		}
		if(message.getPerson()!=null&&!"".equals(message.getPerson())){
			hql+="and m.person like %"+message.getPerson()+"% ";
		}
		if(maxMoney!=null&&!"".equals(maxMoney)){
			hql+="and m.money < "+maxMoney+" ";
		}
		if(minMoney!=null&&!"".equals(minMoney)){
			hql+="and m.money > "+minMoney+" ";
		}
		
		
		ba.getRequest().setAttribute("messageList",h7s.findMessage(hql));
		return "showMessage";
	}
	//根据ID查询Message
	public String findMessageID(){
		ba.getRequest().setAttribute("message",h7s.findMessage(message.getId()));
		return "message";
	}
	//查找所有信息
	public String findAllType(){
		ba.getRequest().setAttribute("typeList",h7s.findAllType());
		return "showType";
	}
	//A标签跳转
	public String href(){
		if(message.getId()==0){
			return findAllType();
		}
		else{
			return findMessageID();
		}
	}
	public Message getModel() {
		// TODO Auto-generated method stub
		return message;
	}
	public Double getMaxMoney() {
		return maxMoney;
	}
	public void setMaxMoney(Double maxMoney) {
		this.maxMoney = maxMoney;
	}
	public Double getMinMoney() {
		return minMoney;
	}
	public void setMinMoney(Double minMoney) {
		this.minMoney = minMoney;
	}
	

}

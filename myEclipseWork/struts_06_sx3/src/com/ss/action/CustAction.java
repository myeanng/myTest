package com.ss.action;

import java.util.List;

import com.ss.entity.Cust;
import com.ss.entity.Order;
import com.ss.factory.BaseAction;
import com.ss.service.CustService;

public class CustAction extends BaseAction {
	private String custId;
	public String findOrder(){
		List<Order> orderList=CustService.getCustOrders(custId);
		this.getRequest().setAttribute("orderList", orderList);
		return "dui";
	}
	public String findCust(){
		Cust cust=CustService.findCustById(custId);
		if(cust!=null){
			this.getSession().setAttribute("cust", cust);
		}else{
			this.getRequest().setAttribute("msg", "<script>alert('没有此用户!');</script>");
		}
		
		return "dui";
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
}

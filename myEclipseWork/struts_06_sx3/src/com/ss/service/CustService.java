package com.ss.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.ss.entity.Cust;
import com.ss.entity.Order;

public class CustService {
	private static List<Cust> custList=new ArrayList<Cust>();
	static{
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Cust c1=new Cust("c001","Jack","110");
			Cust c2=new Cust("c002","Tom","120");
			Cust c3=new Cust("c003","Kim","119");
			
			custList.add(c1);
			custList.add(c2);
			custList.add(c3);
			Order o1=new Order("OR001",sdf.parse("2013-01-01"),0);
			Order o2=new Order("OR002",sdf.parse("2013-01-02"),0);
			Order o3=new Order("OR003",sdf.parse("2013-01-03"),1);
			Order o4=new Order("OR004",sdf.parse("2013-01-04"),0);
			Order o5=new Order("OR005",sdf.parse("2013-01-05"),1);
			Order o6=new Order("OR006",sdf.parse("2013-01-06"),1);
			Order o7=new Order("OR007",sdf.parse("2013-01-07"),0);
			Order o8=new Order("OR008",sdf.parse("2013-01-08"),1);
			Order o9=new Order("OR009",sdf.parse("2013-01-09"),1);
			
			c1.getOrders().add(o1);
			c1.getOrders().add(o2);
			c1.getOrders().add(o3);
			c2.getOrders().add(o4);
			c2.getOrders().add(o5);
			c2.getOrders().add(o6);
			c3.getOrders().add(o7);
			c3.getOrders().add(o8);
			c3.getOrders().add(o9);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Cust findCustById(String custId){
		for(Cust cust:custList){
			if(cust.getCustId().equals(custId)){
				return cust;
			}
		}
		return null;
	}
	
	public static List<Order> getCustOrders(String custId){
		for(Cust cust:custList){
			if(cust.getCustId().equals(custId)){
				return cust.getOrders();
			}
		}
		return null;
	}
}

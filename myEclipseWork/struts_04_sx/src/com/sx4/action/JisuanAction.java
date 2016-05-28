package com.sx4.action;

import com.opensymphony.xwork2.ModelDriven;
import com.sx4.entity.Calculator;
import com.sx4.factory.BaseAction;

public class JisuanAction extends BaseAction implements ModelDriven<Calculator>  {
	private Calculator cal=new Calculator();
	public String jia(){
		cal.setResult(cal.getNum1()+cal.getNum2());
		return "result";
	}
	public String jian(){
		cal.setResult(cal.getNum1()-cal.getNum2());
		return "result";
	}
	public String cheng(){
		cal.setResult(cal.getNum1()*cal.getNum2());
		return "result";
	}
	public String chu(){
		cal.setResult(cal.getNum1()/cal.getNum2());
		return "result";
	}
	public Calculator getModel() {
		// TODO Auto-generated method stub
		return cal;
	}
	public Calculator getCal() {
		return cal;
	}
	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	
	
}

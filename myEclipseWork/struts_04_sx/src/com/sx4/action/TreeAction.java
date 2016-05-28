package com.sx4.action;

import org.apache.struts2.ServletActionContext;

public class TreeAction {
	public String execute(){
		System.out.println("tree...");
		Object[][] obj={
				{"1","0","短信平台管理","#"},
				{"2","1","员工管理","#"},
				{"3","1","短信管理","#"},
				{"4","1","用户权限管理","#"},
				{"5","2","用户列表","hei.jsp"},
				{"6","2","员工信息列表","hei.jsp"},
				{"7","3","员工信息修改","hei.jsp"},
				{"8","3","接收短信","hei.jsp"},
				{"9","4","短信通缉","hei.jsp"},
				{"10","4","嘿嘿","hei.jsp"},
		};
		ServletActionContext.getRequest().setAttribute("objarray", obj);
		System.out.println("tree2...");
		return "dui";
	}
}

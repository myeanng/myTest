package com.sx4.action;

import org.apache.struts2.ServletActionContext;

public class TreeAction {
	public String execute(){
		System.out.println("tree...");
		Object[][] obj={
				{"1","0","����ƽ̨����","#"},
				{"2","1","Ա������","#"},
				{"3","1","���Ź���","#"},
				{"4","1","�û�Ȩ�޹���","#"},
				{"5","2","�û��б�","hei.jsp"},
				{"6","2","Ա����Ϣ�б�","hei.jsp"},
				{"7","3","Ա����Ϣ�޸�","hei.jsp"},
				{"8","3","���ն���","hei.jsp"},
				{"9","4","����ͨ��","hei.jsp"},
				{"10","4","�ٺ�","hei.jsp"},
		};
		ServletActionContext.getRequest().setAttribute("objarray", obj);
		System.out.println("tree2...");
		return "dui";
	}
}

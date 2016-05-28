package com.yourcompany.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action extends org.apache.struts.action.Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LonginForm lf=(LonginForm)form;
		String logname=lf.getLogname();
		String logpwd=lf.getLogpwd();
		AdminDao ad=new AdminDao();
		if(ad.checkLogin(logname, logpwd)){
			request.setAttribute("admin", new Admin(logname,logpwd));
			return mapping.findForward("fail");
		}
		return mapping.findForward("success");
	}

}

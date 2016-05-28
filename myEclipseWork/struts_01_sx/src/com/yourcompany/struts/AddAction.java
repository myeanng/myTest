package com.yourcompany.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sx1.entity.Admin;
import com.sx1.entity.AdminDao;

public class AddAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AddForm af=(AddForm)form;
		AdminDao ad=new AdminDao();
		Admin admin=new Admin(af.getName(),af.getPwd());
		int row=ad.addAdmin(admin);
		if(row>0){
		return mapping.findForward("dui");
		}
		return mapping.findForward("cuo");
	}

}

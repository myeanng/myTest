package com.yourcompany.struts;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sx1.entity.Admin;
import com.sx1.entity.AdminDao;

public class ShowAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AdminDao ad=new AdminDao();
		List<Admin> list=ad.findAll();
		if(list!=null){
		request.setAttribute("adminList", list);
		return mapping.findForward("list");}
		return mapping.findForward("cuo");
	}

}

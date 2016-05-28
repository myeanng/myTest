package com.yourcompany.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sx1.entity.AdminDao;

public class DelAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String idstr=request.getParameter("id");
		
		int id=Integer.parseInt(idstr);
		AdminDao ad=new AdminDao();
		int row=ad.delAdmin(id);
		if(row>0){
			System.out.println(idstr);
		return mapping.findForward("dui");
		}
		return mapping.findForward("cuo");
	}

}

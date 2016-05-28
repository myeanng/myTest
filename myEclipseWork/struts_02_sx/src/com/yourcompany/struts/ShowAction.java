package com.yourcompany.struts;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sx.entity.Admin;
import com.sx.entity.AdminDao;

public class ShowAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		/*AdminDao ad=new AdminDao();
		List<Admin> list=ad.findAll();
		if(list!=null){
		request.setAttribute("adminList", list);
		return mapping.findForward("list");}
		return mapping.findForward("cuo");
		*/
		String l=request.getParameter("l");
		String c=request.getParameter("c");
		Locale loc=new Locale(l,c);
		HttpSession session=request.getSession();
		session.setAttribute(Globals.LOCALE_KEY,loc);
		return mapping.findForward("w");
	}

}

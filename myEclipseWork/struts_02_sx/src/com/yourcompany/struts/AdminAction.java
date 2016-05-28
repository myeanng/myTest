package com.yourcompany.struts;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.sx.entity.Admin;
import com.sx.entity.AdminDao;

public class AdminAction extends DispatchAction {

	public ActionForward xg(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		AddForm af=(AddForm)form;
		AdminDao ad=new AdminDao();
		Admin admin =new Admin(af.getAdmin().getId(),af.getAdmin().getName(),af.getAdmin().getPwd());
		int row=ad.updAdmin(admin);
		if(row>0){
			List<Admin> list=ad.findAll();
			request.setAttribute("adminList", list);
			return cx(mapping,form,request,response);
			}
			return mapping.findForward("cuo");
	}
	public ActionForward tj(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		AddForm af=(AddForm)form;
		AdminDao ad=new AdminDao();
		Admin admin =new Admin(af.getAdmin().getName(),af.getAdmin().getPwd());
		int row=ad.addAdmin(admin);
		if(row>0){
			return cx(mapping,form,request,response);
			}
			return mapping.findForward("cuo");
	}
	public ActionForward sc(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		AddForm af=(AddForm)form;
		AdminDao ad=new AdminDao();
		
		int row=ad.delAdmin(af.getAdmin().getId());
		if(row>0){
			return cx(mapping,form,request,response);
			}
			return mapping.findForward("cuo");
	}
	public ActionForward cx(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		AdminDao ad=new AdminDao();
		List<Admin> list=ad.findAll();
		if(list!=null){
		request.setAttribute("adminList", list);
		return mapping.findForward("dui");}
		return mapping.findForward("cuo");
		
	}
	public ActionForward Gjh(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		
		String l=request.getParameter("l");
		String c=request.getParameter("c");
		Locale loc=new Locale(l,c);
		HttpSession session=request.getSession();
		session.setAttribute(Globals.LOCALE_KEY,loc);
		return cx(mapping,form,request,response);
	}
}

package com.fxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.dao.UsersDao;
import com.fxt.dao.impl.UsersDaoImpl;
import com.fxt.entity.Users;
import com.fxt.util.MD5;

/**
 * Servlet implementation class adminLoginServlet
 */
public class adminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		int sta=0;
		String name=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		String userpwd=MD5.encodePassword(pwd, "MD5");
		UsersDao ud=new UsersDaoImpl();
		Users user=ud.login(name,userpwd);
		if(user!=null){
			if(user.getIsadmin()==1||user.getIsadmin()==2){
				session.setAttribute("adminname", user);
				session.setAttribute("isboss", user.getIsadmin());
				sta=1;
				out.print(sta);
			}else{
				sta=0;
				out.print(sta);
			}
		}else{
			sta=2;
			out.print(sta);
		}
		out.close();
	}

}

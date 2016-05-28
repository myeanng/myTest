package com.fxt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fxt.service.impl.UsersServiceImpl;

/**
 * Servlet implementation class UpUsersStatusByUidServlet
 */
public class UpUsersStatusByUidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpUsersStatusByUidServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int xuan=Integer.parseInt(request.getParameter("xuan"));
		int uid=Integer.parseInt(request.getParameter("uid"));
		int status=Integer.parseInt(request.getParameter("status"));
		UsersServiceImpl usi=new UsersServiceImpl();
		if(xuan==1){
			int row=usi.UpUsersStatusByUid(uid, status);
			if(row>0){
				response.sendRedirect("usersServlet");
			}else{
				response.sendRedirect("usersServlet");
			}
		}else if(xuan==2){
			int row=usi.UpUsersStatusByUid(uid, status);
			if(row>0){
				response.sendRedirect("QueryGuanLiYuanServlet");
			}else{
				response.sendRedirect("QueryGuanLiYuanServlet");
			}
		}
		
	}

}

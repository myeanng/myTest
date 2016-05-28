package com.fxt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Users;
import com.fxt.service.impl.UsersServiceImpl;

/**
 * Servlet implementation class QueryGuanLiYuanServlet
 */
public class QueryGuanLiYuanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryGuanLiYuanServlet() {
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
		UsersServiceImpl usi=new UsersServiceImpl();
		List<Users> adminlist=usi.queryGuanLiYuan(1);
		HttpSession session=request.getSession();
		session.setAttribute("adminlist", adminlist);
		System.out.println(adminlist.get(0).getUsername());
		response.sendRedirect("admin/showguanliyuan.jsp");
	}

}

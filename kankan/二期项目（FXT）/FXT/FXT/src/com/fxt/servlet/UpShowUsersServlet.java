package com.fxt.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.fxt.entity.Users;
import com.fxt.service.UsersService;
import com.fxt.service.impl.UsersServiceImpl;

/**
 * Servlet implementation class UpShowUsers
 */
public class UpShowUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()更新数据后查询数�?
     */
    public UpShowUsersServlet() {
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
		HttpSession session=request.getSession();
		Users u=(Users)session.getAttribute("nowuser");
		UsersService um=new  UsersServiceImpl();
		Users userslist=um.UpShowUser(u.getUid());
		session.setAttribute("ulist", userslist);
		String xingqu=userslist.getXingqu()+",";
	//	String[] xq=userslist.getXingqu().split(",");//�?号分割查询的数据
		String[] xq=xingqu.split(",");
		List<String> list=new ArrayList<String>();
		for(int i=0;i<xq.length;i++){
		list.add(xq[i]);
		System.out.println(xq[i]);
		}
		session.setAttribute("xq", list);
		response.sendRedirect("ShowOrdersServlet");//跳转servlet（完成）
	}

}

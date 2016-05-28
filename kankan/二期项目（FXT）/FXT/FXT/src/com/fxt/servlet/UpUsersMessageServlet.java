package com.fxt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Users;
import com.fxt.service.UsersService;
import com.fxt.service.impl.UsersServiceImpl;

/**
 * Servlet implementation class UpUsersMessageServlet
 */
public class UpUsersMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpUsersMessageServlet() {
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
		String sex=request.getParameter("sex");
		String birthday=request.getParameter("birthday");
		String shen=request.getParameter("shen");
		String hobby=request.getParameter("str");
		// hobby = new String(hobby.getBytes("iso-8859-1"), "utf-8");  
		if(sex!=null||"".equals(sex)&&shen!=null||"".equals(shen)&&hobby!=null||"".equals(hobby)){
			int row=um.UpUserMessage(sex, birthday, shen, hobby, u.getUid());
			if(row>0){
				response.sendRedirect("UpShowUsersServlet");//跳转到查询信息表
			}else{
				response.sendRedirect("ShowOrdersServlet");//跳转到分页表
			}
		}
	}
}

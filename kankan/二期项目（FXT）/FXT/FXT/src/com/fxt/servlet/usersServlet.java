package com.fxt.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fxt.entity.Users;
import com.fxt.service.UsersService;
import com.fxt.service.impl.UsersServiceImpl;

/**
 * Servlet implementation class usersServlet
 */
public class usersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public usersServlet() {
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
		int size=5;
		UsersService us=new UsersServiceImpl();
		int renshu=us.querypage(size);
		int zongyeshu=renshu%size==0?renshu/size:renshu/size+1;
		String yeshu=request.getParameter("pageindex");
		if(yeshu==null){
			yeshu="1";
		}
		int pageindex=Integer.parseInt(yeshu);
		List<Users> user=us.queryUsersBypage(size,pageindex);
		request.setAttribute("renshu", renshu);
		request.setAttribute("zongyeshu", zongyeshu);
		request.setAttribute("pageindex", pageindex);
		request.setAttribute("userslist", user);
		request.getRequestDispatcher("admin/showusers.jsp").forward(request, response);
	}

}

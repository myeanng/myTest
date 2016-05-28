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
import com.fxt.util.MD5;

/**
 * Servlet implementation class ReviseUsersMessage鏇存柊鐢ㄦ埛淇℃伅
 */
public class ReviseUsersMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviseUsersMessage() {
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
		String name=request.getParameter("name");
		String tel=request.getParameter("tel");
		String pwd=request.getParameter("pwd");
		String userpwd=MD5.encodePassword(pwd, "MD5");
		if(name!=null&&tel!=null&&pwd!=null){
			int row=um.ReviseUsersMessage(name, tel,userpwd, u.getUid());
			if(row>0){
				session.setAttribute("row1","修改成功");//怎样跳转
				response.sendRedirect("UpShowUsersServlet");
			}else{
				session.setAttribute("row1","修改失败");
				response.sendRedirect("showdingdan.jsp");
			}
		}
	}
}

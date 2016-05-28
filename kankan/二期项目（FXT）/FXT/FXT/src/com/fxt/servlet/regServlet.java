package com.fxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fxt.service.PayService;
import com.fxt.service.UsersService;
import com.fxt.service.impl.PayServiceImpl;
import com.fxt.service.impl.UsersServiceImpl;
import com.fxt.util.MD5;

/**
 * Servlet implementation class reg
 */
public class regServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regServlet() {
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
		//response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		UsersService us=new UsersServiceImpl();
		PayService ps=new PayServiceImpl();
		int x=Integer.parseInt(request.getParameter("x"));
		String tel=request.getParameter("tel");
		String username=request.getParameter("username");
		String userpwd1=request.getParameter("userpwd1");
		String userpwd2=request.getParameter("userpwd2");
		if(tel==null||"".equals(tel)||username==null||"".equals(username)||userpwd1==null||"".equals(userpwd1)||userpwd2==null||"".equals(userpwd2)){
			out.print("×¢²áÊ§°Ü1");
		}else{
			if(userpwd1.equals(userpwd2)){
				int rows=us.reg(username, MD5.encodePassword(userpwd1, "MD5"),tel,x);
				int uid=us.SelectMaxUid();
				ps.insertPayByUid(uid);
				if(rows>0){
					if(x==0){
						response.sendRedirect("login.jsp");
					}else if(x==1){
						response.sendRedirect("QueryGuanLiYuanServlet");
					}
					
				}else{
					out.print("×¢²áÊ§°Ü2¡£");
				}
			}else{
				out.print("×¢²áÊ§°Ü3¡£");
			}
		}
	}

}

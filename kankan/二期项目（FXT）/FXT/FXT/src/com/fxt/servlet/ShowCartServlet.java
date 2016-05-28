package com.fxt.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Cart;
import com.fxt.entity.Users;
import com.fxt.service.impl.CartServiceImpl;

/**
 * Servlet implementation class ShowCartServlet
 */
public class ShowCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCartServlet() {
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
		Users user=(Users)session.getAttribute("nowuser");
		if(user==null){
			response.sendRedirect("showcart.jsp");
		}else{
			List<Cart> cartlist=new ArrayList<Cart>();
			int uid=user.getUid();
			CartServiceImpl csi=new CartServiceImpl();
			cartlist=csi.queryCartByUid(uid);
			request.setAttribute("cartlist", cartlist);
			request.getRequestDispatcher("showcart.jsp").forward(request, response);
		}
	}

}

package com.fxt.servlet;

import java.io.IOException;
import java.util.HashMap;
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
 * Servlet implementation class DelCartServlet
 */
public class DelCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelCartServlet() {
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
		String id=request.getParameter("id");
		int gid=Integer.parseInt(id);
		HttpSession session=request.getSession();
		Users user=(Users)session.getAttribute("nowuser");
		CartServiceImpl cs=new CartServiceImpl();
		if(user==null){
			Map<String,Cart> carts=(Map)session.getAttribute("carts");
			carts.remove(id);
		}else{
			int uid=user.getUid();
			cs.DelCartByGid_Uid(gid, uid);
			List<Cart> cartlist=cs.queryCartByUid(uid);
			request.setAttribute("cartlist", cartlist);
		}
		request.getRequestDispatcher("showcart.jsp").forward(request, response);
	}

}

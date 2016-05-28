package com.fxt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fxt.entity.Goods;
import com.fxt.service.OrdersService;
import com.fxt.service.impl.OrdersServiceImpl;

/**
 * Servlet implementation class price
 */
public class price extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public price() {
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
		OrdersService ordersServiceImpl=new OrdersServiceImpl();
		int gid=Integer.parseInt(request.getParameter("gid"));
		System.out.println(gid);
		Goods goods=ordersServiceImpl.price(gid);
		int goodsid=goods.getGid();
		String gname=goods.getGname();
		float price=goods.getPrice();
		request.getSession().setAttribute("goods", goods);
		response.sendRedirect("addorder.jsp");
	}

}

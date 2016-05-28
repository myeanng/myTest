package com.fxt.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fxt.entity.Orders;
import com.fxt.service.OrdersService;
import com.fxt.service.impl.OrdersServiceImpl;


/**
 * Servlet implementation class DFHOrdersServlet
 */
public class DFHOrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DFHOrdersServlet() {
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
		OrdersService os=new OrdersServiceImpl();
		List<Orders> orderlist=new ArrayList<Orders>();
		int status=Integer.parseInt(request.getParameter("status"));
		int pn=Integer.parseInt(request.getParameter("pn"));
		request.getSession().setAttribute("status", status);
		int p=os.getPageNum(15, status);//pÊÇ×ÜÒ³Êý
		orderlist=os.queryOrderByStatusInPage(status, pn, 15);
		request.getSession().setAttribute("p", p);
		request.getSession().setAttribute("pn", pn);
		request.getSession().setAttribute("order", orderlist);
		response.sendRedirect("admin/dfhorders.jsp");
	}

}

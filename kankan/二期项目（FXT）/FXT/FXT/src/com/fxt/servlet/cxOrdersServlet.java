package com.fxt.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Orders;
import com.fxt.service.OrdersService;
import com.fxt.service.impl.OrdersServiceImpl;


/**
 * Servlet implementation class DFHOrdersServlet
 */
public class cxOrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cxOrdersServlet() {
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
		HttpSession session=request.getSession();
		int status=Integer.parseInt(session.getAttribute("status").toString());
		OrdersService os=new OrdersServiceImpl();
		List<Orders> orderlist=new ArrayList<Orders>();
		String oid=request.getParameter("oid");
		String name=request.getParameter("name");
		String time=request.getParameter("time");
		orderlist=os.queryOrderByCX(oid, name, time, status);
		request.getSession().setAttribute("cxorder", orderlist);
		response.sendRedirect("admin/CXorders.jsp");
	}

}

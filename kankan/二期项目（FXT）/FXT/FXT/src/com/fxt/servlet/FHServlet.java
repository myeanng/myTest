package com.fxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.service.impl.OrdersServiceImpl;



/**
 * Servlet implementation class FHServlet
 */
public class FHServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FHServlet() {
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
		PrintWriter out=response.getWriter();
		OrdersServiceImpl os=new OrdersServiceImpl();
		HttpSession session=request.getSession();
		int oid=Integer.parseInt(request.getParameter("oid"));
		int sta=Integer.parseInt(request.getParameter("sta"));
		String status=session.getAttribute("status").toString();
		System.out.println(status);
		int s=Integer.parseInt(status);
		int rows=os.updateOrder(oid, sta);
		String pns=session.getAttribute("pn").toString();
		int pn=Integer.parseInt(pns);
		if(rows>0){
			response.sendRedirect("DFHOrdersServlet?status="+s+"&pn="+pn);
		}else{
			out.print("²Ù×÷Ê§°Ü¡£");
		}
		
	}

}

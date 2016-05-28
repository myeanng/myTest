package com.fxt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Users;
import com.fxt.service.GoodsService;
import com.fxt.service.OrdersService;
import com.fxt.service.impl.GoodsServiceImpl;
import com.fxt.service.impl.OrdersServiceImpl;

/**
 * Servlet implementation class TuiDanServlet
 */
public class TuiDanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TuiDanServlet() {
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
		OrdersService dao=new OrdersServiceImpl();
		String oid=request.getParameter("oid");
		String status=request.getParameter("status");
		String num1=request.getParameter("num");
		System.out.println(num1+":数量");
		if(oid!=null&&status!=null){
			int row=dao.delOrder(u.getUid(), Integer.parseInt(status),Integer.parseInt(oid));
			 GoodsService g=new GoodsServiceImpl();
			 g.UpGoodSupNum(u.getUid(),Integer.parseInt(num1),  Integer.parseInt(status));
			if(row>0){
				session.setAttribute("mes", "退单成功");
				response.sendRedirect("ShowOrdersServlet?ob="+status+"");
				
			}else{
				System.out.println("退单删除失败");
			}
		}
	}

}

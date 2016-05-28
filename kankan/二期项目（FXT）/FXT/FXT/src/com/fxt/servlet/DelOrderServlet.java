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
 * Servlet implementation class DelOrderServlet
 */
public class DelOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelOrderServlet() {
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
		Users u=(Users)session.getAttribute("nowuser");//获取User
		String sta=request.getParameter("st");
		String id=request.getParameter("oid");
		String num1=request.getParameter("num");
		System.out.println("更新数量:"+num1);
		if(sta!=null||"".equals(sta)&&id!=null||"".equals(id)){
		OrdersService dao=new OrdersServiceImpl();
		int row=dao.delOrder(u.getUid(), Integer.parseInt(sta), Integer.parseInt(id));
		       if(Integer.parseInt(sta)==1){//未付款的删除后增加数量
			   GoodsService g=new GoodsServiceImpl();
			   g.UpGoodSupNum(u.getUid(), Integer.parseInt(num1),Integer.parseInt(sta));
		       }
		if(row>0){
			response.sendRedirect("ShowOrdersServlet?status="+sta+"");
		}
		}else{
			response.sendRedirect("showdingdan.jsp");
		}
	}

}

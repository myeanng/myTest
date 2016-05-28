package com.fxt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Users;
import com.fxt.service.PayService;
import com.fxt.service.impl.PayServiceImpl;

/**
 * Servlet implementation class ShowPayServlet
 */
public class ShowPayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPayServlet() {
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
		String cq=request.getParameter("cq");
		System.out.println(cq);
		HttpSession session=request.getSession();
		Users u=(Users)session.getAttribute("nowuser");
		PayService ps=new PayServiceImpl();
		if(cq==null||cq==""){
			float money=ps.queryBalanceByUid(u.getUid());
			session.setAttribute("money", money);
			session.setAttribute("num", 1);
			session.setAttribute("u", u);
			response.sendRedirect("showdingdans.jsp");
		}else{
			int row=ps.updateBalanceByUid_Pay2(Float.parseFloat(cq), u.getUid());
			 cq="";
			if(row>0){
				float money=ps.queryBalanceByUid(u.getUid());
				session.setAttribute("money", money);
				session.setAttribute("cqrow", "充值成功");
				response.sendRedirect("showdingdans.jsp");
			}else{
				session.setAttribute("cqrow", "充值失败");
				response.sendRedirect("showdingdans.jsp");
			}
		}
		
		
	}
}

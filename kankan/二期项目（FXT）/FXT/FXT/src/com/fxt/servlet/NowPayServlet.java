package com.fxt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Goods;
import com.fxt.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class NowPayServlet
 */
public class NowPayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NowPayServlet() {
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
		int gid=Integer.parseInt(request.getParameter("gid"));
		int num=Integer.parseInt(request.getParameter("num"));
		GoodsServiceImpl gsi=new GoodsServiceImpl();
		Goods gd=gsi.selectGoods(gid);
		gd.setNum(num);
		request.setAttribute("gd", gd);
		request.getRequestDispatcher("nowpay.jsp").forward(request, response);
	//	HttpSession session=request.getSession();
	//	session.setAttribute("gd",gd);
	//	response.sendRedirect("nowpay.jsp");
	}

}

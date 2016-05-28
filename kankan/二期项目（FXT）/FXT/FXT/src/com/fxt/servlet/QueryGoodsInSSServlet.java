package com.fxt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Goods;
import com.fxt.service.GoodsService;
import com.fxt.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class QueryGoodsInSSServlet
 */
public class QueryGoodsInSSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryGoodsInSSServlet() {
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
		GoodsService goodsServiceImpl=new GoodsServiceImpl();
		String sstj=request.getParameter("sstj");
		List<Goods> goodsList=goodsServiceImpl.queryGoodsInSS(sstj);
		HttpSession session=request.getSession();
		session.setAttribute("goodsLists", goodsList);
		session.setAttribute("guanjianzi", sstj);
		response.sendRedirect("sousuojieguo.jsp");
	}

}

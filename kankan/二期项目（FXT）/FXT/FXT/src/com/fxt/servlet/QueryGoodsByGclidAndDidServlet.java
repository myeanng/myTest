package com.fxt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fxt.entity.Goods;
import com.fxt.service.GoodsService;
import com.fxt.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class QueryGoodsByGclidAndDidServlet
 */
public class QueryGoodsByGclidAndDidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryGoodsByGclidAndDidServlet() {
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
		System.out.println("asd");
		int gclid=1;
		int did=1;
		gclid=Integer.parseInt(request.getParameter("gclid"));
		//did=Integer.parseInt(request.getParameter("did"));
		GoodsService goodsService=new GoodsServiceImpl();
		List<Goods> goodslist=goodsService.queryGoodsByGclidandDid(gclid, did);
		request.setAttribute("goodslist", goodslist);
		request.getRequestDispatcher("showG.jsp").forward(request, response);
	}

}

package com.fxt.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Goods;
import com.fxt.entity.GoodsClass;
import com.fxt.entity.GoodsClassList;
import com.fxt.service.impl.GoodsClassListServiceImpl;
import com.fxt.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class SelectGoodsByGclidServlet
 */
public class SelectGoodsByGclidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectGoodsByGclidServlet() {
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
		String pageindex=request.getParameter("pageindex");
		if(pageindex==null){
			pageindex="1";
		}
		int ye=Integer.parseInt(pageindex);
		int size=6;
		int gclid=Integer.parseInt(request.getParameter("gclid"));
		GoodsServiceImpl gsi=new GoodsServiceImpl();
		int countpage=gsi.queryCountPageByGclid(gclid, size);
		List<Goods> goodslist=gsi.queryGoodsByGclid_Pageindex_size(gclid, ye, size);
		GoodsClassListServiceImpl gclsi=new GoodsClassListServiceImpl();
		GoodsClass gc=gclsi.queryGoodsClassByGclid(gclid);
		GoodsClassList gcl=gclsi.queryGoodsClassListByGclid(gclid);
		request.setAttribute("gc", gc);
		request.setAttribute("gcl", gcl);
		request.setAttribute("ye", ye);
		request.setAttribute("countpage", countpage);
		request.setAttribute("goodslist", goodslist);
		request.getRequestDispatcher("showgoodsbygclid.jsp").forward(request, response);
	}

}

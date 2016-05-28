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
 * Servlet implementation class mainShowGoodsServlet
 */
public class mainShowGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mainShowGoodsServlet() {
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
		GoodsService goodsServiceImpl=new GoodsServiceImpl();
		List<Goods> weeklist=goodsServiceImpl.selectweekgoods();
		List<Goods> todaylist=goodsServiceImpl.selecttodaygoods();
		List<Goods> meishilist=goodsServiceImpl.selectlistgoods(1);
		List<Goods> jiudianlist=goodsServiceImpl.selectlistgoods(2);
		List<Goods> dianyinglist=goodsServiceImpl.selectlistgoods(3);
		List<Goods> yulelist=goodsServiceImpl.selectlistgoods(4);
		List<Goods> lvyoulist=goodsServiceImpl.selectlistgoods(5);
		List<Goods> fuwulist=goodsServiceImpl.selectlistgoods(6);
		List<Goods> gouwulist=goodsServiceImpl.selectlistgoods(7);
		List<Goods> lirenlist=goodsServiceImpl.selectlistgoods(8);
		List<Goods> ShowAll=goodsServiceImpl.selectAll();
		HttpSession session=request.getSession();
		session.setAttribute("goodpic", ShowAll);//在更新图片的时候使用
		session.setAttribute("weeklist", weeklist);
		session.setAttribute("todaylist", todaylist);
		session.setAttribute("meishilist", meishilist);
		session.setAttribute("jiudianlist", jiudianlist);
		session.setAttribute("dianyinglist", dianyinglist);
		session.setAttribute("yulelist", yulelist);
		session.setAttribute("lvyoulist", lvyoulist);
		session.setAttribute("fuwulist", fuwulist);
		session.setAttribute("gouwulist", gouwulist);
		session.setAttribute("lirenlist", lirenlist);
		response.sendRedirect("index.jsp");
	}

}

package com.fxt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Goods;
import com.fxt.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class SelectAllGoodsServlet
 */
public class SelectGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectGoodsServlet() {
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
			int size=18;
			String pageIndex=request.getParameter("pageIndex");
			if(pageIndex==null){
				pageIndex="1";
			}
			int dangqianye=Integer.parseInt(pageIndex);
			GoodsServiceImpl goodsserviceimpl=new GoodsServiceImpl();
			int countpage=goodsserviceimpl.countpage(size);
			List<Goods> pagegoodslist=goodsserviceimpl.selectPageGoods(size, dangqianye);
			HttpSession session=request.getSession();
			session.setAttribute("zongyeshu", countpage);
			session.setAttribute("dangqianye", dangqianye);
			session.setAttribute("pagegoodslist", pagegoodslist);
			response.sendRedirect("admin/showgoods.jsp");
	}

}

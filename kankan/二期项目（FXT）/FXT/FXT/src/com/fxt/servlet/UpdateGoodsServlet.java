package com.fxt.servlet;

import java.io.IOException;

import javax.faces.context.ResponseWriterWrapper;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fxt.entity.Goods;
import com.fxt.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class UpdateGoodsServlet
 */
public class UpdateGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateGoodsServlet() {
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
		request.setCharacterEncoding("utf-8");
		int gid=Integer.parseInt(request.getParameter("gid"));
		int did=Integer.parseInt(request.getParameter("did"));
		int gclid=Integer.parseInt(request.getParameter("gclid"));
		String gname=request.getParameter("gname");
		int num=Integer.parseInt(request.getParameter("num"));
		float price=Float.parseFloat(request.getParameter("price"));
		float nowprice=Float.parseFloat(request.getParameter("nowprice"));
		String destroytime=request.getParameter("destroytime");
		String intros=request.getParameter("intro");
		int x=intros.indexOf(">");
		String intro=intros.substring(x+1);
		String describes=request.getParameter("describe");
		int y=describes.indexOf(">");
		String describe=describes.substring(y+1);
		Goods good=new Goods(gid,did,gclid,gname,num,price,nowprice,destroytime,intro,describe);
		GoodsServiceImpl goodsserviceimpl=new GoodsServiceImpl();
		int rows=goodsserviceimpl.updategoods(good);
		if(rows>0){
			request.getRequestDispatcher("SelectGoodsServlet").forward(request, response);
		}else{
			response.sendRedirect("admin/err.jsp");
		}
		
	}

}

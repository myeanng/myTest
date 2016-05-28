package com.fxt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fxt.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class UpdateGoddsIsdeleteServlet
 */
public class UpdateGoodsIsdeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateGoodsIsdeleteServlet() {
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
		int isdelete=Integer.parseInt(request.getParameter("isdelete"));
		GoodsServiceImpl goodsserviceimpl=new GoodsServiceImpl();
		int rows=goodsserviceimpl.updategoodsisdelete(gid, isdelete);
		if(rows>0){
			response.sendRedirect("SelectGoodsServlet");
		}else{
			response.sendRedirect("admin/err.jsp");
		}
	}

}

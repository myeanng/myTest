package com.fxt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fxt.entity.Comment;
import com.fxt.entity.Goods;
import com.fxt.service.impl.CommentServiceImpl;
import com.fxt.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class SelectGoodsServlet1
 */
public class SelectGoodsServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectGoodsServlet1() {
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
		int xuan=Integer.parseInt(request.getParameter("xuan"));
		int gid=Integer.parseInt(request.getParameter("gid"));
		GoodsServiceImpl goodsserviceimpl=new GoodsServiceImpl();
		Goods good=goodsserviceimpl.selectGoods(gid);
		request.getSession().setAttribute("goods", good);
		if(xuan==1){
			response.sendRedirect("admin/updategoodspic.jsp");
		}else if(xuan==2){	
			response.sendRedirect("admin/updategoods.jsp");
		}else if(xuan==3){
			CommentServiceImpl commentserviceimpl=new CommentServiceImpl();
			List<Comment> commentlist=commentserviceimpl.queryCommentByGoodsid(gid);
			request.getSession().setAttribute("commentlist", commentlist);
			
			response.sendRedirect("showgoods.jsp");
		}
		
	}

}

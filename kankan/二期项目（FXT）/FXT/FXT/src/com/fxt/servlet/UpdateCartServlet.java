package com.fxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.registry.infomodel.User;

import com.fxt.entity.Cart;
import com.fxt.entity.Goods;
import com.fxt.entity.Users;
import com.fxt.service.impl.CartServiceImpl;
import com.fxt.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class UpdateCartServlet
 */
public class UpdateCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCartServlet() {
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
		PrintWriter out=response.getWriter();
		String gids=request.getParameter("gid");
		int gid=Integer.parseInt(gids);
		int num=Integer.parseInt(request.getParameter("num"));
		GoodsServiceImpl gsi=new GoodsServiceImpl();
		Goods gd=gsi.selectGoods(gid);
		float price=gd.getNowprice();
		float zongjia=price*num;
		HttpSession session=request.getSession();
		Users us=(Users)session.getAttribute("nowuser");
		if(us==null){
			Map<String,Cart> carts=(Map)session.getAttribute("carts");
			Cart ca=carts.get(gids);
			//总价的获取是用原来购物车里的总价+更改数量后增加或减少的商品的总价，而不是直接用商品的单价*更改后商品的数量，是为了防止商品调价后，以前加入购物车的商品也按调价后商品的单价计算总价
			ca.setNum(num);
			ca.setTotalmoney(zongjia);
			carts.remove(gids);
			carts.put(gids, ca);	
		}else{
			int uid=us.getUid();
			CartServiceImpl csi=new CartServiceImpl();
			csi.upCartByUid_Gid(uid, gid, num, zongjia);
		}
		out.print(zongjia);
	}

}

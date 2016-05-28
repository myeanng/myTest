package com.fxt.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Cart;
import com.fxt.entity.Goods;
import com.fxt.entity.Orders;
import com.fxt.entity.Users;
import com.fxt.service.impl.CartServiceImpl;
import com.fxt.service.impl.GoodsServiceImpl;
import com.fxt.service.impl.OrdersServiceImpl;

/**
 * Servlet implementation class AddOrdersServlet
 */
public class AddOrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOrdersServlet() {
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
		List<Goods> goodslist=new ArrayList<Goods>();
		int xuan=Integer.parseInt(request.getParameter("xuan"));
		String uname=request.getParameter("uname");
		String address=request.getParameter("address");
		String tel=request.getParameter("tel");
		
		HttpSession session=request.getSession();
		Users us=(Users)session.getAttribute("nowuser");
		int uid=us.getUid();
		
		if(xuan==1){//说明是购物车页面提交的订单
			Float zongjia=Float.parseFloat(request.getParameter("zongjia"));
			String[] gids=request.getParameterValues("xuanze");
		    GoodsServiceImpl gdi=new GoodsServiceImpl();
		    CartServiceImpl csi=new CartServiceImpl();
		    OrdersServiceImpl osi=new OrdersServiceImpl();
		    for(int i=0;i<gids.length;i++){
			    int gid=Integer.parseInt(gids[i]);
			    if(gid>0){
				    Goods gd=gdi.selectGoods(gid);
				    int gclid=gd.getGclid();
				    Cart ca=csi.queryCartByUid_Gid(uid, gid);
				    gd.setNum(ca.getNum());
				    gd.setNowprice(ca.getTotalmoney());
				    if(gclid==12||gclid==13){
					     Orders od=new Orders(gid,uid,ca.getNum(),ca.getTotalmoney(),uname,address,tel);
					     osi.AddOrders_fh(od);//向订单表中插入订单
					     int max=osi.queryOidByUid_status(uid, 1);//获取刚插入订单的Id;
					     gd.setOid(max);
					     goodslist.add(gd);//将下单的商品信息传递到支付页面
					     csi.DelCartByGid_Uid(gid, uid);//删除此商品在购物车中的记录
					     gdi.updategoodsbysupnum(ca.getNum(), gid);//更新商品的库存信息
					     
				    }else{
					     Orders od=new Orders(gid,uid,ca.getNum(),ca.getTotalmoney());
					     osi.AddOrders(od);//向订单表中插入订单
					     int max=osi.queryOidByUid_status(uid, 1);//获取刚插入订单的Id;
					     gd.setOid(max);
					     goodslist.add(gd);//将下单的商品信息传递到支付页面
					     csi.DelCartByGid_Uid(gid, uid);//删除此商品在购物车中的记录
					     gdi.updategoodsbysupnum(ca.getNum(), gid);//更新商品的库存信息
				}	
			}
		 }
		 // request.setAttribute("zongjia", zongjia);
		 // request.setAttribute("goodslist", goodslist);
		    session.setAttribute("zongjia", zongjia);
		    session.setAttribute("goodslist", goodslist);
		    response.sendRedirect("pay.jsp");
		 // request.getRequestDispatcher("pay.jsp").forward(request, response);
	 }else if(xuan==2){//说明是立即购买商品页面提交的订单
		 Float zongjia=Float.parseFloat(request.getParameter("zongjia"));
		String gids=request.getParameter("gid");
		int num=Integer.parseInt(request.getParameter("num"));
		int gid=Integer.parseInt(gids);
		GoodsServiceImpl gsi=new GoodsServiceImpl();
		Goods gd=gsi.selectGoods(gid);
		System.out.println(gd.getGid());
		gd.setNum(num);
		gd.setNowprice(zongjia);
		goodslist.add(gd);
		OrdersServiceImpl osi=new OrdersServiceImpl();
		if(gd.getGclid()==12||gd.getGclid()==13){
			Orders od=new Orders(gid,uid,num,zongjia,uname,address,tel);
			osi.AddOrders_fh(od);//向订单表中插入订单
			int max=osi.queryOidByUid_status(uid, 1);//获取刚插入订单的Id;
		     gd.setOid(max);
		     goodslist.add(gd);//将下单的商品信息传递到支付页面
			gsi.updategoodsbysupnum(num, gid);//更新商品的库存信息
			
		}else{
			Orders od=new Orders(gid,uid,num,zongjia);
			osi.AddOrders(od);//向订单表中插入订单
			int max=osi.queryOidByUid_status(uid, 1);//获取刚插入订单的Id;
		     gd.setOid(max);
		     goodslist.add(gd);//将下单的商品信息传递到支付页面
			gsi.updategoodsbysupnum(num, gid);//更新商品的库存信息
		}
		//request.setAttribute("zongjia", zongjia);
		//request.setAttribute("goodslist", goodslist);
		session.setAttribute("zongjia", zongjia);
	    session.setAttribute("goodslist", goodslist);
	    response.sendRedirect("pay.jsp");
		//request.getRequestDispatcher("pay.jsp").forward(request, response);
	}else if(xuan==3){
		 System.out.println("此操作是在个人中心给商品付款");
	     int oid=Integer.parseInt(request.getParameter("oid"));
	     System.out.println("从个人中心获取的订单ID是："+oid);
		 OrdersServiceImpl osi=new OrdersServiceImpl();
		 Orders od=osi.queryOrderByOid(oid);//根据订单ID查询出订单内容
		 
		 float zongjias=od.getTotalprice();
		 int num=od.getNum();
		 int gid=od.getGid();
		 System.out.println("该订单需付款的商品ID是："+gid);
		 GoodsServiceImpl gsi=new GoodsServiceImpl();
		 Goods gd=gsi.selectGoods(gid);//根据订单中的商品ID查询出商品信息
		 System.out.println("该订单需付款的商品名称是："+gd.getGname());
		 gd.setNum(num);
		 gd.setNowprice(zongjias);
		 gd.setOid(oid);
		 goodslist.add(gd);
		 
		 session.setAttribute("zongjia", zongjias);
		 session.setAttribute("goodslist", goodslist);
		 response.sendRedirect("pay.jsp");
	}
	}
}

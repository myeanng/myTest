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
		
		if(xuan==1){//˵���ǹ��ﳵҳ���ύ�Ķ���
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
					     osi.AddOrders_fh(od);//�򶩵����в��붩��
					     int max=osi.queryOidByUid_status(uid, 1);//��ȡ�ղ��붩����Id;
					     gd.setOid(max);
					     goodslist.add(gd);//���µ�����Ʒ��Ϣ���ݵ�֧��ҳ��
					     csi.DelCartByGid_Uid(gid, uid);//ɾ������Ʒ�ڹ��ﳵ�еļ�¼
					     gdi.updategoodsbysupnum(ca.getNum(), gid);//������Ʒ�Ŀ����Ϣ
					     
				    }else{
					     Orders od=new Orders(gid,uid,ca.getNum(),ca.getTotalmoney());
					     osi.AddOrders(od);//�򶩵����в��붩��
					     int max=osi.queryOidByUid_status(uid, 1);//��ȡ�ղ��붩����Id;
					     gd.setOid(max);
					     goodslist.add(gd);//���µ�����Ʒ��Ϣ���ݵ�֧��ҳ��
					     csi.DelCartByGid_Uid(gid, uid);//ɾ������Ʒ�ڹ��ﳵ�еļ�¼
					     gdi.updategoodsbysupnum(ca.getNum(), gid);//������Ʒ�Ŀ����Ϣ
				}	
			}
		 }
		 // request.setAttribute("zongjia", zongjia);
		 // request.setAttribute("goodslist", goodslist);
		    session.setAttribute("zongjia", zongjia);
		    session.setAttribute("goodslist", goodslist);
		    response.sendRedirect("pay.jsp");
		 // request.getRequestDispatcher("pay.jsp").forward(request, response);
	 }else if(xuan==2){//˵��������������Ʒҳ���ύ�Ķ���
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
			osi.AddOrders_fh(od);//�򶩵����в��붩��
			int max=osi.queryOidByUid_status(uid, 1);//��ȡ�ղ��붩����Id;
		     gd.setOid(max);
		     goodslist.add(gd);//���µ�����Ʒ��Ϣ���ݵ�֧��ҳ��
			gsi.updategoodsbysupnum(num, gid);//������Ʒ�Ŀ����Ϣ
			
		}else{
			Orders od=new Orders(gid,uid,num,zongjia);
			osi.AddOrders(od);//�򶩵����в��붩��
			int max=osi.queryOidByUid_status(uid, 1);//��ȡ�ղ��붩����Id;
		     gd.setOid(max);
		     goodslist.add(gd);//���µ�����Ʒ��Ϣ���ݵ�֧��ҳ��
			gsi.updategoodsbysupnum(num, gid);//������Ʒ�Ŀ����Ϣ
		}
		//request.setAttribute("zongjia", zongjia);
		//request.setAttribute("goodslist", goodslist);
		session.setAttribute("zongjia", zongjia);
	    session.setAttribute("goodslist", goodslist);
	    response.sendRedirect("pay.jsp");
		//request.getRequestDispatcher("pay.jsp").forward(request, response);
	}else if(xuan==3){
		 System.out.println("�˲������ڸ������ĸ���Ʒ����");
	     int oid=Integer.parseInt(request.getParameter("oid"));
	     System.out.println("�Ӹ������Ļ�ȡ�Ķ���ID�ǣ�"+oid);
		 OrdersServiceImpl osi=new OrdersServiceImpl();
		 Orders od=osi.queryOrderByOid(oid);//���ݶ���ID��ѯ����������
		 
		 float zongjias=od.getTotalprice();
		 int num=od.getNum();
		 int gid=od.getGid();
		 System.out.println("�ö����踶�����ƷID�ǣ�"+gid);
		 GoodsServiceImpl gsi=new GoodsServiceImpl();
		 Goods gd=gsi.selectGoods(gid);//���ݶ����е���ƷID��ѯ����Ʒ��Ϣ
		 System.out.println("�ö����踶�����Ʒ�����ǣ�"+gd.getGname());
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

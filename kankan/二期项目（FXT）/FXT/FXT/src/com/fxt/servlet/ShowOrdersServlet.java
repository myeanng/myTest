package com.fxt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.GoodsOrders;
import com.fxt.entity.Users;
import com.fxt.service.OrdersService;
import com.fxt.service.impl.OrdersServiceImpl;

/**
 * Servlet implementation class ShowOrders
 */
public class ShowOrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowOrdersServlet() {
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
		HttpSession session=request.getSession();
		Users u=(Users)session.getAttribute("nowuser");
		OrdersService dao=new OrdersServiceImpl();//ɾ���������˵��������Ӹı�
		session.setAttribute("num", 2);
		String status=request.getParameter("ob");//��ѯ����״̬
		int size=4;
		System.out.println("��ѯ����״̬"+status);
		if(status==null||status==""){
		   session.setAttribute("status", 1);
			int pn=1;
			String p1=request.getParameter("p");
			if(p1==null){
				pn=1;
			}else{
				pn=Integer.parseInt(p1);		
			}
			List<GoodsOrders> list=dao.findOrderStatus(u.getUid(), 1, size, pn);//״̬Ϊ�յĲ�ѯΪδ����
			int statusrow=dao.getcountOrder("orders", size, u.getUid(), 1);//����״̬��ѯ��������
			session.setAttribute("orderrow", statusrow);//����״̬��������ҳ
			session.setAttribute("pn", pn);
			session.setAttribute("orderstatus", list);
	    	response.sendRedirect("showdingdans.jsp");
		}else if(Integer.parseInt(status)==0){//��ѯ����״̬��0��
			 session.setAttribute("status", Integer.parseInt(status));
				int pn=1;
				String p1=request.getParameter("p");
				if(p1==null){
					pn=1;
				}else{
					pn=Integer.parseInt(p1);		
				}
			List<GoodsOrders> list=dao.findOrderMessage(u.getUid(),size,pn);
			int statusrow=dao.getcount("orders", size, u.getUid());//����״̬��ѯ��������
			session.setAttribute("orderrow", statusrow);//����״̬��������ҳ
			session.setAttribute("pn", pn);
			session.setAttribute("orderstatus", list);
	    	response.sendRedirect("showdingdans.jsp");
		}
		else{
			 session.setAttribute("status", Integer.parseInt(status));
			int pn=1;
			String p1=request.getParameter("p");
			if(p1==null){
				pn=1;
			}else{
				pn=Integer.parseInt(p1);		
			}
			List<GoodsOrders> list=dao.findOrderStatus(u.getUid(), Integer.parseInt(status), size, pn);//״̬Ϊ�յĲ�ѯΪδ����
			int statusrow=dao.getcountOrder("orders", size, u.getUid(), Integer.parseInt(status));//����״̬��ѯ��������
			session.setAttribute("orderrow", statusrow);//����״̬��������ҳ
			session.setAttribute("pn", pn);
			session.setAttribute("orderstatus", list);
	    	response.sendRedirect("showdingdans.jsp");
		}
	}
}

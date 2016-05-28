package com.fxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Goods;
import com.fxt.entity.Users;
import com.fxt.service.impl.OrdersServiceImpl;
import com.fxt.service.impl.PayServiceImpl;

/**
 * Servlet implementation class PayServlet
 */
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PayServlet() {
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
		HttpSession session=request.getSession();
		Users user=(Users)session.getAttribute("nowuser");
		int uid=user.getUid();
		List<Goods> goodslist=(List<Goods>) session.getAttribute("goodslist");
		float zongjia=(Float)session.getAttribute("zongjia");
		PayServiceImpl psi=new PayServiceImpl();
		float yue=psi.queryBalanceByUid(uid);//�����û�uid��ѯ���û����˻����
		if(yue<zongjia){//����û��˻����С�ڸ�����
			out.print("false");
		}else{
			OrdersServiceImpl osi=new OrdersServiceImpl();
			for(int i=0;i<goodslist.size();i++){
				int gid=goodslist.get(i).getGid();
				System.out.println("����������Ʒ��ID��"+gid);
				int gclid=goodslist.get(i).getGclid();
				System.out.println("����������Ʒ��gclid��"+gclid);
				int oid=goodslist.get(i).getOid();
				System.out.println("�����������Ʒ���ڶ���ID��"+oid);
				if(gclid==12||gclid==13){
					osi.updateOrder(oid, 2);
				}else{
					osi.updateOrder(oid, 4);
				}
				//����������Ʒ״̬Ϊ�Ѹ���
			}
			psi.updateBalanceByUid_Pay(zongjia, uid);//�������¸������
			out.print("true");
		}
	}

}

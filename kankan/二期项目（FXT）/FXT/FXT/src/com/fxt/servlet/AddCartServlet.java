package com.fxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
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
import com.fxt.service.GoodsService;
import com.fxt.service.impl.CartServiceImpl;
import com.fxt.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class AddCartServlet
 */
public class AddCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCartServlet() {
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
		GoodsService gs=new GoodsServiceImpl();
		Goods gd=gs.selectGoods(gid);
		int num=Integer.parseInt(request.getParameter("num"));
		float price=Float.parseFloat(request.getParameter("price"));
		float totalmoney=price*num;
		HttpSession session=request.getSession();
		Users user=(Users)session.getAttribute("nowuser");
		if(user==null){
			System.out.println("δ��¼�û�");
			Cart ca=new Cart(gid,gd.getGname(),gd.getPic1(),num,totalmoney);
			Map<String,Cart> carts=(Map)session.getAttribute("carts");
			if(carts==null){
				System.out.println("���û���һ�μӹ��ﳵ");
				carts=new HashMap<String,Cart>();
				carts.put(gids, ca);
				session.setAttribute("carts", carts);
				System.out.println("���빺�ﳵ�ɹ�");
			}else{
				System.out.println("���û�֮ǰ�Ѽ��빺�ﳵ����Ʒ");
				//�жϹ��ﳵ���Ƿ��Ѵ��ڸ���Ʒ
				Cart cas=carts.get(gids);
				//û�д���
				if(cas==null){
					carts.put(gids, ca);
					System.out.println("���빺�ﳵ�ɹ�");
				}else{//�Ѿ�����
					int cartnum=cas.getNum()+num;
					float totalmoney2=price*cartnum;
					ca.setNum(cartnum);
					ca.setTotalmoney(totalmoney2);
					carts.remove(gids);
					carts.put(gids, ca);
					System.out.println("���빺�ﳵ�ɹ�");
				}
			}
			
		}else{
			System.out.println("�ѵ�¼�û�");
			int uid=user.getUid();
			CartServiceImpl csi=new CartServiceImpl();
			//��ѯ���ݿ�Ĺ��ﳵ���Ƿ��Ѿ����ڸ���Ʒ
			Cart cart=csi.queryCartByUid_Gid(uid, gid);
			//û�д��ڣ�����һ������
			if(cart==null){
				Cart car=new Cart(uid,gid,gd.getGname(),gd.getPic1(),num,totalmoney);
				int f=csi.addcart(car);
			    if(f>0){
			    	System.out.println("�ɹ����빺�ﳵ");
			    }else{
			    	System.out.println("���빺�ﳵʧ��");
			    }
			}else{//������ڣ����¹��ﳵ��Ϣ
				int nums=cart.getNum()+num;
				float zongjia=price*nums;
				int row=csi.upCartByUid_Gid(uid, gid, nums, zongjia);
				if(row>0){
					System.out.println("���빺�ﳵ�ɹ�");
				}else{
					System.out.println("���빺�ﳵʧ��");
				}
			}
		}
		out.print("true");
	}

}

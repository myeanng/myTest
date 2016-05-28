package com.fxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.dao.UsersDao;
import com.fxt.dao.impl.UsersDaoImpl;
import com.fxt.entity.Cart;
import com.fxt.entity.Users;
import com.fxt.service.impl.CartServiceImpl;
import com.fxt.util.MD5;

/**
 * Servlet implementation class login
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
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
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		int xuan=Integer.parseInt(request.getParameter("xuan"));
		String username=request.getParameter("username");
		String userpwds=request.getParameter("userpwd");
		String userpwd=MD5.encodePassword(userpwds, "MD5");
		UsersDao ud=new UsersDaoImpl();
		Users user=ud.login(username,userpwd);
		if(user!=null){
			request.getSession().setAttribute("nowuser", user);
			if(xuan==1){
				out.print(true);
			}else if(xuan==2){
				HttpSession session=request.getSession();
				Map<String,Cart> carts=(Map)session.getAttribute("carts");
				if(carts!=null){
					CartServiceImpl csi=new CartServiceImpl();
					for(Cart ca:carts.values()){
						int gid=ca.getGid();
						int uid=user.getUid();
						Cart cas=csi.queryCartByUid_Gid(uid, gid);
						if(cas==null){
							System.out.println("用户数据库购物车中没有"+ca.getGname()+",插入此商品信息");
							ca.setUid(user.getUid());
							csi.addcart(ca);
							System.out.println("aaa");
							carts.remove(gid+"");
						}else{
							System.out.println("用户数据库购物车中存在"+ca.getGname()+",更新数量和总价");
							int num=cas.getNum()+ca.getNum();
							float totalmoney=cas.getTotalmoney()+ca.getTotalmoney();
							csi.upCartByUid_Gid(uid, gid, num, totalmoney);
							carts.remove(gid+"");
						}
					}
				}
				System.out.println("未登录用户登陆后重新返回购物车页面");
				out.print("true");
				//response.sendRedirect("ShowCartServlet");
			}else if(xuan==3){
				out.print("true");
			}
		}else{
			System.out.println("登录失败");
			if(xuan==2||xuan==1){
				out.print("false");
			}else{
				response.sendRedirect("login.jsp");
			}
			
		}
	}

}

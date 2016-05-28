package com.fxt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Orders;
import com.fxt.service.CommentService;
import com.fxt.service.OrdersService;
import com.fxt.service.impl.CommentServiceImpl;
import com.fxt.service.impl.OrdersServiceImpl;

/**
 * Servlet implementation class ShowCommentServlet
 */
public class ShowCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCommentServlet() {
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
		
		String ly=request.getParameter("liuyan");
		
		if(ly==null||ly==""){//绗竴娆¤繘鍏ユ病鏈夌暀瑷�
			String name=request.getParameter("name");
			String pic=request.getParameter("pic");
			String endtime=request.getParameter("endtime");
			String oid=request.getParameter("oid");
			if(name!=null||"".equals(name)&&pic!=null||"".equals(pic)&&endtime!=null||"".equals(endtime)){
				request.getSession().setAttribute("gname", name);
				request.getSession().setAttribute("pic", pic);
				request.getSession().setAttribute("endtime", endtime);
				request.getSession().setAttribute("oid", Integer.parseInt(oid));
				response.sendRedirect("pingjia.jsp");
			}else{
				//鍑洪敊椤甸潰
			}
		}else{//鏈夌暀瑷�
			int x=ly.indexOf(">");
//			int y=ly.lastIndexOf("<");
			String lys=ly.substring(x+1);
		 String oid2=request.getParameter("oid1");
			OrdersService oss=new OrdersServiceImpl();
			Orders os=oss.queryOrderByOid(Integer.parseInt(oid2));//浠庢鏂规硶涓彇鍊�
			CommentService cs=new CommentServiceImpl();
			int row=cs.AddComment(os.getGid(), os.getUid(), lys);
			if(row>0){
				response.sendRedirect("ShowOrdersServlet");
			}else{
				//鍑洪敊椤甸潰
			}
		}
		
	}

}

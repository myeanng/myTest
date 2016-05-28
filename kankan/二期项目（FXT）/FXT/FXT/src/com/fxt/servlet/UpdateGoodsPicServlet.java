package com.fxt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

import com.fxt.entity.Goods;
import com.fxt.service.impl.GoodsServiceImpl;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

/**
 * Servlet implementation class UpdateGoodsPicServlet
 */
public class UpdateGoodsPicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateGoodsPicServlet() {
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
		SmartUpload smart=new SmartUpload();
		PageContext pagecontext=JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
		smart.initialize(pagecontext);
		smart.setCharset("utf-8");
		try {
			smart.upload();
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Request smartReq=smart.getRequest();
		int gid=Integer.parseInt(smartReq.getParameter("gid"));
		int xuan=Integer.parseInt(smartReq.getParameter("xuan"));
		String pic="";
		Files files=smart.getFiles();//取得所有上传文件
		for(int i=0;i<files.getCount();i++){
			pic=files.getFile(i).getFileName();
			
			try {
				smart.save("img");
			} catch (SmartUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		GoodsServiceImpl gsi=new GoodsServiceImpl();
		if(xuan==1){
			if(!pic.equals("")){
				int row=gsi.UpGoodsPic(pic, xuan, gid);
				if(row>0){
					response.sendRedirect("SelectGoodsServlet?xuan=1");
				}else{
					response.sendRedirect("admin/err.jsp");
				}
			}else{
				response.sendRedirect("SelectGoodsServlet?xuan=1");
			}
		}
		if(xuan==2){
			if(!pic.equals("")){
				int row=gsi.UpGoodsPic(pic, xuan, gid);
				if(row>0){
					response.sendRedirect("SelectGoodsServlet?xuan=1");
				}else{
					response.sendRedirect("admin/err.jsp");
				}
			}else{
				response.sendRedirect("SelectGoodsServlet?xuan=1");
			}
		}
		if(xuan==3){
			if(!pic.equals("")){
				int row=gsi.UpGoodsPic(pic, xuan, gid);
				if(row>0){
					response.sendRedirect("SelectGoodsServlet?xuan=1");
				}else{
					response.sendRedirect("admin/err.jsp");
				}
			}else{
				response.sendRedirect("SelectGoodsServlet?xuan=1");
			}
		}
	}
}

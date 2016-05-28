package com.fxt.servlet;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

import com.fxt.entity.Goods;
import com.fxt.service.impl.GoodsServiceImpl;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

/**
 * Servlet implementation class AddGoodsServlet
 */
public class AddGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGoodsServlet() {
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
		String dids=smartReq.getParameter("did");
		int did=Integer.parseInt(dids);
		int gclid=Integer.parseInt(smartReq.getParameter("gclid"));
		String gname=smartReq.getParameter("gname");
		int num=Integer.parseInt(smartReq.getParameter("num"));
		float price=Float.parseFloat(smartReq.getParameter("price"));
		float nowprice=Float.parseFloat(smartReq.getParameter("nowprice"));
		String destroytime=smartReq.getParameter("destroytime");
		String intros=smartReq.getParameter("intro");
		int x=intros.indexOf(">");
		String intro=intros.substring(x+1);
		String describes=smartReq.getParameter("describe");
		int y=describes.indexOf(">");
		String describe=describes.substring(y+1);
		String[] pic=new String[3];
		Files files=smart.getFiles();//取得所有上传文件
		for(int i=0;i<files.getCount();i++){
			pic[i]=files.getFile(i).getFileName();
			try {
				smart.save("img");
			} catch (SmartUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Goods good=new Goods(did,gclid,gname,num,num,price,nowprice,(new Timestamp(new java.util.Date().getTime())).toString(),destroytime,intro,describe,0,1,pic[0],pic[1],pic[2]);
		GoodsServiceImpl goodsserviceimpl=new GoodsServiceImpl();
		int rows=goodsserviceimpl.addgoods(good);
		if(rows>0){
			response.sendRedirect("SelectGoodsServlet?xuan=1");
		}else{
			response.sendRedirect("admin/err.jsp");
		}
	}

}

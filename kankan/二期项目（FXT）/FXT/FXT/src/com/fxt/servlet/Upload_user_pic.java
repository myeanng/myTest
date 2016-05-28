package com.fxt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

import com.fxt.entity.Users;
import com.fxt.service.UsersService;
import com.fxt.service.impl.UsersServiceImpl;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

/**
 * Servlet implementation class Upload_user_pic
 */
public class Upload_user_pic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()上传用户头像
     */
    public Upload_user_pic() {
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
		Files file=smart.getFiles();
		String pic1=file.getFile(0).getFileName();
		try {
			smart.save("pic");
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session=request.getSession();
		Users u=(Users)session.getAttribute("users");
		UsersService us=new UsersServiceImpl();
		int row=us.AddHead(u.getUid(), pic1);//整加头像
		if(row>0){
			response.sendRedirect("UpShowUsers");//添加头像成功，显示头像(链接到查询用户信息)
		}
	}

}

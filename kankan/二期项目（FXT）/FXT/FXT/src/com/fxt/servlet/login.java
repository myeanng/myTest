package com.fxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fxt.entity.Users;
import com.fxt.service.UsersService;
import com.fxt.service.impl.UsersServiceImpl;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		//閸欐牕鍩岄幋鎴犲仯閸戝锟芥稉顓犳畱閸愬懎顔愰敍灞芥躬閻ц缍嶉悾宀勬桨鏉╂稖顢戦幍褑顢�
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String userpwd=request.getParameter("userpwd");
		if(username==null||"".equals(username)&&userpwd==null||"".equals(userpwd))
		{
			response.sendRedirect("login.jsp");	
		}else{
			UsersService ud=new UsersServiceImpl();
			Users users=ud.login(username,userpwd);
			if(users!=null){
				
				
			
			if(users!=null&&users.getStatus()==1&&users.getIsadmin()==0){//閸掋倛顕伴弰顖氭儊閺勵垳顓搁悶鍡楁喅,閺勵垰鎯佸锝呯埗閻ц缍�
				String[] val=request.getParameterValues("cbx");
				if(val!=null){
				//閺勵垰鎯侀柅澶嬪鐠佹壆娼冪�鍡欑垳 
						request.getSession().setAttribute("Users", users);	//閺咁噣锟介悽銊﹀煕閻ц缍�
						out.print(users.getUsername()+"success");
				}else{
				out.print("success");//濞屸剝婀侀弽鍥唶鐠侀缍囩�鍡欑垳
				}
				}else if(users!=null&&users.getStatus()==1&&users.getIsadmin()==1){
					String[] val=request.getParameterValues("cbx");
					if(val!=null){
					//閺勵垰鎯侀柅澶嬪鐠佹壆娼冪�鍡欑垳 
						request.getSession().setAttribute("Users", users);	
						response.sendRedirect("admin/main.jsp");//缁狅紕鎮婇崨妯兼闂勶拷
					}else{
						response.sendRedirect("admin/main.jsp");//濞屸剝婀侀弽鍥唶鐠侀缍囩�鍡欑垳
					}
				}
				else{
					request.getSession().setAttribute("mes", "你的账户已被禁用!");
					response.sendRedirect("login.jsp");
				}
			}else{
				request.getSession().setAttribute("pwderror", "你的账号或密码输入有误，请重试!");
				response.sendRedirect("login.jsp");
			}
		}
	}
	
	
	
	
	
	
}

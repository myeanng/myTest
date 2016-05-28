package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class updatepwd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'updatepwd.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("   <h3>修改密码</h3>\r\n");
      out.write("   <form action=\"adminaction_updatepwd.action\" method=\"post\">\r\n");
      out.write("   <label id=\"lableajax\"></label><br>\r\n");
      out.write("   用户名称:<input name=\"loginname\" id=\"loginname\"><br>\r\n");
      out.write("   当前密码:<input name=\"pwd\" type=\"password\" id=\"pwd\" onblur=\"ajax()\"><br/>\r\n");
      out.write("   新密码:<input name=\"loginpwd\" type=\"password\" id=\"loginpwd\"  onblur=\"checknewpwd1()\"><label id=\"lablepwd\"></label><br/>\r\n");
      out.write("   二次确认:<input name=\"loginpwd2\" type=\"password\" id=\"loginpwd2\" onblur=\"checknewpwd2()\"><label id=\"lablepwd2\"></label><br/>\r\n");
      out.write("   <input type=\"submit\" value=\"提交\">\r\n");
      out.write("   </form>\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("   var xhr;\r\n");
      out.write("   function ajax(){\r\n");
      out.write("   var loginname=document.getElementById(\"loginname\").value;\r\n");
      out.write("   var loginpwd=document.getElementById(\"pwd\").value;\r\n");
      out.write("   xhr=new XMLHttpRequest;\r\n");
      out.write("   xhr.onreadystatechange=callback;\r\n");
      out.write("   //xhr.open(\"GET\",\"adminaction_updatepwd.action\",true);\r\n");
      out.write("   //post\r\n");
      out.write("   xhr.open(\"POST\",\"adminaction_ajax.action\",true);\r\n");
      out.write("   xhr.setRequestHeader(\"Content-type\",\"application/x-www-form-urlencoded\");\r\n");
      out.write("   //post方式传参\r\n");
      out.write("   xhr.send(\"loginname=\"+loginname+\"&loginpwd=\"+loginpwd);\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   function callback(){\r\n");
      out.write("   \tif(xhr.readyState==4){\r\n");
      out.write("   \t\tif(xhr.status==200){\r\n");
      out.write("   \t\t\tvar str=xhr.responseText;\r\n");
      out.write("   \t\t\tif(str==\"false\"){\r\n");
      out.write("   \t\t\tvar lableajax =document.getElementById(\"lableajax\");\r\n");
      out.write("   \t\t\tlableajax.innerHTML=\"用户名或密码错误!\";\r\n");
      out.write("   \t\t\t\t//改变样式\r\n");
      out.write("   \t\t\t}else{\r\n");
      out.write("   \t\t\tvar lableajax =document.getElementById(\"lableajax\");\r\n");
      out.write("   \t\t\tlableajax.innerHTML=\"\";\r\n");
      out.write("   \t\t\t}\r\n");
      out.write("   \t\t}\r\n");
      out.write("   \t}\r\n");
      out.write("   }\r\n");
      out.write("   function checknewpwd2(){\r\n");
      out.write("   var loginpwd=document.getElementById(\"loginpwd\").value;\r\n");
      out.write("   var loginpwd2=document.getElementById(\"loginpwd2\").value;\r\n");
      out.write("   if(loginpwd!=loginpwd2){\r\n");
      out.write("   \t\tvar lablepwd =document.getElementById(\"lablepwd2\");\r\n");
      out.write("   \t\t\tlablepwd.innerHTML=\"密码不一致!\";\r\n");
      out.write("   }else{\r\n");
      out.write("   \t\tvar lablepwd =document.getElementById(\"lablepwd2\");\r\n");
      out.write("   \t\t\tlablepwd.innerHTML=\"\";\r\n");
      out.write("   }\r\n");
      out.write("   }\r\n");
      out.write("   function checknewpwd1(){\r\n");
      out.write("   var loginpwd=document.getElementById(\"loginpwd\").value;\r\n");
      out.write("   if(loginpwd==\"\"){\r\n");
      out.write("   \t\tvar lablepwd =document.getElementById(\"lablepwd\");\r\n");
      out.write("   \t\t\tlablepwd.innerHTML=\"新密码必须填写!\";\r\n");
      out.write("   }else{\r\n");
      out.write("   \t\tvar lablepwd =document.getElementById(\"lablepwd\");\r\n");
      out.write("   \t\t\tlablepwd.innerHTML=\"\";\r\n");
      out.write("   }\r\n");
      out.write("   }\r\n");
      out.write("   </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

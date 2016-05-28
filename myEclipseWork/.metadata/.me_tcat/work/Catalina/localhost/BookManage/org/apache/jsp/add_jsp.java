package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'add.jsp' starting page</title>\r\n");
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
      out.write("    \t<form action=\"adminaction_add.action\" method=\"post\" >\r\n");
      out.write("  \t\t用户名:<input name=\"loginname\" onblur=\"ajax()\"><label id=\"loginnamelable\"></label><br/>\r\n");
      out.write("  \t\t密码:<input type=\"password\" name=\"loginpwd\"><label id=\"loginpwdlable\"></label><br/>\r\n");
      out.write("  \t\t<input type=\"radio\" name=\"roleid\" value=\"0\" checked=\"checked\">操作员<input type=\"radio\" name=\"roleid\" value=\"1\">管理员\r\n");
      out.write("  \t\t<input type=\"submit\" value=\"添加\">\r\n");
      out.write("  \t\t</form>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("   var xhr;\r\n");
      out.write("   function ajax(){\r\n");
      out.write("   var loginname=document.getElementById(\"loginname\").value;\r\n");
      out.write("   xhr=new XMLHttpRequest;\r\n");
      out.write("   xhr.onreadystatechange=callback;\r\n");
      out.write("   //xhr.open(\"GET\",\"adminaction_updatepwd.action\",true);\r\n");
      out.write("   //post\r\n");
      out.write("   xhr.open(\"POST\",\"adminaction_ajaxName.action\",true);\r\n");
      out.write("   xhr.setRequestHeader(\"Content-type\",\"application/x-www-form-urlencoded\");\r\n");
      out.write("   //post方式传参\r\n");
      out.write("   xhr.send(\"loginname=\"+loginname);\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   function callback(){\r\n");
      out.write("   \tif(xhr.readyState==4){\r\n");
      out.write("   \t\tif(xhr.status==200){\r\n");
      out.write("   \t\t\tvar str=xhr.responseText;\r\n");
      out.write("   \t\t\tif(str==\"true\"){\r\n");
      out.write("   \t\t\tvar lableajax =document.getElementById(\"loginnamelable\");\r\n");
      out.write("   \t\t\tlableajax.innerHTML=\"用户名已存在!\";\r\n");
      out.write("   \t\t\t\t//改变样式\r\n");
      out.write("   \t\t\t}else{\r\n");
      out.write("   \t\t\tvar lableajax =document.getElementById(\"loginnamelable\");\r\n");
      out.write("   \t\t\tlableajax.innerHTML=\"\";\r\n");
      out.write("   \t\t\t}\r\n");
      out.write("   \t\t}\r\n");
      out.write("   \t}\r\n");
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

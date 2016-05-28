package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'myTest.jsp' starting page</title>\r\n");
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
      out.write("  <body onload=\"show()\">\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <div align=\"center\" style=\"vertical-align: middle\"><font color=\"red\" size=\"20\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font><br/>\r\n");
      out.write("   3秒钟后跳转页面...\r\n");
      out.write("   <br>\r\n");
      out.write("   返回<a href=\"myAccount-baccount\">我的账户</a>首页\r\n");
      out.write("   <form action=\"msg\" method=\"post\">\r\n");
      out.write("   <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"msg\" name=\"msg\">\r\n");
      out.write("   </form>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("\tfunction show() {\r\n");
      out.write("\t    \r\n");
      out.write("\t    setTimeout(\"href()\",3000);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction href() {\r\n");
      out.write("\tvar msg=\"\";\r\n");
      out.write("\tmsg=document.getElementById(\"msg\").value;\r\n");
      out.write("\talert(msg);\r\n");
      out.write("\tvar href=\"\";\r\n");
      out.write("\tif (msg == \"支付密码错误\") href = \"withdrawCash.jsp\";\r\n");
      out.write("\telse if (msg == \"账户余额不足\") href = \"recharge.jsp\";\r\n");
      out.write("\telse href = \"myAccount-baccount\"; \r\n");
      out.write("\t\r\n");
      out.write("\t    window.location=href;\r\n");
      out.write("\t    \r\n");
      out.write("\t}\r\n");
      out.write("\t   \r\n");
      out.write("   \r\n");
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

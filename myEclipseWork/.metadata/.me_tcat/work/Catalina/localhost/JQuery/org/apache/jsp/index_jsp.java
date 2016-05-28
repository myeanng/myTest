package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\" src=\"JS/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("  .hover{\r\n");
      out.write("  background-color: blue;\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <form action=\"\">\r\n");
      out.write("    \t<input type=\"button\" value=\"测试1\"><br>\r\n");
      out.write("    \t<input type=\"button\" value=\"测试2\"><br>\r\n");
      out.write("    \t<div id=\"cs\">Go to the store</div>\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    </form>\r\n");
      out.write("    <ul>\r\n");
      out.write("\t\t  <li>Go to the store</li>\r\n");
      out.write("\t\t  <li>Pick up dinner</li>\r\n");
      out.write("\t\t  <li>Debug crash</li>\r\n");
      out.write("\t\t  <li>Take a jog</li>\r\n");
      out.write("\t</ul> \r\n");
      out.write("     <br>\r\n");
      out.write("     <script type=\"text/javascript\">\r\n");
      out.write("     $(document).ready(function(){\r\n");
      out.write("\t\t  alert(\"欢迎...\");\r\n");
      out.write("\t\t}); \r\n");
      out.write("     \t$(\":button :eq(0)\").one({\r\n");
      out.write("\t\t    click: function() {\r\n");
      out.write("\t\t      // do something on click\r\n");
      out.write("\t\t      alert(\"abc\");\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\":button\").hover(\r\n");
      out.write("\t\t  function () {\r\n");
      out.write("\t\t    $(this).addClass(\"hover\");\r\n");
      out.write("\t\t  },\r\n");
      out.write("\t\t  function () {\r\n");
      out.write("\t\t    $(this).removeClass(\"hover\");\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t); \r\n");
      out.write("\t\t$(\"#cs\").toggle(\r\n");
      out.write("\t      function () {\r\n");
      out.write("\t        $(this).css({ \"background-color\":\"blue\"});\r\n");
      out.write("\t      },\r\n");
      out.write("\t      function () {\r\n");
      out.write("\t        $(this).css({\"background-color\":\"red\"});\r\n");
      out.write("\t      },\r\n");
      out.write("\t      function () {\r\n");
      out.write("\t        $(this).css({\"background-color\":\"\"});\r\n");
      out.write("\t      }\r\n");
      out.write("\t    );\r\n");
      out.write("\t\t\r\n");
      out.write("     </script>\r\n");
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

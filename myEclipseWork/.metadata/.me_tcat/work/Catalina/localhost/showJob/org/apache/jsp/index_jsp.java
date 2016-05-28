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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"jquery-1.9.1.min.js\"></script></head>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  \t$(function(){\r\n");
      out.write("  \t\r\n");
      out.write("  \t\tvar data;\r\n");
      out.write("  \t\t/*[{\"superType\":\"软件工程师\",\"subTypes\":[{\"subType\":\"Java工程师\"},{\"subType\":\"UI/UE界面工程师\"}]}\r\n");
      out.write("  \t\t,\r\n");
      out.write("  \t\t{\"superType\":\"通信工程师\",\"subTypes\":[{\"subType\":\"FPGA工程师\"},{\"subType\":\"芯片ASIC设计师\"}]}\r\n");
      out.write("  \t\t];*/\r\n");
      out.write("  \t\t$.ajax({\r\n");
      out.write("  \t\t\turl:\"getData\",\r\n");
      out.write("  \t\t\ttype:\"post\",\r\n");
      out.write("  \t\t\tdataType:\"json\",\r\n");
      out.write("  \t\t\tasync:false,\r\n");
      out.write("  \t\t\tsuccess:function(da){\r\n");
      out.write("  \t\t\t\tdata=da;\r\n");
      out.write("  \t\t\t}\r\n");
      out.write("  \t\t});\r\n");
      out.write("  \t\t\r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("  \t\t$(\"#job\").bind(\"mouseover\",function(){\r\n");
      out.write("  \t\tvar str =\"\";\r\n");
      out.write("  \t\t\t$.each(data,function(index,item){\r\n");
      out.write("  \t\t\t\tstr+=\"<option value='\"+item.superType+\"'>\"+item.superType+\"</option>\"\r\n");
      out.write("  \t\t\t})\r\n");
      out.write("  \t\t\t$(\"#superType\").html(str);\r\n");
      out.write("  \t\t\t$(\"#superType\").css(\"display\",\"block\")\r\n");
      out.write("  \t\t});\r\n");
      out.write("  \t\t$(\"#superType\").bind(\"change\",function(){\r\n");
      out.write("  \t\t\tvar superTypeVal = $(\"#superType\").val();\r\n");
      out.write("  \t\t\t$.each(data,function(index,item){\r\n");
      out.write("  \t\t\t\tif(superTypeVal==item.superType){\r\n");
      out.write("  \t\t\t\t\tvar str=\"\";\r\n");
      out.write("  \t\t\t\t\t$.each(item.subTypes,function(i,sub){\r\n");
      out.write("  \t\t\t\t\t\tstr+=\"<option value='\"+sub.subType+\"'>\"+sub.subType+\"</option>\"\r\n");
      out.write("  \t\t\t\t\t})\r\n");
      out.write("  \t\t\t\t\t$(\"#subType\").html(str);\r\n");
      out.write("  \t\t\t\t\t$(\"#subType\").css(\"display\",\"block\")\r\n");
      out.write("  \t\t\t\t\treturn ;\r\n");
      out.write("  \t\t\t\t}\r\n");
      out.write("  \t\t\t})\r\n");
      out.write("  \t\t})\r\n");
      out.write("  \t\t\r\n");
      out.write("  \t\t$(\"#subType\").bind(\"change\",function(){\r\n");
      out.write("  \t\t\t$(\"#superType\").css(\"display\",\"none\")\r\n");
      out.write("  \t\t\t$(\"#subType\").css(\"display\",\"none\")\r\n");
      out.write("  \t\t})\r\n");
      out.write("  \t});\r\n");
      out.write("  \t\r\n");
      out.write("  </script>\r\n");
      out.write("  <body>\r\n");
      out.write("  \t<form action=\"ShowjobServlet\" method=\"post\">\r\n");
      out.write("  \t\t<input type=\"button\" value=\"选择职位\" id=\"job\"/>\r\n");
      out.write("  \t\t<select id=\"superType\" name=\"superType\" style=\"display: none\">\r\n");
      out.write("  \t\t</select>\r\n");
      out.write("  \t\t<select id=\"subType\" name=\"subType\" style=\"display: none\">\r\n");
      out.write("  \t\t</select>\r\n");
      out.write("  \t\t<input type=\"submit\" value=\"提交\">\r\n");
      out.write("  \t</form>\r\n");
      out.write("  \r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<head>\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"js/themes/icon.css\" type=\"text/css\"></link>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"js/themes/default/easyui.css\"\r\n");
      out.write("\t\t\ttype=\"text/css\"></link>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"jquery-1.9.1.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("$(function() {\r\n");
      out.write("\t$(\"#xx\").bind(\"click\",function(){\r\n");
      out.write("\t\tvar jd=$(\"#xx\").tree('getSelected');\r\n");
      out.write("\t\tvar aa=jd.attributes.id\r\n");
      out.write("\t\talert(aa);\r\n");
      out.write("\t});\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("\t<body class=\"easyui-layout\">\r\n");
      out.write("\t\t<div data-options=\"region:'north',title:'',split:false\"\r\n");
      out.write("\t\t\tstyle=\"height: 30px;\">XXX管理系统后台</div>\r\n");
      out.write("\t\t<div data-options=\"region:'south',title:'',split:false\"\r\n");
      out.write("\t\t\tstyle=\"height: 25px;text-align: center;line-height: 25px\">版权信息:GS346\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div data-options=\"region:'west',title:'系统菜单',split:true\"\r\n");
      out.write("\t\t\tstyle=\"width: 100px;\"></div>\r\n");
      out.write("\t\t<div data-options=\"region:'center',title:'center title'\"\r\n");
      out.write("\t\t\tstyle=\"padding: 0px; background: #eee;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"easyui-layout\" data-options=\"fit:true\">\r\n");
      out.write("\t\t\t\t<div data-options=\"region:'west',title:'员工信息'\" style=\"width:150px\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"easyui-tree\" data-options=\"url:'servlet/treeServlet'\" id=\"xx\"></ul>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t<div data-options=\"region:'center',title:'详情'\" id=\"xq\" >\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

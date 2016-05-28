package org.apache.jsp.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Thread Start -->\r\n");
      out.write("\t<div class=\"t\" style=\"margin-bottom:0px; border-bottom:0\">\r\n");
      out.write("\t\t<table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"h\">\r\n");
      out.write("\t\t\t\t\t<strong class=\"fl w\"><b>添加类别</b></strong>\r\n");
      out.write("\t\t\t\t</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"categoryAction_add.action\" method=\"post\">\r\n");
      out.write("\t\t<div class=\"t t2\">\r\n");
      out.write("\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\"\r\n");
      out.write("\t\t\t\tstyle=\"table-layout:fixed;border-top:0\">\r\n");
      out.write("\t\t\t\t<tr class=\"tr1 r_one\">\r\n");
      out.write("\t\t\t\t\t<th style=\"width:20%\" class=\"r_two\"  style=\"text-align: right\">\r\n");
      out.write("\t\t\t\t\t\t名称\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"vertical-align:bottom;padding-left:15px;border:0\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"name\"/>\r\n");
      out.write("\t\t\t\t\t\t<br/><br/>\r\n");
      out.write("\t\t\t\t\t\t<input  type=\"submit\" value=\"提交\" class=\"btn\"/>\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, true);
      out.write('\r');
      out.write('\n');
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("<div id=\"bottom\"></div><br />\r\n");
      out.write("<center class=\"gray\">\r\n");
      out.write("<small><span id=\"windspend\">Total 0.002773(s) query 3, Time now is:07-04 16:19, Gzip enabled</span> <a href=\"http://www.miibeian.gov.cn\" target=\"_blank\">浙ICP备06001596号</a><br />\r\n");
      out.write("Powered by <a href=\"http://www.phpwind.net/\" target=\"_blank\"><b>PHPWind</b></a> <a href=\"http://www.phpwind.net/\" target=\"_blank\"><b style=\"color:#FF9900\">v6.3</b></a> <a href=\"http://www.phpwind.com/certificate.php?host=www.phpwind.net\"><b>Certificate</b></a> Code &copy; 2003-07 <a href=\"http://www.phpwind.com/\" target=\"_blank\"><b>PHPWind.com</b></a> Corporation</small>\r\n");
      out.write("</center><br />\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<span class=\"f12 fl\"><a href=\"http://www.phpwind.com\" title=\"\" target=\"_blank\">官方站</a> | <a href=\"http://www.uu1001.com\" title=\"\" target=\"_blank\">申请免费论坛空间</a></span><a href=\"http://www.phpwind.com/info.php?type=contact\">Contact us</a> | <a href=\"wap/index.php\">Wap</a> | <a href=\"javascript:scroll(0,0)\">Top</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
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

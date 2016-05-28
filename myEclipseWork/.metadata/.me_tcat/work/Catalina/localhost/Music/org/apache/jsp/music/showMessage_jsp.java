package org.apache.jsp.music;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class showMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("   <body>\r\n");
      out.write("   \t\t<h3>查看短消息</h3>\r\n");
      out.write("   \t\t<br/>\r\n");
      out.write("   \t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br/>\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t<br/>\r\n");
      out.write("   \t\t他给你留言:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.msgvalue }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t<br/>\r\n");
      out.write("   \t\t<br/>\r\n");
      out.write("   \t\t您可以点击下面的播放器进行试听!<br/>\r\n");
      out.write("   \t\t<object type=\"application/x-shockwave-flash\"\r\n");
      out.write("\t    data=\"player/audioplayer.swf\" width=\"290\" height=\"24\"\r\n");
      out.write("\t    id=\"audioplayer7643\">\r\n");
      out.write("\t\t<param name=\"movie\" value=\"player/audioplayer.swf\" />\r\n");
      out.write("\t\t<param name=\"FlashVars\"\r\n");
      out.write("\t\tvalue=\"playerID=7643&soundFile=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.music.url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t<param name=\"quality\" value=\"high\" />\r\n");
      out.write("\t\t<param name=\"menu\" value=\"false\" />\r\n");
      out.write("\t\t<param name=\"wmode\" value=\"transparent\" />\r\n");
      out.write("\t\t</object>\r\n");
      out.write("   </body>\r\n");
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

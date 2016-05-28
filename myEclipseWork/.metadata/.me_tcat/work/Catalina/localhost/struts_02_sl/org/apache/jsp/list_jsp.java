package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.sl2.entity.*;
import java.util.List.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <body>\r\n");
      out.write("   <table>\r\n");
      out.write("   <caption>图书列表</caption>\r\n");
      out.write("   <tr>\r\n");
      out.write("   <td>ISBN</td>\r\n");
      out.write("   <td>图书名称</td>\r\n");
      out.write("   <td>图书作者</td>\r\n");
      out.write("   <td>出版社</td>\r\n");
      out.write("   <td>售价</td>\r\n");
      out.write("   <td>库存</td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   ");

   List<Book> booklist=(List<Book>)request.getAttribute("booklist");
   for(int i=0;i<booklist.size();i++){
   
      out.write("\r\n");
      out.write("   <tr>\r\n");
      out.write("   <td>\r\n");
      out.write("   ");
      out.print(booklist.get(i).getISBN() );
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("   <td>\r\n");
      out.write("   ");
      out.print(booklist.get(i).getName() );
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("   <td>\r\n");
      out.write("   ");
      out.print(booklist.get(i).getAuthor() );
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("   <td>\r\n");
      out.write("   ");
      out.print(booklist.get(i).getPublish() );
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("   <td>\r\n");
      out.write("   ");
      out.print(booklist.get(i).getPrice() );
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("   <td>\r\n");
      out.write("   ");
      out.print(booklist.get(i).getCurrcount() );
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   ");

   }
     
      out.write("\r\n");
      out.write("   </table>\r\n");
      out.write("  </body>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  </script>\r\n");
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

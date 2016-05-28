package org.apache.jsp.music;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class sendmusic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<!--权限验证 -->\r\n");
      out.write("<HTML>\r\n");
      out.write("\t<HEAD>\r\n");
      out.write("\t\t<META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("\t\t<META content=\"MSHTML 6.00.2900.3157\" name=GENERATOR>\r\n");
      out.write("\t</HEAD>\r\n");
      out.write("\t<BODY>\r\n");
      out.write("\t\t<DIV style=\"TEXT-ALIGN: center\">\r\n");
      out.write("\t\t<!-- id为音乐编号 -->\r\n");
      out.write("\t\t\t<form action=\"music-addMessage.action?message.music.id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t<TABLE style=\"MARGIN: 0px auto\" cellSpacing=3 cellPadding=3 border=0>\r\n");
      out.write("\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"center\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t点播歌曲\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD width=\"85\">\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t<TD width=\"332\">\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<LABEL>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t用户名：\r\n");
      out.write("\t\t\t\t\t\t\t\t</LABEL>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<INPUT type=\"text\" name=\"message.toUsre.name\" maxlength=\"16\" id=\"toUserName\" onblur=\"ajax()\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label id=\"toUserNameLabel\" style=\"color: green;font-size: 15px;\" ></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"message.noname\" value=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t匿名点歌\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<LABEL>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t留言：\r\n");
      out.write("\t\t\t\t\t\t\t\t</LABEL>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<textarea name=\"message.msgvalue\" id=\"textarea\" cols=\"45\" rows=\"5\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR align=right>\r\n");
      out.write("\t\t\t\t\t\t\t<TD colSpan=2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<INPUT id=Login type=submit value=\"确 定\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<INPUT type=\"reset\" onclick=tb_remove() value=\"取 消\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</DIV>\r\n");
      out.write("\t</BODY>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("   var xhr;\r\n");
      out.write("   function ajax(){\r\n");
      out.write("   var toUserName=document.getElementById(\"toUserName\").value;\r\n");
      out.write("   xhr=new XMLHttpRequest;\r\n");
      out.write("   xhr.onreadystatechange=callback;\r\n");
      out.write("   //xhr.open(\"GET\",\"adminaction_updatepwd.action\",true);\r\n");
      out.write("   //post\r\n");
      out.write("   xhr.open(\"POST\",\"music-ajaxToName.action\",true);\r\n");
      out.write("   xhr.setRequestHeader(\"Content-type\",\"application/x-www-form-urlencoded\");\r\n");
      out.write("   //post方式传参\r\n");
      out.write("   xhr.send(\"message.toUsre.name=\"+toUserName);\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   function callback(){\r\n");
      out.write("   \tif(xhr.readyState==4){\r\n");
      out.write("   \t\tif(xhr.status==200){\r\n");
      out.write("   \t\t\tvar str=xhr.responseText;\r\n");
      out.write("   \t\t\tif(str==\"true\"){\r\n");
      out.write("   \t\t\tvar lableajax =document.getElementById(\"toUserNameLabel\");\r\n");
      out.write("   \t\t\tlableajax.innerHTML=\"<label id='toUserNameLabel' style='color: green;font-size: 15px;' >用户名存在!</label>\";\r\n");
      out.write("   \t\t\t\t//改变样式\r\n");
      out.write("   \t\t\t}else{\r\n");
      out.write("   \t\t\tvar lableajax =document.getElementById(\"toUserNameLabel\");\r\n");
      out.write("   \t\t\tlableajax.innerHTML=\"<label id='toUserNameLabel' style='color: red;font-size: 15px;' >用户名不存在!</label>\";\r\n");
      out.write("   \t\t\t}\r\n");
      out.write("   \t\t}\r\n");
      out.write("   \t}\r\n");
      out.write("   }\r\n");
      out.write("   </script>\r\n");
      out.write("</HTML>\r\n");
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

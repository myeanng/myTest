package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");

	Enumeration enumeration = request.getAttributeNames();
	
	while(enumeration.hasMoreElements()){
		String name = (String) enumeration.nextElement();
		Object obj = request.getAttribute(name);
		System.out.println("request[\"" + name + "\"]: " + obj);
	}
	

      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
      out.write("\t\t<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope[requestScope['org.apache.struts.action.mapping.instance'].attribute].title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("body{font-family:Tahoma;font-size:12px;background:#e1d5aa url(images/yellow/bg1.jpg) top center repeat-y; margin:auto;}\r\n");
      out.write("h1,h2,h3,h4,h5,h6,form,body{padding:0;margin:0}\r\n");
      out.write("td,th,div{word-break:break-all;word-wrap:break-word}\r\n");
      out.write("table{empty-cells:show;}\r\n");
      out.write("img{border:0}\r\n");
      out.write("h1{font-size:16px;margin:.5em 1em 1em 0}\r\n");
      out.write("h3,h2{display:inline;font-size:1.0em;}\r\n");
      out.write("h3{font-weight:normal}\r\n");
      out.write("h2 a,h3 a{color:#000}\r\n");
      out.write("h4{margin:20px 0 10px;font-size:1.1em}\r\n");
      out.write("textarea,input,select{font:12px Arial;padding:1px 3px 0 3px;vertical-align:middle;margin-bottom:1px}\r\n");
      out.write(".c{clear:both;height:0;font:0/0 Arial;}\r\n");
      out.write(".b{font-weight:bold}\r\n");
      out.write(".tal{text-align:left}\r\n");
      out.write(".tac{text-align:center}\r\n");
      out.write(".tar{text-align:right}\r\n");
      out.write(".fr{float:right}\r\n");
      out.write(".fl{float:left}\r\n");
      out.write("/*a link 基本连接颜色*/\r\n");
      out.write("a{text-decoration:none;color:#96465d}\r\n");
      out.write("a:hover{text-decoration:underline;}\r\n");
      out.write(".abtn{cursor:pointer;border:1px solid #c7b985;color:#96465d;padding:2px 8px;margin-left:2px;height:30px}\r\n");
      out.write("/*字体大小*/\r\n");
      out.write(".f9{font-size:11px;}\r\n");
      out.write(".f10{font-size:11px;}\r\n");
      out.write(".f12{font-size:12px}\r\n");
      out.write(".f14{font-size:14px}\r\n");
      out.write(".fn,.fn a{font-weight:normal}\r\n");
      out.write("/*span color 数值自定义*/\r\n");
      out.write(".s1{color:#008000;}\r\n");
      out.write(".s2{color:#984B98;}\r\n");
      out.write(".s3{color:#FA891B;}\r\n");
      out.write(".s4{color:#0033FF;}\r\n");
      out.write(".s5{color:#659B28}\r\n");
      out.write(".gray{color:#818a89} /*次要文字颜色-可定义*/\r\n");
      out.write("/*main color 数值自定义*/\r\n");
      out.write(".f_one,.t_one,.r_one{background:#ffffff;}\r\n");
      out.write(".f_two,.t_two,.r_two{background:#fbf8e9;}\r\n");
      out.write("/*form*/\r\n");
      out.write("textarea,input,select{font:12px Arial;padding:1px 3px 0 3px;vertical-align:middle;margin-bottom:1px}\r\n");
      out.write("select{border:solid 1px #e1d5aa;}\r\n");
      out.write(".btn{background:#c7b985 url(images/yellow/bg.png) 0 -200px repeat-x;color:#000000;border-width:1px;padding-left:15px;padding-right:15px;vertical-align:middle}\r\n");
      out.write(".input{border:solid 1px #c7b985;padding:2px 0px 2px 1px;font-size:1.0em;vertical-align:middle}\r\n");
      out.write("form{display:inline;}\r\n");
      out.write("textarea{border:solid 1px #c7b985;}\r\n");
      out.write("/*header*/\r\n");
      out.write("#header{width:940px;margin:auto; background:url(images/yellow/headerbg.png) 0 0 repeat-x;}\r\n");
      out.write("/*toolbar*/\r\n");
      out.write(".toptool{background:url(images/yellow/bg.png) 0 0 repeat-x;color:#ffffff; padding-top:5px;}\r\n");
      out.write(".toptool span{padding:1px 5px;line-height:150%;}\r\n");
      out.write(".toptool span a{color:#ffffff;}\r\n");
      out.write("/*index info*/\r\n");
      out.write("#infobox{ border:#c7b985 1px solid; margin-top:-.8em;background:#c7b985 url(images/yellow/bg.png) 0 bottom repeat-x; }\r\n");
      out.write("#notice{ margin:0 -.3em; height:20px}\r\n");
      out.write("#notice a{ color:#fff; padding-left:1em; background:url(images/yellow/dotB.png) no-repeat 0 .1em; margin-left:1.5em}\r\n");
      out.write("/*banner*/\r\n");
      out.write(".banner img{vertical-align:middle;}\r\n");
      out.write("/*guide*/\r\n");
      out.write(".guide{background:#F3F8EF url(images/yellow/bg.png) 0 -100px repeat-x; padding:.5em;color:#ccc}\r\n");
      out.write(".guide a{color:#ccc;}\r\n");
      out.write("/*table*/\r\n");
      out.write(".t{border:1px solid #c7b985;margin:0px auto 8px;}\r\n");
      out.write(".t table{border:1px solid #fff;margin:0 auto;width:99.98%;}\r\n");
      out.write(".t2{border-top:#c7b985 1px solid;margin:0px auto 5px;}\r\n");
      out.write(".t3{margin:auto}\r\n");
      out.write(".t4{padding:1px 0 1px 1px}\r\n");
      out.write("/*table head*/\r\n");
      out.write(".h{border-bottom:1px solid #f9c100;background:#E0F0F9 url(images/yellow/bg.png) 0 -200px repeat-x;text-align:left;color:#000000;padding:.3em .4em}\r\n");
      out.write(".h span{font-weight:normal;}\r\n");
      out.write(".h h2{font-weight:bold}\r\n");
      out.write(".h a{font-family:Arial;color:#000000}\r\n");
      out.write(".h span a,.h span{color:#5495A0;}\r\n");
      out.write(".h a.a2{margin-left:12px;}\r\n");
      out.write("/*table tr1*/\r\n");
      out.write(".tr1 th{padding:5px 10px;text-align:left;vertical-align:top;font-weight:normal;}\r\n");
      out.write(".tr1 td.td1{border:1px solid #e1d5aa;}\r\n");
      out.write("/*table tr2*/\r\n");
      out.write(".tr2{background:#F3F8EF url(images/yellow/bg.png) 0 -300px repeat-x;color:#dc565e;}\r\n");
      out.write(".tr2 td,.tr2 th{line-height:18px;border-bottom:1px solid #c7b985;padding:2px 6px 0px;/*border-top:1px solid #c7b985;*/}\r\n");
      out.write(".tr2 a{color:#dc565e;margin:2px 2px 0}\r\n");
      out.write("/*table tr3*/\r\n");
      out.write(".tr3 td,.tr3 th{border-bottom:1px solid #e1d5aa;padding:.3em .6em}\r\n");
      out.write(".tr3 th{text-align:left;font-weight:normal;}\r\n");
      out.write(".tr4{background:#E0F0F9 url(images/yellow/bg.png) 0 -200px repeat-x;color:#000000;}\r\n");
      out.write(".tr4 td{padding:4px 10px;}\r\n");
      out.write(".tr td,.tr th{padding:2px}\r\n");
      out.write("/*topic content tips*/\r\n");
      out.write(".tpc_content{font-size:14px;font-family:Arial;padding:0 2% 0 0.5%;margin:0 0 2%}\r\n");
      out.write(".tips{background:#fbf8e9;border:#e1d5aa 1px solid;padding:5px;margin:0 1% 1% 0;float:left;text-align:center;}\r\n");
      out.write(".tiptop{border-bottom:1px solid #e1d5aa;padding:0 0 5px 0;vertical-align:middle;}\r\n");
      out.write(".tipad{border-top:1px solid #e1d5aa;margin:10px 0 0;padding:5px 0 0;}\r\n");
      out.write(".quote{width:80%;font-size:70%;color:#000000;margin:8px 2px 2px;padding:0}\r\n");
      out.write("blockquote{width:80%;font-size:85%;color:#81888c;border:1px solid #e1d5aa;border-left-width:3px;padding:5px;margin:0 0 1%}\r\n");
      out.write("/*menu*/\r\n");
      out.write(".menu{position:absolute;background:#fff;border:1px solid #c7b985;}\r\n");
      out.write(".menu td, .menu li,.menu ul{background:#fff;padding:0; margin:0}\r\n");
      out.write(".menu li{list-style:none;}\r\n");
      out.write(".menu a{display:block;padding:3px 15px 3px 15px;background:#fff;}\r\n");
      out.write(".menu a:hover{background:#96465d;text-decoration:none;color:#fff;}\r\n");
      out.write(".menu ul.ul1 li a{display:inline;padding:0}\r\n");
      out.write("/*pages*/\r\n");
      out.write(".pages{margin:3px 0;font:11px/12px Tahoma}\r\n");
      out.write(".pages *{vertical-align:middle;}\r\n");
      out.write(".pages a{padding:1px 4px 1px;border:1px solid #c7b985;margin:0 1px 0 0;text-align:center;text-decoration:none;font:normal 12px/14px verdana;}\r\n");
      out.write(".pages a:hover{border:#dc565e 1px solid;background:#F3F8EF;text-decoration:none;color:#000000}\r\n");
      out.write(".pages input{margin-bottom:0px;border:1px solid #dc565e;height:15px;font:bold 12px/15px Verdana;padding-bottom:1px;padding-left:1px;margin-right:1px;color:#dc565e;}\r\n");
      out.write("/*footer*/\r\n");
      out.write("#footer{width:940px;text-align:right;border-top:2px solid #f9c100;margin:auto;padding:5px 0; background:#ffffff}\r\n");
      out.write("#main{width:940px;margin: auto; padding:.8em 0 0; background:#ffffff}\r\n");
      out.write(".button {font-size: 12px; }\r\n");
      out.write(" /*自定义css*/\r\n");
      out.write("</style>\r\n");
      out.write("\t\t<!--css-->\r\n");
      out.write("\r\n");
      out.write("\t\t<style type=\"text/css\">/*竖线风格输出*/\r\n");
      out.write(".tr3 td,.tr3 th{border-right:1px solid #e1d5aa;}\r\n");
      out.write(".y-style{text-align:center;}\r\n");
      out.write(".t table{border:0;width:100%;}\r\n");
      out.write(".tr1 th{border-right:1px solid #e1d5aa;}\r\n");
      out.write(".tr1 td.td1{border-left:0}\r\n");
      out.write(".t{padding:1px}\r\n");
      out.write("</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"wrapA\">\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t<div class=\"toptool tar\">\r\n");
      out.write("\t\t\t\t\t<span><a href=\"form/login.jsp\">Home首页</a> | \r\n");
      out.write("\t\t\t\t\t\t  <a href=\"#\">论坛首页</a> \r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" align=\"center\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"./\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/form/images/yellow/logo.png\" /> </a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"banner\" id=\"banner\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/form/images/yellow/banner.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" height=\"1\" colspan=\"2\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<div id=\"h_guide\" class=\"guide\" >\r\n");
      out.write("\t\t\t\t\t<span class=\"s3\">&raquo;</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t\t<div style=\"margin-top:7px;\"></div>\r\n");
      out.write("\t\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3 align=\"center\">\r\n");
      out.write("\t\t\t\t<a href=\"addCategory.jsp\">添加分类</a>\r\n");
      out.write("\t\t\t\t<a href=\"boardAction_find.action\">添加板块</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</body>\r\n");
      out.write("\t\t</html>");
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

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /header.jsp(170,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${person == null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t您尚未&nbsp;\r\n");
        out.write("\t\t\t\t\t\t\t<a href=\"form/login.jsp\" >登录</a> |\r\n");
        out.write("\t\t\t\t\t\t\t<a href=\"form/addPerson.jsp\" >注册</a>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t欢迎您, <a href=\"Person_view.action?account=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${person.account}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${person.account }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a> |\r\n");
        out.write("\t\t\t\t\t\t\t        <a href=\"Person_exit.action\">注销</a>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}

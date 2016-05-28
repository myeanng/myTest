package org.apache.jsp.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
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
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"contentwrap z\">\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /form/listCategory.jsp(8,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("category");
    // /form/listCategory.jsp(8,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/form/listCategory.jsp(8,1) '${categoryList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${categoryList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<div class=\"t\">\r\n");
          out.write("\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<th class=\"h\" colspan=\"6\">\r\n");
          out.write("\t\t\t\t\t\t<a class=\"closeicon fr\" style=\"cursor:pointer;\"\r\n");
          out.write("\t\t\t\t\t\t\tonclick=\"return IndexDeploy('85',0)\">\r\n");
          out.write("\t\t\t\t\t\t\t<img id=\"img_85\" src=\"form/images/yellow/index/cate_fold.gif\" /></a>\r\n");
          out.write("\t\t\t\t\t\t<h2>\r\n");
          out.write("\t\t\t\t\t\t\t&raquo;\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"Category_enter.action?category.id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\tclass=\"cfont\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ category.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t\t</h2>\r\n");
          out.write("\t\t\t\t\t</th>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t<tr></tr>\r\n");
          out.write("\t\t\t\t<tr class=\"tr2\">\r\n");
          out.write("\t\t\t\t\t<td width=\"*\" colspan=\"2\" class=\"tac\">\r\n");
          out.write("\t\t\t\t\t\t论坛\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"tal y-style e\" style=\"width:5%\">\r\n");
          out.write("\t\t\t\t\t\t主题\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"tal y-style e\" style=\"width:5%\">\r\n");
          out.write("\t\t\t\t\t\t文章\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"tal y-style f\" style=\"width:40%\">\r\n");
          out.write("\t\t\t\t\t\t最后发表\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"y-style\" style=\"width:10%\">\r\n");
          out.write("\t\t\t\t\t\t版主\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t<tbody id=\"cate_85\" style=\"display:;\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td class=\"f_one\" colspan=\"6\" style=\"height:8px\"></td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t</tbody>\r\n");
          out.write("\t\t\t</table>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /form/listCategory.jsp(41,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("board");
    // /form/listCategory.jsp(41,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/form/listCategory.jsp(41,5) '${category.boards }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${category.boards }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<tr class=\"tr3 f_one\">\r\n");
          out.write("\t\t\t\t\t\t\t<td class=\"icon tac\" width=\"45\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"form/images/yellow/new.gif\" /> </a><!-- 新闻 -->\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t<th>\r\n");
          out.write("\t\t\t\t\t\t\t\t<h3 class=\"b\">\r\n");
          out.write("<!--\t\t\t\t\t\t\t\t\t板块名称-->\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a> \r\n");
          out.write("\t\t\t\t\t\t\t\t</h3>\r\n");
          out.write("\t\t\t\t\t\t\t\t<br />\r\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"smalltxt gray\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ board.description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t\t\t</th>\r\n");
          out.write("\t\t\t\t\t\t\t<td class=\"tal y-style e\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"f10\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ board.threadCount }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t<br />\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td class=\"tal y-style e\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"f10\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ board.replyCount }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t<br />\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t<th>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t</th>\r\n");
          out.write("\t\t\t\t\t\t\t<td class=\"y-style\"\r\n");
          out.write("\t\t\t\t\t\t\t\tstyle=\"word-break: keep-all;word-wrap:no-wrap\">\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /form/listCategory.jsp(63,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.lastThread != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"a2\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.lastThread.title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<span class=\"f12\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.lastThread.author.account }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a> \r\n");
        out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<span class=\"f9 gray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ board.lastThread.dateCreated }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /form/listCategory.jsp(76,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("person");
    // /form/listCategory.jsp(76,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/form/listCategory.jsp(76,8) '${board.persons }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${board.persons }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${person.account }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class loginHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fforEach_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fforEach_005fvar_005fitems.release();
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
      out.write("   <title>我的登录历史</title>\r\n");
      out.write("<meta name=\"description\" content=\"拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资\" />\r\n");
      out.write("<link href=\"./ppd_loginHistory_files/basic.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"./ppd_loginHistory_files/layout.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("    <link href=\"./ppd_loginHistory_files/account.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!--头部-->\r\n");
      out.write("    <div class=\"PPD_header_nav\" style=\"margin-bottom: 0;\">\r\n");
      out.write("        <div class=\"PPD_login_status\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"mainNav\">\r\n");
      out.write("        <div class=\"mainNav_inner clearfix w1000center\">\r\n");
      out.write("            <h1 class=\"logo\">\r\n");
      out.write("                <a href=\"http://www.ppdai.com/\">\r\n");
      out.write("                    <img src=\"./ppd_loginHistory_files/logo.png\" alt=\"ppdai logo\" />\r\n");
      out.write("                </a>\r\n");
      out.write("            </h1>\r\n");
      out.write("            <ul id=\"tabIcon\">\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/lend\">我要投资</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/lend\">我要借出</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/product/list\">彩虹计划</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/debtdeal/AlldebtList/DebtList\">如何借出</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/principalprotection\">本金保障</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/borrow\">我要借款</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/borrow\">我要借入</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/howtoborrow.html\">如何借入</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/borrow/interestcalculate\">利息计算器</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/account\" class=\"tabon\">我的账户</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/account/borrow\">借款账户</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/account/lend\">投资账户</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/help/aboutus\">关于拍拍贷</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/aboutus\">关于我们</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/howworks\">工作原理</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/fees\">资费说明</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--头部结束-->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"my-frame\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <ul class=\"breadcrumb\" style=\"border: none !important;\">\r\n");
      out.write("                    <li><a href=\"/\">首页</a> <span class=\"divider\">></span></li>\r\n");
      out.write("                            <li><a href=\"http://www.ppdai.com/account/borrow\">我的账户-我是借入者</a> <span class=\"divider\">></span></li>\r\n");
      out.write("                        <li class=\"active\">登录历史</li>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"clearfix\">\r\n");
      out.write("        <!-- Left Nav -->\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"my-f-left fl\">\r\n");
      out.write("    <div class=\"my-f-l-nav\">我的账户</div>\r\n");
      out.write("    <ul class=\"my-f-l-list\">\r\n");
      out.write("            <li><a href=\"http://www.ppdai.com/account/lend\">我的账户首页</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"my-f-l-nav\">资金管理</div>\r\n");
      out.write("    <ul class=\"my-f-l-list\">\r\n");
      out.write("        <li><a href=\"http://www.ppdai.com/moneyhistory\">资金记录</a></li>\r\n");
      out.write("        <li><a href=\"http://pay.ppdai.com/order/online\">充值</a></li>\r\n");
      out.write("        <li><a href=\"http://pay.ppdai.com/trade/cashwithdrawal\">提现</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("        <div class=\"my-f-l-nav\">投资管理</div>\r\n");
      out.write("        <ul class=\"my-f-l-list\">\r\n");
      out.write("            <li><a href=\"http://www.ppdai.com/paybackLendReceived\">投资列表</a></li>\r\n");
      out.write("            <li><a href=\"http://www.ppdai.com/myproduct/ppb/1\">彩虹计划</a></li>\r\n");
      out.write("            <li><a href=\"http://www.ppdai.com/myproduct/yxb/1\">我的拍小宝</a></li>\r\n");
      out.write("            <li><a href=\"http://www.ppdai.com/autobid/addrule\">自动投标</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    <div class=\"my-f-l-nav\">账户设置</div>\r\n");
      out.write("    <ul class=\"my-f-l-list\">\r\n");
      out.write("        <li><a href=\"http://ac.ppdai.com/safe/setting\" class=\"on\">安全中心</a></li>\r\n");
      out.write("        <li><a href=\"http://ac.ppdai.com/user/accountbind\" class=\"\">关联账户</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"my-f-l-nav\">市场推广</div>\r\n");
      out.write("    <ul class=\"my-f-l-list\">\r\n");
      out.write("        <li><a href=\"http://www.ppdai.com/account/spread\">有奖推荐</a></li>\r\n");
      out.write("        <li><a href=\"http://www.ppdai.com/account/paimoney/market?menu\">拍币兑换</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Right -->\r\n");
      out.write("        <div class=\"ml20 my-f-right fl\">\r\n");
      out.write("            <div class=\"lendtotal_nav \" style=\"margin-top: 0;\">\r\n");
      out.write("                <h3 class=\"my-f-r-title\">登录历史</h3>\r\n");
      out.write("                <dl class=\"safetyTipsDl\">\r\n");
      out.write("                    <dt>友情提示：</dt>\r\n");
      out.write("                    <dd>1)IP和参考地点由网络运营商提供，如果您对您的IP和参考地点有疑问，建议您咨询您的宽带供应商。</dd>\r\n");
      out.write("                    <dd>2)为保护您的账户安全，我们建议您使用较复杂的密码，并定期<a href=\"/User/UpdatePassword\">更换</a>；同时，请定期扫描您的电脑，以确保没有木马或病毒。</dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"0\" class=\"bidhisab c666666 mt10\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th width=\"180\">日期时间</th>\r\n");
      out.write("                        <th>参考IP</th>\r\n");
      out.write("                        <th>参考地点</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                       ");
      if (_jspx_meth_s_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--底部-->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_footerBottom\">\r\n");
      out.write("        <ul class=\"footer_footerBottomNav clearfix\">\r\n");
      out.write("            <li><span class=\"webindex\"></span><a href=\"http://www.ppdai.com/\">网站首页</a>|</li>\r\n");
      out.write("            <li><span class=\"aboutus\"></span><a href=\"http://www.ppdai.com/help/aboutus\">关于我们</a>|</li>\r\n");
      out.write("            <li><span class=\"mapsite\"></span><a href=\"http://www.ppdai.com/home/sitemap\">网站地图</a>|</li>\r\n");
      out.write("            <li><span class=\"webservice\"></span><a href=\"http://www.ppdai.com/consult\">客服中心</a>|</li>\r\n");
      out.write("            <li class=\"nomr\"><span class=\"onlneserve\"></span><a href=\"./ppd_loginHistory_files/wpa.php\" target=\"_blank\">在线咨询</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p>Copyright Reserved 2007-2015©拍拍贷（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公司</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--底部结束-->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"./ppd_loginHistory_files/jquery.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script src=\"http://ac.ppdai.com/status?v=2014\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script src=\"./ppd_loginHistory_files/init.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\".my-f-l-list li a.on\").closest(\".my-f-l-list\").prev(\".my-f-l-nav\").addClass(\"my-f-l-nav-sd\");\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Google Tag Manager -->\r\n");
      out.write("    <noscript>\r\n");
      out.write("        <iframe src=\"//www.googletagmanager.com/ns.html?id=GTM-PVQ5D8\"\r\n");
      out.write("            height=\"0\" width=\"0\" style=\"display: none; visibility: hidden\"></iframe>\r\n");
      out.write("    </noscript>\r\n");
      out.write("    <script>(function (w, d, s, l, i) {\r\n");
      out.write("    w[l] = w[l] || []; w[l].push({\r\n");
      out.write("        'gtm.start':\r\n");
      out.write("            new Date().getTime(), event: 'gtm.js'\r\n");
      out.write("    }); var f = d.getElementsByTagName(s)[0],\r\n");
      out.write("            j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : ''; j.async = true; j.src =\r\n");
      out.write("                '//www.googletagmanager.com/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f);\r\n");
      out.write("})(window, document, 'script', 'dataLayer', 'GTM-PVQ5D8');</script>\r\n");
      out.write("<!-- End Google Tag Manager -->\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var _bdhmProtocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");\r\n");
      out.write("        document.write(unescape(\"%3Cscript src='\" + _bdhmProtocol + \"hm.baidu.com/h.js%3Fcfc74b94210e27ea643566ddece504a7' type='text/javascript'%3E%3C/script%3E\"));\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_s_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fs_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_s_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fforEach_005f0.setParent(null);
    // /loginHistory.jsp(138,23) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fforEach_005f0.setVar("userlogin");
    // /loginHistory.jsp(138,23) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_s_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/loginHistory.jsp(138,23) '${listuserlogin.result}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listuserlogin.result}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_s_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_s_005fforEach_005f0 = _jspx_th_s_005fforEach_005f0.doStartTag();
      if (_jspx_eval_s_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                       <tr><td><fmt:formatDate value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userlogin.logindate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" pattern=\"yyyy-MM-dd hh:mm\"/></td>\r\n");
          out.write("                       \t   <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userlogin.loginip}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                       \t     <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userlogin.loginaddress}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                       </tr>\r\n");
          out.write("                       ");
          int evalDoAfterBody = _jspx_th_s_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_s_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fs_005fforEach_005fvar_005fitems.reuse(_jspx_th_s_005fforEach_005f0);
    }
    return false;
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class securityCenter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("   <title>安全中心</title>\r\n");
      out.write("<meta name=\"description\" content=\"拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资\" />\r\n");
      out.write("<link href=\"./ppd_securityCenter_files/basic.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"./ppd_securityCenter_files/layout.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("    <link href=\"./ppd_securityCenter_files/account.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
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
      out.write("                    <img src=\"./ppd_securityCenter_files/logo.png\" alt=\"ppdai logo\" />\r\n");
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
      out.write("                        <a href=\"myAccount-baccount\">借款账户</a>\r\n");
      out.write("                        <a href=\"myAccount-laccount\">投资账户</a>\r\n");
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
      out.write("<div class=\"w100per maintop\"></div>\r\n");
      out.write("<div class=\"my-frame\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <ul class=\"breadcrumb\" style=\"border: none !important;\">\r\n");
      out.write("                    <li><a href=\"/\">首页</a> <span class=\"divider\">></span></li>\r\n");
      out.write("                            <li><a href=\"myAccount-baccount\">我的账户-我是借入者</a> <span class=\"divider\">></span></li>\r\n");
      out.write("                        <li class=\"active\">安全中心</li>\r\n");
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
      out.write("            <li><a href=\"myAccount-laccount\">我的账户首页</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"my-f-l-nav\">资金管理</div>\r\n");
      out.write("    <ul class=\"my-f-l-list\">\r\n");
      out.write("        <li><a href=\"myAccount-moneyhistory?classType=99&dateType=3\">资金记录</a></li>\r\n");
      out.write("        <li><a href=\"recharge.jsp\">充值</a></li>\r\n");
      out.write("        <li><a href=\"withdrawCash.jsp\">提现</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("        <div class=\"my-f-l-nav\">投资管理</div>\r\n");
      out.write("        <ul class=\"my-f-l-list\">\r\n");
      out.write("            <li><a href=\"myAccount-investMessage?classType=99&dateType=3\">投资列表</a></li>\r\n");
      out.write("            <li><a href=\"http://www.ppdai.com/autobid/addrule\">自动投标</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    <div class=\"my-f-l-nav\">账户设置</div>\r\n");
      out.write("    <ul class=\"my-f-l-list\">\r\n");
      out.write("        <li><a href=\"myAccount-securityCenter\" class=\"on\">安全中心</a></li>\r\n");
      out.write("        <li><a href=\"myAccount-connectNumber\" class=\"\">关联账户</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Right -->\r\n");
      out.write("        <div class=\"ml20 my-f-right fl\">\r\n");
      out.write("            <div class=\"my-f-r-safty\">\r\n");
      out.write("                    <div class=\"my-f-r-sf-title c39a1ea\">安全中心</div>\r\n");
      out.write("                    <div class=\"my-f-r-sf-degree mt12\">\r\n");
      out.write("                        安全等级：\r\n");
      out.write("                            <span>中</span>\r\n");
      out.write("\r\n");
      out.write("                            <span>建议您启动全部安全设置，以保障账户和资金安全</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"my-f-r-sflist\">\r\n");
      out.write("                        <li class=\"clearfix\">\r\n");
      out.write("                            <p class=\"icons icon1 fl\"><span class=\"fw\">身份认证</span><span>用于提升安全性和信用分。认证后不能修改。</span></p>\r\n");
      out.write("                            \r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"clearfix\">\r\n");
      out.write("                            <p class=\"icons icon2 fl\"><span class=\"fw\">手机绑定</span><span>用于实时了解账户变动，享受拍拍贷手机服务。</span></p>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"clearfix\">\r\n");
      out.write("                            <p class=\"icons icon3 fl\"><span class=\"fw\">信息认证</span><span>携手权威机构，认证您的网络身份，让账户更被信任。</span></p>\r\n");
      out.write("                            <a href=\"http://www.ppdai.com/cert/videousercert\" target=\"_blank\" class=\"c39a1ea fr\">管理</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"clearfix\">\r\n");
      out.write("                            <p class=\"icons icon4 fl\"><span class=\"fw\">关联账户</span><span>关联您在其他网站上的账号，可以快速登入拍拍贷，并提升您的账户安全保障。</span></p>\r\n");
      out.write("                            <a href=\"connectNumber.jsp\" target=\"_blank\" class=\"c39a1ea fr\">管理</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"clearfix\">\r\n");
      out.write("                            <p class=\"icons icon5-gy fl\"><span class=\"fw\">安全问题</span><span>作为基础安全工具，验证账户信息，保障账户安全。</span></p>\r\n");
      out.write("                             ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"clearfix\">\r\n");
      out.write("                            <p class=\"icons icon6-gy fl\"><span class=\"fw\">邮箱绑定</span><span>享受拍拍贷邮箱服务，接收账单信息，保障账号安全。</span></p>\r\n");
      out.write("                             ");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"btnone clearfix\">\r\n");
      out.write("                            <p class=\"icons icon7 fl\"><span class=\"fw\">登录密码</span><span>定期更换密码让您的账户更安全。</span></p>\r\n");
      out.write("                            <a href=\"updatePassword.jsp\" target=\"_blank\" class=\"c39a1ea fr\">修改</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"btnone clearfix\">\r\n");
      out.write("                            <p class=\"icons icon8 fl\"><span class=\"fw\">登录历史</span><span>查看最近您一个月的登录历史。</span></p> \r\n");
      out.write("                            <a href=\"myAccount-loginHistory\" target=\"_blank\" class=\"c39a1ea fr\">查看</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
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
      out.write("            <li class=\"nomr\"><span class=\"onlneserve\"></span><a href=\"http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf\" target=\"_blank\">在线咨询</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p>Copyright Reserved 2007-2015©拍拍贷（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公司</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--底部结束-->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"./ppd_securityCenter_files/jquery.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script src=\"http://ac.ppdai.com/status?v=2014\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script src=\"./ppd_securityCenter_files/init.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /securityCenter.jsp(132,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${safety.ic!=''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            \t<a class=\"c666666 fr\">通过认证</a>\r\n");
        out.write("                            ");
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

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /securityCenter.jsp(135,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${safety.ic==''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            \t<a class=\"c39a1ea fr\" href=\"aaa\">去认证</a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /securityCenter.jsp(142,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${safety.tel!=''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            \t<a href=\"updatePhone.jsp\" target=\"_blank\" class=\"c39a1ea fr\">修改</a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /securityCenter.jsp(145,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${safety.tel==''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            \t<a class=\"c39a1ea fr\" href=\"updatePhone.jsp\">去认证</a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    // /securityCenter.jsp(160,29) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${protects!=''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            \t<a href=\"myAccount-safetyProblem\" target=\"_blank\" class=\"c39a1ea fr\">修改</a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    // /securityCenter.jsp(163,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${protects==''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            \t<a href=\"myAccount-safetyProblem\" target=\"_blank\" class=\"c39a1ea fr\">立即设置</a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent(null);
    // /securityCenter.jsp(170,29) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email!=''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            \t<a href=\"emailBundling.jsp\" target=\"_blank\" class=\"c39a1ea fr\">修改</a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent(null);
    // /securityCenter.jsp(173,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email==''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            \t<a href=\"emailBundling.jsp\" target=\"_blank\" class=\"c39a1ea fr\">立即绑定</a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }
}

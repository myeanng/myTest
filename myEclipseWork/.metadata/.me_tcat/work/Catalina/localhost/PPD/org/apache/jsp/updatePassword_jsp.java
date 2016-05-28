package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class updatePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>修改密码</title>\r\n");
      out.write("<meta name=\"description\" content=\"拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资\" />\r\n");
      out.write("<link href=\"./ppd_updatePassword_files/basic.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"./ppd_updatePassword_files/layout.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"./ppd_updatePassword_files/account.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"./ppd_updatePassword_files/bindAccount.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"./ppd_updatePassword_files/validation.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
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
      out.write("                    <img src=\"./ppd_updatePassword_files/logo.png\" alt=\"ppdai logo\" />\r\n");
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
      out.write("<div class=\"main\" style=\"padding-top: 10px; margin-bottom: 20px;\">\r\n");
      out.write("    <div class=\"my-frame\">\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <ul class=\"breadcrumb\" style=\"border: none !important;\">\r\n");
      out.write("                    <li><a href=\"/\">首页</a> <span class=\"divider\">></span></li>\r\n");
      out.write("                            <li><a href=\"myAccount-baccount\">我的账户-我是借入者</a> <span class=\"divider\">></span></li>\r\n");
      out.write("                        <li class=\"active\">修改密码</li>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"clearfix\">\r\n");
      out.write("            <!-- Left Nav -->\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"my-f-left fl\">\r\n");
      out.write("    <div class=\"my-f-l-nav\">我的账户</div>\r\n");
      out.write("    <ul class=\"my-f-l-list\">\r\n");
      out.write("            <li><a href=\"myAccount-baccount\">我的账户首页</a></li>\r\n");
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
      out.write("            <!-- Right -->\r\n");
      out.write("            <div class=\"ml20 my-f-right fl\">\r\n");
      out.write("                <div class=\"my-f-r-safty bdradius0\">\r\n");
      out.write("                    <div class=\"my-f-r-sf-title c666\">修改密码</div>\r\n");
      out.write("                    <div class=\"cahngePassword\">\r\n");
      out.write("                        <form id=\"mypassword\" action=\"myAccount-upuserPWD\" method=\"POST\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li class=\"clearfix\">\r\n");
      out.write("                                    <label>用户名：</label><span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></li>\r\n");
      out.write("                                <li class=\"clearfix\">\r\n");
      out.write("                                    <label>原密码：</label>\r\n");
      out.write("                                    <input type=\"password\" id=\"password\" name=\"CurrentPassWord\" maxlength=\"16\" data-validation-engine=\"validate[required ,maxSize[16],minSize[8]]\" />\r\n");
      out.write("                                    <div class=\"formErrorMsg\"></div>\r\n");
      out.write("                                    <em>请输入您的原密码</em></li>\r\n");
      out.write("                                <li class=\"clearfix\">\r\n");
      out.write("                                    <label>新密码：</label>\r\n");
      out.write("                                    <input type=\"password\" id=\"newPassword\" name=\"NewPassWord\" maxlength=\"16\" data-validation-engine=\"validate[required ,maxSize[16],minSize[8],custom[password]]\" />\r\n");
      out.write("                                    <div class=\"formErrorMsg\"></div>\r\n");
      out.write("                                    <em>请使用8-16个字符的英文字母、符号和数字的组合</em></li>\r\n");
      out.write("                                <li class=\"clearfix\">\r\n");
      out.write("                                    <label>密码强度：</label>\r\n");
      out.write("                                    <i id=\"passstrong\" class=\"weak\"></i></li>\r\n");
      out.write("                                <li class=\"clearfix\">\r\n");
      out.write("                                    <label>再次输入新密码：</label>\r\n");
      out.write("                                    <input type=\"password\" id=\"confirmPassword\" name=\"NewPassWordConfirm\" maxlength=\"16\" data-validation-engine=\"validate[required ,maxSize[16],minSize[8],custom[password]]\" />\r\n");
      out.write("                                    <div class=\"formErrorMsg\"></div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <input type=\"hidden\" name=\"Redirect\" value=\"\" />\r\n");
      out.write("                            <div class=\"subBtn\">\r\n");
      out.write("                                <input type=\"submit\" value=\"立即修改\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
      out.write("            <li class=\"nomr\"><span class=\"onlneserve\"></span><a href=\"./ppd_updatePassword_files/wpa.php\" target=\"_blank\">在线咨询</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p>Copyright Reserved 2007-2015©拍拍贷（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公司</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--底部结束-->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"./ppd_updatePassword_files/jquery.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script src=\"http://ac.ppdai.com/status?v=2014\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script src=\"./ppd_updatePassword_files/init.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\".my-f-l-list li a.on\").closest(\".my-f-l-list\").prev(\".my-f-l-nav\").addClass(\"my-f-l-nav-sd\");\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <script src=\"./ppd_updatePassword_files/validation.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script src=\"./ppd_updatePassword_files/validation-zh.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#mypassword\").validationEngine();\r\n");
      out.write("\r\n");
      out.write("            var passLength = function (s, minLen, $showObj) {\r\n");
      out.write("                if (s.length < minLen) {\r\n");
      out.write("                    $showObj.removeAttr(\"class\").addClass('weak');\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("                var a = -1;\r\n");
      out.write("                if (s.match(/[a-z]/ig)) {\r\n");
      out.write("                    a++;\r\n");
      out.write("                }\r\n");
      out.write("                if (s.match(/[0-9]/ig)) {\r\n");
      out.write("                    a++;\r\n");
      out.write("                }\r\n");
      out.write("                if (s.match(/(.[^a-z0-9])/ig)) {\r\n");
      out.write("                    a++;\r\n");
      out.write("                }\r\n");
      out.write("                if (s.length < 6 && a > 0) {\r\n");
      out.write("                    a--;\r\n");
      out.write("                }\r\n");
      out.write("                switch (a) {\r\n");
      out.write("                case 0:\r\n");
      out.write("                    $showObj.removeAttr(\"class\").addClass('weak');\r\n");
      out.write("                    break;\r\n");
      out.write("                case 1:\r\n");
      out.write("                    $showObj.removeAttr(\"class\").addClass('medium');\r\n");
      out.write("                    break;\r\n");
      out.write("                case 2:\r\n");
      out.write("                    $showObj.removeAttr(\"class\").addClass('strong');\r\n");
      out.write("                    break;\r\n");
      out.write("                default:\r\n");
      out.write("                    $showObj.removeAttr(\"class\").addClass('weak');\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            $('#newPassword').bind('input propertychange', function () {\r\n");
      out.write("                passLength($('#newPassword').val(), 6, $('#passstrong'));\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
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
      out.write("                './ppd_updatePassword_files/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f);\r\n");
      out.write("})(window, document, 'script', 'dataLayer', 'GTM-PVQ5D8');</script>\r\n");
      out.write("<!-- End Google Tag Manager -->\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var _bdhmProtocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");\r\n");
      out.write("        document.write(unescape(\"%3Cscript src='\" + _bdhmProtocol + \"hm.baidu.com/h.js%3Fcfc74b94210e27ea643566ddece504a7' type='text/javascript'%3E%3C/script%3E\"));\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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

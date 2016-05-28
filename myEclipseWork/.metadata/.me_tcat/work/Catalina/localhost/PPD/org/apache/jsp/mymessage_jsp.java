package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class mymessage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
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
      out.write("    \r\n");
      out.write("<title>通知 - 拍拍贷官网_中国领先互联网金融P2P网贷平台_网络贷款_投资理财</title>\r\n");
      out.write("<meta name=\"description\" content=\"拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值\">\r\n");
      out.write("<meta name=\"keywords\" content=\"网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./ppd_mymessage_files/basic.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./ppd_mymessage_files/layout.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./ppd_mymessage_files/siteMessage.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"./ppd_mymessage_files/jquery_002.js\" type=\"text/javascript\"></script><script src=\"./ppd_mymessage_files/ppd_pop.js\" type=\"text/javascript\"></script><script src=\"./ppd_mymessage_files/hubs\" type=\"text/javascript\"></script><script src=\"./ppd_mymessage_files/acstatus_hub.js\" type=\"text/javascript\"></script></head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- 顶部登录注册状态栏目 -->\r\n");
      out.write("    <div class=\"PPD_header_nav\" style=\"margin-bottom: 0;\">\r\n");
      out.write("        <div class=\"PPD_login_status top\"><br></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 顶部登录注册状态栏目 -->\r\n");
      out.write("\r\n");
      out.write("     <!--头部开始-->\r\n");
      out.write("    <div class=\"mainNav\">\r\n");
      out.write("        <div class=\"mainNav_inner clearfix w1000center\">\r\n");
      out.write("            <h1 class=\"logo\">\r\n");
      out.write("                <a href=\"http://www.ppdai.com/\"><img src=\"./ppd_mymessage_files/logo.png\" alt=\"\"></a>\r\n");
      out.write("            </h1>\r\n");
      out.write("            <ul id=\"tabIcon\">\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/lend\" category=\"Lend\">我要投资</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/lend\">我要投资</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/product/plan/rainbow\">彩虹计划</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/debtdeal/AlldebtList/DebtList\">债权交易</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/howtolend\">如何投资</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/principalprotection\">本金保障</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/borrow\" category=\"Borrow\">我要借款</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/borrow\">我要借款</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/howtoborrow\">如何借款</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/borrow/interestcalculate\">利息计算器</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/account\" category=\"Account\">我的账户</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/account/borrow\">借款账户</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/account/lend\">投资账户</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/help/aboutus\" category=\"About\">关于我们</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/aboutus\">关于我们</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/howworks\">工作原理</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/fees\">资费说明</a>\r\n");
      out.write("                      \t<a href=\"http://www.ppdai.com/job\">招贤纳士</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--头部结束-->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\t<div style=\"height: 421px;\" class=\"main\">\r\n");
      out.write("\t\t<!--面包屑导航-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t    <ul class=\"breadcrumb\" style=\"border: none !important;\">\r\n");
      out.write("\t\t        <li><a href=\"http://www.ppdai.com/\">首页</a> <span class=\"divider\">&gt;</span></li>\r\n");
      out.write("\t\t         <li>消息</li>\r\n");
      out.write("\t\t    </ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--面包屑导航-->\r\n");
      out.write("\t\t<div class=\"wrapSiteMessageMain w1000center\">\r\n");
      out.write("\t\t\t<div class=\"siteMessageMain\">\r\n");
      out.write("                <ul class=\"siteMessageNav siteMessageNav2 clearfix\">\r\n");
      out.write("\t\t\t\t\t<li class=\"first current\"><a href=\"myAccount-mymessage\">通知</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<table class=\"siteMessageTable1\" width=\"1000\" height=\"159\">\r\n");
      out.write("\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"7%\"><input name=\"\" id=\"checkboxall\" type=\"checkbox\"></th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"7%\">全选</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"6%\">\r\n");
      out.write("                            <a href=\"myAccount-deleteAllMessage\" class=\"webSiteMessage-delete\" rel=\"all\">删除</a></th>\r\n");
      out.write("\t\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"139px\">\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<!--\r\n");
      out.write("    循环开始                                    \r\n");
      out.write("                                         -->\r\n");
      out.write("  ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!--\r\n");
      out.write("\t循环结束\t\t\t\t\r\n");
      out.write("                     -->\r\n");
      out.write("                     \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tbody></table>\r\n");
      out.write("                <!-- 翻页开始 -->\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("<div class=\"pagination-container\"><ul class=\"pagination\"><li class=\"active\"><a>1</a></li></ul></div>\t\t\t\t</div>\r\n");
      out.write("                  <!-- 翻页结束 --> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <!--底部-->\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <div class=\"footer_footerBottom\">\r\n");
      out.write("            <ul class=\"footer_footerBottomNav clearfix\">\r\n");
      out.write("                <li><span class=\"webindex\"></span><a href=\"http://www.ppdai.com/\">网站首页</a>|</li>\r\n");
      out.write("                <li><span class=\"aboutus\"></span><a href=\"http://www.ppdai.com/help/aboutus\">关于我们</a>|</li>\r\n");
      out.write("                <li><span class=\"mapsite\"></span><a href=\"http://www.ppdai.com/home/sitemap\">网站地图</a>|</li>\r\n");
      out.write("                <li><span class=\"webservice\"></span><a href=\"http://www.ppdai.com/consult\">客服中心</a>|</li>\r\n");
      out.write("                <li class=\"nomr\"><span class=\"onlneserve\"></span><a href=\"http://wpa.b.qq.com/cgi/wpa.php?ln=1&amp;key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf\" target=\"_blank\">在线咨询</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <p>Copyright Reserved \r\n");
      out.write("2007-2015©拍拍贷\r\n");
      out.write("（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备\r\n");
      out.write("05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公\r\n");
      out.write("司</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--底部结束-->\r\n");
      out.write("    \r\n");
      out.write("\t<script src=\"./ppd_mymessage_files/jquery.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<script src=\"./ppd_mymessage_files/init.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<script src=\"./ppd_mymessage_files/bootstrap.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./ppd_mymessage_files/customize.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t    $(function () {\r\n");
      out.write("\t        $('.siteMessageTable1 tr').hover(function () {\r\n");
      out.write("\t            $(this).children('td').css('background', '#F7F7F7');\r\n");
      out.write("\t        }, function () {\r\n");
      out.write("\t            $(this).children('td').css('background', '#fff');\r\n");
      out.write("\t        });\r\n");
      out.write("\r\n");
      out.write("\t        //checkBox全选/全不选\r\n");
      out.write("\t        $('.siteMessageTable1 th input[type=checkbox]').click(function () {\r\n");
      out.write("\t            if ($(this).is(':checked')) {\r\n");
      out.write("\t                $('.siteMessageTable1 td input[type=checkbox]').attr('checked', 'checked');\r\n");
      out.write("\t            } else {\r\n");
      out.write("\t                $('.siteMessageTable1 td input[type=checkbox]').removeAttr('checked');\r\n");
      out.write("\t            }\r\n");
      out.write("\t        });\r\n");
      out.write("\r\n");
      out.write("\t        //删除确认框\r\n");
      out.write("\t        $('.webSiteMessage-delete').click(function () {\r\n");
      out.write("\t            var id = $(this).attr(\"rel\");\r\n");
      out.write("\t            var hasChecked = 0;\r\n");
      out.write("\t            var ids = \"\";\r\n");
      out.write("\t            //alert(id);\r\n");
      out.write("                //如果用户点了全选后边的 删除 判断用户是至少选择一个\r\n");
      out.write("\t            if (id == \"all\")\r\n");
      out.write("\t            {\r\n");
      out.write("\t                $('.siteMessageTable1 td input[type=checkbox]').each(function () {\r\n");
      out.write("\t                    if ($(this).attr('checked') == \"checked\")\r\n");
      out.write("\t                    {\r\n");
      out.write("\t                        hasChecked = 1;\r\n");
      out.write("\t                        ids += $(this).attr(\"rel\") + \"|\";\r\n");
      out.write("\t                    }\r\n");
      out.write("\t                });\r\n");
      out.write("\t                if (hasChecked == 0) {\r\n");
      out.write("\t                    return false;\r\n");
      out.write("\t                }\r\n");
      out.write("\t            }\r\n");
      out.write("\t            //alert(id);\r\n");
      out.write("                $(this).PPDfloatDiv({\r\n");
      out.write("\t                    floatbgtype: true,\r\n");
      out.write("\t                    floattruebtn: '确认',\r\n");
      out.write("\t                    floatfalsebtn: '取消',\r\n");
      out.write("\t                    handertext: '是否删除消息',\r\n");
      out.write("\t                    context: \"<p>删除后无法恢复。确认删除？</p>\",\r\n");
      out.write("\t                    btnshow: true,\r\n");
      out.write("\t                    keyboards: false,\r\n");
      out.write("\t                    truebtnid: \"btnDelete\",\r\n");
      out.write("\t                    btnalign: 'center'\r\n");
      out.write("\t                });\r\n");
      out.write("\t           \r\n");
      out.write("\t            //弹出层中的 确认按钮事件\r\n");
      out.write("\t            $(\"#btnDelete\").click(function () {\r\n");
      out.write("\t                //批量删除\r\n");
      out.write("\t                if (id == \"all\")\r\n");
      out.write("\t                {\r\n");
      out.write("\t                    $.ajax({\r\n");
      out.write("\t                        url: \"/Message/DeleteMany?ids=\" + ids,\r\n");
      out.write("\t                        cache: false,\r\n");
      out.write("\t                        success: function (back) {\r\n");
      out.write("\t                            if (back.Status == 1) {\r\n");
      out.write("\t                                //alert(\"删除成功\");\r\n");
      out.write("\t                                parent.$('#modalbackdroptrue').modal('hide');\r\n");
      out.write("\t                                location.reload();\r\n");
      out.write("\t                            } else {\r\n");
      out.write("\t                                alert(\"删除失败 : \" + back.Msg);\r\n");
      out.write("\t                                parent.$('#modalbackdroptrue').modal('hide');\r\n");
      out.write("\t                            }\r\n");
      out.write("\t                        },\r\n");
      out.write("\t                        error: function (e) {\r\n");
      out.write("\t                            alert(\"删除失败: \" + e.statusText);\r\n");
      out.write("\t                        }\r\n");
      out.write("\t                    });\r\n");
      out.write("\t                }\r\n");
      out.write("\t                //单个删除\r\n");
      out.write("\t                if (id != \"all\")\r\n");
      out.write("\t                {\r\n");
      out.write("\t                    $.ajax({\r\n");
      out.write("\t                        url: \"/Message/Delete?id=\" + id,\r\n");
      out.write("\t                        cache: false,\r\n");
      out.write("\t                        success: function (back) {\r\n");
      out.write("\t                            if (back.Status == 1) {\r\n");
      out.write("\t                                //alert(\"删除成功\");\r\n");
      out.write("\t                                parent.$('#modalbackdroptrue').modal('hide');\r\n");
      out.write("\t                                location.reload();\r\n");
      out.write("\t                            } else {\r\n");
      out.write("\t                                alert(\"删除失败 : \" + back.Msg);\r\n");
      out.write("\t                            }\r\n");
      out.write("\t                        },\r\n");
      out.write("\t                        error: function (e) {\r\n");
      out.write("\t                            alert(\"删除失败: \" + e.statusText);\r\n");
      out.write("\t                        }\r\n");
      out.write("\t                    });\r\n");
      out.write("\t                }\r\n");
      out.write("\t            });\r\n");
      out.write("\t            //return false;\r\n");
      out.write("            //delete end\r\n");
      out.write("\t        });\r\n");
      out.write("\r\n");
      out.write("\t        //发送弹出框\r\n");
      out.write("\t        $('.webSiteMessage-send').click(function () {\r\n");
      out.write("\t            $(this).PPDfloatDiv({\r\n");
      out.write("\t                floatbgtype: true,\r\n");
      out.write("\t                floattruebtn: '发送',\r\n");
      out.write("\t                floatfalsebtn: '取消',\r\n");
      out.write("\t                handertext: '发送消息',\r\n");
      out.write("\t                context: \"<iframe scrolling='auto' width='100%' height='200' frameborder='0' src='/Message/Send?toUserId=-1&time=\" + (new Date()).getTime() + \"'></iframe>\",\r\n");
      out.write("\t                btnshow: true,\r\n");
      out.write("\t                keyboards: false,\r\n");
      out.write("\t                truebtnid: \"btnSendMsg\",\r\n");
      out.write("\t                btnalign: 'center'\r\n");
      out.write("\t            });\r\n");
      out.write("\t            \r\n");
      out.write("\t            $(\".graypop-btn\").click(removeIframe);\r\n");
      out.write("\t            $(\".close\").click(removeIframe);\r\n");
      out.write("\t        });\r\n");
      out.write("\r\n");
      out.write("\t        //回复弹出框\r\n");
      out.write("\t        $('.webSiteMessage-apply').click(function () {\r\n");
      out.write("\t            var id = $(this).attr(\"rel\");\r\n");
      out.write("\t            var userName = $(\"#userName\" + id).val();\r\n");
      out.write("\t            $(this).PPDfloatDiv({\r\n");
      out.write("\t                floatbgtype: true,\r\n");
      out.write("\t                floattruebtn: '发送',\r\n");
      out.write("\t                floatfalsebtn: '取消',\r\n");
      out.write("\t                handertext: '回复消息',\r\n");
      out.write("\t                context: \"<iframe scrolling='auto' width='100%' height='200' frameborder='0' src='/Message/Send?toUserId=\"+id+\"&userName=\"+userName+\"&time=\"+new Date()+\"'></iframe>\",\r\n");
      out.write("\t                btnshow: true,\r\n");
      out.write("\t                keyboards: false,\r\n");
      out.write("\t                truebtnid: \"btnSendMsg\",\r\n");
      out.write("\t                btnalign: 'center'\r\n");
      out.write("\t            });\r\n");
      out.write("\r\n");
      out.write("\t            $(\".graypop-btn\").click(removeIframe);\r\n");
      out.write("\t            $(\".close\").click(removeIframe);\r\n");
      out.write("\r\n");
      out.write("\t        });\r\n");
      out.write("\r\n");
      out.write("\t        //更新验证码 清除iframe\r\n");
      out.write("\t        function removeIframe() {\r\n");
      out.write("\t            var obj = $('#modalbackdroptrue');\r\n");
      out.write("\r\n");
      out.write("\t            //取消处 更新一下验证码（解决IE下iframe中缓存内容的问题）\r\n");
      out.write("\t            var frame = $(obj[0]).find(\"iframe\");\r\n");
      out.write("\t            var frameBody = $(frame[0].contentWindow.document.body);\r\n");
      out.write("\t            var time = new Date();\r\n");
      out.write("\t            frameBody.find(\"#imageCode\").attr(\"src\", \"/Message/Image?time=\" + time);\r\n");
      out.write("\r\n");
      out.write("\t            //先移除iframe(不移除IE下有bug)\r\n");
      out.write("\r\n");
      out.write("\t            $(obj[0]).find(\"iframe\").remove();\r\n");
      out.write("\t        }\r\n");
      out.write("\r\n");
      out.write("            //点击消息内容 设置为已读\r\n");
      out.write("\t        $('.siteMessageTable1 tr').click(function () {\r\n");
      out.write("\t            var id = $(this).attr(\"rel\");\r\n");
      out.write("\t            var isRead = $(\"#isRead\" + id).attr(\"class\");\r\n");
      out.write("\t            //alert(isRead);\r\n");
      out.write("\t            if (id && isRead==\"read no\")\r\n");
      out.write("\t            {\r\n");
      out.write("\t                $.ajax({\r\n");
      out.write("\t                    url: \"/Message/Read?id=\"+id,\r\n");
      out.write("\t                    cache: false,\r\n");
      out.write("\t                    success: function (back) {\r\n");
      out.write("\t                        $(\"#isRead\" + id).removeClass(\"no\");\r\n");
      out.write("\t                        $(\"#userName\" + id).removeClass(\"readNo\");\r\n");
      out.write("\t                        $(\"#content\" + id).removeClass(\"readNo\");\r\n");
      out.write("\t                    }\r\n");
      out.write("\t                });\r\n");
      out.write("\t            }\r\n");
      out.write("\t        });\r\n");
      out.write("\r\n");
      out.write("\t       \r\n");
      out.write("\r\n");
      out.write("            //end\r\n");
      out.write("\t    });\r\n");
      out.write("\r\n");
      out.write("        //点击查看更多\r\n");
      out.write("\t    function SeeMore(id) {\r\n");
      out.write("\t        var text = $(\"#linkMore\" + id).text();\r\n");
      out.write("\t        var content = $(\"#divContent\" + id).html().replace(/&lt;/g,'<').replace(/&gt;/g,'>').replace(/&amp;gt;/g,'>');\r\n");
      out.write("\t        var contentShort = $(\"#divContentShort\" + id).html();\r\n");
      out.write("\t        if (text.indexOf(\"更多\") > 0) {\r\n");
      out.write("\t            $(\"#divContentShow\" + id).html(content);\r\n");
      out.write("                //解决内容太我展示后底部 没有自动向下移动 start\r\n");
      out.write("\t            $('.main').removeAttr('style');\r\n");
      out.write("\t            var height = $('.PPD_header_nav').outerHeight(true) + $('.footer').outerHeight(true) + 75;\r\n");
      out.write("\t            if ($(window).height() == $(document).height()) {\r\n");
      out.write("\r\n");
      out.write("\t                $('.main').animate({\r\n");
      out.write("\t                    height: $(window).height() - height\r\n");
      out.write("\t                }, 0);\r\n");
      out.write("\r\n");
      out.write("\t            }\r\n");
      out.write("\t            //解决内容太我展示后底部 没有自动向下移动 end\r\n");
      out.write("\t            $(\"#linkMore\" + id).text(\">>收起\");\r\n");
      out.write("\t        } else {\r\n");
      out.write("\t            $(\"#divContentShow\" + id).html(contentShort);\r\n");
      out.write("\r\n");
      out.write("\t            $('.main').removeAttr('style');\r\n");
      out.write("\t            var height = $('.PPD_header_nav').outerHeight(true) + $('.footer').outerHeight(true) + 75;\r\n");
      out.write("\t            if ($(window).height() == $(document).height()) {\r\n");
      out.write("\r\n");
      out.write("\t                $('.main').animate({\r\n");
      out.write("\t                    height: $(window).height() - height\r\n");
      out.write("\t                }, 0);\r\n");
      out.write("\r\n");
      out.write("\t            }\r\n");
      out.write("\r\n");
      out.write("\t            $(\"#linkMore\" + id).text(\">>点击查看更多\");\r\n");
      out.write("\t        }\r\n");
      out.write("\t        \r\n");
      out.write("\t    }\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"./ppd_mymessage_files/status\" type=\"text/javascript\" charset=\"utf-8\"></script><script type=\"text/javascript\" src=\"./ppd_mymessage_files/acstatus.js\"></script>\r\n");
      out.write("    <script src=\"./ppd_mymessage_files/init.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\".my-f-l-list li a.on\").closest(\".my-f-l-list\").prev(\".my-f-l-nav\").addClass(\"my-f-l-nav-sd\");\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"ac_quickLogin_pop\"></div></body></html>\r\n");
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
    // /mymessage.jsp(105,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/mymessage.jsp(105,2) '${messages}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${messages}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /mymessage.jsp(105,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("message");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <tr rel=\"1790433\">\r\n");
          out.write("\t\t\t\t\t\t<td style=\"background: none repeat scroll 0% 0% rgb(255, 255, 255);\" valign=\"top\"><input name=\"\" rel=\"1790433\" style=\"margin-top:4px;\" type=\"checkbox\"></td>\r\n");
          out.write("\t\t\t\t\t\t<td style=\"background: none repeat scroll 0% 0% rgb(255, 255, 255);\" valign=\"top\"><span class=\"read no\" id=\"isRead1790433\" style=\"margin-top:4px;\"></span></td>\r\n");
          out.write("\t\t\t\t\t\t<td style=\"background: none repeat scroll 0% 0% rgb(255, 255, 255);\" class=\"readNo\" id=\"userName1790433\" valign=\"top\">  </td>\r\n");
          out.write("\t\t\t\t\t\t<td style=\"background: none repeat scroll 0% 0% rgb(255, 255, 255);\" class=\"tal readNo\" id=\"content1790433\" rel=\"1790433\" valign=\"top\">\r\n");
          out.write("                            <div id=\"divContentShow1790433\" style=\"word-break:break-all;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t<td style=\"background: none repeat scroll 0% 0% rgb(255, 255, 255);\" class=\"operate\" valign=\"top\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.createtime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("<br>\r\n");
          out.write("                            <a href=\"myAccount-deleteMessage?");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.messageid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"webSiteMessage-delete\" rel=\"1790433\">删除</a>\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
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
}

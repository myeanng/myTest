package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class withdrawCash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <title>账户提现 -拍拍贷-中国首家，最大、最多人使用的互联网金融P2P网络借贷平台。提供小额贷款,短期贷款,个人贷款,自定利率,借期灵活。您还可以成为借出人理财投资,超低门槛，获得高年收益率回报</title>\r\n");
      out.write("    <meta name=\"description\" content=\"拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./ppd_withdrawCash_files/basic.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./ppd_withdrawCash_files/layout.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./ppd_withdrawCash_files/index.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./ppd_withdrawCash_files/account.css\" />\r\n");
      out.write("    <link href=\"./ppd_withdrawCash_files/validation-min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <script src=\"./ppd_withdrawCash_files/jquery-1.js\"></script>\r\n");
      out.write("    <script src=\"./ppd_withdrawCash_files/jquery-migrate-1.js\"></script>\r\n");
      out.write("    <script src=\"./ppd_withdrawCash_files/jquery.kinMaxShow-1.0.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script src=\"./ppd_withdrawCash_files/init.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script src=\"./ppd_withdrawCash_files/servicestack-min.js\"></script>\r\n");
      out.write("    <script src=\"./ppd_withdrawCash_files/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"./ppd_withdrawCash_files/jquery.cookie.js\"></script>\r\n");
      out.write("    <script src=\"./ppd_withdrawCash_files/newRefer.js\"></script>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"./ppd_withdrawCash_files/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body><!--头部开始-->\r\n");
      out.write("    <div class=\"mainNav\">\r\n");
      out.write("        <div class=\"mainNav_inner clearfix w1000center\">\r\n");
      out.write("            <h1 class=\"logo\">\r\n");
      out.write("                <a href=\"http://www.ppdai.com/\"><img src=\"./ppd_withdrawCash_files/logo.png\" alt=\"\" /></a>\r\n");
      out.write("            </h1>\r\n");
      out.write("            <ul id=\"tabIcon\">\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/lend\"  category=\"Lend\">我要投资</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/lend\">我要投资</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/product/plan/rainbow\">彩虹计划</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/debtdeal/AlldebtList/DebtList\">债权交易</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/howtolend\">如何投资</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/principalprotection\">本金保障</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/borrow\"  category=\"Borrow\">我要借款</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/borrow\">我要借款</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/help/howtoborrow\">如何借款</a>\r\n");
      out.write("                        <a href=\"http://www.ppdai.com/borrow/interestcalculate\">利息计算器</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/account\" class='tabon' category=\"Account\">我的账户</a>\r\n");
      out.write("                    <div class=\"subMenu\">\r\n");
      out.write("                        <a href=\"myAccount-baccount\">借款账户</a>\r\n");
      out.write("                        <a href=\"myAccount-laccount\">投资账户</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"hasSubMenu\">\r\n");
      out.write("                    <a href=\"http://www.ppdai.com/help/aboutus\"  category=\"About\">关于我们</a>\r\n");
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
      out.write("\r\n");
      out.write("<div class=\"w100per maintop\"></div>\r\n");
      out.write("<div class=\"my-frame\">\r\n");
      out.write("    <div class=\"clearfix\">\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <ul class=\"breadcrumb\" style=\"border: none !important;\">\r\n");
      out.write("        <li><a href=\"http://www.ppdai.com/\">首页</a> <span class=\"divider\">&gt;</span></li>\r\n");
      out.write("            <li><a href=\"myAccount-laccount\">我的账户-我是投资者</a> <span class=\"divider\">></span></li>\r\n");
      out.write("                    <li><a href=\"/trade/cashWithDrawal\">账户提现</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    var breadcrumbCategory = \"Account\";\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("<div class=\"clearfix\"></div>\r\n");
      out.write("<div class=\"my-f-left fl\">\r\n");
      out.write("    <div class=\"my-f-l-nav\">我的账户</div>\r\n");
      out.write("    <ul class=\"my-f-l-list\">\r\n");
      out.write("            <li><a href=\"myAccount-laccount\">我的账户首页</a></li>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"my-f-l-nav\">资金管理</div>\r\n");
      out.write("    <ul class=\"my-f-l-list\">\r\n");
      out.write("        <li><a href=\"myAccount-moneyhistory?classType=99&dateType=3\">资金记录</a></li>\r\n");
      out.write("            <li><a href=\"recharge.jsp\">充值</a></li>\r\n");
      out.write("\r\n");
      out.write("            <li><a href=\"withdrawCash.jsp\" class=\"on\">提现</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("        <div class=\"my-f-l-nav\">投资管理</div>\r\n");
      out.write("        <ul class=\"my-f-l-list\">\r\n");
      out.write("            <li><a href=\"myAccount-investMessage?classType=99&dateType=3\">投资列表</a></li>\r\n");
      out.write("            <li><a href=\"http://www.ppdai.com/autobid/addrule\">自动投标</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"my-f-l-nav\">账户设置</div>\r\n");
      out.write("    <ul class=\"my-f-l-list\">\r\n");
      out.write("        <li><a href=\"myAccount-securityCenter\">账户安全</a></li>\r\n");
      out.write("        <li><a href=\"myAccount-connectNumber\">关联账户</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"my-f-right fr\">\r\n");
      out.write("           \r\n");
      out.write("             <form action=\"myAccount-withdrawCash\" method=\"post\">\r\n");
      out.write("              <div class=\"my-ac-tx-rframe\" style=\"border: solid 1px #d5d5d5;\">\r\n");
      out.write("             \r\n");
      out.write("                <div class=\"my-ac-tx-balance mt0 clearfix\">\r\n");
      out.write("\r\n");
      out.write("                    <span class=\"fl\">可用余额：<span class=\"my-ac-balanceNum\">&#165;");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("</span></span>\r\n");
      out.write("                    <span class=\"mr20 fr\">\r\n");
      out.write("                        <a style=\"cursor: pointer;\" class=\"my-ac-tx-add c666666 addbank\">添加银行卡</a>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cardbox_nav clearfix\">\r\n");
      out.write("                    <div class=\"fl\" style=\"width: 94px; padding-right: 10px; line-height: 48px; font-size: 14px; text-align: right;\">选择银行卡：</div>\r\n");
      out.write("                    <div class=\"cardbox_list fl\">\r\n");
      out.write("                            <p style=\"margin: 0; width: 635px; height: 48px; border: solid 1px #bfcfe5; background: #f0f6f9;\">\r\n");
      out.write("                                <a class=\"cd-add addbank\">添加银行卡</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <input type=\"hidden\" value=\"0\" name=\"BankAccountId\" id=\"BankAccountId\" />\r\n");
      out.write("                        <div class=\"cd-list\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"cd-items\" id=\"jscd-items\" style=\"height:0px\">\r\n");
      out.write("                                                                            <div class=\"cd-itembg choose-list-bg\" style=\"top: 5px; z-index: 10; display: block;\"></div>\r\n");
      out.write("                                        <div class=\"cd-itembg choose-list-bg\" style=\"top: 10px; z-index: 9; display: block;\"></div>\r\n");
      out.write("                                        <div class=\"choose-more clearfix\" style=\"display: block;\">\r\n");
      out.write("                                            <a class=\"link fl\">选择其他银行</a>\r\n");
      out.write("                                            <span class=\"fl ps\">* 银行卡必须为“*建”的借记卡，否则无法提现</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <!--<div class=\"ps\"></div></div>-->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"paychannel_nav clearfix\">\r\n");
      out.write("                    <div class=\"tit fl\">提现方式：</div>\r\n");
      out.write("                    <div class=\"jue jue_on fl\" onclick=\"changemoney(0)\">1-3个工作日到账</div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mt15 clearfix \">\r\n");
      out.write("                     <label class=\"lh32 my-ac-rc-fel fl\">提现金额：</label><input class=\"my-ac-rc-jine fl\" name=\"money\" id=\"money\" type=\"text\" autocomplete=\"off\"\r\n");
      out.write("                      value=\"0\" data-validation-engine=\"validate[required]\" maxlength=\"8\" /><span class=\"my-ac-rc-yuan fl\">元</span>\r\n");
      out.write("\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"mt15 clearfix \">\r\n");
      out.write("                     <label class=\"lh32 my-ac-rc-fel fl\">支付密码：</label><input class=\"my-ac-rc-jine fl\" name=\"zfmm\" id=\"zfmm\" type=\"password\"\r\n");
      out.write("                     maxlength=\"8\" />\r\n");
      out.write("\r\n");
      out.write("                 </div>\r\n");
      out.write("                <div class=\"shoufei_nav\">\r\n");
      out.write("                \r\n");
      out.write("                    <div class=\"tit\">\r\n");
      out.write("                        提现费用：<span><span class=\"inormal\">3</span>元笔（<a href=\"javascript:void(0)\" id=\"Withdrawrule\" class=\"c39a1ea\">收费规则</a>）</span>\r\n");
      out.write("                        <table class=\"ruletable\">\r\n");
      out.write("                            <tr style=\"background: #f8f8f8; height: 22px;\">\r\n");
      out.write("                                <td colspan=\"3\">第三方收取\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr style=\"color: #666; height: 22px; border: 1px solid #e5e5e5;\">\r\n");
      out.write("                                <td style=\"border: 1px solid #e5e5e5; width: 120px;\">提现金额</td>\r\n");
      out.write("                                <td style=\"border: 1px solid #e5e5e5; width: 100px;\">工作日当天到账</td>\r\n");
      out.write("                                <td style=\"border: 1px solid #e5e5e5; width: 130px\">1-3工作日到账</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr style=\"color: #666; height: 22px; border: 1px solid #e5e5e5;\">\r\n");
      out.write("                                <td style=\"border: 1px solid #e5e5e5;\">0-3W（含）</td>\r\n");
      out.write("                                <td style=\"border: 1px solid #e5e5e5;\">10元/笔</td>\r\n");
      out.write("                                <td style=\"border: 1px solid #e5e5e5;\">3元/笔（VIP 3元/笔）</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr style=\"color: #666; height: 22px;\">\r\n");
      out.write("                                <td style=\"border: 1px solid #e5e5e5; width: 30px;\">3-5W（均不含）</td>\r\n");
      out.write("                                <td style=\"border: 1px solid #e5e5e5;\">20元/笔</td>\r\n");
      out.write("                                <td style=\"border: 1px solid #e5e5e5;\">6元/笔（VIP 3元/笔）</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                    <p class=\"txc\">\r\n");
      out.write("                    \t<input type=\"submit\" class=\"my-blue-btn mt30\" style=\"display:inline-block;width: 250px; height: 50px; line-height: 50px; text-align: center;margin-left:0px; cursor:pointer;\" value=\"申请提现\" id=\"btnOk\">\r\n");
      out.write("                        <!--<input type=\"submit\"   value=\"申请提现\"  class=\"my-gray-btn my-ac-nongt-nextstep mt30\" />\r\n");
      out.write("                    --></p>\r\n");
      out.write("                    <p class=\"my-ac-non-grtxt\">\r\n");
      out.write("                        为了方便您熟悉还款/充值流程，首次提现前，\r\n");
      out.write("                        请您至少<span class=\"c39a1ea\"><a href=\"/Order/online\" style=\"color: #39a1ea\">即时充值0.1元</a></span>激活账户。谢谢您的配合！\r\n");
      out.write("                    </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"instant_recharge_three\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    温馨说明：\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>1、请确保您输入银行帐号信息准确无误。</li>\r\n");
      out.write("                    <li>2、如果您填写的提现信息不正确可能会导致提现失败，由此产生的提现费用将不予返还。</li>\r\n");
      out.write("                    <li>3、双休日和法定节假日期间，用户可以申请提现，拍拍贷会在下一个工作日进行处理。由此造成的不便，请多多谅解！</li>\r\n");
      out.write("                    <li>4、平台禁止洗钱、信用卡套现、虚假交易等行为，一经发现并确认，将终止该账户的使用。</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"cover\"></div>\r\n");
      out.write("<div class=\"remind_withdraw\" style=\"display: none;\">\r\n");
      out.write("    <div class=\"remind_withdraw_title\">温馨提示</div>\r\n");
      out.write("    <div class=\"remind_withdraw_content\">\r\n");
      out.write("        <div class=\"remind_withdraw_content_title\">\r\n");
      out.write("            客官，提现后每年将损失897元收益呢。能告诉我们取现的原因吗?\r\n");
      out.write("        </div>\r\n");
      out.write("        <p class=\"remind_withdraw_content_option\">\r\n");
      out.write("            <input type=\"radio\" name=\"check\" value=\"没有适合我的标的投资\" />没有适合我的标的投资\r\n");
      out.write("        </p>\r\n");
      out.write("        <p class=\"remind_withdraw_content_option\">\r\n");
      out.write("            <input type=\"radio\" name=\"check\" value=\"我希望有更高的收益\" />我希望有更高的收益\r\n");
      out.write("        </p>\r\n");
      out.write("        <p class=\"remind_withdraw_content_option\">\r\n");
      out.write("            <input type=\"radio\" name=\"check\" value=\"逾期的情况比我想象中多\" />逾期的情况比我想象中多\r\n");
      out.write("        </p>\r\n");
      out.write("        <p class=\"remind_withdraw_content_option\">\r\n");
      out.write("            <input type=\"radio\" name=\"check\" value=\"需要用钱\" />需要用钱\r\n");
      out.write("        </p>\r\n");
      out.write("        <p class=\"remind_withdraw_content_option\">\r\n");
      out.write("            <input type=\"radio\" name=\"check\" value=\"操作麻烦\" />操作麻烦\r\n");
      out.write("        </p>\r\n");
      out.write("        <p class=\"remind_withdraw_content_option\">\r\n");
      out.write("            <input type=\"radio\" name=\"check\" value=\"有其他的投资方式\" />有其他的投资方式\r\n");
      out.write("        </p>\r\n");
      out.write("        <p class=\"remind_withdraw_content_option\">\r\n");
      out.write("            <input type=\"radio\" name=\"check\" class=\"other_option\" value=\"其他\" />其他\r\n");
      out.write("        </p>\r\n");
      out.write("        <textarea class=\"remind_withdraw_content_textBox\" name=\"\"></textarea>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"remind_withdraw_buttonBox\">\r\n");
      out.write("        <a href=\"javascript:;\" class=\"remind_withdraw_button blue remind_withdraw_close\">先不提了</a>\r\n");
      out.write("        <a href=\"javascript:;\" class=\"remind_withdraw_button gray remind_withdraw_submit\">继续提现</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"remind_withdraw_error\"></div>\r\n");
      out.write("    <a href=\"javascript:;\" class=\"remind_withdraw_close\">×</a>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./ppd_withdrawCash_files/customize.js\"></script>\r\n");
      out.write("<script src=\"./ppd_withdrawCash_files/withdraw.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var userLevel = parseInt('0');\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        $(\"#10003\").attr('class', 'tabon');\r\n");
      out.write("        $(\"#10003013\").attr('class', 'li_on');\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"clear\">\r\n");
      out.write("    </div>\r\n");
      out.write("     <!--底部-->\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <div class=\"footer_footerBottom\">\r\n");
      out.write("            <ul class=\"footer_footerBottomNav clearfix\">\r\n");
      out.write("                <li><span class=\"webindex\"></span><a href=\"http://www.ppdai.com/\">网站首页</a>|</li>\r\n");
      out.write("                <li><span class=\"aboutus\"></span><a href=\"http://www.ppdai.com/help/aboutus\">关于我们</a>|</li>\r\n");
      out.write("                <li><span class=\"mapsite\"></span><a href=\"http://www.ppdai.com/home/sitemap\">网站地图</a>|</li>\r\n");
      out.write("                <li><span class=\"webservice\"></span><a href=\"http://www.ppdai.com/consult\">客服中心</a>|</li>\r\n");
      out.write("                <li class=\"nomr\"><span class=\"onlneserve\"></span><a href=\"http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf\" target=\"_blank\">在线咨询</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <p>Copyright Reserved 2007-2015©拍拍贷（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公司</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--底部结束-->\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        $(\".my-f-l-list li a.on\").closest(\".my-f-l-list\").prev(\".my-f-l-nav\").addClass(\"my-f-l-nav-sd\");\r\n");
      out.write("        $(\"#tabIcon a[category='\" + breadcrumbCategory + \"']\").addClass(\"tabon\");\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"http://ac.ppdai.com/status?v=2014\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var _gaq = _gaq || [];\r\n");
      out.write("        _gaq.push(['_setAccount', 'UA-3635664-1']);\r\n");
      out.write("        _gaq.push(['_setDomainName', 'ppdai.com']);\r\n");
      out.write("        _gaq.push(['_setAllowHash', false]);\r\n");
      out.write("        _gaq.push([\"_addOrganic\", \"baidu\", \"word\"]);\r\n");
      out.write("        _gaq.push([\"_addOrganic\", \"soso\", \"w\"]);\r\n");
      out.write("        _gaq.push([\"_addOrganic\", \"soso\", \"key\"]);\r\n");
      out.write("        _gaq.push([\"_addOrganic\", \"sogou\", \"query\"]);\r\n");
      out.write("        _gaq.push([\"_addOrganic\", \"sogou\", \"keyword\"]);\r\n");
      out.write("        _gaq.push(['_addOrganic', 'youdao', 'q']);\r\n");
      out.write("        _gaq.push([\"_addOrganic\", \"so.com\", \"q\"]);\r\n");
      out.write("        _gaq.push([\"_addOrganic\", \"m.baidu.com\", \"word\"]);\r\n");
      out.write("        _gaq.push(['_trackPageview']);\r\n");
      out.write("        (function () {\r\n");
      out.write("            var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\r\n");
      out.write("            ga.src = ('https:' == document.location.protocol ? './ppd_withdrawCash_files' : './ppd_withdrawCash_files') + '/ga.js';\r\n");
      out.write("            var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\r\n");
      out.write("        })();\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var _bdhmProtocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");\r\n");
      out.write("        document.write(unescape(\"%3Cscript src='\" + _bdhmProtocol + \"hm.baidu.com/h.js%3Faab1030ecb68cd7b5c613bd7a5127a40' type='text/javascript'%3E%3C/script%3E\"));\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /withdrawCash.jsp(135,79) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/withdrawCash.jsp(135,79) '${user.accounts}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${user.accounts}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /withdrawCash.jsp(135,79) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("account");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${account.inmoney}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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

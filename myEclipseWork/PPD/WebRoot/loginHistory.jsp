<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <title>我的登录历史</title>
<meta name="description" content="拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值" />
<meta name="keywords" content="网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资" />
<link href="./ppd_loginHistory_files/basic.css" rel="stylesheet" type="text/css" />
<link href="./ppd_loginHistory_files/layout.css" rel="stylesheet" type="text/css" />

    <link href="./ppd_loginHistory_files/account.css" rel="stylesheet" type="text/css" />

</head>
<body>
    <!--头部-->
    <div class="PPD_header_nav" style="margin-bottom: 0;">
        <div class="PPD_login_status"></div>
    </div>
    <div class="mainNav">
        <div class="mainNav_inner clearfix w1000center">
            <h1 class="logo">
                <a href="http://www.ppdai.com/">
                    <img src="./ppd_loginHistory_files/logo.png" alt="ppdai logo" />
                </a>
            </h1>
            <ul id="tabIcon">
                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/lend">我要投资</a>
                    <div class="subMenu">
                        <a href="http://www.ppdai.com/lend">我要借出</a>
                        <a href="http://www.ppdai.com/product/list">彩虹计划</a>
                        <a href="http://www.ppdai.com/debtdeal/AlldebtList/DebtList">如何借出</a>
                        <a href="http://www.ppdai.com/help/principalprotection">本金保障</a>
                    </div>
                </li>
                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/borrow">我要借款</a>
                    <div class="subMenu">
                        <a href="http://www.ppdai.com/borrow">我要借入</a>
                        <a href="http://www.ppdai.com/help/howtoborrow.html">如何借入</a>
                        <a href="http://www.ppdai.com/borrow/interestcalculate">利息计算器</a>
                    </div>
                </li>
                <li class="hasSubMenu">
                    <a href="myAccount-baccount" class="tabon">我的账户</a>
                    <div class="subMenu">
                        <a href="myAccount-baccount">借款账户</a>
                        <a href="myAccount-laccount">投资账户</a>
                    </div>
                </li>
                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/help/aboutus">关于拍拍贷</a>
                    <div class="subMenu">
                        <a href="http://www.ppdai.com/help/aboutus">关于我们</a>
                        <a href="http://www.ppdai.com/help/howworks">工作原理</a>
                        <a href="http://www.ppdai.com/help/fees">资费说明</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
    <!--头部结束-->
    



<div class="my-frame">
    


<div>
    <ul class="breadcrumb" style="border: none !important;">
                    <li><a href="/">首页</a> <span class="divider">></span></li>
                            <li><a href="myAccount-baccount">我的账户-我是借入者</a> <span class="divider">></span></li>
                        <li class="active">登录历史</li>

    </ul>
</div>

    <div class="clearfix">
        <!-- Left Nav -->
        


<div class="my-f-left fl">
    <div class="my-f-l-nav">我的账户</div>
    <ul class="my-f-l-list">
            <li><a href="myAccount-baccount">我的账户首页</a></li>
    </ul>
    <div class="my-f-l-nav">资金管理</div>
    <ul class="my-f-l-list">
        <li><a href="myAccount-moneyhistory?classType=99&dateType=3">资金记录</a></li>
        <li><a href="recharge.jsp">充值</a></li>
        <li><a href="withdrawCash.jsp">提现</a></li>
    </ul>
        <div class="my-f-l-nav">投资管理</div>
        <ul class="my-f-l-list">
            <li><a href="myAccount-investMessage?classType=99&dateType=3">投资列表</a></li>
            <li><a href="http://www.ppdai.com/autobid/addrule">自动投标</a></li>
        </ul>
    <div class="my-f-l-nav">账户设置</div>
    <ul class="my-f-l-list">
        <li><a href="myAccount-securityCenter" class="on">安全中心</a></li>
        <li><a href="myAccount-connectNumber" class="">关联账户</a></li>
    </ul>
    
</div>

        <!-- Right -->
        <div class="ml20 my-f-right fl">
            <div class="lendtotal_nav " style="margin-top: 0;">
                <h3 class="my-f-r-title">登录历史</h3>
                <dl class="safetyTipsDl">
                    <dt>友情提示：</dt>
                    <dd>1)IP和参考地点由网络运营商提供，如果您对您的IP和参考地点有疑问，建议您咨询您的宽带供应商。</dd>
                    <dd>2)为保护您的账户安全，我们建议您使用较复杂的密码，并定期<a href="/User/UpdatePassword">更换</a>；同时，请定期扫描您的电脑，以确保没有木马或病毒。</dd>
                </dl>
                <table cellpadding="0" cellspacing="0" class="bidhisab c666666 mt10">
                    <tr>
                        <th width="180">日期时间</th>
                        <th>参考IP</th>
                    </tr>
                       <c:forEach var="l" items="${landingrecords}">
                       <tr><td><fmt:formatDate value="${l.landingtime}" pattern="yyyy-MM-dd hh:mm"/></td>
                       	   <td>${l.landingip}</td>
                       </tr>
                       </c:forEach>
                </table>
                
            </div>
           
        </div>
    </div>
</div>


    <!--底部-->
<div class="footer">
    <div class="footer_footerBottom">
        <ul class="footer_footerBottomNav clearfix">
            <li><span class="webindex"></span><a href="http://www.ppdai.com/">网站首页</a>|</li>
            <li><span class="aboutus"></span><a href="http://www.ppdai.com/help/aboutus">关于我们</a>|</li>
            <li><span class="mapsite"></span><a href="http://www.ppdai.com/home/sitemap">网站地图</a>|</li>
            <li><span class="webservice"></span><a href="http://www.ppdai.com/consult">客服中心</a>|</li>
            <li class="nomr"><span class="onlneserve"></span><a href="./ppd_loginHistory_files/wpa.php" target="_blank">在线咨询</a></li>
        </ul>
        <p>Copyright Reserved 2007-2015©拍拍贷（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公司</p>
    </div>
</div>
<!--底部结束-->

    <script src="./ppd_loginHistory_files/jquery.js" type="text/javascript" charset="utf-8"></script>
    <script src="http://ac.ppdai.com/status?v=2014" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_loginHistory_files/init.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $(function () {
            $(".my-f-l-list li a.on").closest(".my-f-l-list").prev(".my-f-l-nav").addClass("my-f-l-nav-sd");
        });
    </script>
    
    <!-- Google Tag Manager -->
    <noscript>
        <iframe src="//www.googletagmanager.com/ns.html?id=GTM-PVQ5D8"
            height="0" width="0" style="display: none; visibility: hidden"></iframe>
    </noscript>
    <script>(function (w, d, s, l, i) {
    w[l] = w[l] || []; w[l].push({
        'gtm.start':
            new Date().getTime(), event: 'gtm.js'
    }); var f = d.getElementsByTagName(s)[0],
            j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : ''; j.async = true; j.src =
                '//www.googletagmanager.com/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f);
})(window, document, 'script', 'dataLayer', 'GTM-PVQ5D8');</script>
<!-- End Google Tag Manager -->
    <script type="text/javascript">
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fcfc74b94210e27ea643566ddece504a7' type='text/javascript'%3E%3C/script%3E"));
    </script>
</body>
</html>
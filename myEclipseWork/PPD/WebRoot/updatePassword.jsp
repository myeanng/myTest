<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
  <title>修改密码</title>
<meta name="description" content="拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值" />
<meta name="keywords" content="网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资" />
<link href="./ppd_updatePassword_files/basic.css" rel="stylesheet" type="text/css" />
<link href="./ppd_updatePassword_files/layout.css" rel="stylesheet" type="text/css" />


<link href="./ppd_updatePassword_files/account.css" rel="stylesheet" type="text/css" />
<link href="./ppd_updatePassword_files/bindAccount.css" rel="stylesheet" type="text/css" />
<link href="./ppd_updatePassword_files/validation.css" rel="stylesheet" type="text/css" />


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
                    <img src="./ppd_updatePassword_files/logo.png" alt="ppdai logo" />
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
                    <a href="http://www.ppdai.com/account" class="tabon">我的账户</a>
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
    


<div class="main" style="padding-top: 10px; margin-bottom: 20px;">
    <div class="my-frame">
        


<div>
    <ul class="breadcrumb" style="border: none !important;">
                    <li><a href="/">首页</a> <span class="divider">></span></li>
                            <li><a href="myAccount-baccount">我的账户-我是借入者</a> <span class="divider">></span></li>
                        <li class="active">修改密码</li>

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
                <div class="my-f-r-safty bdradius0">
                    <div class="my-f-r-sf-title c666">修改密码</div>
                    <div class="cahngePassword">
                        <form id="mypassword" action="myAccount-upuserPWD" method="POST">
                            <ul>
                                <li class="clearfix">
                                    <label>用户名：</label><span>${user.username}</span></li>
                                <li class="clearfix">
                                    <label>原密码：</label>
                                    <input type="password" id="password" name="password" maxlength="16" data-validation-engine="validate[required ,maxSize[16],minSize[8]]" />
                                    <div class="formErrorMsg"></div>
                                    <em>请输入您的原密码</em></li>
                                <li class="clearfix">
                                    <label>新密码：</label>
                                    <input type="password" id="newPassword" name="NewPassWord" maxlength="16" data-validation-engine="validate[required ,maxSize[16],minSize[8],custom[password]]" />
                                    <div class="formErrorMsg"></div>
                                    <em>请使用8-16个字符的英文字母、符号和数字的组合</em></li>
                                <li class="clearfix">
                                    <label>密码强度：</label>
                                    <i id="passstrong" class="weak"></i></li>
                                <li class="clearfix">
                                    <label>再次输入新密码：</label>
                                    <input type="password" id="confirmPassword" name="NewPassWordConfirm" maxlength="16" data-validation-engine="validate[required ,maxSize[16],minSize[8],custom[password]]" />
                                    <div class="formErrorMsg"></div>
                                </li>
                            </ul>
                            <input type="hidden" name="Redirect" value="" />
                            <div class="subBtn">
                                <input type="submit" value="立即修改" />
                            </div>
                        </form>
                    </div>
                </div>
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
            <li class="nomr"><span class="onlneserve"></span><a href="./ppd_updatePassword_files/wpa.php" target="_blank">在线咨询</a></li>
        </ul>
        <p>Copyright Reserved 2007-2015©拍拍贷（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公司</p>
    </div>
</div>
<!--底部结束-->

    <script src="./ppd_updatePassword_files/jquery.js" type="text/javascript" charset="utf-8"></script>
    <script src="http://ac.ppdai.com/status?v=2014" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_updatePassword_files/init.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $(function () {
            $(".my-f-l-list li a.on").closest(".my-f-l-list").prev(".my-f-l-nav").addClass("my-f-l-nav-sd");
        });
    </script>
    

    <script src="./ppd_updatePassword_files/validation.js" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_updatePassword_files/validation-zh.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $(function () {
            $("#mypassword").validationEngine();

            var passLength = function (s, minLen, $showObj) {
                if (s.length < minLen) {
                    $showObj.removeAttr("class").addClass('weak');
                    return;
                }
                var a = -1;
                if (s.match(/[a-z]/ig)) {
                    a++;
                }
                if (s.match(/[0-9]/ig)) {
                    a++;
                }
                if (s.match(/(.[^a-z0-9])/ig)) {
                    a++;
                }
                if (s.length < 6 && a > 0) {
                    a--;
                }
                switch (a) {
                case 0:
                    $showObj.removeAttr("class").addClass('weak');
                    break;
                case 1:
                    $showObj.removeAttr("class").addClass('medium');
                    break;
                case 2:
                    $showObj.removeAttr("class").addClass('strong');
                    break;
                default:
                    $showObj.removeAttr("class").addClass('weak');
                }
            };

            $('#newPassword').bind('input propertychange', function () {
                passLength($('#newPassword').val(), 6, $('#passstrong'));
            });
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
                './ppd_updatePassword_files/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f);
})(window, document, 'script', 'dataLayer', 'GTM-PVQ5D8');</script>
<!-- End Google Tag Manager -->
    <script type="text/javascript">
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fcfc74b94210e27ea643566ddece504a7' type='text/javascript'%3E%3C/script%3E"));
    </script>
</body>
</html>

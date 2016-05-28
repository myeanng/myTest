<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <title>绑定/修改手机</title>
<meta name="description" content="拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值" />
<meta name="keywords" content="网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资" />
<link href="./ppd_updatePhone_files/basic.css" rel="stylesheet" type="text/css" />
<link href="./ppd_updatePhone_files/layout.css" rel="stylesheet" type="text/css" />


<link href="./ppd_updatePhone_files/account.css" rel="stylesheet" type="text/css" />
<link href="./ppd_updatePhone_files/bindAccount.css" rel="stylesheet" type="text/css" />
<link href="./ppd_updatePhone_files/validation.css" rel="stylesheet" type="text/css" />


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
                    <img src="./ppd_updatePhone_files/logo.png" alt="ppdai logo" />
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
    


<div class="main" style="padding-top: 10px;margin-bottom: 20px;">
    <div class="my-frame">
        


<div>
    <ul class="breadcrumb" style="border: none !important;">
                    <li><a href="/">首页</a> <span class="divider">></span></li>
                            <li><a href="myAccount-baccount">我的账户-我是借入者</a> <span class="divider">></span></li>
                        <li class="active">绑定/修改手机</li>

    </ul>
</div>

        <div class="clearfix">
            <!-- Left Nav -->
            


<div class="my-f-left fl">
    <div class="my-f-l-nav">我的账户</div>
    <ul class="my-f-l-list">
            <li><a href="myAccount-laccount">我的账户首页</a></li>
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
                <div class="my-f-r-safty">
                    <div class="my-f-r-sf-title c666">修改手机</div>
                        <div class="my-f-r-sf-degree mt5 bgfafafa">您已绑定的手机：<span class="cf7971a">${safety.tel}</span></div>
                        <div class="p10 ">
                        
                            <div class="my-f-r-sf-bindStyle">通过【原手机号】+【短信验证码】修改手机号</div>
                        </div>
                        <div class="my-f-r-wrapForm" style="">
                            <form action="myAccount-upuserPhone" method="POST">
                                <input type="hidden" name="Step" value="OldValidate" />
                                    <input type="hidden" name="Way" value="Mobile" />
                                    <ul class="formItem pl188 pt36">
                                        <li class="clearfix">
                                            <label class="w80">原手机号：</label>
                                            <input type="text" class="w246 bd" id="txtMobile" name="Mobile" maxlength="11" data-validation-engine="validate[required,custom[mobile]]" />
          
                                            <div class="formErrorMsg"></div>
                                        </li>
                                        <li class="clearfix">
                                            <label class="w80">验证码：</label>
                                            <input type="text" class="w123 bd" name="ValidateCode" maxlength="6" data-validation-engine="validate[required]" />
                                            <input type="button" value="获取验证码" class="getmobilevalidata w114" data-step="OldValidate" data-way="Mobile" />
                                        </li>
                                        <li class="clearfix">
                                            <label class="w80">新手机号：</label>
                                            <input type="text" class="w246 bd" id="newPhone" name="newPhone" maxlength="11" data-validation-engine="validate[required,custom[mobile]]" />
          
                                            <div class="formErrorMsg"></div>
                                        </li>
                                    </ul>
                                    <div class="my-f-r-submit pl268 pb30 pt11"><input type="submit" value="提交" class="submitBtn" /></div>
                            </form>
                        </div>
                        <p class="formExplain">
                            温馨提示：若无法通过以上方式修改，请联系 <a href="http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf" target="_blank">在线客服</a> 。</p>
                </div>
            </div>
        </div>
    </div>
</div>
<input type="hidden" id="hid_code" value="0" />
<input type="hidden" id="hid_message" value="" />
<input type="hidden" id="hid_step" value="OldValidate" />



    <!--底部-->
<div class="footer">
    <div class="footer_footerBottom">
        <ul class="footer_footerBottomNav clearfix">
            <li><span class="webindex"></span><a href="http://www.ppdai.com/">网站首页</a>|</li>
            <li><span class="aboutus"></span><a href="http://www.ppdai.com/help/aboutus">关于我们</a>|</li>
            <li><span class="mapsite"></span><a href="http://www.ppdai.com/home/sitemap">网站地图</a>|</li>
            <li><span class="webservice"></span><a href="http://www.ppdai.com/consult">客服中心</a>|</li>
            <li class="nomr"><span class="onlneserve"></span><a href="http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf" target="_blank">在线咨询</a></li>
        </ul>
        <p>Copyright Reserved 2007-2015©拍拍贷（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公司</p>
    </div>
</div>
<!--底部结束-->

    <script src="./ppd_updatePhone_files/jquery.js" type="text/javascript" charset="utf-8"></script>
    <script src="http://ac.ppdai.com/status?v=2014" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_updatePhone_files/init.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $(function () {
            $(".my-f-l-list li a.on").closest(".my-f-l-list").prev(".my-f-l-nav").addClass("my-f-l-nav-sd");
        });
    </script>
    
<script src="http://ac.ppdaicdn.com/js/jquery.cookie.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./ppd_updatePhone_files/ppd_ac_utils.js" type="text/javascript" charset="utf-8"></script>
<script src="./ppd_updatePhone_files/validation.js" type="text/javascript" charset="utf-8"></script>
<script src="./ppd_updatePhone_files/validation-zh.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
$(function () {
    var acUtils = new PPDAcUtils("v1.0");

    var step = $('#hid_step').val();
    var way1 = 'Email',
        way2 = 'Mobile';
    var remainTimeKey0 = step + '_bindmobile_remainTime',
        remainTimeKey1 = step + way1 + '_bindmobile_remainTime',
        remainTimeKey2 = step + way2 + '_bindmobile_remainTime';
    var cookieObj = { expires: 1 / 24 / 60, path: '/', domain: '.ac.ppdai.com', secure: false };

    function checkRemainTime(obj, remainTimeKey) {
        if (jQuery.cookie(remainTimeKey) && jQuery.cookie(remainTimeKey).length > 0) {
            acUtils.remainTime(obj, jQuery.cookie(remainTimeKey), null, '秒后重新发送', remainTimeKey, cookieObj);
        }
    }
    function init() {
        if ($('.getemailvalidata').length > 0) {
            if ($('.getemailvalidata').data('step') == 'Add') {
                checkRemainTime('.getemailvalidata', remainTimeKey0);
            } else if ($('.getemailvalidata').data('way') == 'Email') {
                checkRemainTime('.getemailvalidata', remainTimeKey1);
            } else if ($('.getemailvalidata').data('way') == 'Mobile') {
                checkRemainTime('.getemailvalidata', remainTimeKey2);
            } else {
                //
            }
        }
        if ($('.getmobilevalidata').length > 0) {
            if ($('.getmobilevalidata').data('step') == 'Add') {
                checkRemainTime('.getmobilevalidata', remainTimeKey0);
            } else if ($('.getmobilevalidata').data('way') == 'Email') {
                checkRemainTime('.getmobilevalidata', remainTimeKey1);
            } else if ($('.getmobilevalidata').data('way') == 'Mobile') {
                checkRemainTime('.getmobilevalidata', remainTimeKey2);
            } else {
                //
            }
        }
    }
    setTimeout(init, 10);

    $('.my-f-r-sf-bindStyle').click(function () {
        if ($(this).children('a').text() == '点击修改') {
            $(this).parent().next('.my-f-r-wrapForm').slideDown().siblings('.my-f-r-wrapForm').slideUp();
            $('.my-f-r-sf-bindStyle>a').text('点击修改');
            $(this).children('a').text('点击收起');
        }
    });

    $("form").validationEngine();

    //手机验证码
    $('.getmobilevalidata').click(function () {
        var $this = $(this);
        var regphone = /^(13[0-9]|14[57]|15[0-35-9]|17[0678]|18[0-9])[0-9]{8}$/,
            mobilephone = $('#txtMobile');
        if ($.trim(mobilephone.val()) == '') {
            mobilephone.parent().children('.formErrorMsg').html('手机号码不能为空').show();
        } else if (mobilephone.val().length != 11 || !regphone.test(mobilephone.val())) {
            mobilephone.parent().children('.formErrorMsg').html('请输入正确的手机号码').show();
        } else {
            mobilephone.parent().children('.formErrorMsg').hide();

            if ($this.data('step') == 'Add') {
                acUtils.remainTime($this, 60, null, '秒后重新发送', remainTimeKey0, cookieObj);
            } else if ($this.data('way') == 'Email') {
                acUtils.remainTime($this, 60, null, '秒后重新发送', remainTimeKey1, cookieObj);
            } else if ($this.data('way') == 'Mobile') {
                acUtils.remainTime($this, 60, null, '秒后重新发送', remainTimeKey2, cookieObj);
            } else {
                //
            }

            var mobile = mobilephone.val();
            var datastep = $(this).data("step") || "";
            var sendFor = 'UpdateMobilePhone';
            $.post("/userbind/sendsmsvalidatecode", { mobile: mobile, step: datastep, sendFor: sendFor }, function (res) {
                if (res != null) {
                    if (res.Code == 0) {
                        //$(this).attr("disabled", false);
                        alert(res.Message);
                    } else {
                        alert(res.Message);
                        //remainTime($(this));
                    }
                }
            });
        }
    });

    var page_message = $('#hid_message').val();
    //var page_code = $('hide_code').val();
    if (page_message && page_message.length > 0) {
        alert(page_message);
    }

    $('.my-f-r-sf-bindStyle').click();
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
                './ppd_updatePhone_files/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f);
})(window, document, 'script', 'dataLayer', 'GTM-PVQ5D8');</script>
<!-- End Google Tag Manager -->
    <script type="text/javascript">
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fcfc74b94210e27ea643566ddece504a7' type='text/javascript'%3E%3C/script%3E"));
    </script>
</body>
</html>
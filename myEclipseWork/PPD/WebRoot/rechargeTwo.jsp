<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <title>非即时充值 - 中国首家创新民间借贷网络平台，解决个人小额贷款、短期贷款问题。个人可以通过贷款获得比银行更高的投资收益</title>
    <meta name="description" content="拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值" />
    <meta name="keywords" content="网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资" />
    <link rel="stylesheet" type="text/css" href="./ppd_rechargeTwo_files/basic.css" />
    <link rel="stylesheet" type="text/css" href="./ppd_rechargeTwo_files/layout.css" />
    <link rel="stylesheet" type="text/css" href="./ppd_rechargeTwo_files/index.css" />
    <link rel="stylesheet" type="text/css" href="./ppd_rechargeTwo_files/account.css" />
    <link href="./ppd_rechargeTwo_files/validation-min.css" rel="stylesheet" />
    <script src="./ppd_rechargeTwo_files/jquery-1.js"></script>
    <script src="./ppd_rechargeTwo_files/jquery-migrate-1.js"></script>
    <script src="./ppd_rechargeTwo_files/jquery.kinMaxShow-1.0.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_rechargeTwo_files/init.js" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_rechargeTwo_files/servicestack-min.js"></script>
    <script src="./ppd_rechargeTwo_files/bootstrap.js"></script>
    <script src="./ppd_rechargeTwo_files/jquery.cookie.js"></script>
    <script src="./ppd_rechargeTwo_files/newRefer.js"></script>
    <link rel="shortcut icon" href="./ppd_rechargeTwo_files/favicon.ico" type="image/x-icon" />
    
</head>
<body><!--头部开始-->
    <div class="mainNav">
        <div class="mainNav_inner clearfix w1000center">
            <h1 class="logo">
                <a href="http://www.ppdai.com/"><img src="./ppd_rechargeTwo_files/logo.png" alt="" /></a>
            </h1>
            <ul id="tabIcon">
                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/lend"  category="Lend">我要投资</a>
                    <div class="subMenu">
                        <a href="http://www.ppdai.com/lend">我要投资</a>
                        <a href="http://www.ppdai.com/product/plan/rainbow">彩虹计划</a>
                        <a href="http://www.ppdai.com/debtdeal/AlldebtList/DebtList">债权交易</a>
                        <a href="http://www.ppdai.com/howtolend">如何投资</a>
                        <a href="http://www.ppdai.com/help/principalprotection">本金保障</a>
                    </div>
                </li>
                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/borrow"  category="Borrow">我要借款</a>
                    <div class="subMenu">
                        <a href="http://www.ppdai.com/borrow">我要借款</a>
                        <a href="http://www.ppdai.com/help/howtoborrow">如何借款</a>
                        <a href="http://www.ppdai.com/borrow/interestcalculate">利息计算器</a>
                    </div>
                </li>

                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/account" class='tabon' category="Account">我的账户</a>
                    <div class="subMenu">
                        <a href="http://www.ppdai.com/account/borrow">借款账户</a>
                        <a href="http://www.ppdai.com/account/lend">投资账户</a>
                    </div>
                </li>
                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/help/aboutus"  category="About">关于我们</a>
                    <div class="subMenu">
                        <a href="http://www.ppdai.com/help/aboutus">关于我们</a>
                        <a href="http://www.ppdai.com/help/howworks">工作原理</a>
                        <a href="http://www.ppdai.com/help/fees">资费说明</a>
                      	<a href="http://www.ppdai.com/job">招贤纳士</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>

    <!--头部结束-->
    


<div class="w100per maintop"></div>
<div class="my-frame">
    

<div>
    <ul class="breadcrumb" style="border: none !important;">
        <li><a href="http://www.ppdai.com/">首页</a> <span class="divider">&gt;</span></li>
            <li><a href="http://www.ppdai.com/account/lend">我的账户-我是投资者</a> <span class="divider">></span></li>
                    <li><a href="/order/offline">非即时充值</a></li>
    </ul>
</div>
<script>
    var breadcrumbCategory = "Account";
</script>

    

<div class="clearfix"></div>
<div class="my-f-left fl">
    <div class="my-f-l-nav">我的账户</div>
    <ul class="my-f-l-list">
            <li><a href="http://www.ppdai.com/account/lend">我的账户首页</a></li>

    </ul>
    <div class="my-f-l-nav">资金管理</div>
    <ul class="my-f-l-list">
        <li><a href="moneyRecord.jsp">资金记录</a></li>
            <li><a href="recharge.jsp" class="on">充值</a></li>

            <li><a href="withdrawCash.jsp">提现</a></li>
    </ul>
        <div class="my-f-l-nav">投资管理</div>
        <ul class="my-f-l-list">
            <li><a href="http://www.ppdai.com/paybackLendReceived">投资列表</a></li>
            <li><a href="http://www.ppdai.com/myproduct/ppb/1">彩虹计划</a></li>
            <li><a href="http://www.ppdai.com/myproduct/yxb/1">我的拍小宝</a></li>
            <li><a href="http://www.ppdai.com/debtdeal/Negotiable/Apply">债权交易</a></li>
            <li><a href="http://www.ppdai.com/autobid/addrule">自动投标</a></li>
        </ul>

    <div class="my-f-l-nav">账户设置</div>
    <ul class="my-f-l-list">
        <li><a href="http://ac.ppdai.com/safe/setting">账户安全</a></li>
        <li><a href="http://ac.ppdai.com/user/accountbind">关联账户</a></li>
    </ul>
    <div class="my-f-l-nav">市场推广</div>
    <ul class="my-f-l-list">
        <li><a href="http://www.ppdai.com/account/spread">有奖推广</a></li>
        <li><a href="http://www.ppdai.com/account/paimoney/market?menu">拍币兑换</a></li>
    </ul>
</div>

    <div class="clearfix">
        <div class="my-f-right fr">
            <div class="my-f-r-main mt0" style="border-bottom: solid 1px #e0e0e0;">
                <div class="my-f-r-ppb clearfix">
                    <div class="keeping fl"><a href="/order/online">即时充值</a></div>
                    <div class="outed on fl"><a href="/order/offline" style="color: #39a1ea;">非即时充值（免费）</a></div>
                </div>
                <div class="my-ac-pig" style="color: #39a1ea;">工作时间正确填写交易号/商务订单号，资金1小时内到账。</div>
                <div id="step1">
                    <div class="my-ac-non-step">
                        <label class="one fl">支付宝转账</label>
                        <label class="dayu fl"></label>
                        <label class="twogay fl">登记订单</label>
                        <label class="dayugay fl"></label>
                        <label class="threegay fl">提交成功</label>
                    </div>
                    <div class="my-ac-non-zfway">
                        <div class="my-ac-non-pc clearfix">
                            <label class="fs16 pr10 fl">用PC端支付：</label>
                            <div class="fl">
                                <div class="c666666 fs16">转账至 in@ppdai.com</div>
                                <div class="fs14 c39a1ea"><span style="cursor: pointer;" onclick="bindTranferAlipay();">【前往支付宝转账】</span></div>
                            </div>
                        </div>
                        <div class="mt40 clearfix ">
                            <label class="fs16  lh26 pr10 fl">用支付宝支付：</label>
                            <div class="fl">
                                <div class="c666666 lh26 fs12">扫描二维码支付</div>
                                <div>
                                    <img src="./ppd_rechargeTwo_files/zhifubao.jpg" alt="Alternate Text" width="112" height="111" />
                                </div>
                                <input type="button" id="btnStepOne" name="name" value="转账完，登记订单" class="my-blue-btn my-ac-non-nextstep mt46" style="cursor: pointer;" />
                            </div>
                        </div>
                        <div class="info_box">
                            <div class="info_close">

                            </div>
                            <p class="info_message">
                                完成转账后，记得回来填写订单号哦！否则可能造成充值失败！
                            </p>
                        </div>
                    </div>
                </div>
                <div id="step2" style="display: none;">
                    <div class="my-ac-non-step">
                        <label class="one fl">支付宝转账</label>
                        <label class="dayu fl"></label>
                        <label class="two fl">登记订单</label>
                        <label class="dayugay fl"></label>
                        <label class="threegay fl">提交成功</label>
                    </div>
<form action="recordController/addrecord" method="post">                        <div class="my-ac-non-zfway pl80">
                            <div class="my-ac-non-bsorder clearfix">
                                <label class="left lh100 fl">商户订单号：</label>
                                <div class="fl">
                                    <div class="my-ac-non-djo-tip">*重要！未填写可能导致无法正常到账</div>
                                    <div>
                                        <input class="my-ac-rc-jine my-ac-non-djo-ortxt" id="ExternalDepositNo" name="orderid" type="text" value="" />
                                    </div>
                                    
                                    <div class="fs12 lh30 clearfix" >
                                        <span class="fl">订单在哪儿？</span>
                                        <div class="fl swimg">
                                            <span class="dib c39a1ea"  style="cursor:pointer;position:relative; z-index:10000;">【手机端】</span>
                                            <img alt="" src='./ppd_rechargeTwo_files/a5873c77-a247-4c17-a4c0-a69f9368b3ba.jpg'  style="display:none;" class="my-ac-non-p1" width="200" height="345" />
                                        </div>
                                        <div class="fl swimg">
                                            <span class="dib c39a1ea" style="cursor:pointer;position:relative; z-index:10000;" >【网页版】</span>
                                            <img src='./ppd_rechargeTwo_files/715214ff-2d31-49ee-9ac2-edad1925a8f6.jpg'  style="display:none;" class="my-ac-non-p1" width='580' height='370' />
                                        </div>
                                        <span class="dib c39a1ea fl" onclick="bind()" style="cursor: pointer">【绑定支付宝】</span>
                                </div>
                                </div>
                            </div>
                            <div class="mt12 clearfix ">
                                <label class="left fl">填写充值金额：</label>
                                <div class="fl">
                                    <div class="clearfix">
                                        <input class="my-ac-rc-jine fl" data-val="true" data-val-number="字段 Amount 必须是一个数字。" id="Amount" name="deposit" type="text" value="" /><span class="my-ac-rc-yuan fl">元</span>

                                    </div>
                                    <input type="submit" name="name" value="提交，下一步" onclick="return CheckInput();" class="my-blue-btn my-ac-non-nextstep mt30" style="cursor: pointer;" />
                                    <div class="alert alert-error" style="font-size: 13px; color: red;">
                                    </div>
                                </div>
                            </div>
                        </div>
</form>                </div>
                <div id="step3" style="display: none;">
                    <div class="my-ac-non-step">
                        <label class="one fl">支付宝转账</label>
                        <label class="dayu fl"></label>
                        <label class="two fl">登记订单</label>
                        <label class="dayu fl"></label>
                        <label class="three fl">提交成功</label>
                    </div>
                    <div class="my-ac-non-zfway" style="padding-left: 0">
                        <p class="my-ac-non-suc">提交成功，查看填写记录</p>
                        <table class="nonresucesstab">
                            <tr>
                                <th>填写金额</th>
                                <th>商户订单号</th>
                                <th>提交时间</th>
                                <th>是否已经处理</th>
                            </tr>
                        </table>
                        <p class="txc">
                            <input type="button" id="btnStepThree" name="name" value="继续充值" class="my-blue-btn my-ac-non-nextstep mt30" style="cursor: pointer;" />
                        </p>
                    </div>
                </div>
            </div>
                <div id="submitOrderPanel" class="my-non-addframe" style="display: none;">
                    <p class="my-non-addP ">已提交的订单</p>
                    <table class="nonresucesstab">
                        <tr>
                            <th>填写金额</th>
                            <th>商户订单号</th>
                            <th>提交时间</th>
                            <th>是否已经处理</th>
                        </tr>
                    </table>
                </div>
            <div class="instant_recharge_three">
                <div>
                    常见问题：
                </div>
                <ul>
                    <li>1、什么是“非即时到账充值”？</li>
                    <li class="answer" style="color: gray">通过支付宝收款服务进行充值，资金1小时内可充入拍拍贷账户，到账后会短信提醒。
                        <br />
                        交易号或商户订单号（二选一任意填写）是您充值的唯一凭据，请务必正确填写。</li>
                        <li>2、哪些人享受非即时到账充值免费？</li>
                        <li>为了感谢和鼓励广大在拍拍贷理财的用户群体，我们针对借出者施行非即时到账充值免费策略。</li>
                </ul>
            </div>
        </div>
    </div>
</div>


<script src="./ppd_rechargeTwo_files/offline.js"></script>
<script>
    $(function () {
        $("#btnStepOne").live('click', function () {
            $("#step1").hide();
            $("#step2").show();
            $("#submitOrderPanel").hide();
        });

        $("#btnStepThree").live('click', function () {
            window.location = window.location;
        });
    })

    function submitThreeStep() {
        $("#step1").hide();
        $("#step2").hide();
        $("#step3").show();
        isShowUnload = false;
        $("#submitOrderPanel").hide();
    }

    function sumitTwoStep() {
        $("#step1").hide();
        $("#step2").show();
        $("#step3").hide();
        $("#submitOrderPanel").hide();
    }

</script>

    <div class="clear">
    </div>
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
    
    <script>
        $(".my-f-l-list li a.on").closest(".my-f-l-list").prev(".my-f-l-nav").addClass("my-f-l-nav-sd");
        $("#tabIcon a[category='" + breadcrumbCategory + "']").addClass("tabon");
    </script>
    <script src="http://ac.ppdai.com/status?v=2014" type="text/javascript"></script>
    <script type="text/javascript">
        var _gaq = _gaq || [];
        _gaq.push(['_setAccount', 'UA-3635664-1']);
        _gaq.push(['_setDomainName', 'ppdai.com']);
        _gaq.push(['_setAllowHash', false]);
        _gaq.push(["_addOrganic", "baidu", "word"]);
        _gaq.push(["_addOrganic", "soso", "w"]);
        _gaq.push(["_addOrganic", "soso", "key"]);
        _gaq.push(["_addOrganic", "sogou", "query"]);
        _gaq.push(["_addOrganic", "sogou", "keyword"]);
        _gaq.push(['_addOrganic', 'youdao', 'q']);
        _gaq.push(["_addOrganic", "so.com", "q"]);
        _gaq.push(["_addOrganic", "m.baidu.com", "word"]);
        _gaq.push(['_trackPageview']);
        (function () {
            var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
        })();
    </script>
    <script type="text/javascript">
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Faab1030ecb68cd7b5c613bd7a5127a40' type='text/javascript'%3E%3C/script%3E"));
    </script>
</body>
</html>

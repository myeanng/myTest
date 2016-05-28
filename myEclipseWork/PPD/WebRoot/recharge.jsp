<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
     <title>充值 - 拍拍贷-中国首家，最大、最多人使用的互联网金融P2P网络借贷平台。提供小额贷款,短期贷款,个人贷款,自定利率,借期灵活。您还可以成为借出人理财投资,超低门槛，获得高年收益率回报</title>
    <meta name="description" content="拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值" />
    <meta name="keywords" content="网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资" />
    <link rel="stylesheet" type="text/css" href="./ppd_recharge_files/basic.css" />
    <link rel="stylesheet" type="text/css" href="./ppd_recharge_files/layout.css" />
    <link rel="stylesheet" type="text/css" href="./ppd_recharge_files/index.css" />
    <link rel="stylesheet" type="text/css" href="./ppd_recharge_files/account_old.css" />
    <link href="./ppd_recharge_files/validation-min.css" rel="stylesheet" />
    <script src="./ppd_recharge_files/jquery-1.js"></script>
    <script src="./ppd_recharge_files/jquery-migrate-1.js"></script>
    <script src="./ppd_recharge_files/jquery.kinMaxShow-1.0.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_recharge_files/init.js" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_recharge_files/servicestack-min.js"></script>
    <script src="./ppd_recharge_files/bootstrap.js"></script>
    <script src="./ppd_recharge_files/jquery.cookie.js"></script>
    <script src="./ppd_recharge_files/newRefer.js"></script>
    <link rel="shortcut icon" href="./ppd_recharge_files/favicon.ico" type="image/x-icon" />
    
</head>
<body><!--头部开始-->
    <div class="mainNav">
        <div class="mainNav_inner clearfix w1000center">
            <h1 class="logo">
                <a href="http://www.ppdai.com/"><img src="./ppd_recharge_files/logo.png" alt="" /></a>
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
                    <a href="myAccount-laccount" class='tabon' category="Account">我的账户</a>
                    <div class="subMenu">
                        <a href="myAccount-baccount">借款账户</a>
                        <a href="myAccount-laccount">投资账户</a>
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
            <li><a href="myAccount-laccount">我的账户-我是投资者</a> <span class="divider">></span></li>
                    <li><a href="recharge.jsp">即时充值</a></li>
    </ul>
</div>
<script>
    var breadcrumbCategory = "Account";
</script>

    

<div class="clearfix"></div>
<div class="my-f-left fl">
    <div class="my-f-l-nav">我的账户</div>
    <ul class="my-f-l-list">
            <li><a href="myAccount-laccount">我的账户首页</a></li>

    </ul>
    <div class="my-f-l-nav">资金管理</div>
    <ul class="my-f-l-list">
        <li><a href="myAccount-moneyhistory?classType=99&dateType=3">资金记录</a></li>
            <li><a href="recharge.jsp" class="on">充值</a></li>

            <li><a href="withdrawCash.jsp">提现</a></li>
    </ul>
        <div class="my-f-l-nav">投资管理</div>
        <ul class="my-f-l-list">
            <li><a href="myAccount-investMessage?classType=99&dateType=3">投资列表</a></li>
            <li><a href="http://www.ppdai.com/autobid/addrule">自动投标</a></li>
        </ul>

    <div class="my-f-l-nav">账户设置</div>
    <ul class="my-f-l-list">
        <li><a href="myAccount-securityCenter">账户安全</a></li>
        <li><a href="myAccount-connectNumber">关联账户</a></li>
    </ul>
   
</div>

    <div class="clearfix">
        <div class="my-f-right fr">
            <div class="my-f-r-main mt0" style="border-bottom: solid 1px #e0e0e0;">
                <div class="my-f-r-ppb clearfix">
                    <div class="keeping on fl"><a href="recharge.jsp" style="color: #39a1ea;">即时充值</a></div>
                    <div class="outed fl"><a href="rechargeTwo.jsp">非即时充值（免费）</a></div>
                </div>
                
                <div class="my-ac-balance">可用余额：<span class="my-ac-balanceNum">&#165;<c:forEach items="${user.accounts}" var="account">${account.inmoney}</c:forEach> </span></div>
                <div class="my-ac-recharge" style="padding-top: 3px;">
                    <p style="line-height: 78px;">充值方式：<span class="c666666">支持多家银行借记卡充值；支持支付宝、财付通多种充值平台.</span></p>
                    <form action="myAccount-recharge" method="POST" id="aibankform">
                        <div class="card_nav">
                            <div class="card">
                                <table cellpadding="0" cellspacing="0">
                                    <tr>
                                            <td>
                                                <input name="SelectedBankId" type="radio" value="2" channel="2" class="balpay" />
                                            </td>
                                            <td>
                                                <span class="zhifu inititem" style="cursor: pointer;"></span>
                                            </td>
                                            <td>
                                                <input name="SelectedBankId" type="radio" value="3" channel="3" class="balpay" />
                                            </td>
                                            <td>
                                                <span class="t_caifu inititem" style="cursor: pointer;"></span>
                                            </td>

                                    </tr>
                                    <tr>
                                        <td colspan="4">
                                            <div class="my-ac-rc-other morebank">选择其他方式充值</div>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                            <div class="bank_nav" style="display: none;">
                                <div class="bank p1">
                                    <div class="title">支付平台</div>
                                    <div class="content">
                                        <table cellpadding="0" cellspacing="0">
                                            <tr>
                                                    <td>
                                                        <input name="SelectedBankId" type="radio" value="2" channel="2" style="margin-left: 0;" class="balpay"/>
                                                    </td>
                                                    <td>
                                                        <span class="zhifu item" style="cursor: pointer;"></span>
                                                    </td>
                                                    <td>
                                                        <input name="SelectedBankId" channel="3" type="radio" value="3" class="balpay"/>
                                                    </td>
                                                    <td>
                                                        <span class="t_caifu item" style="cursor: pointer;"></span>
                                                    </td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>
                                <div class="bank p2">
                                    <div class="title">网上银行</div>
                                    <div class="content">
                                        <ul class="instant_ok_banklist_nav">
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="5" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_gs.gif;" title="中国工商银行">
                                                            <img src="./ppd_recharge_files/bank_gs.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="9" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image:./ppd_recharge_files/bank_ny.gif;" title="中国农业银行">
                                                            <img src="./ppd_recharge_files/bank_ny.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="7" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_js.gif;" title="中国建设银行">
                                                            <img src="./ppd_recharge_files/bank_js.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="8" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_zg.gif;" title="中国银行">
                                                            <img src="./ppd_recharge_files/bank_zg.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="6" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image:./ppd_recharge_files/bank_zs.gif;" title="招商银行">
                                                            <img src="./ppd_recharge_files/bank_zs.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="10" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_jt.gif;" title="交通银行">
                                                            <img src="./ppd_recharge_files/bank_jt.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="11" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image:./ppd_recharge_files/bank_yzcx.gif;" title="中国邮政储蓄银行">
                                                            <img src="./ppd_recharge_files/bank_yzcx.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="12" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_gd.gif;" title="中国光大银行">
                                                            <img src="./ppd_recharge_files/bank_gd.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="13" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_pf.gif;" title="浦发银行">
                                                            <img src="./ppd_recharge_files/bank_pf.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="14" channel="2" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_gf.gif;" title="广发银行">
                                                            <img src="./ppd_recharge_files/bank_gf.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="15" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_ms.gif;" title="中国民生银行">
                                                            <img src="./ppd_recharge_files/bank_ms.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="16" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image:./ppd_recharge_files/bank_bj.gif;" title="北京银行">
                                                            <img src="./ppd_recharge_files/bank_bj.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="17" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_bjncsy.gif;" title="北京农村商业银行">
                                                            <img src="./ppd_recharge_files/bank_bjncsy.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="18" channel="2" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_fd.gif;" title="富滇银行">
                                                            <img src="./ppd_recharge_files/bank_fd.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="19" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_zx.gif;" title="中信银行">
                                                            <img src="./ppd_recharge_files/bank_zx.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="20" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_xy.gif;" title="兴业银行">
                                                            <img src="./ppd_recharge_files/bank_xy.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="21" channel="4" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_sh.gif;" title="上海银行">
                                                            <img src="./ppd_recharge_files/bank_sh.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="22" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_pa.gif;" title="平安银行">
                                                            <img src="./ppd_recharge_files/bank_pa.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="23" channel="6" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_nb.gif;" title="宁波银行">
                                                            <img src="./ppd_recharge_files/bank_nb.gif" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="25" channel="2" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_ccbbtb.png;" title="中国建设银行-企业">
                                                            <img src="./ppd_recharge_files/bank_ccbbtb.png" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="26" channel="2" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_abcbtb.png;" title="中国农业银行-企业">
                                                            <img src="./ppd_recharge_files/bank_abcbtb.png" /></span>
                                                    </label>
                                                </li>
                                                <li>
                                                    <input name="SelectedBankId" type="radio"  value="27" channel="2" />
                                                    <label>
                                                        <span class="icon icbc105 item" style="cursor: pointer;list-style-image: ./ppd_recharge_files/bank_pfbtb.png;" title="浦发银行-企业">
                                                            <img src="./ppd_recharge_files/bank_pfbtb.png" /></span>
                                                    </label>
                                                </li>

                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="mt15 clearfix ">
                            <label class="lh32 my-ac-rc-fel fl">充值金额：</label><input class="my-ac-rc-jine fl" name="money" id="Amount" type="text" autocomplete="off"
                                value="0" data-validation-engine="validate[required]" maxlength="8" /><span class="my-ac-rc-yuan fl">元</span>

                        </div>
                            <div class="mt12 lh32" style="display: none;">
                                <label style="display: none;"><span class="my-ac-rc-fel">实际到账：</span><span id="factAmount" style="height: 30px; line-height: 30px;">￥0.00</span></label>
                            </div>
                            <div class="mt12 lh32" style="display: none;">
                                <label><span class="my-ac-rc-fel">预估手续费：</span><span><span id="fee">￥0.00</span></span></label><a class="c39a1ea" href="javascript:void()" title="第三方支付收取充值费1%（财付通9折），拍拍贷提供给您的免费充值流量：&#165;0.00元。实际完成充值时，手续费优先使用免费流量，如果不足，则超出部分按正常收取。">【收费规则】</a>
                            </div>
                        <p>
                            <input type="submit" class="my-blue-btn mt30" style="display:inline-block;width: 250px; height: 50px; line-height: 50px; text-align: center;margin-left:100px; cursor:pointer;" value="免费充值" id="btnOk">
                            <span class="error" style="color: red; padding-top: 21px; padding-left: 10px;">
<label for="">*投资者前三次即时到账充值免费*</label>                                                            </span>
                        </p>
                        <input type="hidden" id="hidUserId" value="5105760"  />
                        <input id="Redirect" name="Redirect" type="hidden" value="" />
                    </form>
                    
                </div>
            </div>
            <div class="instant_recharge_three">
                <div>
                    温馨说明：
                </div>
                <ul>
                    <li>1、充值资金可用于进行多项认证、投标、还款等。</li>
                    <li>2、所有资金将由第三方平台 支付宝、财付通、银行等托管，拍拍贷本身不存放用户的投标保证金。</li>
                    <li>3、省手续费，推荐使用“<a href="rechargeTwo.jsp" target="_blank" class="c39a1ea">非即时到账充值</a>”，最高10元/笔，<a href="http://www.ppdai.com/info/vip" target="_blank">VIP</a>单笔充值1千（含）元以上，免手续费。</li>
                    <li>4、手续费减免：有免费流量时会根据免费流量减免手续费；交易时以实际完成交易的时间为准，先完成的交易会优先使用掉免费流量。</li>
                    <li>5、借出者推荐使用“<a href="rechargeTwo.jsp" target="_blank" class="c39a1ea">非即时到账充值</a>”，充值免费。</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    var inpourAmountMax = 10000000
</script>
<script>
    var freeAmout = 0.0000
</script>
<script src="./ppd_recharge_files/order.js"></script>

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

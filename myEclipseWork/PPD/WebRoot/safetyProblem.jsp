<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <title>设置安全问题</title>
<meta name="description" content="拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值" />
<meta name="keywords" content="网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资" />
<link href="./ppd_safetyProblem_files/basic.css" rel="stylesheet" type="text/css" />
<link href="./ppd_safetyProblem_files/layout.css" rel="stylesheet" type="text/css" />


<link href="./ppd_safetyProblem_files/account.css" rel="stylesheet" type="text/css" />
<link href="./ppd_safetyProblem_files/bindAccount.css" rel="stylesheet" type="text/css" />


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
                    <img src="./ppd_safetyProblem_files/logo.png" alt="ppdai logo" />
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
    



<div class="main" style="padding-top: 10px;margin-bottom: 20px;">
    <div class="my-frame">
        


<div>
    <ul class="breadcrumb" style="border: none !important;">
                    <li><a href="/">首页</a> <span class="divider">></span></li>
                            <li><a href="myAccount-baccount">我的账户-我是借入者</a> <span class="divider">></span></li>
                        <li class="active">设置安全问题</li>

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
                    <div class="my-f-r-sf-title c666">设置安全问题</div>
                        <div class="my-fr-sf-saftyQuestion">
                            <p>安全问题是基础安全工具，可作为二次验证的备选方案，建议<span>认真填写</span>。</p>
                            <table>
                                <tr>
                                    <th>问题一：</th>
                                    <td>
                                        <select id="QuestionId1" name="QuestionId1" onchange="change(0);" >
                                            <option name="nullqustion" value="0">请选择问题</option>
                                            <c:forEach items="${questions}" var="q">
                                            	<option value="${q.questionid}">${q.question}</option>
                                            </c:forEach>    
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <th>回答：</th>
                                    <td><input type="text" id="Answer1" name="Answer1" /></td>
                                </tr>
                                <tr>
                                    <th>问题二：</th>
                                    <td>
                                        <select id="QuestionId2" name="QuestionId2" onchange="change(1);">
                                            <option name="nullqustion" value="0">请选择问题</option>
                                                <c:forEach items="${questions}" var="q">
                                            	<option value="${q.questionid}">${q.question}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <th>回答：</th>
                                    <td><input type="text" id="Answer2" name="Answer2" /></td>
                                </tr>
                                <tr>
                                    <th>问题三：</th>
                                    <td>
                                        <select id="QuestionId3" name="QuestionId3" onchange="change(2);">
                                            <option name="nullqustion" value="0">请选择问题</option>
                                                <c:forEach items="${questions}" var="q">
                                            	<option value="${q.questionid}">${q.question}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <th>回答：</th>
                                    <td><input type="text" id="Answer3" name="Answer3" /></td>
                                </tr>
                            </table>
                            <div class="subBtn clearfix">
                                <input type="button" class="sub" id="setquestion" value="提交" />
                                <input type="button" class="cancel" id="cancel" value="取消" />
                            </div>
                        </div>
                </div>
                <p class="formExplain oneRowFormExplain">
                    温馨提示：1.请设置容易记忆的安全问题，并定期重新设置，避免遗忘。2.请不要向外人透露您的安全问题答案。
                </p>
            </div>
        </div>
    </div>
</div>
<input type="hidden" id="hid_type" />
<script type="text/javascript">
    var questionlist = ["您父亲的出生地是哪里?","您出生的医院是哪间?","您成长的街道叫什么路?","您就读的第一所学校名称是?","您的初恋情人叫什么名字?","您就职的第一间公司叫什么名称?","您的双亲姓名叫什么?","您母亲的生日是哪一天?","您父亲的生日是哪一天?","您的父亲的姓名是？","您的母亲的姓名是？","您的配偶的姓名是？","您最后就读的学校名是？"];
</script>



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

    <script src="./ppd_safetyProblem_files/jquery.js" type="text/javascript" charset="utf-8"></script>
    <script src="http://ac.ppdai.com/status?v=2014" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_safetyProblem_files/init.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $(function () {
            $(".my-f-l-list li a.on").closest(".my-f-l-list").prev(".my-f-l-nav").addClass("my-f-l-nav-sd");
        });
    </script>
    
<script type="text/javascript">
    $(document).ready(function () {
        if ($("#QuestionId1").length>0){
            change();
        }

        $("#setquestion").click(function () {
            var answer1 = $("#Answer1").val();
            var answer2 = $("#Answer2").val();
            var answer3 = $("#Answer3").val();
            var questionId1 = $("#QuestionId1 option:selected").attr('title');
            var questionId2 = $("#QuestionId2 option:selected").attr('title');
            var questionId3 = $("#QuestionId3 option:selected").attr('title');
            if (answer1.length == 0 || answer2.length == 0 || answer3.length == 0) {
                alert("请输入答案");
                return;
            }
            if (answer1 == answer2 || answer1 == answer3 || answer2 == answer3) {
                alert("答案不能相同");
                return;
            }
            if (questionId1==0 || questionId2==0 || questionId3==0) {
                alert("请选择问题类型");
                return;
            }

            var data = {
                QuestionId1: questionId1,
                Answer1: answer1,
                QuestionId2: questionId2,
                Answer2: answer2,
                QuestionId3: questionId3,
                Answer3: answer3,
                Type: $('#hid_type').val()
            };
            $.post("/userbind/setsafequestion", data, function(res){
                alert(res.Message);
                if(res.Code == 1){
                    location.href = "/userbind/setsafequestion";
                } else {
                    //alert(res.Message);
                }
            });
        });

        $("#cancel").click(function () {
            location.href = '/userbind/setsafequestion';
        });
    });

    //选项内容：['问题1', '问题2', '问题3', '问题4', '问题5', '问题6'];
    var questions = questionlist;
    //当前被选中的值：
    var currentValue = new Array();

    var selectobj = ['QuestionId1', 'QuestionId2', 'QuestionId3'];

    function selid(id) {
        return document.getElementById(id);
    }
    function init() {
        for (var j = 0; j < selectobj.length; j++) {
            //清除原先选项：
            selid(selectobj[j]).options.length = 0;
            //添加选项：
            var oOption = document.createElement("option");
            var text = "--请选择--";
            var value = "";
            oOption.text = text;
            oOption.value = value;
            selid(selectobj[j]).add(oOption);

            for (var i = 0; i < questions.length; i++) {
                var oOption = document.createElement("option");
                oOption.text = questions[i];
                oOption.value = questions[i];

                selid(selectobj[j]).add(oOption);
            }
        }
    }
    function collectVlue() {
        var currentobj = null;
        for (var j = 0; j < selectobj.length; j++) {
            currentobj = selid(selectobj[j]);
            if(currentobj){
                currentValue[j] = currentobj.value;
            }
        }
    }
    function change(i) {
        if (i != 10000) {
            collectVlue();
        }
        for (var j = 0; j < selectobj.length; j++) {
            //清除原先选项：
            selid(selectobj[j]).options.length = 0;
            //添加选项：
            var oOption = document.createElement("option");
            var text = "--请选择--"
            var value = "";
            oOption.text = text;
            oOption.value = value;
            selid(selectobj[j]).add(oOption);

            for (var i = 0; i < questions.length; i++) {

                var available = true; //选项是否被占用
                for (var k = 0; k < currentValue.length; k++) {
                    if (questions[i] == currentValue[k] && j != k) {
                        available = false;
                        break;
                    }
                }
                if (available) {
                    var oOption = document.createElement("option");
                    oOption.text = questions[i];
                    oOption.value = questions[i];
                    oOption.title = i + 1;
                    selid(selectobj[j]).add(oOption);
                }
            }
            //选中项：
            //$(selectobj[j]).value=currentValue[j];
            setSelect(selectobj[j], currentValue[j]);
        }
    }
    //使select选中特定值：
    function setSelect(id, value) {
        for (var i = 0; i < selid(id).options.length; i++) {
            if (selid(id).options[i].value == value) {
                selid(id).selectedIndex = i;
                break;
            }
        }
    }
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
                './ppd_safetyProblem_files/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f);
})(window, document, 'script', 'dataLayer', 'GTM-PVQ5D8');</script>
<!-- End Google Tag Manager -->
    <script type="text/javascript">
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fcfc74b94210e27ea643566ddece504a7' type='text/javascript'%3E%3C/script%3E"));
    </script>
</body>
</html>
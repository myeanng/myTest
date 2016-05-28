<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<title>工薪族资料信息</title>
    <meta name="description" content="拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值" />
    <meta name="keywords" content="网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资" />
    <link rel="stylesheet" type="text/css" href="./ppd_basicMes_files/basic.css" />
    <link rel="stylesheet" type="text/css" href="./ppd_basicMes_files/layout.css" />
    <link href="./ppd_basicMes_files/validation-min.css" rel="stylesheet" />
    <link rel="shortcut icon" href="./ppd_basicMes_files/favicon.ico" type="image/x-icon" />
    <script src="./ppd_basicMes_files/js/newRefer.js?v=0807"></script>
    <script type="text/javascript">
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Faab1030ecb68cd7b5c613bd7a5127a40' type='text/javascript'%3E%3C/script%3E"));
    </script>
    
    <link rel="stylesheet" href="./ppd_basicMes_files/account.css" />
    <link rel="stylesheet" type="text/css" href="./ppd_basicMes_files/bindAccount.css" />
    <link href="./ppd_basicMes_files/validation-min.css" rel="stylesheet" />

<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="js/chinaprovinces_0.2.1.js"></script>
</head>
<body><br><div class="mainNav">
        <div class="mainNav_inner w1000center clearfix">
            <h1 class="logo">
                <a href="/">
                    <img src="./ppd_basicMes_files/logo.png" alt="" /></a>
            </h1>
            <ul id="tabIcon">
                <li class="hasSubMenu">
                    <a href="/lend" category="Lend">我要投资</a>
                    <div class="subMenu">
                        <a href="/lend">我要投资</a>
                        <a href="http://www.ppdai.com/product/plan/rainbow">彩虹计划</a>
                        <a href="http://www.ppdai.com/debtdeal/AlldebtList/DebtList">债权交易</a>
                        <a href="/howtolend">如何投资</a>
                        <a href="/help/principalprotection">本金保障</a>
                    </div>
                </li>
                <li class="hasSubMenu">
                    <a href="/borrow" category="Borrow">我要借款</a>
                    <div class="subMenu">
                        <a href="/borrow">我要借款</a>
                        <a href="/help/howtoborrow">如何借款</a>
                        <a href="/borrow/interestcalculate">利息计算器</a>
                    </div>
                </li>
                <li class="hasSubMenu"><a href="myAccount-baccount" category="Account">我的账户</a>
                    <div class="subMenu">
                        <a href="myAccount-baccount">借款账户</a>
                        <a href="myAccount-laccount">投资账户</a>
                    </div>
                </li>
                <li class="hasSubMenu"><a href="/help/aboutus" category="About">关于拍拍贷</a>
                    <div class="subMenu">
                        <a href="/help/aboutus">关于我们</a>
                        <a href="/help/howworks">工作原理</a>
                        <a href="/help/fees">资费说明</a>
                            <a href="/job">招贤纳士</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
    
<!-- 顶部占位符-->



<style type="text/css">
    .formItem li div {
        height: auto;
    }
</style>
<div class="main" style="padding-top: 10px; margin-bottom: 20px;">
    <div class="my-frame">
       <div>
            <ul style="border: none !important;" class="breadcrumb">
                <li><a href="http://www.ppdai.com">首页</a> <span class="divider">&gt;</span></li>
                <li><a href="myAccount-myloan">我的账户</a> <span class="divider">&gt;</span></li>
                <li><a href="myAccount-myloan">借款管理</a> <span class="divider">&gt;</span></li>
                <li class="active">编辑个人资料<li>
            </ul>
        </div>
        <div class="clearfix">
            
<div class="wrapleftnav fl" style="width: 200px">
    <div class="my-f-left fl">
        <div class="my-f-l-nav">我的账户</div>
        <ul class="my-f-l-list">
                <li><a href="myAccount-baccount" >我的账户首页</a></li>

        </ul>
        <div class="my-f-l-nav">资金管理</div>
        <ul class="my-f-l-list">
            <li><a href="myAccount-moneyhistory?classType=99&dateType=3" >资金记录</a></li>
            <li><a href="recharge.jsp" >充值</a></li>
            <li><a href="withdrawCash.jsp" >提现</a></li>
        </ul>
            <div class="my-f-l-nav">借款管理</div>
            <ul class="my-f-l-list">
                <li><a href=myAccount-myloan >我的借款</a></li>
                <li><a href="myAccount-securityCenter" >信息认证</a></li>
                <li><a href="myAccount-basicMes" class=on>基本资料</a></li>
                <li><a href="myAccount-upLoadMes" >上传资料</a></li>
            </ul>

        <div class="my-f-l-nav">账户设置</div>
        <ul class="my-f-l-list">
            <li><a href="myAccount-securityCenter" >安全中心</a></li>
            <li><a href="myAccount-connectNumber" >关联账户</a></li>
        </ul>

    </div>

    </div>

            <!--右边-->

            <div class="my-f-right fr">
                <div class="my-f-r-safty">
                    <input type="hidden" value="" id="beforePath"/>
                    <div class="my-f-r-sf-title c666">编辑个人资料</div>
                    <div class="my-f-r-sf-degree mt5 bgfafafa">亲爱的用户，为节约您的宝贵时间，请认真准确填以下信息，否则评估会不准确，对您借款会有影响。</span></div>
                    <div class="p10">
                        <div class="my-f-r-sf-bindStyle">我的基本信息<a href="javascript:;">点击修改</a></div>
                    </div>
                    <div class="my-f-r-wrapForm" style="display: block;">
                        <form id="essential_information" action="userController/updateUser" method="post">
                            <ul class="formItem pl188 pt36">
                              
                                <li class="clearfix">
                                    <label class="w80">真实姓名：</label><input class="w246 bd" name="RealName" id="RealName" disabled="True"  value="${userinfo.realname}" <% %>  type="text" data-validation-engine="validate[required,custom[realname],maxSize[30],minSize[2]]"/><em>*</em><div class="formErrorMsg"></div>
                                </li>
                                <li class="clearfix">
                                    <label class="w80">手机号码：</label><input type="text" name="MobilePhone" id="MobilePhone" disabled="True" value="${user.tel}" data-validation-engine="validate[required,custom[mobile]]"  class="w246 bd" /><em>*</em><div class="formErrorMsg"></div>
                                </li>
                                <li class="clearfix">
                                    <label class="w80">邮箱地址：</label><input type="text" name="qq" id="QQ" value="${user.email}" data-validation-engine="validate[required,custom[onlyNumberSp],,maxSize[11],minSize[4]]" class="w246 bd" /><em>*</em><div class="formErrorMsg"></div>
                                </li>
                                <li class="clearfix">
                                    <label class="w80">教育程度：</label>
                                    <select id="EducationId" name="education">
                                 
									<c:forEach var="data" items="${listDataDictionary}">
									
									
									<c:if test="${data.numberid==10001}">
									
									<option value="${data.ddcontent}"   <c:if test="${user.education==data.ddcontent}">selected="selected"</c:if>>${data.ddcontent}</option>
									</c:if>
									</c:forEach>
									
									</select>

                                    <span style="color: #999;">*</span>
                                </li>
                                <li class="clearfix">
                                    <label class="w80">身份证号：</label><input type="text"  name="IdNumber" disabled="True" id="IdNumber" value="${userinfo.ic}" data-validation-engine="validate[required,custom[card]]" class="w246 bd"  /><em>*</em><div class="formErrorMsg"></div>
                                </li>

                            </ul>
                            <div class="my-f-r-submit pl268 pb30 pt11">
                                <input id="a_basic" type="submit" value="确定基本资料" class="btn btn-info font_yahei bangding_btn submitBtn" />
                            </div>


                        </form>
                    </div>
                    <div class="p10">
                        <div class="my-f-r-sf-bindStyle"><a href="javascript:;">点击修改</a>我的家庭情况</div>
                    </div>
                    <div class="my-f-r-wrapForm mb5">
                        <form id="my_family"  action="userController/updateUser" method="post">
                            <ul class="formItem pl188 pt36">
                                <li class="clearfix">
                                    <label class="w80">婚姻状况：</label>
                                    <select id="MarriageStatusId" name="marital">
                                    <c:forEach var="data" items="${listDataDictionary}" >
									<c:if test="${data.numberid==10000}">
									<option value="${data.ddcontent}" <c:if test="${user.marital==data.ddcontent}">selected="selected"</c:if>>${data.ddcontent}</option>
									</c:if>
									</c:forEach>
									
									</select><span>*</span><div class="formErrorMsg"></div>
                                </li>
                              
                                <li class="clearfix">
                                    <label class="w80">住宅地址：</label>
                                    <span id="addressx"></span>
									<script>
										$("#addressx").chinaprovinces({valueType:'name',change:function(province,city,area){
											$("#address").val(province+city+area);
						
										}});
									</script> </li>  
                            <li class="clearfix">
                                 <label class="w80">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input name="address"  readonly="readonly" id="address" type="text" maxlength="40" class="txt01 ml75" value="${userinfo.address}" /></li>
                              
                                <li class="clearfix">
                                    <label class="w80">住宅电话：</label><input type="text" class="w246 bd" name="tell" id="ResidencePhone" value="${userinfo.homephone}" data-validation-engine="validate[required,custom[phone],maxSize[13]]"/><em>*(例 021-51870819、13813888888)</em><div class="formErrorMsg"></div>
                                </li>
                               
                                <li class="clearfix cailizhm" style="position: relative">
                                    <label class="w80">财力证明：</label>

                                    <input style="float: none;height: auto;margin: 6px 5px 0 10px;" type="checkbox" value="我有存款 " <c:forEach  var="fin" items="${financial}"><c:if test="${fin=='我有存款 '}">checked=checked</c:if></c:forEach> name="financial" >我有存款 
                                    <input style="float: none;height: auto;margin: 6px 5px 0 10px;" type="checkbox" value="我有房" <c:forEach  var="fin" items="${financial}"><c:if test="${fin=='我有房'}">checked=checked</c:if></c:forEach>  name="financial" >我有房
                                    <input style="float: none;height: auto;margin: 6px 5px 0 10px;" type="checkbox" value="我有车" <c:forEach  var="fin" items="${financial}"><c:if test="${fin=='我有车'}">checked=checked</c:if></c:forEach> name="financial" >我有车
                                    <input style="float: none;height: auto;margin: 6px 5px 0 10px;" type="checkbox" value="其他" <c:forEach  var="fin" items="${financial}"><c:if test="${fin=='其他'}">checked=checked</c:if></c:forEach> name="financial" >其他
                                    <input style="float: none;height: auto;margin: 6px 5px 0 10px;" type="checkbox" value="无" <c:forEach  var="fin" items="${financial}"><c:if test="${fin=='无'}">checked=checked</c:if></c:forEach> name="financial" ><span>无</span>
                                    <div id="calizhengmingcheck" class="formError" style="display: none; opacity: 0.87; position: absolute; top: -30px; left: 430px;">
                                        <div class="formErrorContent" style="min-width: 0; width: 107px;">
                                            * 请选择财力证明<br>
                                        </div>
                                        <div class="formErrorArrow">
                                            <div class="line10">
                                                <!-- -->
                                            </div>
                                            <div class="line9">
                                                <!-- -->
                                            </div>
                                            <div class="line8">
                                                <!-- -->
                                            </div>
                                            <div class="line7">
                                                <!-- -->
                                            </div>
                                            <div class="line6">
                                                <!-- -->
                                            </div>
                                            <div class="line5">
                                                <!-- -->
                                            </div>
                                            <div class="line4">
                                                <!-- -->
                                            </div>
                                            <div class="line3">
                                                <!-- -->
                                            </div>
                                            <div class="line2">
                                                <!-- -->
                                            </div>
                                            <div class="line1">
                                                <!-- -->
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                            <div class="my-f-r-submit pl268 pb30 pt11">
                                <input id="a_family" type="submit" value="确定家庭情况" class="submitBtn" />
                            </div>
                        </form>
                    </div>













                        <div class="p10">
                            <div class="my-f-r-sf-bindStyle"><a href="javascript:;">点击修改</a>我的单位情况</div>
                        </div>
                        
                        
                         <c:if test="${user.employment=='其它 '}">
                        <div class="my-f-r-wrapForm mb5"> 
                           <form id="my_unit"  action="userController/updateUser" method="post">
                                 
                                <ul  class="formItem pl188 pt36">
                                <li class="clearfix">
                                        <label class="w80">就业状态：</label>
                                        <input type="text" value="其它" disabled="disabled" class="w246 bd" /><em>*如果您需要更换身份，请联系<a href="http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf">在线客服</a></em>
                                        <div class="formErrorMsg"></div>
                                    </li>
                                    <li class="clearfix"> <label class="w80">还款来源：</label><input name="repayment" maxlength="40" type="text" value="${user.repayment}" class="w246 bd" /></li>
                                </ul>
                                 <div class="my-f-r-submit pl268 pb30 pt11">
                                    <input type="submit" id="a_wageearner" value="确认其它情况" class="submitBtn" />
                                </div>
                                </form>
                            </div>
                            </c:if>
                        
                        
                        
                         <c:if test="${user.employment=='学生'}">
                        <div class="my-f-r-wrapForm mb5"> 
                           <form id="my_unit"  action="userController/updateUser" method="post">
                               
                                <ul  class="formItem pl188 pt36">
                                <li class="clearfix">
                                        <label class="w80">就业状态：</label>
                                        <input type="text" value="学生" disabled="disabled" class="w246 bd" /><em>*如果您需要更换身份，请联系<a href="http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf">在线客服</a></em>
                                        <div class="formErrorMsg"></div>
                                    </li>
                                    <li class="clearfix"><label class="w80">学校名称：</label><input name="schoolname" maxlength="40" type="text" value="${user.schoolname}" class="w246 bd" /></li>
                                    <li class="clearfix"><label class="w80">宿舍电话：</label><input name="telephones" type="text" value="${user.telephones}" class="w246 bd" /></li>
                                    <li class="clearfix"><label class="w80">还款来源：</label><input name="repayment" maxlength="40" type="text" value="${user.repayment}" class="w246 bd" /></li>
                                </ul>
                                  <div class="my-f-r-submit pl268 pb30 pt11">
                                    <input type="submit" id="a_wageearner" value="确认学生情况" class="submitBtn" />
                                </div>
                                </form>
                            </div>
                        </c:if>
                        
                        
                        
                        
                        
                           <c:if test="${user.employment=='网店卖家'}">
                        <div class="my-f-r-wrapForm mb5"> 
                           <form id="my_unit"  action="userController/updateUser" method="post">
                              
                                <ul class="formItem pl188 pt36">
                                <!-- 经营网店 -->
                                <li class="clearfix">
                                        <label class="w80">就业状态：</label>
                                        <input type="text" value="网店卖家" disabled="disabled" class="w246 bd" /><em>*如果您需要更换身份，请联系<a href="http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf">在线客服</a></em>
                                        <div class="formErrorMsg"></div>
                                    </li>
                                    <li class="clearfix">
                                     <c:forEach items="${listDataDictionary}" var="data">
                                      <c:if test="${data.ddid == 10044}">
                                            <label class="w80">${data.ddcontent}：</label>
                                       </c:if>
                                    </c:forEach>
                                   
                                        <select class="selct txt02" id="WebShopTypeId" name="onlineshop">
                                          <c:forEach items="${listDataDictionary}" var="data">
                                            <c:if test="${data.numberid == 10008}">
                                              <c:if test="${data.ddid !=10044}">
                                                <option value="${data.ddcontent}" <c:if test="${user.onlineshop==data.ddcontent}">selected="selected"</c:if>>${data.ddcontent}</option>
                                              </c:if>
                                            </c:if>
                                          </c:forEach>
</select>
                                    </li>
                                    <li class="clearfix"> <label class="w80">卖家昵称：</label><input name="nick" type="text" maxlength="40" class="w246 bd"  value="${user.nick}"/></li>
                                    <li class="clearfix"> <label class="w80">店铺地址：</label><input name="onlineaddress" type="text" maxlength="100"  class="w246 bd" value="${user.onlineaddress}" /></li>
                                    <li class="clearfix"> <label class="w80">月营业额：</label><input name="averagemoney" maxlength="6" type="text"  class="w246 bd" value="${user.averagemoney}" /></li>
                                    <li class="clearfix"> <label class="w80">经营地址：</label>
                                             <span id="operaaddressx"></span>
									<script>
										$("#operaaddressx").chinaprovinces({valueType:'name',change:function(province,city,area){
											$("#operaaddress").val(province+city+area);
						
										}});
									</script> </li>  
                            <li class="clearfix">
                                 <label class="w80">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input name="operaaddress"  readonly="readonly" id="operaaddress" type="text" maxlength="40" class="w246 bd" value="${user.operaaddress}" /></li>
                              
                                </ul>
                                 <div class="my-f-r-submit pl268 pb30 pt11">
                                    <input type="submit" id="a_wageearner" value="确认网店情况" class="submitBtn" />
                                </div>
                                </form>
                                
                            </div>
                            </c:if>
                        
                        
                        
                        
                        
                        
                        
                         <c:if test="${user.employment=='私营业主'}">
                        <div class="my-f-r-wrapForm mb5"> 
                           <form id="my_unit"  action="userController/updateUser" method="post">
                                <ul class="formItem pl188 pt36">
                                      <li class="clearfix">
                                        <label class="w80">就业状态：</label>
                                        <input type="text" value="私营业主" disabled="disabled" class="w246 bd" /><em>*如果您需要更换身份，请联系<a href="http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf">在线客服</a></em>
                                        <div class="formErrorMsg"></div>
                                    </li>
                                    <li class="clearfix"><label class="w80">公司名称：</label><input name="companyname" maxlength="20" type="text"  class="w246 bd" value="${user.companyname}" /></li>
                                    
                                    <li class="clearfix">
                                  <!-- 公司人数 -->
                                  <c:forEach items="${listDataDictionary}" var="data">
                                    <c:if test="${data.ddid == 10035}">
                                      <label class="w80">${data.ddcontent}：</label>
                                    </c:if>
                                  </c:forEach>
                                      
                                    
 
                                        <select class="selct txt02" id="CompanySizeId" name="companynum">
												<c:forEach items="${listDataDictionary}" var="data">
												<c:if test="${data.numberid == 10006}">
												<c:if test="${data.ddid != 10035}">
												
												<option value="${data.ddcontent}"  <c:if test="${user.companynum==data.ddcontent}">selected="selected"</c:if>>${data.ddcontent}</option>
												</c:if>
												</c:if>
												
												</c:forEach>
												</select>
                                    </li>
                                 <li class="clearfix"><label class="w80">经营地址：</label>
                                         <span id="BusinessaAddressx"></span>
				<script>
					$("#BusinessaAddressx").chinaprovinces({valueType:'name',change:function(province,city,area){
						$("#BusinessaAddress").val(province+city+area);
						
					}});
				</script>
                                    <li class="clearfix">
                                       <label class="w80"></label> <input id="BusinessaAddress" name="businessaaddress" value="${user.businessaaddress}" type="text" maxlength="40"  class="w246 bd"></li>
                                    <li class="clearfix"><label class="w80">公司电话：</label><input name="companytell" type="text" value="${user.companytell}" class="w246 bd" /></li>
                                    <li class="clearfix">
                                    <!-- 营业执照 -->
                                    <c:forEach items="${listDataDictionary}" var="data">
                                      <c:if test="${data.ddid == 10041}">
                                         <label class="w80">${data.ddcontent}：</label>
                                      </c:if>
                                    </c:forEach>
                                    <c:forEach items="${listDataDictionary}" var="data">
                                       <c:if test="${data.numberid == 10007}">
                                         <c:if test="${data.ddid !=10041}">
                                           <em> <input  name="businlicen"  type="radio" value="${data.ddcontent}"  <c:if test="${user.businlicen==data.ddcontent}">checked="checked"</c:if> />${data.ddcontent}</em>
                                         </c:if>
                                       </c:if>
                                    </c:forEach>
                                    
                                </ul>
                                <div class="my-f-r-submit pl268 pb30 pt11">
                                    <input type="submit" id="a_wageearner" value="确认公司情况" class="submitBtn" />
                                </div>
                                </form>
                            </div>
                            </c:if>
                            
                            
                        
                        <c:if test="${user.employment=='工薪族'}">
                        <div class="my-f-r-wrapForm mb5">
                            <form id="my_unit"  action="userController/updateUser" method="post">
                                <ul class="formItem pl188 pt36">
                                    <li class="clearfix">
                                        <label class="w80">就业状态：</label>
                                        <input type="text" value="工薪族" disabled="disabled" class="w246 bd" /><em>*如果您需要更换身份，请联系<a href="http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf">在线客服</a></em>
                                        <div class="formErrorMsg"></div>
                                    </li>
                                   
                                    <li class="clearfix">
                                        <label class="w80" style="width: 163px;">是否缴纳社保/公积金：</label>
                                        <em><input id="HasSbOrGjj" name="socialse" type="radio"   <c:if test="${user.socialse=='是'}">  checked="checked" </c:if> value="是" />是</em>
                                        <em style="margin-left: 30px;"><input id="HasSbOrGjj" name="socialse" type="radio" <c:if test="${user.socialse=='否'}">  checked="checked" </c:if> value="否" />否</em>
                                        <div class="formErrorMsg"></div>
                                    </li>
                                   

                                    <li class="clearfix">
                                        <label class="w80">工作年限：</label>
                                        <select class="w248" id="workYears" name="workexper">
                                            <option value="">请选择</option>
												<c:forEach var="data" items="${listDataDictionary}">
												<c:if test="${data.numberid==10005}">
												<option value="${data.ddcontent}" <c:if test="${user.workexper==data.ddcontent}">selected="selected"</c:if>>${data.ddcontent}</option>
												</c:if>
												</c:forEach>
												</select>
                                        <span style="color: #999;">*</span>

                                        <div class="formErrorMsg"></div>
                                    </li>

                                    <li class="clearfix">
                                        <label class="w80">单位名称：</label>
                                        <input type="text" class="w246 bd"  name="unitname" id="companyName" value="${user.unitname}"  data-validation-engine="validate[required,minSize[2],maxSize[20]]"/><em>*</em>

                                        <div class="formErrorMsg"></div>
                                    </li>
                                    <li class="clearfix">
                                        <label class="w80">任职部门：</label>
                                        <input type="text" class="w246 bd" name="department" id="department" value="${user.department}" data-validation-engine="validate[required,minSize[2],maxSize[20]]"/><em>*</em>

                                        <div class="formErrorMsg"></div>
                                    </li>
                                    <li class="clearfix">
                                        <label class="w80">任职职位：</label>
                                        <input type="text" class="w246 bd" name="position" id="position" value="${user.position}" data-validation-engine="validate[required,minSize[2],maxSize[20]]"/><em>*</em>

                                        <div class="formErrorMsg"></div>
                                    </li>
                                    <li class="clearfix">
                                        <label class="w80">单位地址：</label>
             <span id="unitaddressx"></span>
				<script>
					$("#unitaddressx").chinaprovinces({valueType:'name',change:function(province,city,area){
						$("#unitaddress").val(province+city+area);
					
					}});
				</script>
                                    <li class="clearfix">
                
                                 <label class="w80">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input name="unitaddress" readonly="readonly" id="unitaddress" type="text" maxlength="40" class="txt01 ml75" value="${user.unitaddress}" /></li>
                              
                                 
                                       
                                    <li class="clearfix">
                                        <label class="w80">单位电话：</label>
                                        <input type="text" class="w246 bd"  name="unittell" id="companyPhone" value="${user.unittell}" data-validation-engine="validate[required,custom[phone],maxSize[13]]"/><em>*(例 021-51870819、13813888888)</em>
                                        <div class="formErrorMsg"></div>
                                    </li>
                                </ul>
                                <div class="my-f-r-submit pl268 pb30 pt11">
                                    <input type="submit" id="a_wageearner" value="确认单位情况" class="submitBtn" />
                                </div>
                            </form>
                        </div>
											</c:if>
                    
                        <div class="p10">
                            <div class="my-f-r-sf-bindStyle nobd"><a href="javascript:;">点击修改</a>紧急联系人</div>
                        </div>
                        <div class="my-f-r-wrapForm mb5">
                                  


<!--判断是否新改版站点，如果不是跳转到老版站点 -->
  								 <form id="my_contactway"  action="userController/updateUser" method="post">
			                    	<ul class="formItem pl188 pt36">
			                    		<li class="clearfix"><label class="w130">直系联系人姓名：</label>
                                            
                                            <input class="w246 bd" name="contactname" value="${user.contactname}" type="text" id="secondRealName" data-validation-engine="validate[required,custom[realname]],maxSize[30],minSize[2]"/>
                                            
                                            <div class="formErrorMsg"></div></li>
			                    		<li class="clearfix"><label class="w130">直系联系人关系：</label>
			      
                                            <select class="w248" id="secondRelationships" name="contactRelation">
                                            <option value="">--请选择--</option>
													<c:forEach var="data" items="${listDataDictionary}">
												<c:if test="${data.numberid==10017}">
												<option value="${data.ddcontent}" <c:if test="${user.contactRelation==data.ddcontent}">selected="selected"</c:if>>${data.ddcontent}</option>
												</c:if>
												</c:forEach>
													</select>
                                         <span style="color: #999;">*</span>
			                    			<div class="formErrorMsg"></div>
			                    		</li>
			                    		<li class="clearfix"><label class="w130">直系联系人手机：</label>
                                            <input type="text" class="w246 bd" name="contactphone" id="secondPhone" value="${user.contactphone}" data-validation-engine="validate[required,custom[phone]]"/><em>*</em>
                                            
                                            <div class="formErrorMsg"></div></li>
			                    		<li class="clearfix"><label class="w130">其他联系人姓名：  </label>
                                            <input type="text"  class="w246 bd" name="othername" id="thirdRealName" value="${user.othername}" data-validation-engine="validate[required,custom[realname]],maxSize[30],minSize[2]"/>
                                            
                                            
                                            <div class="formErrorMsg"></div></li>
			                    		<li class="clearfix"><label class="w130">其他联系人关系：</label>
			                                
                                            <select class="w248" id="thirdRelationships" name="otherRelation">
										 <option value="">--请选择--</option>
										<c:forEach var="data" items="${listDataDictionary}">
												<c:if test="${data.numberid==10017}">
												<option value="${data.ddcontent}"  <c:if test="${user.otherRelation==data.ddcontent}">selected="selected"</c:if>>${data.ddcontent}</option>
												</c:if>
												</c:forEach>					
												</select>
                                           <span style="color: #999;">*</span>
			                    			<div class="formErrorMsg"></div>
			                    		</li>
			                    		<li class="clearfix"><label class="w130">其他联系人手机：</label>
                                            <input type="text" class="w246 bd" name="otherphone" dta='phone' id="thirdPhone" value="${user.otherphone}" data-validation-engine="validate[required,custom[phone]]"/><em>*</em>
                                            <div class="formErrorMsg"></div></li>
			                    	</ul>
			                    	<div class="my-f-r-submit pl300 pb30 pt11"><input type="submit" id="a_contact" value="绑定联系方式" class="submitBtn" /></div>
			                    </form>


                        </div>

                </div>
            </div>
            <!--右边结束-->


        </div>
    </div>
</div>





    <div class="clear">
    </div>

    <div class="footer">
        <div class="footer_footerBottom">
            <ul class="footer_footerBottomNav clearfix">
                <li><span class="webindex"></span><a href="/">网站首页</a>|</li>
                <li><span class="aboutus"></span><a href="/help/aboutus">关于我们</a>|</li>
                <li><span class="mapsite"></span><a href="/home/sitemap">网站地图</a>|</li>
                <li><span class="webservice"></span><a href="/consult">客服中心</a>|</li>
                <li class="nomr"><span class="onlneserve"></span><a href="http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf" target="_blank">在线咨询</a></li>
            </ul>
            <p>Copyright Reserved 2007-2015©拍拍贷（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公司</p>


        </div>

    </div>

    <script src="./ppd_basicMes_files/jquery.js" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_basicMes_files/init.js" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_basicMes_files/servicestack-min.js"></script>
    <script src="./ppd_basicMes_files/jquery.cookie.js"></script>
    <script src="./ppd_basicMes_files/status?v=2014&tmp=635640112556047148" type="text/javascript"></script>
    
    <script>
        $(".my-f-l-list li a.on").closest(".my-f-l-list").prev(".my-f-l-nav").addClass("my-f-l-nav-sd");
        try {
            $("#tabIcon a[category='" + breadcrumbCategory + "']").addClass("tabon");
        } catch (e) {

        }
    </script>
    
    <script src="./ppd_basicMes_files/ppd-min.js"></script>
    <script src="./ppd_basicMes_files/validation.js"></script>
    <script src="./ppd_basicMes_files/validation-zh.js"></script>
    <script type="text/javascript" src="./ppd_basicMes_files/customize.js"></script>



    <script type="text/javascript">
        $('.my-f-r-sf-bindStyle').click(function () {

            if ($(this).children('a').text() == '点击修改') {
                $(this).parent().next('.my-f-r-wrapForm').slideDown('normal', function () {
                    var height = $('.PPD_header_nav').outerHeight(true) + $('.footer').outerHeight(true) + 95;
                    if ($(window).height() == $(document).height()) {

                        $('.main').animate({
                            height: $(window).height() - height
                        }, 200);

                    } else {

                        $('.main').animate({
                            height: 'auto'
                        }, 200);

                    }
                }).siblings('.my-f-r-wrapForm').slideUp();
                $('.my-f-r-sf-bindStyle > a').text('点击修改');
                $(this).children('a').text('点击收起');
            } else if ($(this).children('a').text() == '点击收起') {
                $(this).parent().next('.my-f-r-wrapForm').slideUp('normal', function () {
                    var height = $('.PPD_header_nav').outerHeight(true) + $('.footer').outerHeight(true) + 95;
                    if ($(window).height() == $(document).height()) {

                        $('.main').animate({
                            height: $(window).height() - height
                        }, 200);

                    } else {

                        $('.main').animate({
                            height: 'auto'
                        }, 200);

                    }
                });
                $(this).children('a').text('点击修改');

            }
        });

        $(function () {
            $('.cailizhm input:lt(4)').click(function () {
                $('.cailizhm input:last').removeAttr('checked');

            });
            $('.cailizhm input:last').click(function () {
                $('.cailizhm input:lt(4)').removeAttr('checked');
            });
        });

    </script>

    <script type="text/javascript">
        $(document).ready(function () {
            $("#10003005").attr('class', 'li_on');
            $("#10003").addClass("tabon");
            $("select").each(function () {
                $(this).attr('data-validation-engine', 'validate[required]');
            });
            if ($("#webShops").val() == 7) {
                $("#txtWebOther").attr('data-validation-engine', 'validate[required,minSize[1],maxSize[40]]');
                $("#txtWebOther").show();
            }
            $("#essential_information").validationEngine();
            $("#my_family").validationEngine();
            $("#my_unit").validationEngine();
            $("#my_contactway").validationEngine();
            $('#collapseOne, #collapseTwo, #collapseThree, #collapseFour').on('hide', function () {
                $(this).prev('div').find('a').text('点击修改');
            });
            $('#collapseOne, #collapseTwo, #collapseThree, #collapseFour').on('show', function () {
                $(this).prev('div').find('a').text('点击收起');
            });
            var link = "";
            if (link.toLocaleLowerCase() == "four") {
                $("#collapseOne").collapse('hide');
                $("#collapseFour").collapse('show');
            }
        });


        /*****************获取区域信息**********************/

        var gateway = new servicestack.ClientGateway('http://' + window.location.host);

        /*****************获取区域信息**********************/
        $("[name='ProvinceId'], [name='CityId'], [name='ProvinceIdForCompanyOwner'], [name='CityIdForCompanyOwner'], [name='ProvinceIdForWageEarner'], [name='CityIdForWageEarner'], [name='ProvinceIdForWebShop'], [name='CityIdForWebShop']").change(function () {
            if ($(this).find("option:selected").val() == "0") {
                $(this).nextAll("select").find("option").not(":first-child").remove();
                $(this).nextAll("select").find("option:first-child").attr("selected", true);
            } else {
                getAreaList($(this));
            }


        });

        ///获取区域信息方法

        function getAreaList(obj) {
            var type = obj.attr("data-type");
            var data = { AreaType: type, Id: obj.find("option:selected").val(), format: "json" };
            gateway.postToService(
                { AreaRequest: data },
                function (e) {
                    var ilist = "";
                    var econtent = e.Content;
                    var nextobj = obj.next();
                    if (type == "2") {
                        for (var i = 0; i < econtent.length; i++) {
                            ilist += "<option value=" + econtent[i].Id + ">" + econtent[i].CityName + "</option>";
                        }
                        //nextobj.next().hide();
                        nextobj.next().find("option").not(":first-child").remove();
                    } else {
                        for (var j = 0; j < econtent.length; j++) {
                            ilist += "<option value=" + econtent[j].Id + ">" + econtent[j].DistrictName + "</option>";
                        }
                        //nextobj.show();
                    }
                    nextobj.find("option").not(":first-child").remove();
                    nextobj.append(ilist);

                }, function (e) {
                    alert(e.message);
                }
            );
        }

        /*****************获取区域信息**********************/


        $("#a_basic").click(function () {
            if ($("#essential_information").validationEngine('validate')) {

                $("#a_basic").attr("disabled", true);
                $("#a_basic").val("正在提交...");
                var data = {
                    RealName: $("#RealName").val(),
                    MobilePhone: $("#MobilePhone").val(),
                    QQ: $("#QQ").val(),
                    EducationId: $("#EducationId").val(),
                    IdNumber: $("#IdNumber").val(),
                    BeforePath: $("#beforePath").val()
                };
                gateway.putToService(
                    {
                        UserBasicRequst: data
                    }, function (e) {
                        alert(e.ResponseStatus.Message);
                        $("#a_basic").attr("disabled", false);
                        $("#a_basic").val("确定基本资料");
                        $("#tag2").click();
                    }, function (e) {
                        if (e.errorCode == "520") {
                            alert("修改成功");
                            window.location = e.message;
                        } else if (e.errorCode == "522") {
                            ShowMessage(e.message);

                        } else {
                            var msg = e.message.replace(/<a[^>]*>/, "").replace("</a>", "");
                            alert(msg);

                        }
                        $("#a_basic").attr("disabled", false);
                        $("#a_basic").val("确定基本资料");

                    }
                );
            }
        });
        $("#a_family").click(function () {
            if ($('.cailizhm input:checked').length < 1) {
                $('#calizhengmingcheck').show();
                return;
            } else {
                $('#calizhengmingcheck').hide();
            }
            if ($("#my_family").validationEngine('validate')) {
                $("#a_family").attr("disabled", true);
                $("#a_family").val("正在提交...");
                var assets = "";
                $("input[name='assets']:checked").each(function () {
                    assets += $(this).val() + ",";
                });
                assets = assets.substr(0, assets.length - 1);
                var data = {
                    MarriageStatusId: $("#MarriageStatusId").val(),
                    ResidenceTypeId: $("#ResidenceTypeId").val(),
                    ResidencePhone: $("#ResidencePhone").val(),
                    ResidenceYears: $("#ResidenceYears").val(),
                    HasBuyCar: $(':radio[name=HasBuyCar]:checked').val(),
                    ResidenceAddress: $("#ResidenceAddress").val(),
                    ProvinceId: $("select[name='ProvinceId']").find('option:selected').val(),
                    CityId: $("select[name='CityId']").find('option:selected').val(),
                    DistrictId: $("select[name='DistrictId']").find('option:selected').val(),
                    BeforePath: $("#beforePath").val(),
                    Assets: assets
                };
                gateway.putToService(
                    {
                        UserFamilyRequest: data
                    }, function (e) {
                    
                        $("#a_family").attr("disabled", false);
                        $("#a_family").val("确定家庭情况");
                        $("#tag3").click();
                    }, function (e) {
                        if (e.errorCode == "520") {
                            alert("修改成功");
                            window.location = e.message;
                        } else if (e.errorCode == "522") {
                            ShowMessage(e.message);

                        } else {
                          

                        }

                        $("#a_family").attr("disabled", false);
                        $("#a_family").val("确定家庭情况");
                    }
                );
            }
        });
        $("#a_student").click(function () {
            if ($("#my_unit").validationEngine('validate')) {
                $("#a_student").attr("disabled", true);
                $("#a_student").val("正在提交...");
                var data = {
                    UserType: 4,
                    BeforePath: $("#beforePath").val(),
                    UserStudent: {
                        SchoolName: $("#SchoolName").val(),
                        DormitoryPhone: $("#DormitoryPhone").val(),
                        IncomeFrom: $("#IncomeFrom").val(),
                        IsUseable: false
                    }
                };
                gateway.postToService(
                    {
                        UserDetailRequest: data
                    }, function (e) {
                        alert(e.ResponseStatus.Message);
                        $("#a_student").attr("disabled", false);
                        $("#a_student").val("确定学生情况");
                        $("#tag4").click();
                    }, function (e) {
                        if (e.errorCode == "520") {
                            alert("修改成功");
                            window.location = e.message;
                        } else if (e.errorCode == "522") {
                            ShowMessage(e.message);

                        } else {
                            alert(e.message);
                        }
                        $("#a_student").attr("disabled", false);
                        $("#a_student").val("确定学生情况");
                    }
                );
            }
        });

        $("#a_wageearner").click(function () {
            if ($("#my_unit").validationEngine('validate')) {
                $("#a_wageearner").attr("disabled", true);
                $("#a_wageearner").val("正在提交...");
                var data = {
                    UserType: 1,
                    BeforePath: $("#beforePath").val(),
                    UserWageEarner: {
                        CompanyTypeId: $("#companyTypeId").val(),
                        WorkYears: $("#workYears").val(),
                        CompanyName: $("#companyName").val(),
                        Department: $("#department").val(),
                        CompanyAddress: $("#companyAddress").val(),
                        CompanyPhone: $("#companyPhone").val(),
                        IsUseable: $("#isUseable").val(),
                        IsCash: $(':radio[name=radInCome]:checked').val(),
                        ProvinceId: $("select[name='ProvinceIdForWageEarner']").find('option:selected').val(),
                        CityId: $("select[name='CityIdForWageEarner']").find('option:selected').val(),
                        DistrictId: $("select[name='DistrictIdForWageEarner']").find('option:selected').val(),
                        HasSbOrGjj: $(':radio[name=HasSbOrGjj]:checked').val(),
                        Position: $("#position").val()
                    }
                };
                gateway.postToService(
                    {
                        UserDetailRequest: data
                    }, function (e) {
                        $("#a_wageearner").attr("disabled", false);
                        $("#a_wageearner").val("确定单位情况");
                        $("#tag4").click();
                    }, function (e) {
                        if (e.errorCode == "520") {
                       
                            window.location = e.message;
                        } else if (e.errorCode == "522") {
                            ShowMessage(e.message);

                        } 
                        $("#a_wageearner").attr("disabled", false);
                        $("#a_wageearner").val("确定单位情况");
                    });
            }
        });
        $("#a_webshop").click(function () {
            if ($("#my_unit").validationEngine('validate')) {
                $("#a_webshop").attr("disabled", true);
                $("#a_webshop").val("正在提交...");
                var data = {
                    UserType: 3,
                    BeforePath: $("#beforePath").val(),
                    UserWebShop: {
                        WebShopTypeId: $("#webShops").val(),
                        NickName: $("#nickName").val(),
                        WebShopUrl: $("#webShopUrl").val(),
                        turnover: $("#turnover").val(),
                        IsUseable: $("#isUseable").val(),
                        BussinessAddress: $("#bussinessAddress").val(),
                        OtherWebShopType: $("#txtWebOther").val(),
                        ProvinceId: $("select[name='ProvinceIdForWebShop']").find('option:selected').val(),
                        CityId: $("select[name='CityIdForWebShop']").find('option:selected').val(),
                        DistrictId: $("select[name='DistrictIdForWebShop']").find('option:selected').val()
                    }
                };
                gateway.postToService(
                    {
                        UserDetailRequest: data
                    }, function (e) {
                        alert(e.ResponseStatus.Message);
                        $("#a_webshop").attr("disabled", false);
                        $("#a_webshop").val("确定网店情况");
                        $("#tag4").click();
                    }, function (e) {
                        if (e.errorCode == "520") {
                            alert("修改成功");
                            window.location = e.message;
                        } else if (e.errorCode == "522") {
                            ShowMessage(e.message);

                        } else {
                            alert(e.message);

                        }
                        $("#a_webshop").attr("disabled", false);
                        $("#a_webshop").val("确定网店情况");
                    });
            }
        });
        $("#a_other").click(function () {

            if ($("#my_unit").validationEngine('validate')) {
                $("#a_other").attr("disabled", true);
                $("#a_other").val("正在提交...");
                var data = {
                    UserType: 6,
                    BeforePath: $("#beforePath").val(),
                    UserOther: {
                        IncomeFrom: $("#incomeFrom").val(),
                        IsUseable: $("#isUseable").val()
                    }
                };
                gateway.postToService(
                    {
                        UserDetailRequest: data
                    }, function (e) {
                        alert(e.ResponseStatus.Message);
                        $("#a_other").attr("disabled", false);
                        $("#a_other").val("确定就业情况");
                        $("#tag4").click();
                    }, function (e) {
                        if (e.errorCode == "520") {
                            alert("修改成功");
                            window.location = e.message;
                        } else if (e.errorCode == "522") {
                            ShowMessage(e.message);

                        } else {
                            alert(e.message);

                        }
                        $("#a_other").attr("disabled", false);
                        $("#a_other").val("确定就业情况");
                    });
            }
        });
        $("#a_company").click(function () {

            if ($("#my_unit").validationEngine('validate')) {
                $("#a_company").attr("disabled", true);
                $("#a_company").val("正在提交...");
                var data = {
                    UserType: 2,
                    BeforePath: $("#beforePath").val(),
                    UserCompanyOwner: {
                        BussinessAddress: $("#bussinessAddress").val(),
                        CompanyPhone: $("#companyPhone").val(),
                        CompanyName: $("#companyName").val(),
                        CompanySizeId: $("#companySize").val(),
                        IsUseable: $("#isUseable").val(),
                        HasBusinessLicense: $("#hasbusinesslc").find("input:checked").val(),
                        ProvinceId: $("select[name='ProvinceIdForCompanyOwner']").find('option:selected').val(),
                        CityId: $("select[name='CityIdForCompanyOwner']").find('option:selected').val(),
                        DistrictId: $("select[name='DistrictIdForCompanyOwner']").find('option:selected').val()
                    }
                };
                gateway.postToService(
                    {
                        UserDetailRequest: data
                    }, function (e) {
                        alert(e.ResponseStatus.Message);
                        $("#a_company").attr("disabled", false);
                        $("#a_company").val("确定公司情况");

                        $("#tag4").click();
                    }, function (e) {
                        if (e.errorCode == "520") {
                            alert("修改成功");
                            window.location = e.message;
                        } else if (e.errorCode == "522") {
                            ShowMessage(e.message);

                        } else {
                            alert(e.message);
                        }
                        $("#a_company").attr("disabled", false);
                        $("#a_company").val("确定公司情况");
                    });
            }
        });
        $("#a_contact").click(function () {
            if ($("#my_contactway").validationEngine('validate')) {
                $("#a_contact").attr("disabled", true);
                $("#a_contact").val("正在提交...");
                var data = {
                    UserContactSecond: { RealName: $("#secondRealName").val(), RelationshipId: $("#secondRelationships").val(), Phone: $("#secondPhone").val() },
                    UserContactThird: { RealName: $("#thirdRealName").val(), RelationshipId: $("#thirdRelationships").val(), Phone: $("#thirdPhone").val() }
                };
                gateway.postToService(
                    {
                        UserContactRequest: data
                    }, function (e) {
                     
                        $("#a_contact").attr("disabled", false);
                        $("#a_contact").val("绑定联系方式");
                    }, function (e) {
                     
                        $("#a_contact").attr("disabled", false);
                        $("#a_contact").val("绑定联系方式");
                    }
                );
            }

        });
        $("#webShops").change(function () {
            var shopid = $(this).children('option:selected').val();
            if (shopid == 7) {
                $("#txtWebOther").attr('data-validation-engine', 'validate[required,minSize[1],maxSize[40]]');
                $("#txtWebOther").show();
            } else {
                $("#txtWebOther").removeAttr('data-validation-engine');
                $("#txtWebOther").hide();
            }
        });

        function ShowMessage(url) {
            $(this).PPDfloatDiv({
                floatbgtype: true,
                floattruebtn: '确定',
                floatfalsebtn: '取消',
                handertext: '修改成功',
                truebtnid: 'btnGo',
                context: "是否需要发布借款，如需要先去绑定手机，再发布借款吧",
                btnshow: true
            });
            $('#btnGo').click(function () {
                window.location.href = url;
            });
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
                '//www.googletagmanager.com/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f);
})(window, document, 'script', 'dataLayer', 'GTM-PVQ5D8');</script>
    <!-- End Google Tag Manager -->
</body>
</html>
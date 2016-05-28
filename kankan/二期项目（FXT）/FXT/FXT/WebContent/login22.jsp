 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆界面</title>
<style type="text/css">
a{
text-decoration: none;
color:green;
}
ul>li{
list-style: none;
}
#main{
width:1024px;
height:auto;
margin-left: 160px;
margin-right: 180px;
margin-top:0px;
padding-left: 5px;
padding-top:5px;
}
#title{
width:1024px;
height:70px;
font-size: 50px;
}
#kong{
width:1024px;
height:100px;
}
#left{
width:457px;
height:326px;
}
#center{
position:relative;
float:left;
left:460px;
top:-328px;
width:310px;
}
#center>ul>li{
padding-top:10px;
font-size:14px;
height:30px;
}
#center>li>a{
background-image: url("pic/qq1.jpg");
width:50px;
height:20px;
}
#loginpic{
background-image: url("pic/loginbtn.jpg");
width:261px;
height:36px;
}
#right{
position:relative;
float:right;
background-image: url("pic/right.jpg");
width:140px;
height:257px;
top:-350px;
}
#kong1{
width:1024px;
height:200px;
}
#opinions{
position:relative;
float: right;
right:-100px;
top:100px;
border:1px solid #CCC;
width:70px;
line-height:70px;
text-align: center;
}
#opinions>a{
color:#CCC;
}
#opinions>a:HOVER{
color:green;
}
.tu1,.tu2,.tu3{
background-repeat:no-repeat;
height:30px;
}
.tu1{
background-image: url("pic/suishitui.jpg");
width:80px;
}
.tu2{
background-image: url("pic/guoqitui.jpg");
width:80px;
}
.tu3{
background-image: url("pic/miandan.jpg");
width:110px;
}
#bottom>ul>li{
border-right:1px solid #ccc;
float: left;
width:105px;
line-height:30px;
text-align: center;
}
#bottom{
position: relative;
top:-110px;
left:-250px;
}
#bottom>ul>li>a{
color:#ccc;
}
#bottom>ul>li>a:HOVER{
color:green;
}
#kong2{
width:950px;
height:50px;
border-bottom: 1px solid #ccc;
border-top: 1px solid #ccc;
}
#kong3{
width:1022px;
height:50px;
}
#bottomdizhi{
position: relative;
top:-80px;
left:-240px;
}
#bottomdizhi>a{
color:#ccc;
}
#bottomdizhi>a:HOVER {
	text-decoration: underline;
}

<!--一下是自动提示的额代码 -->
.suggest_link{
padding:2px 6px 2px 6px;
}
.suggest_link_over{
background-color: #e8f2fe;
padding:2px 6px 2px 6px;
}
#tishi{
width:150px;
margin-top: 1px;
position: absolute;
text-align: left;
border: 1px solid #999;
display: none;
font-weight: bold;
}
#username{
	color:#999;
}
</style>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
//检查空？
function clears(){
	if($("#username").val()=="帐号/手机号/邮箱"){
		$("#username").val("");
		$("#username").css("color","black");
	}
}
function isnamenull(){
	var uname=document.getElementById("username").value;
	var isnull=document.getElementById("namenull");
	if(uname==""||uname==null){
		isnull.innerHTML="<font color='red'>用户名不能为空</font>";
		return false;
	}else
		isnull.innerHTML="";
		return true;
}
function isupwdnull(){
	
	var pwd=document.getElementById("userpwd").value;
	var isnull=document.getElementById("pwdnull");
	if(pwd==""||pwd==null){
		isnull.innerHTML="<font color='red'>密码不能为空</font>";
		return false;
	}else
		isnull.innerHTML="";
		return true;
}
</script>
</head>
<body>
<div id="main">
	<div id="title"><a href="mainShowGoodsServlet"><font color="green">放心团</font></a></div>
	
	<div id="kong"></div>
	
	<div id="left"><span><img src="pic/left1.jpg"></span></div>
	
	<form action="loginServlet?xuan=1" method="post" id="myform">
	<div id="center"> 
	<c:choose>
	<c:when test="${empty pwderror}"></c:when>
	<c:otherwise>
	<font color="red">${pwderror}</font>
	</c:otherwise>
	</c:choose>
	<c:choose>
	<c:when test="${empty mes}"></c:when>
	<c:otherwise>
	<font color="red">${mes}</font>
	</c:otherwise>
	</c:choose>
	<ul>
	<li>账号登陆&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">手机动态码登陆<img src="pic/shouji.jpg"></a></li>
	<c:choose>
    <c:when test="${empty users} ">
    <li><input type="text" name="username" id="username" style="color:red" onclick="clears()" onblur="isnamenull()"><span id="namenull"></span></li>
    </c:when>
	<c:otherwise>
	<li><input type="text" name="username" id="username" value="${users.username}" onclick="clears()" onblur="isnamenull()"><span id="namenull"></span></li>
	<div id="tishi"></div>
	</c:otherwise>
	</c:choose>
	<li><input type="password" name="userpwd" id="userpwd" value="" onblur="isupwdnull()"><span id="pwdnull"></span></li>
	<li><input type="checkbox" name="cbx" value="jzmm">记住密码<input type="checkbox" name="cbx" value="zdlogin">下次自动登陆 &nbsp;&nbsp;<a href="">忘记密码?</a></li>
	<li><input type="submit" id="loginpic" value="" ></li>
	<li>还没有账号?<a href="reg.jsp">免费注册</a></li>
	<li></li>
	<li><p>用合作网站登录:</p><a href="#"><img src="pic/qq1.jpg" width="50" height="20"></a>
		<a href="#"><img src="pic/weibo1.jpg" width="50" height="20"></a>
		<a href="#"><img src="pic/baidu1.jpg" width="50" height="20"></a>
		<a href="#"><img src="pic/3601.jpg" width="50" height="20"></a>
		<a href="#"><img src="pic/kaixin1.jpg" width="50" height="20"></a>
		</li>
	</ul>
	</div>
	</form>
	
	<div id="right"></div>
    <div id="kong1"><div id="opinions"><a href="#">意见反馈</a></div></div>
	<div id="kong2"></div>
	<div id="kong3"></div>
	</div>
	<div id="bottom">
	<ul>
	  <li><a href="#">关于放心团</a></li>
		<li><a href="#">加入我们</a></li>
		<li><a href="#">商家入驻</a></li>
		<li><a href="#">帮助中心</a></li>
		<li><a href="#">手机版</a></li>
		<li class="tu1"><a href=""></a></li>
		<li class="tu2"><a href=""></a></li>
		<li class="tu3" style="border-right: none;"><a href=""></a></li>
	</ul>
	</div>
	
	
	<div id="bottomdizhi">©2014 <a href="#">放心团网团购</a> meituan.com <a href="#">京ICP证070791号</a> 京公网安备11010502025545号 <a href="#">电子公告服务规则</a></div>
	
	
</body>
</html>
<script>
$("#username").val("帐号/手机号/邮箱");

</script>
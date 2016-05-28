<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">

var telb=false;
var usernameb=false;
function checkTel(obj){
	var tel=obj.value;
	var reg=/^1[3,5,8][^4]\d{8}$/;
	if(reg.test(tel)){
		document.getElementById("telspan").innerHTML="<font color='green'>√</font>";
		return true;
	}else{
		document.getElementById("telspan").innerHTML="<font color='red'>请输入正确的手机号码。</font>";
		return false;
	}
}
$(function(){
	$("#tel").blur(function(){
		$.post("checktel",{
			tel:$("#tel").val()
		},function(data){
			if(data=="true"){
				$("#telspan").text("该号码已经进行过注册。");
				$("#telspan").css("color","red");
				telb=false;
			}else{
				telb=true;
			}
		});
	});
});
function checkName(obj){
	var name=obj.value;
	var reg=/^[a-zA-Z]\w{3,15}$/;
	if(reg.test(name)){
		document.getElementById("namespan").innerHTML="<font color='green'>√</font>";
		return true;
	}else{
		document.getElementById("namespan").innerHTML="<font color='red'>用户名格式错误。</font>";
		return false;
	}
}
$(function(){
	$("#username").blur(function(){
		$.post("checkusername",{
			username:$("#username").val()
		},function(data){
			if(data=="true"){
				$("#namespan").text("用户名已存在。");
				$("#namespan").css("color","red");
				usernameb=false;
			}else{
				usernameb=true;
			}
		});
	});
});

function checkpwd1(obj){
	var pwd=obj.value;
	if(pwd.length>5&&pwd.length<17){
		$("#pwd1span").text("√");
		$("#pwd1span").css("color","green");
		//document.getElementById("pwd1span").innerHTML="<font color='green'>√</font>";
		return true;
	}else{
		$("#pwd1span").text("密码格式错误。");
		$("#pwd1span").css("color","red");
		//document.getElementById("pwd1span").innerHTML="<font color='red'>密码格式错误。</font>";
		return false;
	}
}
function checkpwd2(obj){
	var repwd=obj.value;
	var pwd=document.getElementById("userpwd1").value;
	if(repwd.length>5&&repwd.length<17&&repwd==pwd){
		document.getElementById("pwd2span").innerHTML="<font color='green'>√</font>";
		return true;
	}else{
		document.getElementById("pwd2span").innerHTML="<font color='red'>两次密码输入不一致。</font>";
		return false;
	}
}
function checkForm(){
	var tel=document.getElementById("tel");
	var username=document.getElementById("username");
	var userpwd1=document.getElementById("userpwd1");
	var userpwd2=document.getElementById("userpwd2");
	if(telb&&usernameb&&checkTel(tel)&&checkName(username)&&checkpwd1(userpwd1)&&checkpwd2(userpwd2)){
		return true;
	}else{
		return false;
	}
}
function CharMode(iN){
	if (iN>=48 && iN <=57) //数字
		return 1; 
	if (iN>=65 && iN <=90) //大写字母
		return 2;
	if (iN>=97 && iN <=122) //小写
		return 4;
	else
		return 8; //特殊字符
}


function bitTotal(num){
	modes=0;
	for (i=0;i<4;i++){
		if (num & 1) modes++;
			num>>>=1;
		}
	return modes;
}


function checkStrong(sPW){
	if (sPW.length<=5)
		return 0; //密码太短
		Modes=0;
	for (i=0;i<sPW.length;i++){
		Modes|=CharMode(sPW.charCodeAt(i));
	}
	return bitTotal(Modes);
} 

function pwStrength(pwd){
	O_color="#eeeeee";
	L_color="#FF0000";
	M_color="#FF9900";
	H_color="#33CC00";
	if (pwd==null||pwd==''){
		Lcolor=Mcolor=Hcolor=O_color;
	} 
	else{
		S_level=checkStrong(pwd);
		switch(S_level) {
			case 0:
				Lcolor=Mcolor=Hcolor=O_color; 
			case 1:
				Lcolor=L_color;
				Mcolor=Hcolor=O_color;
				break;
			case 2:
				Lcolor=Mcolor=M_color;
				Hcolor=O_color;
				break;
			default:
				Lcolor=Mcolor=Hcolor=H_color;
			}
		} 
	document.getElementById("ruo").style.background=Lcolor;
	document.getElementById("zhong").style.background=Mcolor;
	document.getElementById("qiang").style.background=Hcolor;
	return;
}
</script>
<style type="text/css">
#dingbu{
    width:100%;
    height:30px;
    background:#F5F5F5;
}
#title{
	margin:0px auto;
	width:980px;
	height:30px;
	font-size:14px;
	background:#f5f5f5;
}
#title ul{
	list-style:none;
	margin:0px;
	padding:0px;
	over-flow:hidden;
	font-size:14px;
}
#title>ul>li{
	float:left;
	margin:0px 5px;
	line-height:30px;
	position:relative;
}
#title>ul>li:hover ul{
	display:block;
}
#sj{
position:absolute;
top:5px;
}
#sjt{
margin-left:20px;
}
#kongge{
    display:block;
	width:90px;
	height:30px;
}
#title li ul{
	border:1px solid #eee;
	position:absolute;
	left:0px;
	top:30px;
	display:none;
	background:white;
	z-index:200px;
}
#title li ul li{
	width:100px;
	text-align:center;
	line-height:30px;
}
#title li ul li:hover{
	background:#f6f6f6;
	color:#2bb8aa;
}
#main{
	
	width:980px;
	margin:0px auto;
}
#two{
height:60px;
}
#three{
margin-top:20px;
overflow: hidden;
}
#three #yi{
float:left;
}
#three #yi #a{
display:inline-block;
font-size:40px;
font-weight:800;
color:#2CB8AD;
height:36px;
}
#three #yi #b{
display:inline-block;
font-size:14px;
font-weight:bold;
color:#2CB8AD;
line-height:10px;
margin-left:15px;
}
#three #er{
float:left;
}
#three #er #a{
font-size:18px;
font-weight:bold;
color:black;
line-height:30px;
}
#three #er #b{
font-size:13px;
color:#999999;
line-height:15px;
}
#three #san{
display:inline-block;
margin-left:60px;
padding:0px;
}
#three #san #a{
font-size:17px;
width:380px;
height:35px;
line-height:35px;
border:3px solid #2CB8AD;
border-right:none;
}
#three #san #b{
height:45px;
line-height:34px;
width:80px;
font-size:16px;
color:white;
background-color:#2CB8AD;
border:none;
position: relative;
top:-2px;
}
#three #san form{
margin-bottom:3px;
}
#three #san a{
font-size:13px;
color:#9C9C9C;
text-decoration:none;
}
#three #si{
float:right;
margin-right:-10px;
}
#four{
overflow:hidden;
margin-top:20px;
position:absolute;
z-index:100;
}
#four #left{
	
	width:195px;
	float:left;
}
#four #left ul{
border:2px solid #2bb8aa;
	list-style:none;
	margin:0px;
	padding:0px;
	background:white;
}
#four #left>ul>li{
	padding:10px 16px 10px 10px;
	margin:0px;
	border-bottom:1px solid #ccc;
	font-size:14px;
	font-weight:bold;
	position:relative;
	display:none;
}
#four #left>ul>li:hover{
	padding:10px 10px 10px 16px;
}
#four #left>ul>li:hover ul{
	display:block;
}
#four #left #lastli{
	border-bottom:none;
}
#four #left #firstli{
	background:#2bb8aa;
	color:#FFF;
	display:block;
	border-bottom:none;
}
#four #left span{
	font-size:12px;
	font-weight:normal;
	color:#666;
}
#four #left ul li ul{
	border:1px solid #2bb8aa;
	position:absolute;
	left:192px;
	top:-1px;
	display:none;
	background:white;
}
#four #left ul li ul li{
	width:300px;
	margin:10px;
	color:black;
}

#four #left a{
	line-height:20px;
	color:#666;
}

#four #left a:hover{
	color:#2bb8aa;
}
#four #left a:visited{
	color:red;
}
#four #center{
	float:left;
	width:780px;
}
#four #center #top{
	height:39px;
	padding-left:6px;
	border-bottom:2px solid #2bb8aa;
}
#four #center #top ul{
     list-style:none;
	margin:0px;
	padding:0px;
}
#four #center #top ul li{
	float:left;
}
#four #center #top ul li a{
	display:block;
	line-height:39px;
	padding:0px 8px 0px 10px;
	background:#fff;
	color:#000;
	font-weight:bold;
	text-decoration:none;
	font-size:14px;
}
#four #center #top ul li a:hover{
	background:#2bb8aa;
	color:#FFF;
}
#tel,#username,#userpwd1,#userpwd2{
	border:1px #aaa solid;
	width:160px;
	height:28px;
	line-height:28px;
}
.hspan{
	
	color:#888;
}
#xy{
	/*border:1px solid red;*/
	width:130px;
	margin-top:2px;
	margin-left:60px;
}
#fxtyhxy{
	font-size:14px;
	color:#2cb8ad;
	text-decoration: none;
}
#fxtyhxy:hover{
	color:red;
}
.btn{
	background-color:#2cb8ad;
	color:white;
	line-height:32px;
	font-weight:bold;
	border:none;
	margin-right:2px;
	padding:0px 16px;
}
#btn{
	margin-left:26px;
}
#c2{
	border:1px solid #999;
	width:858px;
	height:500px;
	padding:0px 60px;
	margin:0px auto;
	margin-top:65px;
}
#ks{
	background-color:#2CB8AD;
	width:200px;
	line-height:40px;
	text-align:center;
	color:#FFF;
	font-size:20px;
	font-weight:bold;
	position:relative;
	top:8px;
	left:22px;
	z-index:10;
}
hr{
	height:1px;
	background-color:#ccc;
	border:0px;
}
#dl{
	position:relative;
	top:40px;
	left:728px;
	font-size:14px;
}
#dl a{
	color:#2CB8AD;
	text-decoration:none;
	font-weight:bold;
	font-size:16px;
}
#c2 li{
	line-height:60px;
	list-style:none;
	margin-left:-36px;
	padding-left:20px;
}
.qd{
	width:54px;
	height:10px;
	background-color:#cdc;
	float:left;
	position: relative;
	top:-12px;
	left:80px;
	margin-right: 1px;
	font-size: 12px;
}
#cl{
	clear:both;
}
#shiwu{
width:100%;
height:5px;
background-color:#2CB8AD;
}
#shiliu{
width:980px;
height:300px;
background: url(pic/bottom.jpg) no-repeat;
margin:auto;
}
</style>

</head>
<body>
<!-- dingbu是首页最顶部菜单 -->
<div id="dingbu">
<div id="title">
<ul>
	<li>团购一次&nbsp;&nbsp;放心一次&nbsp;&nbsp;</li>
	<c:choose>
	      <c:when test="${empty nowuser }">
	      <li style="width:90px;"><a href="login.jsp">登录</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="reg.jsp">注册</a>&nbsp;&nbsp;|</li>
	      </c:when>
	      <c:otherwise>
	      <li style="width:90px;">Hi,${nowuser.username }&nbsp;&nbsp;<a href="Exit">退出</a></li>
	      </c:otherwise>
	</c:choose>
    
    <li><img src="pic/xiaoshouji.jpg" id="sj"/><span id="sjt">手机放心团</span>&nbsp;<img src="pic/xiaosanjiao.jpg"></li>
    <li><span id="kongge"></span></li>
    <c:choose>
	      <c:when test="${empty nowuser }">
          <li><a href="login.jsp">我的订单</a></li>
          </c:when>
	      <c:otherwise>
	      <li><a href="UpShowUsersServlet">我的订单</a></li>
	      </c:otherwise>
	</c:choose>
	<c:choose>
	      <c:when test="${empty nowuser }">
          <li><a href="login.jsp">我的放心团</a>&nbsp;<img src="pic/xiaosanjiao.jpg" />
    	<ul>
        	<li><a href="login.jsp">我的订单</a></li>
            <li>我的收藏</li>
            <li>我的评价</li>
            <li>我的订单</li>
            <li>我的收藏</li>
            <li>我的评价</li>
        </ul>
    </li>
          </c:when>
	      <c:otherwise>
	      <li><a href="UpShowUsersServlet">我的放心团</a>&nbsp;<img src="pic/xiaosanjiao.jpg" />
    	<ul>
        	<li><a href="UpShowUsersServlet">我的订单</a></li>
            <li>我的收藏</li>
            <li>我的评价</li>
            <li>我的订单</li>
            <li>我的收藏</li>
            <li>我的评价</li>
        </ul>
    </li>
	      </c:otherwise>
	</c:choose>
    <li>最近浏览&nbsp;<img src="pic/xiaosanjiao.jpg" /></li>
    <li><img src="pic/xiaoche.jpg" />&nbsp;<a href="ShowCartServlet">购物车</a>&nbsp;<img src="pic/xiaosanjiao.jpg" /></li>
    <li>联系客服&nbsp;<img src="pic/xiaosanjiao.jpg" />
    	<ul>
        	<li>我的订单</li>
            <li>我的收藏</li>
            <li>我的评价</li>
            <li>我的订单</li>
            <li>我的收藏</li>
            <li>我的评价</li>
        </ul>
    </li>
    <li>我是商家&nbsp;<img src="pic/xiaosanjiao.jpg" />
    	<ul>
        	<li><a href="admin/adminLogin.jsp">商家登陆</a></li>
            <li>我的收藏</li>
            <li>我的评价</li>
            <li>我的订单</li>
            <li>我的收藏</li>
        </ul>
    </li>
    <li>更多&nbsp;<img src="pic/xiaosanjiao.jpg" />
    	<ul>
        	<li>我的订单</li>
            <li>我的收藏</li>
            <li>我的评价</li>
            <li>我的订单</li>
            <li>我的收藏</li>
            <li>我的评价</li>
        </ul>
    </li>
</ul>
</div>
</div>

<div id="main">
<!-- two是首页最顶部轮换图片部分 -->
<div id="two">
<img src="pic/top1.jpg"/>
</div>
<!-- three是网站logo部分 -->
<div id="three">
<div id="yi">
<span id="a">放心团</span><br><span id="b">www.FXT.com</span><br><br>
</div>

<div id="er">
<span id="a">郑州</span><br><span id="b">[切换城市]</span><br><br>
</div>

<div id="san">
<form action="QueryGoodsInSSServlet" method="post"><input type="text" name="sstj" class="sousuotj" id="a" maxlength="20"><input type="submit" value="搜索" id="b" class="sousuo"></form>
&nbsp;&nbsp;&nbsp;&nbsp;<a href="">美食</a>&nbsp;&nbsp;<a href="">电影</a>&nbsp;&nbsp;<a href="">电影</a>&nbsp;&nbsp;<a href="">酒店</a>&nbsp;&nbsp;<a href="">电影</a>&nbsp;&nbsp;<a href="">购物</a>
</div>

<div id="si">
<img alt="" src="pic/001.jpg"><img alt="" src="pic/002.jpg"><img alt="" src="pic/003.jpg">
</div>
</div>
<!-- four是中间菜单部分 -->
<div id="four">
<div id="left">
	<ul>
    	<li id="firstli">全部分类</li>
    	<li>美食<br /><span>自助餐&nbsp;&nbsp;火锅&nbsp;&nbsp;烤肉</span>
        	<ul>
            	<li>美食</li>
                <li><span ><a href="SelectGoodsByGclidServlet?gclid=2" >西餐</a>&nbsp;|&nbsp;<a href="SelectGoodsByGclidServlet?gclid=1">火锅</a>&nbsp;|&nbsp;<a href="#">烤肉</a>&nbsp;|

&nbsp;<a href="#">烧烤/烤串</a>&nbsp;|&nbsp;<a href="#">麻辣烫</a><br /><a href="#">自助餐</a>&nbsp;|&nbsp;<a href="#">日本

料理</a>&nbsp;|&nbsp;<a href="#">蛋糕</a>&nbsp;|&nbsp;<a href="#">香锅烤鱼</a><br /><a href="#">聚餐宴请</a>&nbsp;|

&nbsp;<a href="#">川湘菜</a>&nbsp;|&nbsp;<a href="#">韩国料理</a>&nbsp;|&nbsp;<a href="#">鲁菜/北京菜</a><br /><a 

href="#">小吃快餐</a>&nbsp;|&nbsp;<a href="#">甜点饮品</a>&nbsp;|&nbsp;<a href="#">海鲜</a>&nbsp;|&nbsp;<a href="#">粤港菜

</a><br /><a href="#">咖啡酒吧茶馆</a>&nbsp;|&nbsp;<a href="#">东南亚菜</a>&nbsp;|&nbsp;<a href="#">江浙菜</a>&nbsp;|

&nbsp;<a href="#">东北菜</a><br /><a href="#">创意菜</a>&nbsp;|&nbsp;<a href="#">西北菜</a>&nbsp;|&nbsp;<a href="#">云贵菜

</a></span></li>
            </ul>
        </li>
        <li>酒店/快顶有房<br /><span>经济型酒店&nbsp;&nbsp;主题酒店&nbsp;&nbsp;豪华酒店</span>
        	<ul>
            	<li>酒店</li>
                <li><span><a href="SelectGoodsByGclidServlet?gclid=3">经济型酒店</a>&nbsp;|&nbsp;<a href="SelectGoodsByGclidServlet?gclid=4">豪华型酒店</a>&nbsp;|&nbsp;<a href="#">公寓式酒

店</a><br /><a href="#">主题酒店</a>&nbsp;|&nbsp;<a href="#">度假酒店</a>&nbsp;|&nbsp;<a href="#">温泉酒店</a>&nbsp;|

&nbsp;<a href="#">客栈</a><br /><a href="#">青年旅社</a>&nbsp;|&nbsp;<a href="#">钟点房</a><a href="#">酒店快订

</a></span></li>
            </ul>
        </li>
        <li>电影/在线选座
        	<ul>
            	<li>电影</li>
                <li><span><a href="SelectGoodsByGclidServlet?gclid=5">美嘉欢乐影城</a>&nbsp;|&nbsp;<a href="SelectGoodsByGclidServlet?gclid=5">华谊兄弟影院</a>&nbsp;|&nbsp;<a href="#">保

利国际影城</a><br /><a href="#">CGV星星国际影城</a>&nbsp;|&nbsp;<a href="#">横店电影城</a><br /><a href="#">17.5影城

</a>&nbsp;|&nbsp;<a href="#">金逸影城</a>&nbsp;|&nbsp;<a href="#">鲁信影城</a></span></li>
            </ul>
        </li>
        <li>休闲娱乐<br /><span>KTV&nbsp;&nbsp;足疗按摩&nbsp;&nbsp;水上世界</span>
        	<ul>
            	<li>休闲娱乐</li>
                <li><span><a href="SelectGoodsByGclidServlet?gclid=6">KTV</a>&nbsp;|&nbsp;<a href="SelectGoodsByGclidServlet?gclid=7">足疗按摩</a>&nbsp;|&nbsp;<a href="#">水上世界

</a>&nbsp;|&nbsp;<a href="#">亲子游玩</a>&nbsp;|&nbsp;<a href="#">温泉</a><br /><a href="#">洗浴/汗蒸</a>&nbsp;|&nbsp;<a 

href="#">滑雪</a>&nbsp;|&nbsp;<a href="#">游泳/水上乐园</a></span></li>
            </ul>
        </li>
        <li>旅游<br /><span>景点门票&nbsp;&nbsp;本地/周边游&nbsp;&nbsp;国内游</span>
        	<ul>
            	<li>旅游</li>
                <li><span><a href="SelectGoodsByGclidServlet?gclid=8">景点门票</a>&nbsp;|&nbsp;<a href="SelectGoodsByGclidServlet?gclid=8">国内游</a>&nbsp;|&nbsp;<a href="#">境外游</a>&nbsp;|&nbsp;<a href="#">本地/周边游</a></span></li>
            </ul>
        </li>
        <li>生活服务<br /><span>婚纱摄影&nbsp;&nbsp;个性写真&nbsp;&nbsp;儿童摄影</span>
        	<ul>
            	<li>生活服务</li>
                <li><span><a href="SelectGoodsByGclidServlet?gclid=10">婚纱摄影</a>&nbsp;|&nbsp;<a href="SelectGoodsByGclidServlet?gclid=11">儿童摄影</a>&nbsp;|&nbsp;<a href="#">个性写真

</a>&nbsp;|&nbsp;<a href="#">其他摄影</a><br /><a href="#">照片冲印</a>&nbsp;|&nbsp;<a href="#">汽车服务</a>&nbsp;|

&nbsp;<a href="#">配镜</a>&nbsp;|&nbsp;<a href="#">体检保健</a></span></li>
            </ul>
        </li>
        <li>购物<br /><span>电器/数码&nbsp;&nbsp;女装&nbsp;&nbsp;男装</span>
        	<ul>
            	<li>购物</li>
                <li><span><a href="SelectGoodsByGclidServlet?gclid=12">女装</a>&nbsp;|&nbsp;<a href="SelectGoodsByGclidServlet?gclid=12">男装</a>&nbsp;|&nbsp;<a href="#">内衣</a>&nbsp;|

&nbsp;<a href="SelectGoodsByGclidServlet?gclid=13">鞋靴</a>&nbsp;|&nbsp;<a href="#">箱包/皮具</a><br /><a href="#">家居日用</a>&nbsp;|&nbsp;<a href="#">家

纺</a>&nbsp;|&nbsp;<a href="#">饰品</a></span></li>
            </ul>
        </li>
        <li>丽人<br /><span>美发&nbsp;&nbsp;美容美体&nbsp;&nbsp;美甲</span>
        	<ul>
            	<li>丽人</li>
                <li><span><a href="SelectGoodsByGclidServlet?gclid=14">美发</a>&nbsp;|&nbsp;<a href="#">美容/美体</a>&nbsp;|&nbsp;<a href="SelectGoodsByGclidServlet?gclid=15">美甲

</a>&nbsp;|&nbsp;<a href="#">瑜伽/舞蹈</a><br /><a href="#">个性写真</a></span></li>
            </ul>
        </li>
        <li id="lastli">抽奖</li>
    </ul>
</div>
<!-- center是中间部分 -->
<div id="center">
<!-- top是中间部分的导航菜单 -->
<div id="top">
	<ul>
    	<li><a href="mainShowGoodsServlet">首页</a></li>
        <li><a href="#">身边团购</a></li>
        <li><a href="#">身边外卖</a></li>
        <li><a href="#">今日新单</a></li>
        <li><a href="#">购物</a></li>
        <li><a href="#">商家点评</a></li>
        <li><a href="#">大牌街</a></li>
        <li><a href="#">名店抢购</a></li>
    </ul>
</div>
</div>
</div>

<div id="c2">
	<span id="dl">已有放心团帐号？<a href="login.jsp">登录</a></span>
	<div id="ks">快速注册放心团</div>
<hr />
<form action="regServlet?x=0" method="post" onsubmit="return checkForm()">
<ul id="ul">
	<li>手&nbsp;&nbsp;机&nbsp;&nbsp;号：<input type="text" name="tel" id="tel" onblur="checkTel(this)"/><span id="telspan" class="hspan">用于登录和找回密码，不会公开</span></li>
	<li>账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name="username" id="username" onblur="checkName(this)"/><span id="namespan" class="hspan">首位为字母的4-16位字符串</span></li>
	<li>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="userpwd1" id="userpwd1" onblur="checkpwd1(this)" onkeyup="pwStrength(this.value)" maxlength="16"/><span id="pwd1span" class="hspan">密码长度不能小于6位，大于16位</span><br>
	<div class="qd" id="ruo"></div><div class="qd" id="zhong"></div><div class="qd" id="qiang"></div></li><div id="cl"></div>
	<li>确认密码：<input type="password" name="userpwd2" id="userpwd2" onblur="checkpwd2(this)"/><span id="pwd2span"></span></li>
</ul>
	<input type="submit" value="同意以下协议并注册" class="btn" id="btn"/><input type="reset" value="重置" class="btn" id="cz"/><br/>
	<div id="xy"><a href="#" id="fxtyhxy">《放心团用户协议》</a></div>
</form>
</div>
</div>
<!--  -->
<div id="shiwu"></div>
<div id="shiliu"></div>
</body>
</html>
<script>
$("#fxt").hover(function(){
	$("#fxtlb").css("display","block");
	$("#fxtlb li").css("background-color","white");
	},function(){
		$("#fxtlb").css("display","none");
});

$("#fxtlb li").hover(function(){
	$(this).css("background-color","#2CB8AD");
	$(this).css("color","#fff");
	},function(){
		$(this).css("background-color","white");
		$(this).css("color","#777");
});

$("#kf").hover(function(){
	$("#kflb").css("display","block");
	$("#kflb li").css("background-color","white");
	},function(){
		$("#kflb").css("display","none");
});

$("#kflb li").hover(function(){
	$(this).css("background-color","#2CB8AD");
	$(this).css("color","#fff");
	},function(){
		$(this).css("background-color","white");
		$(this).css("color","#777");
});
$("#ul li").hover(
	function(){
		$(this).css("background-color","#fed");
	},function(){
		$(this).css("background-color","#fff");
});
/*$("#cz").click()(function(){
	$("#ruo").css("background-color","#fed");
});*/
//此处为顶部轮换广告
var num1=2;
function lunhuan()
{
	if(num1>3)
		num1=1;
	$("#two img").attr("src","pic/top"+num1+".jpg");
	num1++;
	}
setInterval("lunhuan()",5000);
//此处为控制菜单的显示与隐藏
$("#four #firstli").hover(
function(){
	$("#four>#left>ul>li").css("display","block");
}
);
$("#four>#left>ul").hover(
function(){
},
function(){
	$("#four>#left>ul>li:gt(0)").css("display","none");
}
);
</script>
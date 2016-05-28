<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
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
	width:70px;
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
margin:auto;
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
}
#four #left{
	border:2px solid #2bb8aa;
	width:195px;
	height:485px;
	float:left;
}
#four #left ul{
	list-style:none;
	margin:0px;
	padding:0px;
}
#four #left>ul>li{
	padding:10px 16px 10px 10px;
	margin:0px;
	border-bottom:1px solid #ccc;
	font-size:14px;
	font-weight:bold;
	position:relative;
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
}
#four #left span{
	font-size:12px;
	font-weight:normal;
	color:#666;
}
#four #left ul li ul{
	border:1px solid #2bb8aa;
	position:absolute;
	left:196px;
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
	width:560px;
	height:485px;
}
#four #center #top{
	height:38px;
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
	line-height:38px;
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
#four #center #er{
height:450px;
padding-left:5px;
padding-right:5px;
}
#four #center #er ul{
margin:0px;
padding:0px;
overflow:hidden;
}
#four #center #er ul li{
margin-left:10px;
padding:0px;
float:left;
height:30px;
line-height:30px;
font-size:12px;
list-style-type:none;
}
#four #center #er #a{
color:#999999;
background:url("pic/007.jpg") left top no-repeat;
padding-left:25px;
margin-left:0px;
}
#four #center #er #b{
color:#999999;
background:url("pic/008.jpg") left top no-repeat;
padding-left:25px;
margin-left:0px;
}
#four #center #er ul a:link{
color:black;
}
#four #center #er ul a:hover{
color:green;
}
#four #center #er ul a:visited{
color:red;
}
#four #center #er #c{
width:520px;
height:25px;
line-height:25px;
font-size:15px;
font-weight:bold;
background:url("pic/009.jpg") left top no-repeat;
padding-left:25px;
}
#four #center #er #d1,#d2,#d3,#d4{
width:520px;
height:315px;
margin-top:5px;
overflow:hidden;
}
#four #center #er #d2,#d3,#d4{
display:none;
}
#four #center #er .d{
width:255px;
height:310px;
float:left;
overflow:hidden;
margin-left:5px;
}
#four #center #er img{
width:255px;
height:250px;
border:none;
}
#four #center #er .div1{
float:left;
width:180px;
height:60px;
padding-left:5px;
padding-right:5px;
background-color:#F6F6F6;
border-right:dashed;
}
#four #center #er .div2{
float:left;
width:60px;
height:60px;
line-height:60px;
text-align:center;
font-size:18px;
color:red;
}
#four #center #er .d a{
text-decoration:none;
}
#five #er .span1{
line-height:30px;
font-size:14px;
font-weight:bold;
}
#four #center #er .span2{
line-height:15px;
font-size:12px;
}
#four #right{
float:left;
width:210px;
height:488px;
margin-left:8px;
border:1px solid #f5f5f5;

}
#six,#seven,#eight,#nine,#ten,#eleven,#shier,#shisan,#shisi{
width:980px;
height:950px;
margin-top:10px;
background-color:#F9F9F9;
}
#six #a,#seven #a,#eight #a,#nine #a,#ten #a,#eleven #a,#shier #a,#shisan #a,#shisi #a,#shiqi #a{
width:980px;
height:50px;
line-height:50px;
padding-left:20px;
font-size:16px;
font-weight:bold;
}

#six #b,#seven #b,#eight #b,#nine #b,#ten #b,#eleven #b,#shier #b,#shisan #b,#shisi #b{
width:980px;
height:900px;
overflow:hidden;
}

#six #b .a,#seven #b .a,#eight #b .a,#nine #b .a,#ten #b .a,#eleven #b .a,#shier #b .a,#shisan #b .a,#shisi #b .a,#shiqi #b .a{
width:320px;
height:450px;
float:left;
overflow:hidden;
}

#six #b .a img,#seven #b .a img,#eight #b .a img,#nine #b .a img,#ten #b .a img,#eleven #b .a img,#shier #b .a img,#shisan #b .a img,#shisi #b .a img,#shiqi #b .a img{
width:320px;
height:300px;
border:none;
}
#six #b .b,#seven #b .b,#eight #b .b,#nine #b .b,#ten #b .b,#eleven #b .b,#shier #b .b,#shisan #b .b,#shisi #b .b,#shiqi #b .b{
width:320px;
height:75px;
padding:5px;
}
#six #b .c,#seven #b .c,#eight #b .c,#nine #b .c,#ten #b .c,#eleven #b .c,#shier #b .c,#shisan #b .c,#shisi #b .c,#shiqi #b .c{
width:320px;
height:35px;
}
#six #b .span1,#seven #b .span1,#eight #b .span1,#nine #b .span1,#ten #b .span1,#eleven #b .span1,#shier #b .span1,#shisan #b .span1,#shisi #b .span1,#shiqi #b .span1{
line-height:30px;
font-size:20px;
font-weight:bold;
color:black;
}
#six #b .span2,#seven #b .span2,#eight #b .span2,#nine #b .span2,#ten #b .span2,#eleven #b .span2,#shier #b .span2,#shisan #b .span2,#shisi #b .span2,#shiqi #b .span2{
line-height:15px;
font-size:14px;
color:#999999;
}
#six #b .span3,#seven #b .span3,#eight #b .span3,#nine #b .span3,#ten #b .span3,#eleven #b .span3,#shier #b .span3,#shisan #b .span3,#shisi #b .span3,#shiqi #b .span3{
font-size:14px;
color:red;
}
#six #b .span4,#seven #b .span4,#eight #b .span4,#nine #b .span4,#ten #b .span4,#eleven #b .span4,#shier #b .span4,#shisan #b .span4,#shisi #b .span4,#shiqi #b .span4{
font-size:24px;
color:red;
}
#six #b .span5,#seven #b .span5,#eight #b .span5,#nine #b .span5,#ten #b .span5,#eleven #b .span5,#shier #b .span5,#shisan #b .span5,#shisi #b .span5,#shiqi #b .span5{
font-size:14px;
color:#999999;
}
#six #b .span6,#seven #b .span6,#eight #b .span6,#nine #b .span6,#ten #b .span6,#eleven #b .span6,#shier #b .span6,#shisan #b .span6,#shisi #b .span6,#shiqi #b .span6{
font-size:12px;
color:#999999;
}
#six #b a,#seven #b a,#eight #b a,#nine #b a,#ten #b a,#eleven #b a,#shier #b a,#shisan #b a,#shisi #b a,#shiqi #b a{
text-decoration:none;
}
#six #b a:hover .span2,#seven #b a:hover .span2,#eight #b a:hover .span2,#nine #b a:hover .span2,#ten #b a:hover .span2,#eleven #b a:hover .span2,#shier #b a:hover .span2,#shisan #b a:hover .span2,#shisi #b a:hover .span2,#shiqi #b a:hover .span2{
color:black;
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
<body >

<!-- dingbu是首页最顶部菜单 -->
<div id="dingbu">
<div id="title">
<ul>
	<li>团购一次&nbsp;&nbsp;放心一次&nbsp;&nbsp;</li>
	<c:choose>
	      <c:when test="${empty nowuser }">
	      <li style="width:110px;"><a href="login.jsp">登录</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="reg.jsp">注册</a>&nbsp;&nbsp;|</li>
	      </c:when>
	      <c:otherwise>
	      <li style="width:110px;">Hi,${nowuser.username }&nbsp;&nbsp;<a href="Exit">退出</a></li>
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
    <li>管理平台&nbsp;<img src="pic/xiaosanjiao.jpg" />
    	<ul>
        	<li><a href="admin/adminLogin.jsp">平台登陆</a></li>
        </ul>
    </li>
    <li>更多&nbsp;<img src="pic/xiaosanjiao.jpg" />
    	<ul>
        	<li>about us</li>
        </ul>
    </li>
</ul>
</div>
</div>

<!-- main是除顶部以为的主题部分 -->
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
<!-- four是首页导航菜单部分 -->
<div id="four">
<!-- left是左侧导航 -->
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
<!-- center是导航栏中间部分 -->
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
<!-- er是中间部分的热门购物 -->
<div id="er">

<ul><li id="a">热门团购</li><li><a href="SelectGoodsByGclidServlet?gclid=1">火锅</a></li><li><a href="SelectGoodsByGclidServlet?gclid=2">自助餐</a></li><li><a href="SelectGoodsByGclidServlet?gclid=6">KTV</a></li><li><a href="SelectGoodsByGclidServlet?gclid=3">经济型酒店</a></li><li><a href="#">公寓式酒店</a></li><li><a href="#">电影</a></li><li><a href="#">烧烤</a></li><li><a href="#">KTV</a></li><li><a href="#">足疗按摩</a></li></ul><hr>
<ul><li id="b">全部区域</li><li><a href="#">金水区</a></li><li><a href="#">中原区</a></li><li><a href="#">二七区</a></li><li><a href="#">管城回族区</a></li><li><a href="#">惠济区</a></li><li><a href="#">上街区</a></li><li><a href="#">高新区</a></li><li><a href="#">近郊</a></li><li><a href="#">其它</a></li></ul><hr>
<div id="c">本周精选</div>

<div id="d1">
<div class="d"><a href="SelectGoodsServlet1?gid=${weeklist[0].gid }&xuan=3"><img src="img/${weeklist[0].pic1 }"></a><div class="div1"><a href="SelectGoodsServlet1?gid=${weeklist[0].gid }&xuan=3"><span class="span1">${weeklist[0].gname }</span></a><br><span class="span2">${weeklist[0].intro }</span></div><div class="div2">￥${weeklist[0].nowprice }</div></div>
<div class="d"><a href="SelectGoodsServlet1?gid=${weeklist[1].gid }&xuan=3"><img src="img/${weeklist[1].pic1 }"></a><div class="div1"><a href="SelectGoodsServlet1?gid=${weeklist[1].gid }&xuan=3"><span class="span1">${weeklist[1].gname }</span></a><br><span class="span2">${weeklist[1].intro }</span></div><div class="div2">￥${weeklist[1].nowprice }</div></div>
</div>

<div id="d2">
<div class="d"><a href="SelectGoodsServlet1?gid=${weeklist[2].gid }&xuan=3"><img src="img/${weeklist[2].pic1 }"></a><div class="div1"><a href="SelectGoodsServlet1?gid=${weeklist[2].gid }&xuan=3"><span class="span1">${weeklist[2].gname }</span></a><br><span class="span2">${weeklist[2].intro }</span></div><div class="div2">￥${weeklist[2].nowprice }</div></div>
<div class="d"><a href="SelectGoodsServlet1?gid=${weeklist[3].gid }&xuan=3"><img src="img/${weeklist[3].pic1 }"></a><div class="div1"><a href="SelectGoodsServlet1?gid=${weeklist[3].gid }&xuan=3"><span class="span1">${weeklist[3].gname }</span></a><br><span class="span2">${weeklist[3].intro }</span></div><div class="div2">￥${weeklist[3].nowprice }</div></div>
</div>

<div id="d3">
<div class="d"><a href="SelectGoodsServlet1?gid=${weeklist[4].gid }&xuan=3"><img src="img/${weeklist[4].pic1 }"></a><div class="div1"><a href="SelectGoodsServlet1?gid=${weeklist[4].gid }&xuan=3"><span class="span1">${weeklist[4].gname }</span></a><br><span class="span2">${weeklist[4].intro }</span></div><div class="div2">￥${weeklist[4].nowprice }</div></div>
<div class="d"><a href="SelectGoodsServlet1?gid=${weeklist[5].gid }&xuan=3"><img src="img/${weeklist[5].pic1 }"></a><div class="div1"><a href="SelectGoodsServlet1?gid=${weeklist[5].gid }&xuan=3"><span class="span1">${weeklist[5].gname }</span></a><br><span class="span2">${weeklist[5].intro }</span></div><div class="div2">￥${weeklist[5].nowprice }</div></div>
</div>

<div id="d4">
<div class="d"><a href="SelectGoodsServlet1?gid=${weeklist[6].gid }&xuan=3"><img src="img/${weeklist[6].pic1 }"></a><div class="div1"><a href="SelectGoodsServlet1?gid=${weeklist[6].gid }&xuan=3"><span class="span1">${weeklist[6].gname }</span></a><br><span class="span2">${weeklist[6].intro }</span></div><div class="div2">￥${weeklist[6].nowprice }</div></div>
<div class="d"><a href="SelectGoodsServlet1?gid=${weeklist[7].gid }&xuan=3"><img src="img/${weeklist[7].pic1 }"></a><div class="div1"><a href="SelectGoodsServlet1?gid=${weeklist[7].gid }&xuan=3"><span class="span1">${weeklist[7].gname }</span></a><br><span class="span2">${weeklist[7].intro }</span></div><div class="div2">￥${weeklist[7].nowprice }</div></div>
</div>

</div>
</div>
<!-- right是导航部分中右侧的轮换图片 -->
<div id="right"><img src="pic/guanggao1.jpg"/></div>
</div>
<!--  -->
<div id="six">
<div id="a">今日新单</div>

<div id="b">
<div class="a">							 <a href="SelectGoodsServlet1?gid=${todaylist[0].gid }&xuan=3"><img src="img/${todaylist[0].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${todaylist[0].gid }&xuan=3"><span class="span1">${todaylist[0].gname }</span><br><span class="span2">${todaylist[0].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${todaylist[0].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${todaylist[0].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${todaylist[1].gid }&xuan=3"><img src="img/${todaylist[1].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${todaylist[1].gid }&xuan=3"><span class="span1">${todaylist[1].gname }</span><br><span class="span2">${todaylist[1].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${todaylist[1].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${todaylist[1].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${todaylist[2].gid }&xuan=3"><img src="img/${todaylist[2].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${todaylist[2].gid }&xuan=3"><span class="span1">${todaylist[2].gname }</span><br><span class="span2">${todaylist[2].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${todaylist[2].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${todaylist[2].price }</span></div></div>
<div class="a">							 <a href="SelectGoodsServlet1?gid=${todaylist[3].gid }&xuan=3"><img src="img/${todaylist[3].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${todaylist[3].gid }&xuan=3"><span class="span1">${todaylist[3].gname }</span><br><span class="span2">${todaylist[3].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${todaylist[3].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${todaylist[3].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${todaylist[4].gid }&xuan=3"><img src="img/${todaylist[4].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${todaylist[4].gid }&xuan=3"><span class="span1">${todaylist[4].gname }</span><br><span class="span2">${todaylist[4].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${todaylist[4].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${todaylist[4].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${todaylist[5].gid }&xuan=3"><img src="img/${todaylist[5].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${todaylist[5].gid }&xuan=3"><span class="span1">${todaylist[5].gname }</span><br><span class="span2">${todaylist[5].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${todaylist[5].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${todaylist[5].price }</span></div></div>
</div>
</div>

<div id="seven">
<div id="a">美食</div>

<div id="b">
<div class="a">							 <a href="SelectGoodsServlet1?gid=${meishilist[0].gid }&xuan=3"><img src="img/${meishilist[0].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${meishilist[0].gid }&xuan=3"><span class="span1">${meishilist[0].gname }</span><br><span class="span2">${meishilist[0].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${meishilist[0].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${meishilist[0].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${meishilist[1].gid }&xuan=3"><img src="img/${meishilist[1].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${meishilist[1].gid }&xuan=3"><span class="span1">${meishilist[1].gname }</span><br><span class="span2">${meishilist[1].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${meishilist[1].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${meishilist[1].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${meishilist[2].gid }&xuan=3"><img src="img/${meishilist[2].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${meishilist[2].gid }&xuan=3"><span class="span1">${meishilist[2].gname }</span><br><span class="span2">${meishilist[2].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${meishilist[2].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${meishilist[2].price }</span></div></div>
<div class="a">							 <a href="SelectGoodsServlet1?gid=${meishilist[3].gid }&xuan=3"><img src="img/${meishilist[3].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${meishilist[3].gid }&xuan=3"><span class="span1">${meishilist[3].gname }</span><br><span class="span2">${meishilist[3].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${meishilist[3].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${meishilist[3].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${meishilist[4].gid }&xuan=3"><img src="img/${meishilist[4].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${meishilist[4].gid }&xuan=3"><span class="span1">${meishilist[4].gname }</span><br><span class="span2">${meishilist[4].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${meishilist[4].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${meishilist[4].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${meishilist[5].gid }&xuan=3"><img src="img/${meishilist[5].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${meishilist[5].gid }&xuan=3"><span class="span1">${meishilist[5].gname }</span><br><span class="span2">${meishilist[5].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${meishilist[5].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${meishilist[5].price }</span></div></div>
</div>
</div>

<div id="eight">
<div id="a">酒店</div>

<div id="b">
<div class="a">    						 <a href="SelectGoodsServlet1?gid=${jiudianlist[0].gid }&xuan=3"><img src="img/${jiudianlist[0].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${jiudianlist[0].gid }&xuan=3"><span class="span1">${jiudianlist[0].gname }</span><br><span class="span2">${jiudianlist[0].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${jiudianlist[0].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${jiudianlist[0].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${jiudianlist[1].gid }&xuan=3"><img src="img/${jiudianlist[1].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${jiudianlist[1].gid }&xuan=3"><span class="span1">${jiudianlist[1].gname }</span><br><span class="span2">${jiudianlist[1].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${jiudianlist[1].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${jiudianlist[1].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${jiudianlist[2].gid }&xuan=3"><img src="img/${jiudianlist[2].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${jiudianlist[2].gid }&xuan=3"><span class="span1">${jiudianlist[2].gname }</span><br><span class="span2">${jiudianlist[2].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${jiudianlist[2].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${jiudianlist[2].price }</span></div></div>
<div class="a">							 <a href="SelectGoodsServlet1?gid=${jiudianlist[3].gid }&xuan=3"><img src="img/${jiudianlist[3].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${jiudianlist[3].gid }&xuan=3"><span class="span1">${jiudianlist[3].gname }</span><br><span class="span2">${jiudianlist[3].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${jiudianlist[3].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${jiudianlist[3].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${jiudianlist[4].gid }&xuan=3"><img src="img/${jiudianlist[4].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${jiudianlist[4].gid }&xuan=3"><span class="span1">${jiudianlist[4].gname }</span><br><span class="span2">${jiudianlist[4].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${jiudianlist[4].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${jiudianlist[4].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${jiudianlist[5].gid }&xuan=3"><img src="img/${jiudianlist[5].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${jiudianlist[5].gid }&xuan=3"><span class="span1">${jiudianlist[5].gname }</span><br><span class="span2">${jiudianlist[5].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${jiudianlist[5].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${jiudianlist[5].price }</span></div></div>
</div>
</div>

<div id="nine">
<div id="a">电影</div>

<div id="b">
<div class="a">							 <a href="SelectGoodsServlet1?gid=${dianyinglist[0].gid }&xuan=3"><img src="img/${dianyinglist[0].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${dianyinglist[0].gid }&xuan=3"><span class="span1">${dianyinglist[0].gname }</span><br><span class="span2">${dianyinglist[0].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${dianyinglist[0].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${dianyinglist[0].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${dianyinglist[1].gid }&xuan=3"><img src="img/${dianyinglist[1].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${dianyinglist[1].gid }&xuan=3"><span class="span1">${dianyinglist[1].gname }</span><br><span class="span2">${dianyinglist[1].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${dianyinglist[1].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${dianyinglist[1].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${dianyinglist[2].gid }&xuan=3"><img src="img/${dianyinglist[2].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${dianyinglist[2].gid }&xuan=3"><span class="span1">${dianyinglist[2].gname }</span><br><span class="span2">${dianyinglist[2].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${dianyinglist[2].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${dianyinglist[2].price }</span></div></div>
<div class="a">							 <a href="SelectGoodsServlet1?gid=${dianyinglist[3].gid }&xuan=3"><img src="img/${dianyinglist[3].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${dianyinglist[3].gid }&xuan=3"><span class="span1">${dianyinglist[3].gname }</span><br><span class="span2">${dianyinglist[3].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${dianyinglist[3].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${dianyinglist[3].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${dianyinglist[4].gid }&xuan=3"><img src="img/${dianyinglist[4].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${dianyinglist[4].gid }&xuan=3"><span class="span1">${dianyinglist[4].gname }</span><br><span class="span2">${dianyinglist[4].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${dianyinglist[4].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${dianyinglist[4].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${dianyinglist[5].gid }&xuan=3"><img src="img/${dianyinglist[5].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${dianyinglist[5].gid }&xuan=3"><span class="span1">${dianyinglist[5].gname }</span><br><span class="span2">${dianyinglist[5].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${dianyinglist[5].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${dianyinglist[5].price }</span></div></div>
</div>
</div>

<div id="ten">
<div id="a">休闲娱乐</div>

<div id="b">
<div class="a">                          <a href="SelectGoodsServlet1?gid=${yulelist[0].gid }&xuan=3"><img src="img/${yulelist[0].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${yulelist[0].gid }&xuan=3"><span class="span1">${yulelist[0].gname }</span><br><span class="span2">${yulelist[0].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${yulelist[0].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${yulelist[0].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${yulelist[1].gid }&xuan=3"><img src="img/${yulelist[1].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${yulelist[1].gid }&xuan=3"><span class="span1">${yulelist[1].gname }</span><br><span class="span2">${yulelist[1].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${yulelist[1].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${yulelist[1].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${yulelist[2].gid }&xuan=3"><img src="img/${yulelist[2].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${yulelist[2].gid }&xuan=3"><span class="span1">${yulelist[2].gname }</span><br><span class="span2">${yulelist[2].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${yulelist[2].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${yulelist[2].price }</span></div></div>
<div class="a">							 <a href="SelectGoodsServlet1?gid=${yulelist[3].gid }&xuan=3"><img src="img/${yulelist[3].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${yulelist[3].gid }&xuan=3"><span class="span1">${yulelist[3].gname }</span><br><span class="span2">${yulelist[3].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${yulelist[3].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${yulelist[3].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${yulelist[4].gid }&xuan=3"><img src="img/${yulelist[4].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${yulelist[4].gid }&xuan=3"><span class="span1">${yulelist[4].gname }</span><br><span class="span2">${yulelist[4].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${yulelist[4].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${yulelist[4].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${yulelist[5].gid }&xuan=3"><img src="img/${yulelist[5].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${yulelist[5].gid }&xuan=3"><span class="span1">${yulelist[5].gname }</span><br><span class="span2">${yulelist[5].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${yulelist[5].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${yulelist[5].price }</span></div></div>
</div>
</div>

<div id="eleven">
<div id="a">旅游</div>

<div id="b">
<div class="a">							 <a href="SelectGoodsServlet1?gid=${lvyoulist[0].gid }&xuan=3"><img src="img/${lvyoulist[0].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lvyoulist[0].gid }&xuan=3"><span class="span1">${lvyoulist[0].gname }</span><br><span class="span2">${lvyoulist[0].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lvyoulist[0].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lvyoulist[0].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${lvyoulist[1].gid }&xuan=3"><img src="img/${lvyoulist[1].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lvyoulist[1].gid }&xuan=3"><span class="span1">${lvyoulist[1].gname }</span><br><span class="span2">${lvyoulist[1].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lvyoulist[1].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lvyoulist[1].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${lvyoulist[2].gid }&xuan=3"><img src="img/${lvyoulist[2].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lvyoulist[2].gid }&xuan=3"><span class="span1">${lvyoulist[2].gname }</span><br><span class="span2">${lvyoulist[2].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lvyoulist[2].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lvyoulist[2].price }</span></div></div>
<div class="a">							 <a href="SelectGoodsServlet1?gid=${lvyoulist[3].gid }&xuan=3"><img src="img/${lvyoulist[3].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lvyoulist[3].gid }&xuan=3"><span class="span1">${lvyoulist[3].gname }</span><br><span class="span2">${lvyoulist[3].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lvyoulist[3].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lvyoulist[3].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${lvyoulist[4].gid }&xuan=3"><img src="img/${lvyoulist[4].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lvyoulist[4].gid }&xuan=3"><span class="span1">${lvyoulist[4].gname }</span><br><span class="span2">${lvyoulist[4].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lvyoulist[4].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lvyoulist[4].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${lvyoulist[5].gid }&xuan=3"><img src="img/${lvyoulist[5].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lvyoulist[5].gid }&xuan=3"><span class="span1">${lvyoulist[5].gname }</span><br><span class="span2">${lvyoulist[5].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lvyoulist[5].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lvyoulist[5].price }</span></div></div>
</div>
</div>

<div id="shier">
<div id="a">生活服务</div>

<div id="b">
<div class="a">						     <a href="SelectGoodsServlet1?gid=${fuwulist[0].gid }&xuan=3"><img src="img/${fuwulist[0].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${fuwulist[0].gid }&xuan=3"><span class="span1">${fuwulist[0].gname }</span><br><span class="span2">${fuwulist[0].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${fuwulist[0].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${fuwulist[0].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${fuwulist[1].gid }&xuan=3"><img src="img/${fuwulist[1].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${fuwulist[1].gid }&xuan=3"><span class="span1">${fuwulist[1].gname }</span><br><span class="span2">${fuwulist[1].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${fuwulist[1].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${fuwulist[1].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${fuwulist[2].gid }&xuan=3"><img src="img/${fuwulist[2].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${fuwulist[2].gid }&xuan=3"><span class="span1">${fuwulist[2].gname }</span><br><span class="span2">${fuwulist[2].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${fuwulist[2].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${fuwulist[2].price }</span></div></div>
<div class="a">							 <a href="SelectGoodsServlet1?gid=${fuwulist[3].gid }&xuan=3"><img src="img/${fuwulist[3].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${fuwulist[3].gid }&xuan=3"><span class="span1">${fuwulist[3].gname }</span><br><span class="span2">${fuwulist[3].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${fuwulist[3].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${fuwulist[3].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${fuwulist[4].gid }&xuan=3"><img src="img/${fuwulist[4].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${fuwulist[4].gid }&xuan=3"><span class="span1">${fuwulist[4].gname }</span><br><span class="span2">${fuwulist[4].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${fuwulist[4].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${fuwulist[4].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${fuwulist[5].gid }&xuan=3"><img src="img/${fuwulist[5].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${fuwulist[5].gid }&xuan=3"><span class="span1">${fuwulist[5].gname }</span><br><span class="span2">${fuwulist[5].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${fuwulist[5].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${fuwulist[5].price }</span></div></div>
</div>
</div>

<div id="shisan">
<div id="a">购物</div>

<div id="b">
<div class="a">							 <a href="SelectGoodsServlet1?gid=${gouwulist[0].gid }&xuan=3"><img src="img/${gouwulist[0].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${gouwulist[0].gid }&xuan=3"><span class="span1">${gouwulist[0].gname }</span><br><span class="span2">${gouwulist[0].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${gouwulist[0].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${gouwulist[0].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${gouwulist[1].gid }&xuan=3"><img src="img/${gouwulist[1].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${gouwulist[1].gid }&xuan=3"><span class="span1">${gouwulist[1].gname }</span><br><span class="span2">${gouwulist[1].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${gouwulist[1].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${gouwulist[1].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${gouwulist[2].gid }&xuan=3"><img src="img/${gouwulist[2].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${gouwulist[2].gid }&xuan=3"><span class="span1">${gouwulist[2].gname }</span><br><span class="span2">${gouwulist[2].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${gouwulist[2].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${gouwulist[2].price }</span></div></div>
<div class="a">							 <a href="SelectGoodsServlet1?gid=${gouwulist[3].gid }&xuan=3"><img src="img/${gouwulist[3].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${gouwulist[3].gid }&xuan=3"><span class="span1">${gouwulist[3].gname }</span><br><span class="span2">${gouwulist[3].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${gouwulist[3].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${gouwulist[3].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${gouwulist[4].gid }&xuan=3"><img src="img/${gouwulist[4].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${gouwulist[4].gid }&xuan=3"><span class="span1">${gouwulist[4].gname }</span><br><span class="span2">${gouwulist[4].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${gouwulist[4].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${gouwulist[4].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${gouwulist[5].gid }&xuan=3"><img src="img/${gouwulist[5].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${gouwulist[5].gid }&xuan=3"><span class="span1">${gouwulist[5].gname }</span><br><span class="span2">${gouwulist[5].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${gouwulist[5].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${gouwulist[5].price }</span></div></div>
</div>
</div>

<div id="shisi">
<div id="a">丽人</div>

<div id="b">
<div class="a">							 <a href="SelectGoodsServlet1?gid=${lirenlist[0].gid }&xuan=3"><img src="img/${lirenlist[0].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lirenlist[0].gid }&xuan=3"><span class="span1">${lirenlist[0].gname }</span><br><span class="span2">${lirenlist[0].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lirenlist[0].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lirenlist[0].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${lirenlist[1].gid }&xuan=3"><img src="img/${lirenlist[1].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lirenlist[1].gid }&xuan=3"><span class="span1">${lirenlist[1].gname }</span><br><span class="span2">${lirenlist[1].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lirenlist[1].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lirenlist[1].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${lirenlist[2].gid }&xuan=3"><img src="img/${lirenlist[2].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lirenlist[2].gid }&xuan=3"><span class="span1">${lirenlist[2].gname }</span><br><span class="span2">${lirenlist[2].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lirenlist[2].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lirenlist[2].price }</span></div></div>
<div class="a">							 <a href="SelectGoodsServlet1?gid=${lirenlist[3].gid }&xuan=3"><img src="img/${lirenlist[3].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lirenlist[3].gid }&xuan=3"><span class="span1">${lirenlist[3].gname }</span><br><span class="span2">${lirenlist[3].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lirenlist[3].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lirenlist[3].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${lirenlist[4].gid }&xuan=3"><img src="img/${lirenlist[4].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lirenlist[4].gid }&xuan=3"><span class="span1">${lirenlist[4].gname }</span><br><span class="span2">${lirenlist[4].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lirenlist[4].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lirenlist[4].price }</span></div></div>
<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${lirenlist[5].gid }&xuan=3"><img src="img/${lirenlist[5].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${lirenlist[5].gid }&xuan=3"><span class="span1">${lirenlist[5].gname }</span><br><span class="span2">${lirenlist[5].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${lirenlist[5].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${lirenlist[5].price }</span></div></div>
</div>
</div>
</div>
<!--  -->
<div id="shiwu"></div>
<div id="shiliu"></div>
</body>
<script>
var num1=2;
var num2=2;
function lunhuan()
{
	if(num1>3)
		num1=1;
	$("#two img").attr("src","pic/top"+num1+".jpg");
	num1++;
	}
function lunhuan2()
{
	if(num2>3)
		num2=1;
	$("#four #right img").attr("src","pic/guanggao"+num2+".jpg");
	num2++;
	}
var s=1;
function lunhuan3()
{
	if(s>4){
		s=1;
	}
	for(var a=1;a<5;a++){
		if(a==s){
			$("#four #center #er #d"+s).slideDown("2000");
		}else{
			$("#four #center #er #d"+a).css("display","none");
		}
		
	}
	s++;
	}
setInterval("lunhuan()",5000);
setInterval("lunhuan2()",3000);
setInterval("lunhuan3()",5000);
</script>
</html>
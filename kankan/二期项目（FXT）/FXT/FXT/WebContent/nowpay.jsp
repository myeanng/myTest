<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>待提交订单界面</title>
<script src="js/jquery-1.8.3.js"></script>
<style>
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
position:absolute;
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
#four2{
margin-top:65px;
border:1px solid #A0A0A0;
}
#four2 img{
width:978px;
height:100px;
}
#myform{
border:1px solid #A0A0A0;
}
#four3{
height:30px;
line-height:30px;
color:red;
text-align:center;
font-size:14px;
border:1px solid #A0A0A0;
display:none;
}
#five{
width:980px;
margin-top:20px;
}
#six{
width:980px;
margin-top:20px;
}
#xms,#dzs,#dhs{
	display:none;
}
#seven{
width:978px;
margin-top:20px;
border:1px solid #A0A0A0;
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
#cover{
background-color:#CCCCCC;
position:absolute;
top:0px;
left:0px;
filter:alpha(opacity=60);
opacity:0.6!important;
z-index:10;
display:none;
}
#tanchu{
width:400px;
height:450px;
position:absolute;
top:200px;
left:500px;
background-color:white;
border:5px solid #AEAEAE;
z-index:100;
display:none;
}
#tanchu #div1{
height:30px;
line-height:30px;
background:#f5f5f5;
font-size:20px;
font-weight:bold;
margin-bottom:20px;
}
#tanchu #div1 a{
text-decoration:none;
font-size:30px;
font-weight:800;
margin-left:330px;
color:black;
}
#tanchu #div1 a:hover{
color:#2CB8AD;
}
#tanchu table{
width:261px;
margin:auto;
font-size:14px;
color:#666666;
}
#tanchu #td1,#tanchu #td4{
height:30px;
line-height:30px;
position:relative;
}
#tanchu #td1 a{
font-size:12px;
margin-left:100px;
text-decoration: none;
color:#666666;
}
#tanchu #td1 img{
position:absolute;
top:5px;
border:none;
}
#tanchu #td2,#tanchu #td3{
height:60px;
line-height:60px;
}
#tanchu #td2 input,#tanchu #td3 input{
width:226px;
height:34px;
line-height:34px;
font-size:14px;
color:#666666;
padding-left:35px;
border:1px solid #666666;
}
#tanchu #td2 input{
background:url(pic/denglutouxiang.jpg) no-repeat;
}
#tanchu #td3 input{
background:url(pic/denglusuo.jpg) no-repeat;
}
#tanchu #td4{
font-size:12px;
color:black;
}
#tanchu #td4 a{
color:#2CB8AD;
text-decoration: none;
margin-left:40px;
}
#tanchu #td5{
height:80px;
line-height:80px;
text-align:center;
}
#tanchu #td5 input{
width:261px;
height:35px;
border:none;
background:url(pic/cartdenglu.jpg) no-repeat;
}
#tanchu #td6 a{
text-decoration:none;
color:#2CB8AD;
}
#tanchu #td7{
width:261px;
height:100px;
margin:auto;
background:url(pic/cartdenglulianjie.jpg) no-repeat;
}
#tanchu #td0{
color:red;
}
</style>
</head>

<body>
<!-- dingbu是首页最顶部菜单 -->
<!-- dingbu是首页最顶部菜单 -->
<div id="dingbu">
<div id="title">
<ul>
	<li>团购一次&nbsp;&nbsp;放心一次&nbsp;&nbsp;</li>
	<c:choose>
	      <c:when test="${empty nowuser }">
	      <li style="width:90px;"><a href="login.jsp">登录</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">注册</a>&nbsp;&nbsp;|</li>
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

<div id="four2">
<img src="pic/gouwuche1.jpg">
</div>

<form action="AddOrdersServlet?xuan=2" id="myform" method="post">
<div id="four3">每人最多只能选购100件商品</div>
<input type="hidden" value="${gd.gid }" name="gid">
<div id="five">
<table border="1" style="border-collapse:collapse;width:979px;text-align:center;">
	<tr style="background-color:#F7F7F7;font-weight:bold;">
	    <td>图片预览</td>
	    <td>商品名称</td>
	    <td>单价</td>
        <td>数量</td>
        <td>总价</td>
    </tr>
    <tr><td><img src="img/${gd.pic1 }" width=40px height=40px></td><td style="width:300px;">${gd.gname }</td><td><input type="text" value="${gd.nowprice }" id="nowprice" readonly="readonly" style="border:none;"></td><td><input type="button" value="-" class="jian"><input type="text" value="${gd.num }" name="num" size=1 id="num" maxlength="2"><input type="button" value="+" class="jia"></td><td><input type="text" value="${gd.nowprice*gd.num }" id="totalprice" style="border:none;"></td></tr>
<tr><td colspan=5 style="text-align:right;height:50px;"><span style="color:block;font-weight:bold;font-size:14px;">应付金额：</span><span style="color:red;font-weight:bold;font-size:18px">￥<input type="text" value="${gd.nowprice*gd.num }" id="heji" name="zongjia" style="color:red;font-weight:bold;font-size:18px;width:50px;border:none;" readonly="readonly">元</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
</table>
</div>


<c:if test="${!empty nowuser }">
<c:if test="${gd.gclid==12||gd.gclid==13 }">
<div id="six">
<table>
<tr><th colspan="2">收货地址&nbsp;&nbsp;<a href="#">管理</a></th></tr>
<tr id="xms"><td colspan="2" style="font-size:12px;color:red;">请填写正确的收件人姓名，以便商品送达之后我们能及时联系到你</td></tr>
<tr><td>收货人姓名：</td><td><input type="text" id="xm" name="uname"/></td></tr>
<tr id="dzs"><td colspan="2" style="font-size:12px;color:red;">请填写正确的收件人地址，以便商品能及时送达</td></tr>
<tr><td>收货人地址：</td><td><input type="text" id="dz" name="address" value="${nowuser.address }"/>
</td></tr>
<tr id="dhs"><td colspan="2" style="font-size:12px;color:red;">请填写正确的收件人联系方式，以便我们能及时向您发送商品交易信息</td></tr>
<tr><td>收货人电话：</td><td> <input type="text" id="dh" name="tel" value="${nowuser.tel }"/>
</td></tr>
</table>
</div>
</c:if>
</c:if>


<div id="seven" style="text-align:right;margin-bottom:20px;">
<input type="button" id="tijiaodingdan" style="width:129px; height:41px; background:url(pic/tijiao.png); border:none;">
</div>
</form>

</div>
<!--  -->
<div id="shiwu"></div>
<div id="shiliu"></div>

<div id="cover"></div>

<div id="tanchu">
<div id="div1">
登陆<a href="#">×</a>
</div>
<form action="loginServlet?xuan=2" method="post">
<table cellpadding="0" cellspacing="0">
<tr><td id="td0"></td></tr>
<tr><td id="td1">账号登陆<a href="#">手机动态码登陆<img src="pic/xiaoshouji.jpg"/></a></td></tr>
<tr><td id="td2"><input type="text" value="手机号/用户名/邮箱" name="username"/></td></tr>
<tr><td id="td3"><input type="password" value="" name="userpwd"/></td></tr>
<tr><td id="td4"><input type="checkbox">记住账号<input type="checkbox">下次自动登陆<a href="#">忘记密码？</a></td></tr>
<tr><td id="td5"><input type="button" value=""/></td></tr>
<tr><td id="td6">还没有账号？<a href="#">免费注册</a></td></tr>
</table>
<div id="td7"></div>
</form>
</div>

</body>
<script>
//单击减按钮时动态改变商品的总价和合计的价格
$(".jian").click(function(){
	var num=$(this).next().val();
	--num;
	if(num<1)
	num=1;
	$(this).next().val(num);
	var price=parseFloat($("#nowprice").val());
	$("#totalprice").val(price*num);
	$("#heji").val(price*num);
	if(num<=100){
		$("#four3").css("display","none");
		$("#seven #tijiaodingdan").removeAttr("disabled");
	}
});
//单击加按钮时动态改变商品的总价和合计的价格
$(".jia").click(function(){
	var num=$(this).prev().val();
	++num;
	$(this).prev().val(num);
	var price=parseFloat($("#nowprice").val());
	$("#totalprice").val(price*num);
	$("#heji").val(price*num);
	if(num>100){
		$("#four3").css("display","block");
		$("#seven #tijiaodingdan").prop("disabled","disabled");
	}
})
$(".num").blur(function(){
	//var num=$(this).val();
	//alert(num);
});
$(".num").keyup(function(){
	//var num=$(this).val();
});

//点击提交按钮时判断是否为登陆用户
$("#tijiaodingdan").click(function(){
		$.ajax({
			url:'checkloginServlet',
			type:'post',
			success:function(data){
				//如果没登陆，让登陆遮罩层出现
				if(data=="false"){
					$("#cover").css("display","block");
					$("#tanchu").css("display","block");
				}else{//如果为登陆用户，。。。
						if($("#six")!=null){
							if($("#xm").val()==""){
								$("#xms").css("display","block");
							}
							if($("#dz").val()==""){
								$("#dzs").css("display","block");
							}
							if($("#dh").val()==""){
								$("#dhs").css("display","block");
							}
							if($("#xm").val()!=""&&$("#dz").val()!=""&&$("#dh").val()!=""){
								$("#myform").submit();
							}
						}else{
							$("#myform").submit();
						}
					}
			},
			error:function(xhr,msg){
				alert(msg);
			}
		});
	
});

//页面加载时确定遮罩层的宽高
$(function(){
	$("#cover").css("width",document.documentElement.scrollWidth+"px");
	$("#cover").css("height",document.documentElement.scrollHeight+"px");
});
$("#denglu").click(function(){
	$.ajax({
		url:'loginServlet',
		type:'post',
		data:{
			xuan:'3',
			username:$("#username").val(),
	        userpwd:$("#userpwd").val()
		},
		success:function(data){
			//如果通过遮罩层登陆成功，让登陆遮罩层隐藏
			if(data=="true"){
				$("#cover").css("display","none");
				$("#tanchu").css("display","none");
			}else{//如果没有成功，给出提示信息
					$("#tishi").css("display","block");
				}
		},
		error:function(xhr,msg){
			alert(msg);
		}
	});
});
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
//控制收货地址里边提示信息的隐藏
$("#xm,#dz,#dh").focus(
		function(){
			$("#"+$(this).get(0).id+"s").css("display","none");
		}
		);
//控制弹出层里账号输入框的提示信息隐藏和显示
$("#tanchu #td2 input").focus(function(){
	$("#tanchu #td0").html("");
	var s=$(this).val();
	if(s=="手机号/用户名/邮箱")
	$(this).val("");
});
$("#tanchu #td3 input").focus(function(){
	$("#tanchu #td0").html("");
})
$("#tanchu #td2 input").blur(function(){
	var s=$(this).val();
	if($.trim(s).length==0)
	$(this).val("手机号/用户名/邮箱");
})
//弹出层右上角的×号实现遮罩层的隐藏
$("#tanchu #div1 a").click(function(){
	$("#tanchu").css("display","none");
	$("#cover").css("display","none");
});
//弹出层登陆按钮点击事件
$("#tanchu #td5 input").click(function(){
	var zhanghao=$("#tanchu #td2 input").val();
	var mima=$("#tanchu #td3 input").val();
	if($.trim(zhanghao)=="手机号/用户名/邮箱"||$.trim(zhanghao).length==0){
		$("#tanchu #td0").html("账号不能为空");
	}else if($.trim(mima).length==0){
		$("#tanchu #td0").html("密码不能为空");
	}else{
		$.ajax({
			url:'loginServlet',
			type:'post',
			dataType:'json',
			data:{
				xuan:2,
				username:zhanghao,
				userpwd:mima,
			},
			success:function(data){
				if(data==false){
					$("#tanchu #td0").html("账号或密码输入有误！");
				}else{//
					$("#tanchu").css("display","none");
					$("#cover").css("display","none");
				}
			},
			error:function(xhr,msg){
				alert(msg);
			}
		});
		
	}
});
$("#num").blur(function(){
	var s=$.trim($(this).val());
	if(s.length==0||!(/([0-9]*[1-9][0-9]*$)/.test(s))){
		alert("数量不能为空或0，且只能为100以内的整数");
		$(this).val("1");
	}
});
</script>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
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
#five{
width:980px;
height:480px;
margin-top:65px;
}
#five #yi{
padding-top:10px;
}
#five #yi #span1{
font-size:28px;
font-weight:900;
line-height:40px;
}
#five #yi #span2{
font-size:18px;
color:#999999;
}
#five #er{
height:385px;
overflow:hidden;
}
#five #er #div1,#div2{
float:left;
width:485px;
height:380px;
}
#five #er #div1 #img1{
width:480px;
height:300px;
}
#five #er #div1 .img2{
width:120px;
height:60px;
margin-right:10px;
border:1px solid #999999;
}
#five #er #div2{
width:465px;
height:370px;
padding-left:20px;
padding-top:10px;
}
#five #er #div2 .span1{
font-size:12px;
color:red;
font-weight:bold;
}
#five #er #div2 #price{
width:100px;
font-size:30px;
color:red;
font-weight:900;
border:none;
}
#five #er #div2 .span3{
font-size:14px;
color:#999999;
}
#five #er #div2 #btn1{
width:170px;
height:50px;
background:url(pic/goumai.jpg) no-repeat;
border:none;
}
#five #er #div2 #btn2{
width:130px;
height:50px;
background:url(pic/gouwuche.jpg) no-repeat;
border:none;
}
#seven{
}
#seven #span1{
height:50px;
line-height:50px;
font-size:20px;
font-weight:bold;
}
#seven #span2{
height:2px;
background-color:#999999;
}
#seven #span3{
font-size:14px;
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
z-index:5;
display:none;
}
#tanchu{
padding-top:50px;
width:300px;
height:200px;
position:absolute;
top:200px;
left:500px;
background-color:white;
border:5px solid #AEAEAE;
z-index:100;
text-align:center;
display:none;
}
#tanchu #btn1{
display:inline-block;
width:113px;
height:35px;
background:url(pic/jixuliulan.jpg) no-repeat;
}
#tanchu #btn2{
display:inline-block;
width:145px;
height:35px;
background:url(pic/qugouwuchejiesuan.jpg) no-repeat;

}
#num{
	border:1px solid #2CB8AD;
	width:32px;
	height:22px;
	line-height: 22px;
}
#jia,#jian{
	border:1px solid #2CB8AD;
	background-color:#2CB8AD;
	width:32px;
	height:26px;
	font-size:16px;
	line-height: 22px;
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
    <li>后台管理&nbsp;<img src="pic/xiaosanjiao.jpg" />
    	<ul>
        	<li><a href="admin/adminLogin.jsp">后台登陆</a></li>
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

<div id="five">

<div id="yi">
<span id="span1">${goods.gname}</span><br>&nbsp;&nbsp;
<span id="span2">${goods.intro }</span>
</div>

<div id="er">

<div id="div1">
<img src="img/${goods.pic1 }" id="img1"/><br><br>
<img src="img/${goods.pic1 }" class="img2"/>
<c:if test="${!empty goods.pic2 }">
<img src="img/${goods.pic2 }" class="img2"/>
</c:if>
<c:if test="${!empty goods.pic3 }">
<img src="img/${goods.pic3 }" class="img2"/>
</c:if>
</div>

<div id="div2">
<form action="NowPayServlet" method="post">
<input type="hidden" value="${goods.gid }" id="gid" name="gid">
<span class="span1">￥</span><input type="text" value="${goods.nowprice }" size="3" id="price" name="nowprive" readonly="readonly">&nbsp;&nbsp;&nbsp;&nbsp;<span class="span3">￥${goods.price }</span><hr>
<span class="span3">已售</span><span class="span1">${goods.num-goods.supnum}</span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="span1">${commentlist.size()}</span><span class="span3">人评价</span><hr>
<span class="span3">有效期&nbsp;&nbsp;&nbsp;&nbsp;${goods.destroytime }</span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="span1">周末节假日通用</span><hr>
<span class="span3">数量</span>&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="-" id="jian">
	<input type="text" name="num" id="num" value="1" maxlength="2">
	<input type="button" value="+" id="jia"><br><br>
<input type="submit" value="" id="btn1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" id="btn2">
</form>
</div>

</div>

</div>

<div id="seven">
<div id="span1">消费评价</div>
<div id="span2"></div>
<div id="span3">
<c:choose>
     <c:when test="${empty commentlist }">
     <p style="font-size:14px;color:#999999;">本团购暂无评价</p>
     </c:when>
     <c:otherwise>
     <c:forEach items="${commentlist }" var="c">
          <span style="line-height:40px;">&nbsp;&nbsp;&nbsp;&nbsp;${c.time }&nbsp;&nbsp;&nbsp;&nbsp;${c.contents }</span><br>
     </c:forEach>
     </c:otherwise>
</c:choose>
</div>
</div>

</div>
<!--  -->
<div id="shiwu"></div>
<div id="shiliu"></div>

<div id="cover"></div>

<div id="tanchu">
<p style="font-weight: bold;"></p>
<input type="button" id="btn1">&nbsp;&nbsp;<a href="ShowCartServlet" id="btn2"></a>
</div>

</body>
<script type="text/javascript">
$(function(){
	$("#cover").css("width",document.documentElement.scrollWidth+"px");
	$("#cover").css("height",document.documentElement.scrollHeight+"px");
});
$("#tanchu #btn1").click(function(){
	$("#cover").css("display","none");
	$("#tanchu").css("display","none");
});
$("#jian").click(function(){
	var num=$("#num").val();
	--num;
	if(num<1)
		num=1;
	$("#num").val(num);
	
});
$("#jia").click(function(){
	var num=$("#num").val();
	++num;
	$("#num").val(num);
});
$("#num").blur(function(){
	var s=$.trim($(this).val());
	if(s.length==0||!(/([0-9]*[1-9][0-9]*$)/.test(s))){
		alert("数量不能为空或0，且只能为100以内的整数");
		$(this).val("1");
	}
});
$("#num").keyup(function(){
	//var num=$("#num").val();
})
$("#five #er #div2 #btn2").click(function(){
	$.ajax({
		url:'AddCartServlet',
		type:'post',
		data:{
			gid:$("#five #er #div2 #gid").val(),
			num:$("#five #er #div2 #num").val(),
			price:$("#five #er #div2 #price").val()
		},
		dataType:'json',
		success:function(data){
			if(data!=null){
				$("#tanchu p").html("<img src='pic/jiagouwuchetupian.jpg'>该商品已成功加入购物车");
				$("#cover").css("display","block");
				$("#tanchu").css("display","block");
			}else{
				$("#tanchu p").html("加入购物车失败");
				$("#cover").css("display","block");
				$("#tanchu").css("display","block");
				$("#tanchu #btn2").css("display","none");
			}
		},
		error:function(xhr,msg){
			alert(msg);
		}
	});
	
});
//控制图片切换
$("#five #er #div1 .img2").hover(function(){
	var s=$(this).attr("src");
	$("#five #er #div1 #img1").attr("src",s);
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
</script>
</html>

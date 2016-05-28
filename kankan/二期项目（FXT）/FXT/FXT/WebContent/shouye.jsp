<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="js/jquery-1.8.3.js"></script>
<style type="text/css">
#main{
border:1px solid red;
width:980px;
margin:auto;
}
#c{
	width:978px;
	height:24px;
	font-size:13px;
	color:#777;
	background-color:#FCFCFC;
	padding-left:2px;
	border:1px solid red;
}
#c span{
	border-left:1px solid #777;
	padding-left:10px;
}
.bor{
	border-left:none;
}
.bor2{
	border-left:1px solid #777;
}
#c img{
	position:relative;
	top:4px;
}
#c #fxtlb{
	list-style:none;
	display:none;
	position:absolute;
	top:20px;
	left:530px;
	background-color:white;
	z-index:10px;
	padding-top:10px;
}
#c #fxtlb li{
	width:88px;
	line-height:23px;
	margin-left:-40px;
	padding-left: 12px;

}
#kflb{
	list-style:none;
	display:none;
	position:absolute;
	padding-top:10px;
	top:20px;
	left:695px;
	background-color:white;
	z-index:10;
}
#kflb li{
	width:100px;
	line-height:23px;
	margin-left:-40px;
	padding-left: 12px;
}
#c span a{
	color:#2CB8AD;
	text-decoration: none;
}
#two{
height:60px;
background:url(pic/top1.png) no-repeat;
}
#three{
margin-top:20px;
}
#three #yi{
display:inline-block;
border:1px solid red;
}
#three #yi #a{
display:inline-block;
font-size:30px;
color:#2CB8AD;
height:30px;
border:1px solid red;
}
#three #yi #b{
display:inline-block;
font-size:12px;
color:#2CB8AD;
height:12px;
line-height:12px;
margin-left:6px;
border:1px solid red;
}
#three #er{
display:inline-block;
border:1px solid red;
}
#three #er #a{
font-size:15px;
font-weight:bold;
color:black;
border:1px solid red;
}
#three #er #b{
font-size:10px;
color:#2CB8AD;
border:1px solid red;
}
#three #san{
display:inline-block;
border:1px solid red;
margin-left:100px;
}
#three #san #a{
font-size:15px;
width:360px;
height:30px;
line-height:30px;
border:2px solid #2CB8AD;
border-right:none;
}
#three #san #b{
height:36px;
line-height:36px;
width:80px;
font-size:16px;
color:white;
background-color:#2CB8AD;
border:none;
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
display:inline-block;
margin-left:100px;
border:1px solid red;
}
#four{
margin-top:20px;
width:980px;
height:30px;
overflow:hidden;
}
#four #fxtlb{
	border:1px solid red;
	list-style:none;
	display:none;
	position:absolute;
	padding-top:10px;
	top:14px;
	left:561px;
	background-color:white;
	z-index:10px;
}
#four #fxtlb li{
	border:1px solid red;
	width:88px;
	line-height:23px;
	margin-left:-40px;
	padding-left: 12px;
}
#four>ul{
margin:0px;
padding:0px;
}
#four>ul>li{
float:left;
list-style-type:none;
width:98px;
height:30px;
line-height:30px;
font-size:14px;
text-align:center;
}
#four>ul>li>a{
display:block;
background-color:#2CB8AD;
color:white;
text-decoration:none;
}
#four li ul{
    border:3px solid #AEAEAE;
	padding:5px;
	list-style:none;
	position:absolute;	
	background-color:white;
	z-index:100px;
	display:none;
}
#four>ul>li>a:hover{
color:black;
background-color:white;
}
#four li:hover ul{
display:block;
}
#four li ul a{
margin-left:5px;
color:#999999;
text-decoration: none;
font-size:12px;
}
#four li ul a:hover{
color:green;
text-decoration: underline;
}
#four li ul a:VISITED{
color:red;
}
#five{
width:980px;
height:450px;
overflow:hidden;
margin-top:10px;
}
#five #yi{
float:left;
width:220px;
height:450px;
background:url(pic/005.jpg) no-repeat;

}
#five #san{
float:left;
width:220px;
height:450px;
background:url(pic/006.jpg) no-repeat;
}
#five #er{
float:left;
width:530px;
height:450px;
padding-left:5px;
padding-right:5px;
}
#five #er ul{
width:520px;
margin:0px;
padding:0px;
overflow:hidden;
}
#five #er ul li{
margin-left:10px;
padding:0px;
float:left;
height:30px;
line-height:30px;
font-size:12px;
list-style-type:none;
}
#five #er #a{
color:#999999;
background:url("pic/007.jpg") left top no-repeat;
padding-left:25px;
margin-left:0px;
}
#five #er #b{
color:#999999;
background:url("pic/008.jpg") left top no-repeat;
padding-left:25px;
margin-left:0px;
}
#five #er ul a:link{
color:black;
}
#five #er ul a:hover{
color:green;
}
#five #er ul a:visited{
color:red;
}
#five #er #c{
width:520px;
height:25px;
line-height:25px;
font-size:15px;
font-weight:bold;
background:url("pic/009.jpg") left top no-repeat;
padding-left:25px;
}
#five #er #d1,#d2,#d3,#d4{
width:520px;
height:315px;
margin-top:5px;
overflow:hidden;
}
#five #er #d2,#d3,#d4{
display:none;
}
#five #er .d{
width:255px;
height:310px;
float:left;
overflow:hidden;
margin-left:5px;
}
#five #er img{
width:255px;
height:250px;
border:none;
}
#five #er .div1{
float:left;
width:180px;
height:60px;
padding-left:5px;
padding-right:5px;
background-color:#F6F6F6;
border-right:dashed;
}
#five #er .div2{
float:left;
width:60px;
height:60px;
line-height:60px;
text-align:center;
font-size:18px;
color:red;
}
#five #er .d a{
text-decoration:none;
}
#five #er .span1{
line-height:30px;
font-size:14px;
font-weight:bold;
}
#five #er .span2{
line-height:15px;
font-size:12px;
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
#three #san #b{

	z-index:5;
	display:block;
	float:right;
}
</style>

</head>
<body >

<script type="text/javascript">
$(function(){
	$(".sousuo").click(function(){
		$.post("QueryGoodsInSSServlet",{
			sstj:$(".sousuotj").val()}
		,callback2);
	});
});
function callback2(){
	//alert("asda13");
	$("#shiqi").attr("height","2800");
	$("#shiqi #b").attr("height","2760");
	var hei=$("#shiqi #b").attr("height");
	alert(hei);
}
function callback(data){
	var sobj=$("#tishi");
	sobj.innerHTML="";
	var tishi="";
	var str=data.split(",");
		if(str.length>0&&str[0].length>0){
			var i;
			for(i=0;i<str.length;i++){
				tishi+="<div onmouseover='suggestOver(this);'";
				tishi+="onmouseout='suggestOut(this);'";
				tishi+="onclick='setSearch(this.innerHTML);'";
				tishi+="class='suggest_link'>"+str[i]+"</div>";
			}
			sobj.html(tishi).css("display","block");
		}else{
			sobj.css("display","none");
		}
}
window.onload="mainShowGoodsServlet";
</script>
<div id="main">

<div id="c">
<span class="bor"><img src="pic/shouji.bmp" />手机放心团</span>
<span class="bor2"><img src="pic/maoyan.bmp" />猫眼电影</span>
<span style="width:160px;display:inline-block;"></span>
<span><a href="login.jsp">登录</a>&nbsp;
<a href="reg.jsp">注册</a>&nbsp;&nbsp;</span>
<span class="bor">我的订单<img src="pic/xsj.bmp" /></span>
<span id="fxt">我的放心团<img src="pic/xsj.bmp" />
	<ul id="fxtlb">
    	<li><a href="UpShowUsersServlet">我的订单</a></li>
        <li>我的评价</li>
        <li>我的收藏</li>
        <li>我的积分</li>
        <li>代金券</li>
        <li>放心团余额</li>
        <li>账户充值</li>
        <li>账户设置</li>
    </ul>
</span>
<span>购物车<img src="pic/xsj.bmp" /></span>
<span id="kf">联系客服<img src="pic/xsj.bmp" />
	<ul id="kflb">
    	<li>申请退款</li>
        <li>申请退换货</li>
        <li>查看放心团券</li>
        <li>换绑手机号</li>
        <li>常见问题</li>
    </ul>
</span>
<span>我的商家<img src="pic/xsj.bmp" /></span>
<span>更多<img src="pic/xsj.bmp" /></span>

</div>

<div id="two"></div>

<div id="three">

<div id="yi">
<span id="a">放心团</span><br><span id="b">www.FXT.com</span><br><br>
</div>

<div id="er">
<span id="a">郑州</span><br><span id="b">[切换城市]</span><br><br>
</div>

<div id="san">
<form action="QueryGoodsInSSServlet" style="border:1px solid red;"><input type="text" name="sstj" class="sousuotj" id="a"><input type="submit" value="搜索" id="b" class="sousuo"></form>
&nbsp;&nbsp;&nbsp;&nbsp;<a href="">美食</a>&nbsp;&nbsp;<a href="">电影</a>&nbsp;&nbsp;<a href="">电影</a>&nbsp;&nbsp;<a href="">酒店</a>&nbsp;&nbsp;<a href="">电影</a>&nbsp;&nbsp;<a href="">购物</a>
</div>

<div id="si">
<img alt="" src="pic/001.jpg"><img alt="" src="pic/002.jpg"><img alt="" src="pic/003.jpg">
</div>

</div>

<div id="four">
<ul>
<li><a href="#">首页</a></li>
<li><a href="#">美食</a>
   <ul id="mslb" style="position: absolute;">
       <li><a href="SelectGoodsByGclidServlet?gclid=1">火锅</a><a href="SelectGoodsByGclidServlet?gclid=2">西餐</a><a href="#">聚餐宴请</a><a href="#">蛋糕</a><a href="#">日本料理</a></li>
       <li><a href="#">自助餐</a><a href="#">川湘菜</a><a href="#">鲁菜/北京菜</a><a href="#">江浙菜</a></li>
       <li><a href="#">粤港菜</a><a href="#">烧烤烤肉</a><a href="#">海鲜</a><a href="#">东南亚菜</a></li>
       <li><a href="#">咖啡酒吧茶馆</a><a href="#">小吃美食</a><a href="#">其他菜</a><a href="#">东北菜</a></li>
       <li><a href="#">西北菜</a><a href="#">云贵菜</a><a href="#">香锅烤鱼</a><a href="#">食品饮料</a></li>
   </ul>
</li>
<li><a href="#">酒店</a>
<ul id="jdlb" style="position: absolute;">
       <li><a href="#">经济型酒店</a><a href="#">豪华酒店</a><a href="#">公寓式酒店</a></li>
       <li><a href="#">主题酒店</a><a href="#">度假酒店</a><a href="#">温泉酒店</a><a href="#">客栈</a></li>
       <li><a href="#">青年旅社</a><a href="#">钟点房</a><a href="#">酒店在线定</a></li>
   </ul>
</li>
<li><a href="#">电影</a>
<ul id="dylb" style="position: absolute;">
       <li><a href="#">美嘉欢乐影城</a><a href="#">华谊兄弟影城</a><a href="#">保利国际影城</a></li>
       <li><a href="#">美嘉欢乐影城</a><a href="#">华谊兄弟影城</a><a href="#">保利国际影城</a></li>
       <li><a href="#">美嘉欢乐影城</a><a href="#">华谊兄弟影城</a><a href="#">保利国际影城</a></li>
       <li><a href="#">美嘉欢乐影城</a><a href="#">华谊兄弟影城</a><a href="#">保利国际影城</a></li>
       <li><a href="#">美嘉欢乐影城</a><a href="#">华谊兄弟影城</a><a href="#">保利国际影城</a></li>
   </ul>
</li>
<li><a href="#">休闲娱乐</a>
<ul id="yllb" style="position: absolute;">
       <li><a href="#">KTV</a><a href="#">足疗按摩</a><a href="#">水上世界</a><a href="#">亲子乐园</a><a href="#">温泉</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
       <li><a href="#">咖啡/酒吧</a><a href="#">桌游/电玩</a><a href="#">景点郊游</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
   </ul>
</li>
<li><a href="#">旅游</a>
<ul id="lylb" style="position: absolute;">
      <li><a href="#">KTV</a><a href="#">足疗按摩</a><a href="#">水上世界</a><a href="#">亲子乐园</a><a href="#">温泉</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
       <li><a href="#">咖啡/酒吧</a><a href="#">桌游/电玩</a><a href="#">景点郊游</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
   </ul>
</li>
<li><a href="#">生活服务</a>
<ul id="shlb" style="position: absolute;">
       <li><a href="#">KTV</a><a href="#">足疗按摩</a><a href="#">水上世界</a><a href="#">亲子乐园</a><a href="#">温泉</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
       <li><a href="#">咖啡/酒吧</a><a href="#">桌游/电玩</a><a href="#">景点郊游</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
   </ul>
</li>
<li><a href="#">购物</a>
<ul id="gwlb" style="position: absolute;">
       <li><a href="#">KTV</a><a href="#">足疗按摩</a><a href="#">水上世界</a><a href="#">亲子乐园</a><a href="#">温泉</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
       <li><a href="#">咖啡/酒吧</a><a href="#">桌游/电玩</a><a href="#">景点郊游</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
       <li><a href="#">洗浴/汗蒸</a><a href="#">滑雪</a><a href="#">游泳/水上乐园</a><a href="#">运动健身</a></li>
   </ul>
</li>
<li><a href="#">身边团购</a></li>
<li><a href="#">今日新单</a></li>
</ul>
</div>

<div id="five">

<div id="yi"></div>

<div id="er">

<ul><li id="a">热门团购</li><li><a href="#">火锅</a></li><li><a href="#">自助餐</a></li><li><a href="#">KTV</a></li><li><a href="#">经济型酒店</a></li><li><a href="#">公寓式酒店</a></li><li><a href="#">电影</a></li><li><a href="#">烧烤</a></li><li><a href="#">KTV</a></li><li><a href="#">足疗按摩</a></li></ul><hr>
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

<div id="san"></div>

</div>

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

<div id="shiwu"></div>
<div id="shiliu"></div>

<div id="shiqi">
<div id="a">筛选结果</div>

<div id="b">
	<div class="a">							 <a href="SelectGoodsServlet1?gid=${goodsList[0].gid }&xuan=3"><img src="img/${goodsList[0].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[0].gid }&xuan=3"><span class="span1">${goodsList[0].gname }</span><br><span class="span2">${goodsList[0].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[0].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[0].price }</span></div></div>
	<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${goodsList[1].gid }&xuan=3"><img src="img/${goodsList[1].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[1].gid }&xuan=3"><span class="span1">${goodsList[1].gname }</span><br><span class="span2">${goodsList[1].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[1].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[1].price }</span></div></div>
	<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${goodsList[2].gid }&xuan=3"><img src="img/${goodsList[2].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[2].gid }&xuan=3"><span class="span1">${goodsList[2].gname }</span><br><span class="span2">${goodsList[2].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[2].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[2].price }</span></div></div>
	<div class="a">							 <a href="SelectGoodsServlet1?gid=${goodsList[3].gid }&xuan=3"><img src="img/${goodsList[3].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[3].gid }&xuan=3"><span class="span1">${goodsList[3].gname }</span><br><span class="span2">${goodsList[3].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[3].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[3].price }</span></div></div>
	<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${goodsList[4].gid }&xuan=3"><img src="img/${goodsList[4].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[4].gid }&xuan=3"><span class="span1">${goodsList[4].gname }</span><br><span class="span2">${goodsList[4].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[4].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[4].price }</span></div></div>
	<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${goodsList[5].gid }&xuan=3"><img src="img/${goodsList[5].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[5].gid }&xuan=3"><span class="span1">${goodsList[5].gname }</span><br><span class="span2">${goodsList[5].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[5].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[5].price }</span></div></div>
	<div class="a">							 <a href="SelectGoodsServlet1?gid=${goodsList[6].gid }&xuan=3"><img src="img/${goodsList[6].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[6].gid }&xuan=3"><span class="span1">${goodsList[6].gname }</span><br><span class="span2">${goodsList[6].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[6].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[6].price }</span></div></div>
	<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${goodsList[7].gid }&xuan=3"><img src="img/${goodsList[7].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[7].gid }&xuan=3"><span class="span1">${goodsList[7].gname }</span><br><span class="span2">${goodsList[7].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[7].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[7].price }</span></div></div>
	<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${goodsList[8].gid }&xuan=3"><img src="img/${goodsList[8].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[8].gid }&xuan=3"><span class="span1">${goodsList[8].gname }</span><br><span class="span2">${goodsList[8].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[8].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[8].price }</span></div></div>
	<div class="a">							 <a href="SelectGoodsServlet1?gid=${goodsList[9].gid }&xuan=3"><img src="img/${goodsList[9].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[9].gid }&xuan=3"><span class="span1">${goodsList[9].gname }</span><br><span class="span2">${goodsList[9].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[9].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[9].price }</span></div></div>
	<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${goodsList[10].gid }&xuan=3"><img src="img/${goodsList[10].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[10].gid }&xuan=3"><span class="span1">${goodsList[10].gname }</span><br><span class="span2">${goodsList[10].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[10].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[10].price }</span></div></div>
	<div class="a" style="margin-left:10px;"><a href="SelectGoodsServlet1?gid=${goodsList[11].gid }&xuan=3"><img src="img/${goodsList[11].pic1 }"></a><div class="b"><a href="SelectGoodsServlet1?gid=${goodsList[11].gid }&xuan=3"><span class="span1">${goodsList[11].gname }</span><br><span class="span2">${goodsList[11].intro }</span></a></div><div class="c"><span class="span3">￥</span><span class="span4">${goodsList[11].nowprice }</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="span5">门店价</span><span class="span6">￥${goodsList[11].price }</span></div></div>
</div>
</div>

</body>
<script>
$("#fxt").hover(function(){
	$("#fxtlb").css("display","block");
	},function(){
		//$("#fxtlb").css("display","none");
});

$("#fxtlb li").hover(function(){
	$(this).css("background-color","#2CB8AD");
	},function(){
		$(this).css("background-color","white");
});

$("#kf").hover(function(){
	$("#kflb").css("display","block");
	},function(){
		$("#kflb").css("display","none");
	});
$("#kflb li").hover(function(){
	$(this).css("background-color","#2CB8AD");
	},function(){
		$(this).css("background-color","white");
});

</script>
</html>

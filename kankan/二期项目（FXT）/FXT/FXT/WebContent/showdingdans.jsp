<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.fxt.entity.*,java.util.*,com.fxt.util.MD5"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单界面</title>
<script src="js/jquery-1.8.3.js"></script>
<script  src="js/ui/jquery.ui.js"></script>
<script src="js/ui/jquery.ui.core.js"></script>
<script src="js/ui/jquery.ui.widget.js"></script>
<script src="js/ui/jquery.ui.accordion.js"></script>
<script src="js/ui/jquery.ui.tabs.js"></script>
<script type="text/javascript" src="js/ui/jquery.ui.datepicker.js"></script>
<link rel="stylesheet" href="js/css/jquery.ui.all.css"  type="text/css"/>
<link rel="stylesheet" > 
<script>
function date(){
	$("#dp").datepicker({
		changeMonth:true,
		changeYear:true,
		showOtherMonths:true,
		selectOtherMonths:true
	});
	$("#dp").datepicker("option","monthNamesShort",['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月']);
		$("#dp").datepicker("option","dayNamesMin",['日','一','二','三','四','五','六',]);
		$("#format").change(function(){
			$("#dp").datepicker("option","dateFormat",$(this).val());
		});
}

$(function(){
	$("#leftorder").accordion();
	});
	$(function(){
		$("#leftorder li").hover(function(){
			$(this).css({"color":"#2BB8AA"});
			$("#leftorder li").visited(function(){
				$(this).css({"background":"#2BB8AA"});
			});
			},function(){
				$(this).css({"color":"#ccc"});
				});
		});
	
</script>
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
ul>li{
	list-style-type:none;
	}
	a{
		text-decoration:none;
		color:#099;}
#main{
 width:980px;
 height:auto;
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
margin-right:10px;
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
	z-index: 3;
}
#four #left>ul>li{
	padding:10px 16px 10px 10px;
	margin:0px;
	border-bottom:1px solid #ccc;
	font-size:14px;
	font-weight:bold;
	position:relative;
	display:none;
	z-index: 3;
	background:white;
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
	width:800px;
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
			#leftusermessage{
				border:1px solid #ccc;
				width:190px;
				height:130px;
				margin-left:0px;
				margin-top:13px;
				color:#066;
				font-style:italic;}
				#left1,#left2{
					margin-top:10px;
					float:left;
					text-align:center;
					width:62px;
					font-size:14px;
					line-height:55px;
					border-right: 1px solid #ccc;
					border-top:1px solid #ccc;
					}
					
				#left3{
				margin-top:10px;
					float:left;
					text-align:center;
					width:63px;
					font-size:14px;
					line-height:55px;
					border-right:none;
					border-top:1px solid #ccc;
				}	
					#leftorder{
						margin-top:15px;
						margin-left:0px;
						width:190px;
						height:auto;
						}
						#leftorder ul>li{
							margin-left:-20px;
							color:#999;}
							#right{
								float:right;
								position:relative;
								top:-510px;
								margin-right:0px;
								border:1px solid #CCC;
								width:780px;
								height:500px;
								color:#999;
								font-size:14px;}
								
								#right1{
								float:right;
								position:relative;
								top:-506px;
								border:1px solid #CCC;
								display:none;
								width:800px;
								height:500px;
								font-size:20px;
								font-weight: bold;
								}
									#button{
										position:absolute;
										top:790px;
								}
							#b{
								position: relative;
								top:-4px;
							}
							#change1{
							width:780px;
							text-align:center;
							display:block;
							font-size: 12px;
							}
							#change1 tr>td{
							line-height:30px;
							width:160px;
							}
							#change2{
							display:none;
							}
							#hid{
							display:none;
							width:auto;
							line-height:auto;
							border:1px solid #ccc;
							background:white;
							color:green;
							position: absolute;
							top:286px;
							left:132px;
							cursor:pointer;
							}
							#tabs-1,#tabs-2{
							 height:410px;
							}
						#tabs-1{
						text-align: left;
						}
					#tabs-1>ul>li{
					 font-size: 18px;
						margin-top: 13px;
					}
					#cover_input>ul>li{
					width:auto;
					line-height:35px;
					margin-top: 13px;
					font-size:16px;
					margin-left: -30px;
					}
					#cover_input1>ul>li{
					width:auto;
					line-height:35px;
					margin-top: 13px;
					font-size:16px;
					margin-left: -30px;
					}
					#xiumi{
					display:none;
					width:330px;
					height:auto;
					border:1px solid #ccc;
					font-size:14px;
					font-family: cursive;
					color:#2DBAAC;
					padding-left: 20px;
					}
h3{
z-index: 2;
}
#button{
width:980px;
height:300px;
background: url(pic/bottom.jpg) no-repeat;
margin:0px auto;
}
</style>
<script>

//设置个人信息省市级联 
$(document).ready(function(){
$("#province").change(function(){
$("#province option").each(function(i,o){
if($(this).attr("selected"))
{	
$(".city").hide();
$(".city").eq(i).show();}});});
$("#province").change();});
//选项卡
$(function(){
	$("#change2").tabs({
		event:"mouseover",collapsible:true,selected:3
	});
});
//修改用户信息(只取操作后的值)
var name,tel,pwd,m1;
    		function xiutel(){
    							$("#tel").css("border","1px solid #ccc");
    							$("#tel").removeAttr("disabled");
    							$("#tel").blur(function(){
    								$(this).css("border","none");
        							$(this).css("disabled","true");
        							tel=$(this).val();
    							});	}
    				function xiuname(){
    					$("#name").css("border","1px solid #ccc");
						$("#name").removeAttr("disabled");
						$("#name").blur(function(){
							$(this).css("border","none");
							$(this).css("disabled","true");
							name=$(this).val();
						});	}
    				function xiupwd(){
    					$("#xiumi").toggle();//切换div是否可见
    				}
    				//验证密码
    				$(function(){
    				$("#yzmm").change(function(){
    					var m=$("#yzmm").val();
    					if(m==null){
    						$("#mibijiao").html("<font color='red'>密码不能为空</font>");
    						$("#xiusave").attr("disabled","true");
    					}else{
    				$("#yzmm1").change(function(){
    					 var n=$("#yzmm1").val();
    					 if(n==null){
    						 $("#mibijiao1").html("<font color='red'>新密码不能为空</font>");
    					 }else{
    						 $("#xiusave").removeAttr("disabled");}});}
        			$("#xiusave").click(function(){//单击保存保存密码
        				pwd=$("#yzmm").val();
        			   m1=$("#yzmm1").val();
        			$("#xiumi").css("display","none");
        				});	});});
    			   
    				function btnxiugai(){//把4个值都传到servlet进行判断
    					alert(name+tel+pwd+m1);
    						window.location.href("ReviseUsersMessage?name="+name+"&tel="+tel+"&pwd="+pwd+"&m1="+m1+"");
    				}
    				
    			    //处理和保存用户更新的个人信息
    			   $(function(){
    				   $("#btn11").click(function(){//判断选中性别
    					  var val,time1,shen,str;
    					   val=$("input:radio[name='sex']:checked").val();
    					   if(val==null){
    					   alert("什么都没选中");
    					   return false;
    					   }
    					  time1=$("#dp").val();//更改后的时间
    					   //选中身份、
    					  shen=$("input:radio[name='shenfen']:checked").val();
    					   if(shen==null){
    						   alert("身份没选中");
    						   return false;
    					   }
    					   str="";//复选框内的值
    					   $("input:checkbox[name='hobby']:checked").each(function(){
    						   str+=$(this).val()+",";
    					   });
    					 window.location.href="UpUsersMessageServlet?sex="+val+"&birthday="+time1+"&shen="+shen+"&str="+str+"";
    				   });
    			   });
    			    
    			
    			   //-点击切换页面
    			   $(function(){
    			          $("#shezhi").hover(function(){
    			       	   $("#hid").css("display","block");
    			          });
    			          $("#hid").mouseout(function(){
    			       	   $("#hid").css("display","none");
    			          });
    			          $("#hid").click(function(){
    			       	   $("#change1").html("");
    			       	   $("#right").css("display","block");//让right边的进行显示
    			       	$("#right1").css("display","none");//让right1边的进行隐藏
    			       	   $("#change2").css("display","block");
    			          });
    			   }); 
    			   //处理go查询
    			      function govalue(ob){
    			      	var reg=/^\+?[1-9][0-9]*$/;
    			      	if(ob==null||ob==""){
    			      		$("#goval").val(1);
    			      		$("#fontgo").click(function(){
    			  				window.location.href("ShowOrdersServlet?p="+1+"");
    			  			});
    			      	}else{
    			      		if(reg.test(ob)){
    			      			$("#fontgo").click(function(){
    			      			window.location.href("ShowOrdersServlet?p="+ob+"");
    			      			});
    			      			return true;
    			      		}else{
    			      			$("#goval").val(1);
    			      			$("#fontgo").click(function(){
    			      				window.location.href("ShowOrdersServlet?p="+1+"");
    			      			});}} }
    			   function show(ob){//根据状态查询
    			   	window.location.href("ShowOrdersServlet?ob="+ob+"");
    			   }
    	
</script>
</head>
<body>
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
<div style="height:65px;"></div>
<div id="cc">
<div id="leftusermessage">
<table  style="width:190px;" border="0">
	<tr>
    	<td width="55">
    	<c:choose>
    	<c:when test="${empty ulist }"><!-- 没有头像的时候显示的是默认头像 -->
    	<img src="pic/kaixin1.jpg" />
    	</c:when>
    	<c:otherwise>
    	<img src="pic/${ulist.pic }" width="55" height="59">
    	</c:otherwise>
    	</c:choose>
    	</td>
        <td width="126"><c:choose>
        <c:when test="${empty ulist }">
                       没登陆
        </c:when>
        <c:otherwise>
        ${ulist.username }
        </c:otherwise>
        </c:choose><br /><font color="red">${users.grade }</font>VIP<br /><img src="pic/icon1.png" width="18" height="18" />&nbsp;<img src="pic/icon2.png" width="18" height="18" />&nbsp;
        <img src="pic/icon3.png" alt="编辑设置" width="18"  id="shezhi" height="18" /><div id="hid">编辑设置</div> </td>
    </tr>
</table>
<div id="left1">余额:0</div>
<div id="left2">积分:0</div>
<div id="left3">代金券:1</div>
</div>
<div id="leftorder">
<h3>我的订单</h3>
<div>
	<ul>
    	<li>&middot;<a href="ShowOrdersServlet">团购订单</a></li>
        <li>&middot;电影订座</li>
        <li>&middot;酒店在线</li>
        <li>&middot;我的抽奖</li>
        <li>&middot;我的收藏</li>
    </ul>
</div>
<h3>我的评价</h3>
<div>
	<ul>
    	<li>&middot;带评价</li>
        <li>&middot;以评价</li>
    </ul>
</div>
<h3>退款维权</h3>
<div>
	<ul>
    	<li>&middot;我的退款</li>
    </ul>
</div>
<h3>我的账户</h3>
<div>
	<ul>
    	<li>&middot;我的积分</li>
        <li>&middot;代金券</li>
        <li>&middot;<a href="ShowPayServlet">我的余额</a></li>
    </ul>
</div>
</div>

			<c:choose>
				<c:when test="${num eq 1 }"><!--num等于1让right1显示  -->
					<style>
						#right1{
							display: block;
						}
						#right{
							display: none;
						}
					</style>
				</c:when>
				<c:otherwise>
						<style>
						#right1{
							display: none;
						}
						#right{
							display: block;
						}
					</style>
				</c:otherwise>
			</c:choose>
			<script>
				$(function(){
					$("#cztoggle").css("display","none");
					$("#cz").click(function(){
						$("#cztoggle").toggle();
					});
				});
			function isnull(cq){
				var reg=/^(([1-9]\d*)|0)(\.(\d{1}|\d{2}))?$/;
				if(cq==null||cq==""){
					$("#cqfont").html("<font color='red'>请输入钱数</font>");
					$("#czsavebtn").css("display","none");
					return false;
				}else{
					if(reg.test(cq)){//判断钱数是否正确n
						$("#czsavebtn").css("display","block");
						$("#cqfont").html("");
						$("#czsavebtn").click(function(){
						 window.location.href("ShowPayServlet?cq="+cq+"");//跳转
						});
						return true;
					}else{
						$("#cqfont").html("<font color='red'>请重新输入</font>");
						$("#czsavebtn").css("display","none");
						return false;
					}
				}
			}
			</script>
		<div id="right1"><!-- 显示余额界面 -->
		
				<div style="border:1px solid #ccc;background: #FFF6DB;text-align: center;line-height: 50px;">${cqrow }</div>
				<table style="margin-left: 5%;padding-top: 3%;">
				<tr></tr>
					<tr style="width:798px;">
						<td>您当前的放心团余额:</td><td style="width:100px;"><font color="red">￥${money }</font></td><td><input type="image" id="cz" src="pic/chongzhi.png"></td>
					</tr>
				</table>
				<div id="cztoggle" style="padding-left: 5%;">
				    您要充值的金额:<input type="text" id="czmoney" onmouseout="isnull(this.value)"><font id="cqfont"></font>
				    <br>
				   <input  type="image" src="pic/baocun.png" id="czsavebtn">
				</div>
				<table border="1" style="margin-left: 5%;margin-top: 3%;border-collapse: collapse;width:728px;text-align: center;color:#ccc;color:#ccc;">
					<tr>
						<td colspan="3">交易记录</td>
					</tr>
					<tr>
						<td>到期时间</td><td>订单详情</td><td>总金额</td>
					</tr>
					<c:forEach items="${orderstatus }" var="ord">
					<tr>
					<c:if test="${status==5 }"></c:if>
						<td>${fn:substring(ord.destorytime,0,10)}</td><td>${ord.gname }</td><td>${ord.price }</td>
					</tr>
					</c:forEach>
				</table>
		</div>
<div id="right"><!-- 显示右面主界面 -->
    <table  id="change1" border="1" style="border-collapse: collapse;">
    <tr>
       <td><select  onchange="show(this.value)" id="zz">
       <option>---请选择---</option>
       <option ${status==0?"selected='selected'":"" } value="0">全部状态</option>
       <option ${status==1?"selected='selected'":"" }  value="1">未付款</option>
       <option ${status==2?"selected='selected'":"" } value="2">未发货</option>
       <option ${status==3?"selected='selected'":"" } value="3">已发货</option>
       <option ${status==4?"selected='selected'":"" } value="4">未使用</option>
       <option ${status==5?"selected='selected'":"" } value="5">交易完成</option>
       </select></td><td colspan="2">&nbsp;提示:您有&nbsp;<font color="#FF0000">待评价：(1)</font></td><td colspan="2"><img src="pic/tu.png" width="174" height="20" /></td>
        </tr>
    	<tr style="background:#FCFCFC;">
        	<td>团购信息</td><td>数量</td><td>总价</td><td>订单状态</td><td>操作</td>
        </tr>
       <c:choose>
        <c:when test="${empty orderstatus }">
         <tr><td colspan="5"><font style="font-size:20px;">您没有该记录</font></td>
      </tr>
        	</c:when>
        	<c:otherwise>
        		<c:forEach items="${orderstatus }" var="ord">
        		<tr style="background:#FCFCFC;"><!-- 一下代码要截取字符串 倒入头文件 -->
        	   <td style="width:450px;"><table><tr><td><img src="img/${ord.pic}" width="100" height="90" /></td><td><table style="margin-left: -35px;width:230px;"><tr><td>${ord.gname }</td></tr><tr><td>团购结束:${fn:substring(ord.destorytime,0,10)}</td></tr><tr><td><font color="#2BB8AA">商家信息</font></td></tr></table></td></tr></table></td><td style="width:40px;">${ord.num }</td><td style="width:40px;">￥${ord.price }</td>
        	   <td style="width:20px;"><c:if test="${ord.status==4 }">未使用</c:if>
        	   							<c:if test="${ord.status==5 }">交易完成</c:if>
        	                             <c:if test="${ord.status==1 }">未付款</c:if>
        	                             <c:if test="${ord.status==2 }">未发货</c:if>
        	                             <c:if test="${ord.status==3 }">已发货</c:if>
        	                             
        	   </td><td style="width:20px;"><!-- 完成就删除，未付款就付款和删除 -->
        	   <script>
        	  function del(st,oid,num){
        		  window.location.href("DelOrderServlet?st="+st+"&oid="+oid+"&num="+num+"");
        	  }
        	  function inputgo(goval){//处理go
        		  if(goval==""||goval==null){
        			  $("#govalue").val(1);
        			  $("#fontgo").click(function(){
     					 window.location.href("ShowOrdersServlet?ob=0&p="+1+""); 
     				  });
        		  }else if(goval==0){
        			  $("#govalue").val(1);
        			  $("#fontgo").click(function(){
     					 window.location.href("ShowOrdersServlet?ob=0&p="+1+""); 
     				  });
        		  }
        		  else{
        			  var reg=/^\+?[1-9][0-9]*$/;//验证是否为数字
        			  if(reg.test(goval)){
        				  $("#fontgo").click(function(){
        					 window.location.href("ShowOrdersServlet?ob=0&p="+goval+""); 
        				  });
        				  return true;
        			  }
        		  }
        	  }
        	   </script>
        	   		  <c:if test="${ord.status==5 }"><table><tr><td><input onclick="del(${ord.status},${ord.oid },${ord.num })" type="image" src="pic/del.png"/></td></tr><tr><td><a href="ShowCommentServlet?name=${ord.gname }&pic=${ord.pic }&endtime=${fn:substring(ord.destorytime,0,10)}&oid=${ord.oid}"><font color="green">评论</font></a></td></tr></table></c:if>
        	  		  <c:if test="${ord.status==1 }"><table><tr><td><input  onclick="del(${ord.status},${ord.oid},${ord.num })" type="image" src="pic/del.png"/></td></tr><tr><td><a href="AddOrdersServlet?xuan=3&oid=${ord.oid }" id="fkOrder"><img src="pic/fk.png" width="81" height="18"></a></td></tr></table></c:if>
        	          <c:if test="${ord.status==4 }">${fn:substring(ord.destorytime,0,10)}到期</c:if>
        	          <c:if test="${ord.status==2 }"><table><tr><td>提醒发货</td></tr><tr><td><a href="TuiDanServlet?status=${ord.status }&oid=${ord.oid}&num=${ord.num}">退单</a></td></tr></table></c:if>
        	          <c:if test="${ord.status==3 }"><a href="ShouHuoServlet?oid=${ord.oid }">确认收货</a></c:if>
        	       </td>
          		</tr>
        		</c:forEach>
        	<tr><td>共${orderrow }页/第${pn }页&nbsp;&nbsp;&nbsp;&nbsp;<c:if test="${status==0 }"><input onblur="inputgo(this.value)" id="govalue" type="text" size="1"><font id="fontgo" style="font-size:16px;color:#009999;cursor: pointer;">GO</font></c:if></td><td><a href="ShowOrdersServlet?ob=${status }&p=1">首页</a></td>
        	<td>
        	<c:choose>
        	<c:when test="${pn gt 1 }"><a href="ShowOrdersServlet?ob=${status }&p=${pn-1 }">上一页</a>
        	</c:when>
        	<c:otherwise>上一页</c:otherwise>
        	</c:choose>
        	</td>
        	<td>
        	<c:choose>
        	<c:when test="${orderrow>pn }">
        	<a href="ShowOrdersServlet?ob=${status }&p=${pn+1 }">下一页</a>
        	</c:when>
        	<c:otherwise>下一页</c:otherwise>
        	</c:choose>
        	 </td>
        	<td><a href="ShowOrdersServlet?ob=${status }&p=${orderrow } ">尾页</a></td>
        	</c:otherwise>
        	</c:choose>
    </table>
    
    <div id="change2">
    <ul>
    	<li><a href="#tabs-1">基本信息</a></li>
    	<li><a href="#tabs-2">个人资料</a></li>
    </ul>
    <div id="tabs-1" ><!-- 修改基本信息  -->
    	<c:choose>
    		<c:when test="${empty row1 }"><!-- 判断修改过-->
    			<ul>
    			
    		<c:choose>
    				 <c:when test="${empty nowuser }">没找到数据</c:when>
    				<c:otherwise>
    					<li>手机号:<input type="text" style="border:none;disabled:true" id="tel" value="${nowuser.tel }" name="tel"/>&nbsp;<a href="javascript:xiutel()">修改</a></li>
    					<li>用户名:<input type="text" id="name" name="name" style="border:none;disabled:true;" value="${nowuser.username }">&nbsp;<a href="javascript:xiuname()">修改</a></li>
    					<li>密码:<input alt="请输入原始密码" id="yz" type="password" value="${nowuser.userpwd }"  style="border:none;disabled:true;" />&nbsp;&nbsp;<a href="javascript:xiupwd()">修改</a></li>
    					<li><div id="xiumi">
    					<br>
    						原始密码:&nbsp;<input type="password" id="yzmm" name="yzmm"><font id="mibijiao"></font><br><br>
    						新&nbsp;密&nbsp;码:&nbsp;<input id="yzmm1" type="password"><font id="mibijiao1"></font><br><br>
    						<input type="button" id="xiusave" disabled="disabled" value="确定"> <br><br>
    						</div>
    					</li>
    					<li><input  type="image" src="pic/baocun.png" onclick="btnxiugai()"></li>
    				</c:otherwise>
    			</c:choose>
    		 </ul>
    		</c:when>
    		<c:otherwise>
    		<center><font style="font-size:20px;font-weight: bold;" color="red">${row1 }</font></center><!-- 判断修改过使用着的信息没     显示修改过的  从upshow Users页面传出数据-->
    			<ul>
    		<c:choose>
    				 <c:when test="${empty ulist }">
    					没找到数据
    				</c:when>
    				<c:otherwise>
    					<li>手机号:<input type="text" style="border:none;disabled:true" id="tel" value="${ulist.tel }" name="tel"/>&nbsp;<a href="javascript:xiutel()">修改</a></li>
    					<li>用户名:<input type="text" id="name" name="name" style="border:none;disabled:true;" value="${ulist.username }">&nbsp;<a href="javascript:xiuname()">修改</a></li>
    					<li>密码:<input alt="请输入原始密码" id="yz" type="password" value="${ulist.userpwd }"  style="border:none;disabled:true;" />&nbsp;&nbsp;<a href="javascript:xiupwd()">修改</a></li>
    					<li><div id="xiumi">
    					<br>
    							原始密码:&nbsp;<input type="password" id="yzmm" name="yzmm"><font id="mibijiao"></font><br><br>
    							新&nbsp;密&nbsp;码:&nbsp;<input id="yzmm1" type="password"><font id="mibijiao1"></font><br><br>
    							<input type="button" id="xiusave" disabled="disabled" value="确定"> <br><br>
    						</div>
    					</li>
    					<li><input  type="image" src="pic/baocun.png" onclick="btnxiugai()"></li>
    				</c:otherwise>
    			</c:choose>
    		 </ul>
    		</c:otherwise>
    		</c:choose>
    </div>
    
    <div id="tabs-2"><!-- 修改个人资料 上传头像 (完成)-->
    
	    <div style="text-align:center; border:1px solid #ccc; line-height:auto; width:303px; background-color:#FCFCFC;">
	    	<form action="Upload_user_pic" method="post" enctype="multipart/form-data">
	    	<c:choose>
	    	<c:when test="${empty ulist }"><!-- 没上传头像的时候 -->
	    	<br>亲爱的<font color="#2EB5A8">${users.username }</font>来上传你的<br>头像吧!<br>
	    	<img src="pic/kongtouxiang.png" width="181" height="180" /><br /><br />
	    	<input type="file" name="pic"><br /><br/>
	    	<input type="submit" value="提交" />
	    	</c:when>
	    	<c:otherwise><!-- 上传头像的时候 -->
	    		<br>亲爱的<font color="#2EB5A8">${ulist.username }</font>更新你的<br>头像吧!<br>
	    	<img src="pic/${ulist.pic }" width="181" height="170" /><br /><br />
	    	<input type="file"  name="pic"><br /><br/>
	    	<input type="submit" value="提交" />
	    	</c:otherwise>
	    	</c:choose>
	    	</form>
	    	<br /><img alt="" src="pic/imgfont.png" width="181" height="34" /><br />
	    </div>
    	<div style="font-family:cue;text-align:left; border:1px solid #ccc; width:443px;height:360px; float:right; margin-top:-362px;border-left:none;">
    		<!-- 修改个人资料 修改信息-->
    		<br>&nbsp;性别:
    		<input type="radio" ${ulist.sex=="男"?"checked='checked'":"" }  name="sex" value="男">男 &nbsp;<input  type="radio" ${ulist.sex=="女"?"checked='checked'":"" } name="sex" value="女">女<br>
    					
    		<br />&nbsp;生日:&nbsp;请选择日期格式:<select id="format">
    			<option value="mm/dd/yy">mm/dd/yy</option>
    			<option value="yy-mm-dd">yy-mm-dd</option>
    		</select><br><br>                                     
    		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请选择日期:<input type="text" value="${fn:substring(ulist.birthday,0,10)}" id="dp" onblur="isnull(this.value)" onmouseover="date()"><font id="isnullfont"></font><br><br><!-- 完成 -->		
    		&nbsp;身份:<input type="radio"  value="学生" ${ulist.shenfen=="学生"?"checked='checked'":"" } name="shenfen">学生<input type="radio" value="在职" ${ulist.shenfen=="在职"?"checked='checked'":"" } name="shenfen">在职<input type="radio" value="自由职业"  ${ulist.shenfen=="自由职业"?"checked='checked'":"" } name="shenfen">自由职业<input type="radio" ${ulist.shenfen=="其它"?"checked='checked'":"" } value="其它" name="shenfen">其它
    		<br><br>
    		<!-- 暂时 -->
    		&nbsp;兴趣:
    	<input type="checkbox" name="hobby"  value="美食" id="hobby">美食
    	<input type="checkbox" name="hobby" value="丽人"  id="hobby1">丽人
    	<input type="checkbox" name="hobby" value="旅游"  id="hobby2">旅游
    	<input type="checkbox" name="hobby" value="电影" id="hobby3">电影
    	<input type="checkbox" name="hobby" value="酒店"  id="hobby4">酒店
    	<input type="checkbox" name="hobby" value="休闲娱乐" id="hobby5">休闲娱乐
    				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<input type="checkbox" name="hobby" value="购物"  id="hobby6">购物<br><br>
    	<%
    		List list = (List)session.getAttribute("xq");
    		for(Object obj:list){
    			if(obj.equals("美食")){
    				%>
    				<script type="text/javascript">$("#hobby").attr("checked","true");</script>
    				<%
    			}
    			if(obj.equals("电影")){
    				%>
    				<script type="text/javascript">$("#hobby4").attr("checked","true");</script>
    				<%	
    			}
    			if(obj.equals("购物")){
    				%>
    				<script type="text/javascript">$("#hobby6").attr("checked","true");</script>
    				<%
    				}
    			if(obj.equals("旅游")){
    				%>
    				<script type="text/javascript">$("#hobby2").attr("checked","true");</script>
    				<%
    				}
    			if(obj.equals("酒店")){
    				%>
    				<script type="text/javascript">$("#hobby3").attr("checked","true");</script>
    				<%
    			}
    			if(obj.equals("丽人")){
    				%>
    				<script type="text/javascript">$("#hobby1").attr("checked","true");</script>
    				
    				<%
    			}
    				if(obj.equals("旅游")){
    				%>
    				<script type="text/javascript">
    				$("#hobby2").attr("checked","true");
    				</script>
    				<%
    				}
    		}
    	%>
    	 &nbsp; &nbsp;<font color="#999999">选择你的兴趣使你获得个性化的团购推荐哦</font><br><br>
    	<center><input id="btn11"  type="image" src="pic/baocun.png"></center> <br><br>
    	</div>
   	</div>
</div>
</div>
<div id="button"></div>
</div>


</body>
<script type="text/javascript">
$(function(){
	$("#cover").css("width",document.documentElement.scrollWidth+"px");
	$("#cover").css("height",document.documentElement.scrollHeight+"px");
});
$("fkOrder").click(function(){
	var s=$(this).prev().
	$("#cover").css("display","block");
	$("#tanchu").css("display","block");
	$("#tanchu p").html("您本次应付金额为：");
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

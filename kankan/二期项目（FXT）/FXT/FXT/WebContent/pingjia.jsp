<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户评价</title>
<script src="js/jquery-1.8.3.js"></script>
<script src="js/WebEditor/js/jquery.wysiwyg.js"></script>
<script src="js/WebEditor/js/wysiwyg.image.js"></script>
<script src="js/WebEditor/js/wysiwyg.link.js"></script>
<script src="js/WebEditor/js/wysiwyg.table.js"></script>
<link rel="stylesheet" href="js/WebEditor/css/jquery.wysiwyg.css" type="text/css" />
<link rel="stylesheet" href="js/WebEditor/css/ie.css" type="text/css" />
<link rel="stylesheet" href="js/WebEditor/css/print.css" type="text/css" />
<link rel="stylesheet" href="js/WebEditor/css/screen.css" type="text/css" />
<style>
#absoltion{
	position:absolute;
	top:50px;
	right:190px;}
ul>li{
	list-style-type:none;
	}
	a{
		text-decoration:none;
		color:#099;}
#main{
 width:1024px;
 height:auto;
 margin-left:170px;
 background:#FFF;
}
#one{
	width:1022px;
background-color:#FCFCFC;
}
#one td{
width:70px;
font-size:12px;
color:#9C9C9C;
height:20px;
line-height:20px;
text-align:center;
border-left:1px solid #F8F8F8;
}

#three{
	margin-left:15px;
	width:1000px;
margin-top:20px;
}
#three #yi{
display:inline-block;
}
#three #yi #a{
display:inline-block;
font-size:30px;
color:#2CB8AD;
height:30px;
}
#three #yi #b{
display:inline-block;
font-size:12px;
color:#2CB8AD;
height:12px;
line-height:12px;
margin-left:6px;
}
#three #er{
display:inline-block;
}
#three #er #a{
font-size:15px;
font-weight:bold;
color:black;
}
#three #er #b{
font-size:10px;
color:#2CB8AD;
}
#three #san{
display:inline-block;
margin-left:100px;

}
#three #san #a{
height:26px;
line-height:26px;
font-size:15px;
width:300px;
border-top:2px solid #2CB8AD;
border-left:2px solid #2CB8AD;
border-bottom:2px solid #2CB8AD;
border-right:none;
}
#three #san #b{
height:30px;
width:50px;
font-size:12px;
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
#daohang{
	margin-top:30px;
	width:1022px;
	height:50px;
	margin-left:15px;
	}
	#daohang>ul{
		margin:0px;
		padding:0px;
		}
	#daohang>ul>li a{
		border-bottom:2px solid #363;
		float:left;
		text-align:center;
		height:35px;
		width:90px;
		text-decoration:none;
		color:#999;
		font-weight:bold;
		font-size:17px;
		padding-top:9px;
		}
		#daohang>ul>li>a:hover{
			background:#066;
			color:#FFF;
			font-size:19px;
			}
			#leftusermessage{
				border:1px solid #ccc;
				width:190px;
				height:130px;
				margin-left:15px;
				margin-top:13px;
				color:#066;
				font-style:italic;}
				#left1,#left2,#left3{
					margin-top:10px;
					float:left;
					text-align:center;
					width:60px;
					font-size:12px;
					line-height:55px;
					border:1px solid #CCC;}
					#comment{
						margin-top:1%;
						position:relative;
						width:885px;
						height:600px;
						border:1px solid #ccc;
						margin-left:185px;
						padding-left:1%;
						padding-top:1%;}
						#commentpic{
							width:460px;
							height:279px;
							float:left;
							}
							#commentfont{
							width:400px;
							height:auto;
							float:right;
							font-size:22px;
							font-weight: bold;
							}
							.container{
							margin-left: 1%;
							}
					#button{
						margin-top:5%;
						position:relative;
									}
</style>
<script>
$(document).ready(//文本编辑器
		function(){
			$("#wysiwyg").wysiwyg();
			});

</script>
</head>

<body>
<div id="main">
<div id="one">
<table>
<tr><td>手机放心团</td><td>猫眼电影</td><td style="width:420px;text-align:right;">一次团购&nbsp;&nbsp;一次放心&nbsp;&nbsp;<a href="">登陆</a></td>
<td><a href="">注册</a></td><td>我的美团</td><td>购物车</td><td>我是商家</td><td>客服</td><td>更多</td></tr>
</table>
</div>
<div id="three">

<div id="yi">
<span id="a">放心团</span><br><span id="b">www.FXT.com</span><br><br>
</div>

<div id="er">
<span id="a">郑州</span><br><span id="b">[切换城市]</span><br><br>
</div>
<div id="san">
<form action=""><input type="text" id="a"><input type="submit" value="搜索" id="b"></form>
&nbsp;&nbsp;&nbsp;&nbsp;<a href="">美食</a>&nbsp;&nbsp;<a href="">电影</a>&nbsp;&nbsp;<a href="">电影</a>&nbsp;&nbsp;<a href="">酒店</a>&nbsp;&nbsp;<a href="">电影</a>&nbsp;&nbsp;<a href="">购物</a>
</div>
</div>


<div id="daohang">
<ul>
<li><a href="#" style="background:#099;color:#FFF;">全部分类&nabla;</a></li>
<li><a href="#">首页</a></li>
<li><a href="#">身边团购</a></li>
<li><a href="#">身边外卖</a></li>
<li><a href="#">今日新单</a></li>
<li><a href="#">购物</a></li>
<li><a href="#">商家点评</a></li>
<li><a href="#">品牌汇</a></li>
<li><a href="#">  </a></li>
<li><a href="#"> </a></li>
</ul>
</div>
<script>
$(function(){
	$("#commentbtn").click(function(){
		window.location.href("ShowCommentServlet?liuyan="+$("#wysiwyg").val()+"&oid1="+$("#oid").val()+"");
	});
});
</script>
</div>
        <div id="comment"><!--处理评论-->
        	<div id="commentpic"><img src="img/${pic }"></div><div  id="commentfont"><br>商品名称:${gname }<br><br>过期时间:${endtime }<br><br>
      		请发表您的意见:
        	<div class="container">
        	<input type="hidden" id="oid" value="${oid }">
			<textarea id="wysiwyg" rows="10" cols="80"></textarea>
			  <input  type="image" src="pic/baocun.png" id="commentbtn">
			</div>
        	</div>
        </div>

<!--底部-->
<div id="button"><img src="pic/buttom.png" /></div>
<!--绝对定位-->
<div id="absoltion"><img src="pic/001.jpg" width="80" height="60"  /><img src="pic/002.jpg" width="80" height="60" /><img src="pic/003.jpg" width="80" height="60" /></div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style>
#one{
width:200px;
}
#one #yi{
font-size:12px;
background-color:#2CB8AD;
}
#one ul{
margin:0px;
padding:0px;
}
#one ul li{
list-style-type:none;
width:200px;
height:30px;
line-height:30px;
text-align:center;
background-color:#2CB8AD;
}
#one ul li a{
color:white;
text-decoration:none;
}
</style>
</head>
<body>
<div id="one">

<div id="yi">
<h3>管理首页</h3>
账号：<input type="text">
级别：<input type="text"> 
</div>

<div id="er">
<ul>
<li><a href="addgoods.jsp" target="main">发布商品</a></li>
<li><a href="../SelectGoodsServlet?xuan=1" target="main">查看商品</a></li>
<li><a href="../usersServlet" target="main">查看用户</a></li>
<li><a href="../ShowOrder" target="main">查看订单</a></li>
<li><a href="../DFHOrdersServlet" target="main">查看待发货订单</a></li>
</ul>
</div>

</div>
</body>
</html>
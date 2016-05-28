<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="../js/jquery-1.8.3.js"></script>
<script src="../js/ui/jquery.ui.core.js"></script>
<script src="../js/ui/jquery.ui.widget.js"></script>
<script src="../js/ui/jquery.ui.accordion.js"></script>
<script src="../js/ui/jquery.ui.tabs.js"></script>
<script type="text/javascript" src="../js/ui/jquery.ui.datepicker.js"></script>
<link rel="stylesheet" href="../js/css/jquery.ui.all.css"  type="text/css"/>
<script>
function date(){
	$("#time").datepicker({
		changeMonth:true,
		changeYear:true,
		showOtherMonths:true,
		selectOtherMonths:true
	});
	$("#time").datepicker("option","monthNamesShort",['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月']);
		$("#time").datepicker("option","dayNamesMin",['日','一','二','三','四','五','六',]);
		$("#time").datepicker("option","dateFormat","yy-mm-dd");
}
</script>
<style type="text/css">
table{
width:1080px;
border:1px solid black;
border-collapse:collapse;
}
caption{
font-size:20px;
font-weight:bold;
}
th,td{
border:1px solid black;
}
form{
font-size:12px;
font-weight:bold;
color:#1F4A65;
}
</style>
</head>
<body>
<form action="../HouTaiSouSuoGoodsServlet" method="post">
商品编号：<input type="text" name="gid">
商品名称：<input type="text" name="gname">
商品发布日期：<input type="text" name="createtime" id="time" onmouseover="date()">
<input type="submit" value="搜索">
</form>
<table>
<caption>商品列表</caption>
<tr><td>商品编号</td><td>商品名称</td><td>团购有效期</td><td>商品状态</td><td>操作</td></tr>
<c:choose>
    <c:when test="${empty gdlist }">
    <tr><td colspan="5">没有您要搜索的商品！</td></tr>
    </c:when>
    <c:otherwise>
    <c:forEach items="${gdlist }" var="goods">
        <tr><td>${goods.gid }</td><td>${goods.gname }</td><td>${goods.destroytime }</td>
        <c:choose>
            <c:when test="${goods.isdelete==0 }">
            <td>在线</td>
            </c:when>
            <c:otherwise>
            <td style="color:red;">已下架</td>
            </c:otherwise>
        </c:choose>
        <td><a href="../SelectGoodsServlet1?gid=${goods.gid }&xuan=1">修改图片</a>||<a href="../SelectGoodsServlet1?gid=${goods.gid }&xuan=2">修改信息</a>||
        <c:choose>
             <c:when test="${goods.isdelete==0 }">
             <a href="../UpdateGoodsIsdeleteServlet?gid=${goods.gid }&isdelete=1">下架</a>
             </c:when>
             <c:otherwise>
             <a href="../UpdateGoodsIsdeleteServlet?gid=${goods.gid }&isdelete=0">上线</a>
             </c:otherwise>
        </c:choose>
        </td></tr>
        </c:forEach>
    </c:otherwise>
</c:choose>
</table>
</body>
</html>
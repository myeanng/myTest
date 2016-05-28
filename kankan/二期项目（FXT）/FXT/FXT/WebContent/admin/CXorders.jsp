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
<style>
table{
width:1080px;
border-collapse: collapse;
border:1px solid #D4F0B0;
}
#cap{
	line-height: 30px;
	font-size: 13px;
	background:url("../pic/tab_05.gif");
	padding-left:10px;
	color: #1F4A65;
	font-weight: bold;
}
td{
border:1px solid #D4F0B0;
}
</style>
</head>
<body>
<c:if test="${status==3 }">
<div id="s">
	<form action="../cxOrdersServlet" method="post">
		订单编号：<input type="text" name="oid">
		收货人：<input type="text" name="name">
		下单时间：<input type="text" name="time" id="time" onmouseover="date()">
		<input type="submit" value="查询">
	</form>
	</div>
	<table>
		<tr><td colspan="9" id="cap">已发货订单列表</td></tr>
		<tr><td>订单编号</td><td>用户编号</td><td>商品编号</td><td>购买数量</td><td>消费金额</td><td>下单时间</td><td>收货人姓名</td><td>收货地址</td><td>预留电话</td></tr>
		<c:choose>
			<c:when test="${empty cxorder }">
				<tr><td colspan="9">没有搜索到您要查询的订单</td></tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${cxorder }" var="o">
					<tr class="tr">
						<td>${o.oid }</td>
						<td>${o.uid }</td>
						<td>${o.gid }</td>
						<td>${o.num }</td>
						<td>${o.totalprice }</td>
						<td>${o.createtime }</td>
						<td>${o.uname }</td>
						<td>${o.address }</td>
						<td>${o.tel }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
</c:if>
</body>
<script>
$(".tr").hover(function(){
	$(this).css("background","#CAEA9F");
},
function(){
	$(this).css("background","none");
})
</script>
</html>
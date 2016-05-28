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
form{
font-size:12px;
font-weight:bold;
color:#1F4A65;
}
</style>

</head>
<body>
<c:if test="${status==1 }">
	<table  onmouseover="changeto()"  onmouseout="changeback()">
		<tr><td colspan="9" id="cap">未付款订单列表</td></tr>
		<tr id="cap2"><td>订单编号</td><td>用户编号</td><td>商品编号</td><td>购买数量</td><td>需支付金额</td><td>下单时间</td><td>收货人姓名</td><td>收货地址</td><td>预留电话</td></tr>
		<c:choose>
			<c:when test="${empty order }">
				<tr><td colspan="9">暂时没有未付款订单</td></tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${order }" var="o">
					<tr id="tr" class="tr">
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
				<tr>
				
						<td><a href="../DFHOrdersServlet?status=1&pn=1">首页</a></td>
						<td>
							<c:choose>
								<c:when test="${pn>1 }">
									<a href="../DFHOrdersServlet?status=1&pn=${pn-1 }">上一页</a>
								</c:when>
								<c:otherwise>
									上一页
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${pn<p }">
									<a href="../DFHOrdersServlet?status=1&pn=${pn+1 }">下一页</a>
								</c:when>
								<c:otherwise>
									下一页
								</c:otherwise>
							</c:choose>
						</td>
						<td><a href="../DFHOrdersServlet?status=1&pn=${p }">末页</a></td>
						<td></td><td></td><td></td><td></td><td></td>
					</tr>
			</c:otherwise>
		</c:choose>
	</table>
</c:if>
<c:if test="${status==2 }">
	<table>
		<tr><td colspan="10" id="cap">待发货订单列表</td></tr>
		<tr><td>订单编号</td><td>用户编号</td><td>商品编号</td><td>购买数量</td><td>消费金额</td><td>下单时间</td><td>收货人姓名</td><td>收货地址</td><td>预留电话</td><td>点击发货</td></tr>
		<c:choose>
			<c:when test="${empty order }">
				<tr><td colspan="10">暂时没有待发货订单</td></tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${order }" var="o">
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
						<td><a href="../FHServlet?oid=${o.oid }&sta=3">发货</a></td>
					</tr>
				</c:forEach>
				<tr>
						<td><a href="../DFHOrdersServlet?status=2&pn=1">首页</a></td>
						<td>
							<c:choose>
								<c:when test="${pn>1 }">
									<a href="../DFHOrdersServlet?status=2&pn=${pn-1 }">上一页</a>
								</c:when>
								<c:otherwise>
									上一页
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${pn<p }">
									<a href="../DFHOrdersServlet?status=2&pn=${pn+1 }">下一页</a>
								</c:when>
								<c:otherwise>
									下一页
								</c:otherwise>
							</c:choose>
						</td>
						<td><a href="../DFHOrdersServlet?status=2&pn=${p }">末页</a></td>
						<td></td><td></td><td></td><td></td><td></td><td></td>
					</tr>
			</c:otherwise>
		</c:choose>
	</table>
</c:if>
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
			<c:when test="${empty order }">
				<tr><td colspan="9">暂时没有已发货订单</td></tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${order }" var="o">
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
				<tr>
						<td><a href="../DFHOrdersServlet?status=3&pn=1">首页</a></td>
						<td>
							<c:choose>
								<c:when test="${pn>1 }">
									<a href="../DFHOrdersServlet?status=3&pn=${pn-1 }">上一页</a>
								</c:when>
								<c:otherwise>
									上一页
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${pn<p }">
									<a href="../DFHOrdersServlet?status=3&pn=${pn+1 }">下一页</a>
								</c:when>
								<c:otherwise>
									下一页
								</c:otherwise>
							</c:choose>
						</td>
						<td><a href="../DFHOrdersServlet?status=3&pn=${p }">末页</a></td>
						<td></td><td></td><td></td><td></td><td></td>
					</tr>
			</c:otherwise>
		</c:choose>
	</table>
</c:if>
<c:if test="${status==4 }">
	<table>
		<tr><td colspan="10" id="cap">待使用订单列表</td></tr>
		<tr><td>订单编号</td><td>用户编号</td><td>商品编号</td><td>购买数量</td><td>消费金额</td><td>下单时间</td><td>收货人姓名</td><td>收货地址</td><td>预留电话</td><td>点击使用</td></tr>
		<c:choose>
			<c:when test="${empty order }">
				<tr><td colspan="10">暂时没有待使用订单</td></tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${order }" var="o">
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
						<td><a href="../FHServlet?oid=${o.oid }&sta=5">使用</a></td>
					</tr>
				</c:forEach>
				<tr>
						<td><a href="../DFHOrdersServlet?status=4&pn=1">首页</a></td>
						<td>
							<c:choose>
								<c:when test="${pn>1 }">
									<a href="../DFHOrdersServlet?status=4&pn=${pn-1 }">上一页</a>
								</c:when>
								<c:otherwise>
									上一页
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${pn<p }">
									<a href="../DFHOrdersServlet?status=4&pn=${pn+1 }">下一页</a>
								</c:when>
								<c:otherwise>
									下一页
								</c:otherwise>
							</c:choose>
						</td>
						<td><a href="../DFHOrdersServlet?status=4&pn=${p }">末页</a></td>
						<td></td><td></td><td></td><td></td><td></td><td></td>
					</tr>
			</c:otherwise>
		</c:choose>
	</table>
</c:if>
<c:if test="${status==5 }">
	<table>
		<tr><td colspan="9" id="cap">已完成订单列表</td></tr>
		<tr><td>订单编号</td><td>用户编号</td><td>商品编号</td><td>购买数量</td><td>消费金额</td><td>下单时间</td><td>收货人姓名</td><td>收货地址</td><td>预留电话</td></tr>
		<c:choose>
			<c:when test="${empty order }">
				<tr><td colspan="9">暂时没有已完成订单</td></tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${order }" var="o">
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
				<tr>
						<td><a href="../DFHOrdersServlet?status=5&pn=1">首页</a></td>
						<td>
							<c:choose>
								<c:when test="${pn>1 }">
									<a href="../DFHOrdersServlet?status=5&pn=${pn-1 }">上一页</a>
								</c:when>
								<c:otherwise>
									上一页
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${pn<p }">
									<a href="../DFHOrdersServlet?status=5&pn=${pn+1 }">下一页</a>
								</c:when>
								<c:otherwise>
									下一页
								</c:otherwise>
							</c:choose>
						</td>
						<td><a href="../DFHOrdersServlet?status=5&pn=${p }">末页</a></td>
						<td></td><td></td><td></td><td></td><td></td>
					</tr>
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
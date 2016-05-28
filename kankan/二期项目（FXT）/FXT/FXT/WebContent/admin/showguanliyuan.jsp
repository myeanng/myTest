<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="../js/jquery-1.8.3.js"></script>
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
<table>
<tr><td colspan="8" id="cap">管理员列表</td></tr>
<tr><td>编号</td><td>帐号</td><td>电话</td><td>级别</td><td>消费金额</td><td>创建时间</td><td>状态</td>
<c:if test="${isboss==2 }">
<td>操作</td>
</c:if>
</tr>
<c:forEach items="${adminlist }" var="u">
    <tr class="tr">
			<td>${u.uid }</td>
			<td>${u.username }</td>
			<td>${u.tel }</td>
			<td>${u.grade }</td>
			<td>${u.money }</td>
			<td>${u.createtime }</td>
				<c:if test="${u.status==1 }" var="v">
				<td>可用</td>
					<c:if test="${isboss==2 }">
						<td><a href="../UpUsersStatusByUidServlet?uid=${u.uid }&status=0&xuan=2">禁用</a></td>
					</c:if>
				</c:if>
				<c:if test="${u.status==0 }" var="v">
				<td style="color:red;">已禁用</td>
					<c:if test="${isboss==2 }">
						<td><a href="../UpUsersStatusByUidServlet?uid=${u.uid }&status=1&xuan=2">启用</a></td>
					</c:if>
				</c:if>
	</tr>
</c:forEach>
</table>
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
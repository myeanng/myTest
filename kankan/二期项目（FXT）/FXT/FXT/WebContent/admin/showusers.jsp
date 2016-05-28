<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="js/jquery-1.8.3.js"></script>
<title>Insert title here</title>
<style>

table{
width:1080px;
border-collapse: collapse;
border:1px solid #D4F0B0;
}
#cap{
	line-height: 30px;
	font-size: 13px;
	background:url("pic/tab_05.gif");
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
	<table >
	<tr><td colspan="8" id="cap">用户列表</td></tr>
	<tr><td colspan="8" align="center">本商城现拥有用户${renshu }人</td></tr>
	<tr><td>编号</td><td>帐号</td><td>电话</td><td>级别</td><td>消费金额</td><td>创建时间</td><td>状态</td><td>操作</td></tr>
		
		<c:choose>
			<c:when test="${empty userslist }">
				<tr><td colspan="5">暂时没有用户</td></tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${userslist }" var="u">
					<tr class="tr">
						<td>${u.uid }</td>
						<td>${u.username }</td>
						<td>${u.tel }</td>
						<td>${u.grade }</td>
						<td>${u.money }</td>
						<td>${u.createtime }</td>
							<c:if test="${u.status==1 }" var="v">
							<td>可用</td><td><a href="UpUsersStatusByUidServlet?uid=${u.uid }&status=0&xuan=1">禁用</a></td>
							</c:if>
							<c:if test="${u.status==0 }" var="v">
							<td style="color:red;">已禁用</td><td><a href="UpUsersStatusByUidServlet?uid=${u.uid }&status=1&xuan=1">启用</a></td>
							</c:if>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
					<tr><td colspan="8">
					第${pageindex }页/共${zongyeshu }页&nbsp;&nbsp;
					<c:choose>
					<c:when test="${pageindex==1 }">
					首页
					</c:when>
					<c:otherwise>
					<a href="usersServlet?pageindex=1">首页</a>
					</c:otherwise>
					</c:choose>
					||
					<c:choose>
					<c:when test="${pageindex>1 }">
					<a href="usersServlet?pageindex=${pageindex-1 }">上一页</a>
					</c:when>
					<c:otherwise>
					上一页
					</c:otherwise>
					</c:choose>
					||
					<c:choose>
					<c:when test="${pageindex<zongyeshu }">
					<a href="usersServlet?pageindex=${pageindex+1 }">下一页</a>
					</c:when>
					<c:otherwise>
					下一页
					</c:otherwise>
					</c:choose>
					||
					<c:choose>
					<c:when test="${pageindex==zongyeshu }">
					末页
					</c:when>
					<c:otherwise>
					<a href="usersServlet?pageindex=${zongyeshu }">末页</a>
					</c:otherwise>
					</c:choose>
					</td></tr>

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
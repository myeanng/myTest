<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
   <body>
   <form action="music-deleteMessage.action" method="post">
   <h3>我的短消息</h3>
   	<c:if test="${empty messagelist}">
	<div>
	暂无任何信息~！
	</div>
	</c:if>
  	<c:if test="${! empty messagelist }">
  	<table>
	  	<tr>
	    	<td>发件人</td>
	    	<td>时间</td>
	    	<td>标题</td>
	    	<td><input type="checkbox" name="quan" value="-1"></td>
	    </tr>
    <c:forEach var="message" items="${messagelist}"  varStatus="status">
    	<tr>
    			<c:if test="${message.noname==1}">
					<td>[佚名]</td>
				</c:if>
				<c:if test="${message.noname==0}">
					<td>${message.formUser.name }</td>
				</c:if>
    		
    		<td>${message.msgtime }</td>
    		<td><a href="music-showMessage.action?message.id=${message.id }">${message.title }</a></td>
    		<td><input type="checkbox" name="messageIds" value="${message.id }" ></td>
    	</tr>
    </c:forEach>
    </table>
    <input type="submit" value="删除选中项"/>
    </c:if>
    </form>
   </body>
</html>

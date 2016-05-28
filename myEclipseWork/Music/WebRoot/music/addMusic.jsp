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
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
  	<c:if test="${empty sessionScope.user}">
		您还没有登陆,请先<a href="music/login.jsp" target="user">[登录]</a>!
	</c:if>
	<c:if test="${!empty sessionScope.user}">
    <h3>分享歌曲</h3><br>
    <form method="post" action="music-addMusicURL.action"  enctype="multipart/form-data"> 
		    <input type="file" name="upload"/><br>
    <input type="submit" value="下一步">
    </form>
    </c:if> 
  </body>
</html>

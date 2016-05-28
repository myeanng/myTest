<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
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
    <h3>音乐在线</h3>
   <div align="right"> 
   <a href="music/body.jsp" target="body">首页</a>&nbsp;&nbsp;&nbsp;&nbsp; 
   <a href="music-musicBox.action" target="body">音乐盒</a>&nbsp;&nbsp;&nbsp;&nbsp; 
   <a href="music/addMessage.jsp" target="body">短消息</a>&nbsp;&nbsp;&nbsp;&nbsp; 
   <a href="music/addMusic.jsp" target="body">分享歌曲</a>
   </div>
  </body>
</html>

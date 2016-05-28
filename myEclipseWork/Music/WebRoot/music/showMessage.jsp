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
   		<h3>查看短消息</h3>
   		<br/>
   		${message.title }<br/>
   		
   		<br/>
   		他给你留言:${message.msgvalue }
   		
   		<br/>
   		<br/>
   		您可以点击下面的播放器进行试听!<br/>
   		<object type="application/x-shockwave-flash"
	    data="player/audioplayer.swf" width="290" height="24"
	    id="audioplayer7643">
		<param name="movie" value="player/audioplayer.swf" />
		<param name="FlashVars"
		value="playerID=7643&soundFile=${message.music.url}" />
		<param name="quality" value="high" />
		<param name="menu" value="false" />
		<param name="wmode" value="transparent" />
		</object>
   </body>
</html>

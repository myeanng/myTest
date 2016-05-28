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
    ${user.name },欢迎回来!<br><br>
    你有${messageNum }封短消息,请<a href="music/messageList.jsp" target="body">查看</a>!<br>
    如果你有音乐分享,你可以点我进行<a href="music/addMusic.jsp" target="body">[上传音乐]</a>!<br><br>
    退出请点<a href="music-exit.action">[注销登陆]</a>!<br>
  </body>
</html>

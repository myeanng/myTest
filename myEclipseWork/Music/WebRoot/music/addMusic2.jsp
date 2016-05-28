<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
    <h3>您的音乐已经上传成功,您可以点下面的播放器进行试听!</h3>
    <br>
    <object type="application/x-shockwave-flash"
    data="player/audioplayer.swf" width="290" height="24"
    id="audioplayer7643">
	<param name="movie" value="player/audioplayer.swf" />
	<param name="FlashVars"
	value="playerID=7643&soundFile=${musicURL}" />
	<param name="quality" value="high" />
	<param name="menu" value="false" />
	<param name="wmode" value="transparent" />
	</object>
    <form method="post" action="music-addMusic.action"> 
		    歌曲名称:<input name="music.title" ><br/>
		    歌手:<input name="music.singer" ><br/>
		    所属专辑:<input name="music.special" ><br/>
		    简介:<textarea rows="5" cols="20" name="music.mscvalue"></textarea><br/>
    <input type="submit" value="提交">
    </form> 
  </body>
</html>

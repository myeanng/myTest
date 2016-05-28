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
  <c:if test="${empty musiclist}">
	<div>
	暂无任何歌曲，快来分享给大家喔~！
	</div>
	</c:if>
  <c:if test="${! empty musiclist }">
    <c:forEach var="music" items="${musiclist}"  varStatus="status">
    <div align="right" style="margin-bottom: -35px; margin-top: 20px;"><font color="gray" size="2">${music.msctime}</font></div>
    	<h4>${music.title}</h4>
    	<table>
    		<tr>
    			<td>试听:
    			<object type="application/x-shockwave-flash"
				data="player/audioplayer.swf" width="290" height="24"
				id="audioplayer${status.index}">
				<param name="movie" value="player/audioplayer.swf" />
				<param name="FlashVars"
					value="playerID=${status.index}&soundFile=${music.url}" />
				<param name="quality" value="high" />
				<param name="menu" value="false" />
				<param name="wmode" value="transparent" />
			</object>
    			</td>
    		</tr>
    		<tr>
    			<td>歌手:${music.singer }</td>
    		</tr>
    		<tr>
    			<td>所在专辑:${music.special }</td>
    		</tr>
    		<tr>
    			<td>${music.mscvalue }</td>
    		</tr>
    	</table>
    	<br/>
    	<img src="images/img09.gif"/>
    	<a href="#"  style="color: gray;">阅读全文</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
    	<img src="images/img10.gif"/> <a href="#" style="color: gray;">评论</a>
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
    	<img src="images/img10.gif"/> <a  style="color: gray; font-size: 15px" ><font color="red">${music.click }</font>次点击</a>
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
    	<img src="images/img10.gif"/> <a href="music-addToMusicBox.action?music.id=${music.id }"  style="color: gray;">添加到音乐盒</a>
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
    	<img src="images/img10.gif"/> <a href="music/addMessage.jsp?id=${music.id}"  style="color: gray;" onclick="diange(${music.id})">点歌</a>
    
    </c:forEach>
    </c:if>
  </body>
</html>

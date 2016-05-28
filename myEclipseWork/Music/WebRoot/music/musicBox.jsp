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
   		 <c:if test="${empty user.musics}">
	<div>
	暂无收藏~!<br>
	返回<a  href="music/body.jsp">首页</a>,去收藏...
	</div>
	</c:if>
  <c:if test="${! empty user.musics }">
  <form action="music-delectMusicBox" method="post">
  <table>
    	<tr>
    		<td>
    			ID
    		</td>
    		<td>
    			歌曲
    		</td>
    		<td>
    			歌手
    		</td>
    		<td>
    			试听
    		</td>
    		<td>
    			<input type="checkbox" name="quan" value="-1">
    		</td>
    	</tr>
    	
 
    <c:forEach var="music" items="${user.musics}"  varStatus="status">
    	<tr>
    		<td>
    			${music.id }
    		</td>
    		<td>
    			${music.title }
    		</td>
    		<td>
    			${music.singer }
    		</td>
    		<td>
    			<object type="application/x-shockwave-flash"
			    data="player/audioplayer.swf" width="290" height="24"
			    id="audioplayer7643">
				<param name="movie" value="player/audioplayer.swf" />
				<param name="FlashVars"
				value="playerID=7643&soundFile=${music.url}" />
				<param name="quality" value="high" />
				<param name="menu" value="false" />
				<param name="wmode" value="transparent" />
				</object>
    		</td>
    		<td>
    			<input type="checkbox" name="musicIds" value="${music.id }">
    		</td>
    	</tr>
    </c:forEach>
    	
    </table>
   		<input type="submit" value="移除选中项"/>
   	</form>	
    </c:if>
   </body>
</html>

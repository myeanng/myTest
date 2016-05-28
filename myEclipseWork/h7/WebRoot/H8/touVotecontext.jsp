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
    <h3>
    <a href="H8/body.jsp" target="body">投票主页</a>
     &raquo;
     <a href="H8/addVote.jsp" target="body">修改投票</a>
     &raquo;
     修改<span style="color:red">${vote.title }</span>投票内容
     </h3><br>
    <form method="post" action="h8vote_updateVote.action">
    <h4>修改投票选项内容</h4> 
    	<input type="button" onclick="add()" value="添加一个新选项"/>
<!-- 遍历集合循环输出选项内容 -->    	
    	<br>
		<c:forEach items="${vote.votecontexts }" var="votecontext" varStatus="status">
			第${status.count }项: <input name="vt" value="${votecontext.context }"/>
			<a href="h8votecontext_delete.action?id=${votecontext.id }" target="body">删除</a>
			<br/><br/>
		</c:forEach>
<!--
添加新选项的位置
-->
		<span id="add"></span>
		<c:choose> 
			<c:when test="${vote.publish==0}"> 									
			<input type="radio" name="publish" checked="checked" value="0"/>开放<input type="radio" name="publish" value="1"/>不开放						
			</c:when> 									
			<c:otherwise> 									
			<input type="radio" name="publish"  value="0"/>开放<input type="radio" name="publish" checked="checked" value="1"/>不开放	
			</c:otherwise> 								
		</c:choose>
		<br/>
		<c:choose> 
			<c:when test="${vote.type==0}"> 									
			<input type="radio" name="type" checked="checked" value="0"/>单选<input type="radio" name="type" value="1"/>复选								
			</c:when> 									
			<c:otherwise> 									
			<input type="radio" name="type" value="0"/>单选<input type="radio" name="type" value="1" checked="checked"/>复选
			</c:otherwise> 								
		</c:choose>
		<br/>		
    <input type="submit" value="确认">
    </form> 
  </body>
</html>

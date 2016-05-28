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
     <a href="H8/addVote.jsp" target="body">创建投票</a>
     &raquo;
     <a>创建新投票</a>
     </h3><br>
    <form method="post" action="h8vote_add.action">
    <h4>输入投票信息</h4> 
		    投票主题:<input name="title"><br><br>
		    子选项数:<input name="voteNum"><br/><br>
		  投票类型:<select name="type">
		  	<option value="0">单选</option>
		  	<option value="1">多选</option>
		  </select> <br><br>
		  是否开放:<select name="publish">
		  	<option value="0">是</option>
		  	<option value="1">否</option>
		  </select> <br><br> 
    <input type="submit" value="下一步">
    </form> 
  </body>
</html>

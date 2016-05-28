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
   <h3>主页面</h3> <br>
   <table width="800px" height="200px">
   		<tr>
   		<td></td><td> <a href="H8/addVote.jsp" target="body"><img height="40" width="40" src="img/tnt_icon_01.png"/></a></td><td></td><td><a href="H8/findVote.jsp" target="body"><img height="40" width="40" src="img/tnt_icon_02.png"/></a></td>
   		</tr>
   		<tr>
   		<td></td><td> <a href="H8/addVote.jsp" target="body">创建投票</a></td><td></td><td><a href="H8/findVote.jsp" target="body">查找投票</a></td>
   		</tr>
   		<tr>
   		<td></td><td><a href="H8/updatePwd.jsp" target="body"><img height="40" width="40" src="img/tnt_icon_07.png"/></a></td><td></td><td><a href="h8vote_findVote.action" target="body"><img height="40" width="40" src="img/tnt_icon_06.png"/></a></td>
   		</tr>
   		<tr>
   		<td></td><td><a href="H8/updatePwd.jsp" target="body">修改密码</a></td><td></td><td><a href="h8vote_findVote.action" target="body">管理投票</a></td>
   		</tr>
   </table>
  </body>
</html>

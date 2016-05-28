<%@ page language="java" import="java.util.*,java.text.SimpleDateFormat" pageEncoding="utf-8"%>
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
    <h3>时间信息</h3>
    现在的时间是:<%
    	Date date = new Date();
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = df1.format(date);
     %><br>
     <%=time %>
     <br>
     <br>
     <br>
     <h3>欢迎信息</h3>
    欢迎您:${admin.name } <br>
    您上次登录的时间是:<br>
    ${logintime }<br>
    <br>
    <a href="h8admin_exit.action">注销</a>
     <br>
     <h3>统计信息</h3>
     目前共有${vtype0+vtype1 }个投票主题
     <br>
     其中:<br>
     单选投票共有:${vtype0 }
     <br>
     多选投票共有:${vtype1 }
  </body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
  <table>
   <tr>
   <td>用户编号</td>
   <td>用户名称</td>
   <td>用户权限</td>
   <td>修改权限</td>
   <td>删除用户</td>
   </tr>
   <s:iterator id="u" value="#attr.userList">
   <tr>
   <td>
   <s:property value="#u.userid"/>
   </td>
   <td>
   <s:property value="#u.loginname"/>
   </td>
   <td>
   <s:if test="%{#u.roleid==1}">管理员</s:if>
    <s:else>操作员</s:else>
   </td>
   <td><input type="button" value="更改" onclick="uproleid(${u.roleid},${u.userid})"/></td>
   <td>
  	<a href="adminaction_del.action?userid=<s:property value="#u.userid"/>">删除 </a>
   </td>
   </tr>
  </s:iterator>
   </table>
   <a href="add.jsp" target="body">添加用户</a>
   <script type="text/javascript">
   function uproleid(roleid,userid){
   document.location="adminaction_uproleid.action?roleid="+roleid+"&userid="+userid;
   }
   </script>
  </body>
</html>

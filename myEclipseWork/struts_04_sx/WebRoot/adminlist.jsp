<%@ page language="java" import="java.util.*,com.sx4.entity.*,java.util.List.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
   <table>
   <tr>
   <td>管理员编号</td>
   <td>管理员名称</td>
   <td>管理员密码</td>
   <td>操作</td>
   </tr>
   <s:iterator id="a" value="#attr.adminList.{?#this.pwd.length()>0}">
   <tr>
   <td>
   <s:property value="#a.id"/>
   </td>
   <td>
   <s:property value="#a.name"/>
   </td>
   <td>
   <s:property value="pwd"/>
   </td>
   <td>
  	<a href="admin_del.action?id=<s:property value="id"/>">删除 </a>
   </td>
   </tr>
  </s:iterator>
   </table>
   <a href="add.jsp">添加管理员</a>
  </body>
  <script type="text/javascript">
  </script>
</html>

<%@ page language="java" import="java.util.*,com.sx1.entity.*,java.util.List.*" pageEncoding="utf-8"%>
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
   <td>操作</td>
   </tr>
   <%
   List<Admin> adminList=(List<Admin>)request.getAttribute("adminList");
   for(int i=0;i<adminList.size();i++){
   %>
   <tr>
   <td>
   <%=adminList.size() %>
   <%=adminList.get(i).getId() %>
   </td>
   <td>
   <%=adminList.get(i).getName() %>
   </td>
   <td>
  	<a href="del.do?id=<%=adminList.get(i).getId() %>">删除 </a>
   </td>
   </tr>
   <%
   }
     %>
   </table>
   <a href="add.jsp" >添加管理员</a>
  </body>
  <script type="text/javascript">
  </script>
</html>

<%@ page language="java" import="java.util.*,com.sx.entity.*,java.util.List.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
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
  <a href="admin.do?l=zh&c=CN&rd=Gjh"><bean:message key="yy"/></a>|<a href="admin.do?l=en&c=US&rd=Gjh"><bean:message key="yy2"/></a><br>
  <form action="admin.do" method="post" name="loginForm">
   <table>
   <tr>
   <td><bean:message key="adminID"/></td>
   <td><bean:message key="adminName"/></td>
   <td><bean:message key="cz"/></td>
   </tr>
   <%
   List<Admin> adminList=(List<Admin>)request.getAttribute("adminList");
   for(int i=0;i<adminList.size();i++){
   %>
   <tr>
   <td>
   <%=adminList.get(i).getId() %>
   </td>
   <td>
   <%=adminList.get(i).getName() %>
   </td>
   <td>
    <input type="radio" name="rd" value="xg" onclick="checkxg( <%=adminList.get(i).getId() %>, <%=adminList.get(i).getName() %>)"><bean:message key="upd"/>
    <input type="radio" name="rd" value="sc" onchange="checksc( <%=adminList.get(i).getId() %>)"><bean:message key="del"/>
   </td>
   </tr>
   <%
   }
     %>
   </table>
   <input type="radio" name="rd" value="tj"  checked="checked" ondblclick="checktj()"><bean:message key="add"/><br/>
     <table>
   <tr>
   <td><bean:message key="addadmin"/>
   <input type="hidden" value="" name="admin.id" id="aid">
   </td>
   </tr>
   <tr>
   <td><bean:message key="name"/></td>
   <td><input name="admin.name" type="text" id="name"/></td>
   </tr>
   <tr>
   <td><bean:message key="pwd"/></td>
   <td><input name="admin.pwd" type="password"/></td>
   </tr>
   <tr>
   <td>确认密码:</td>
   <td><input name="pwd2" type="password"/></td>
   </tr>
   </table>
   <input type="submit" value="确定"/>
   </form>
  </body>
  <script type="text/javascript">
  function checkxg(id,name){
  var fname=document.getElementById("name");
   var aid=document.getElementById("aid");
   aid.value=id;
   fname.valueOf(name);
  }
  function checksc(id){
   var aid=document.getElementById("aid");
   aid.value=id;
  }
  function checktj(){
  var fname=document.getElementById("name");
   var aid=document.getElementById("aid");
   aid.value="";
   fname.value="";
  }
  </script>
</html>

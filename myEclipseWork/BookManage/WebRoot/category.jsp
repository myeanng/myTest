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
  <form action="categoryaction_add.action" method="post">
  <table>
   <tr>
   <td>类别ID</td>
   <td>类别名称</td>
   <td>类别描述</td>
   <td>修改</td>
   <td>删除</td>
   </tr>
   <s:iterator id="c" value="#attr.CategoryList">
   <tr>
   <td>
   <s:property value="#c.categoryid"/>
   </td>
   <td>
   <s:property value="#c.categoryname"/>
   </td>
   <td>
   <s:property value="#c.categorydesc"/>
   </td>
   <td><input type="button" value="更改" onclick="upname()"/></td>
   <td>
  	<a href="categoryaction_del.action?categoryid=<s:property value="#c.categoryid"/>">删除 </a>
   </td>
   </tr>
  </s:iterator>
  <tr><td>类别ID</td><td><input name="categoryid"/></td></tr>
  <tr><td>类别名称</td><td><input name="categoryname" onblur="ajax()"/></td><td><label id="namelable" style="color: red;"></label></td></tr>
  <tr><td>类别描述</td><td><textarea name="categorydesc"></textarea></td></tr>
   </table>
  <input type="submit" value="添加">
  </form>
   <script type="text/javascript">
   function uproleid(roleid,userid){
   document.location="publisheraction_uproleid.action?roleid="+roleid+"&userid="+userid;
   }
   var xhr;
   function ajax(){
   var name=document.getElementById("categoryname").value;
   xhr=new XMLHttpRequest;
   xhr.onreadystatechange=callback;
   //xhr.open("GET","adminaction_updatepwd.action",true);
   //post
   xhr.open("POST","categoryaction_ajaxName.action",true);
   xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
   //post方式传参
   xhr.send("categoryname="+name);
   }
   
   function callback(){
   	if(xhr.readyState==4){
   		if(xhr.status==200){
   			var str=xhr.responseText;
   			if(str=="true"){
   			var lableajax =document.getElementById("namelable");
   			lableajax.innerHTML="类别名已存在!";
   				//改变样式
   			}else{
   			var lableajax =document.getElementById("namelable");
   			lableajax.innerHTML="";
   			}
   		}
   	}
   }
   </script>
  </body>
</html>

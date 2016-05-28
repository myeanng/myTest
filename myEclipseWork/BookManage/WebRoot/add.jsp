<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
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
    	<form action="adminaction_add.action" method="post" >
  		用户名:<input name="loginname" onblur="ajax()"><label id="loginnamelable"></label><br/>
  		密码:<input type="password" name="loginpwd"><label id="loginpwdlable"></label><br/>
  		<input type="radio" name="roleid" value="0" checked="checked">操作员<input type="radio" name="roleid" value="1">管理员
  		<input type="submit" value="添加">
  		</form>
  <script type="text/javascript">
   var xhr;
   function ajax(){
   var loginname=document.getElementById("loginname").value;
   xhr=new XMLHttpRequest;
   xhr.onreadystatechange=callback;
   //xhr.open("GET","adminaction_updatepwd.action",true);
   //post
   xhr.open("POST","adminaction_ajaxName.action",true);
   xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
   //post方式传参
   xhr.send("loginname="+loginname);
   }
   
   function callback(){
   	if(xhr.readyState==4){
   		if(xhr.status==200){
   			var str=xhr.responseText;
   			if(str=="true"){
   			var lableajax =document.getElementById("loginnamelable");
   			lableajax.innerHTML="用户名已存在!";
   				//改变样式
   			}else{
   			var lableajax =document.getElementById("loginnamelable");
   			lableajax.innerHTML="";
   			}
   		}
   	}
   }
   </script>
  </body>
</html>

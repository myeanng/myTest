<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updatepwd.jsp' starting page</title>
    
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
   <h3>修改密码</h3>
   <form action="adminaction_updatepwd.action" method="post">
   <label id="lableajax"></label><br>
   用户名称:<input name="loginname" id="loginname"><br>
   当前密码:<input name="pwd" type="password" id="pwd" onblur="ajax()"><br/>
   新密码:<input name="loginpwd" type="password" id="loginpwd"  onblur="checknewpwd1()"><label id="lablepwd"></label><br/>
   二次确认:<input name="loginpwd2" type="password" id="loginpwd2" onblur="checknewpwd2()"><label id="lablepwd2"></label><br/>
   <input type="submit" value="提交">
   </form>
   <script type="text/javascript">
   var xhr;
   function ajax(){
   var loginname=document.getElementById("loginname").value;
   var loginpwd=document.getElementById("pwd").value;
   xhr=new XMLHttpRequest;
   xhr.onreadystatechange=callback;
   //xhr.open("GET","adminaction_updatepwd.action",true);
   //post
   xhr.open("POST","adminaction_ajax.action",true);
   xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
   //post方式传参
   xhr.send("loginname="+loginname+"&loginpwd="+loginpwd);
   }
   
   function callback(){
   	if(xhr.readyState==4){
   		if(xhr.status==200){
   			var str=xhr.responseText;
   			if(str=="false"){
   			var lableajax =document.getElementById("lableajax");
   			lableajax.innerHTML="用户名或密码错误!";
   				//改变样式
   			}else{
   			var lableajax =document.getElementById("lableajax");
   			lableajax.innerHTML="";
   			}
   		}
   	}
   }
   function checknewpwd2(){
   var loginpwd=document.getElementById("loginpwd").value;
   var loginpwd2=document.getElementById("loginpwd2").value;
   if(loginpwd!=loginpwd2){
   		var lablepwd =document.getElementById("lablepwd2");
   			lablepwd.innerHTML="密码不一致!";
   }else{
   		var lablepwd =document.getElementById("lablepwd2");
   			lablepwd.innerHTML="";
   }
   }
   function checknewpwd1(){
   var loginpwd=document.getElementById("loginpwd").value;
   if(loginpwd==""){
   		var lablepwd =document.getElementById("lablepwd");
   			lablepwd.innerHTML="新密码必须填写!";
   }else{
   		var lablepwd =document.getElementById("lablepwd");
   			lablepwd.innerHTML="";
   }
   }
   </script>
  </body>
</html>

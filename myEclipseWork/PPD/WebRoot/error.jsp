<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'myTest.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body onload="show()">
   
   
   <div align="center" style="vertical-align: middle"><font color="red" size="20">${msg }</font><br/>
   3秒钟后跳转页面...
   <br>
   返回<a href="myAccount-baccount">我的账户</a>首页
   <form action="msg" method="post">
   <input type="hidden" value="${msg }" id="msg" name="msg">
   </form>
   </div>
   
   <script type="text/javascript">
	function show() {
	    
	    setTimeout("href()",3000);
	}

	function href() {
	var msg="";
	msg=document.getElementById("msg").value;
	alert(msg);
	var href="";
	if (msg == "支付密码错误") href = "withdrawCash.jsp";
	else if (msg == "账户余额不足") href = "recharge.jsp";
	else if (msg == "原密码错误，请重试！") href = "updatePassword.jsp";
	else href = "myAccount-baccount"; 
	
	    window.location=href;
	    
	}
	   
   
   </script>
  </body>
</html>

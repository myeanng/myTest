<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  <form action="jisuanaction.action" method="post" name="f">
	<h3>简易计算器</h3> 
  	第一个数<input type="text" name="num1" /><br>
  	第二个数<input type="text" name="num2" /><br>
    <input type="submit" value="+" name="fuhao" />
    <input type="submit" value="-" name="fuhao" />
    <input type="submit" value="*" name="fuhao" />
    <input type="submit" value="/" name="fuhao" /><br>
    结果 <input type="text" name="num4" value="${num4 }" />
  </form>
  </body>
  <script type="text/javascript">
  /*function js(ob){
  	f.action="jisuan.action?fuhao="+ob;
  	f.submit();
  }*/
  </script>
</html>

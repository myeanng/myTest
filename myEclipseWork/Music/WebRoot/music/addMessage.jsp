<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
    <h3>点播歌曲</h3>
    <br>
    <form method="post" action="music-addMessage.action?message.music.id=${param.id}"> 
		    用户名:<input name="message.toUsre.name" id="toUserName" onblur="ajax()" >
		    <label id="toUserNameLabel"></label>
		    <br/>
		    <input type="checkbox" name="niming" value="0" >匿名点歌<br>
		    留言:<textarea rows="5" cols="20" name="message.msgvalue"></textarea><br/>
    <input type="submit" value="确定">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
    <input type="reset" value="取消">
    </form>
    
    <script type="text/javascript">
   var xhr;
   function ajax(){
   var toUserName=document.getElementById("toUserName").value;
   xhr=new XMLHttpRequest;
   xhr.onreadystatechange=callback;
   //xhr.open("GET","adminaction_updatepwd.action",true);
   //post
   xhr.open("POST","music-ajaxToName.action",true);
   xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
   //post方式传参
   xhr.send("message.toUsre.name="+toUserName);
   }
   
   function callback(){
   	if(xhr.readyState==4){
   		if(xhr.status==200){
   			var str=xhr.responseText;
   			if(str=="true"){
   			var lableajax =document.getElementById("toUserNameLabel");
   			lableajax.innerHTML="<label id='toUserNameLabel' style='color: green;font-size: 15px;' >用户名存在!</label>";
   				//改变样式
   			}else{
   			var lableajax =document.getElementById("toUserNameLabel");
   			lableajax.innerHTML="<label id='toUserNameLabel' style='color: red;font-size: 15px;' >用户名不存在!</label>";
   			}
   		}
   	}
   }
   </script> 
  </body>
</html>

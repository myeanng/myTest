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
    
    <title>My JSP 'buy.jsp' starting page</title>
    
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
  <h1>图书销售</h1>
        <form action="bookaction_sale.action">
    图书ISBN:<input name="bookisbn" onblur="ajax()"/><label style="color: red;" id="bookisbnlable"></label><br>
    图书名称:<input name="bookname"/><br>
    图书作者:<input name="author"/><br>
    图书定价:<input name="saleprice"/><br/>
    销售数量:<input name="salenum" onblur="sum()"/><label style="color: red;" id="booknumlable"></label><br>
    销售总价:<input name="allprice"/><br>
    <input type="submit" value="提交"/>
    </form>
<script type="text/javascript">
   var xhr;
   function ajax(){
   var bookisbn=document.getElementById("bookisbn").value;
   xhr=new XMLHttpRequest;
   xhr.onreadystatechange=callback;
   //xhr.open("GET","adminaction_updatepwd.action",true);
   //post
   xhr.open("POST","bookaction_ajax.action",true);
   xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
   //post方式传参
   xhr.send("bookisbn="+bookisbn);
   }
   
   function callback(){
   	if(xhr.readyState==4){
   		if(xhr.status==200){
   			var str=xhr.responseText;
   			var lableajax =document.getElementById("bookisbnlable");
   			var booknumlable =document.getElementById("booknumlable");
   			if(str==""){
   			lableajax.innerHTML="该图书编号不存在!";
   				//改变样式
   			}else{
   			var bookname =document.getElementById("bookname");
   			var saleprice =document.getElementById("saleprice");
   			var author =document.getElementById("author");
   			//初始化数据
   			var json = eval('(' + str + ')');
   			bookname.value=json.bookname;
   			author.value=json.author;
   			saleprice.value=json.saleprice;
   			lableajax.innerHTML="";
   			booknumlable.innerHTML="库存数量为:"+json.nownum;
   			}
   		}
   	}
   }
   function sum(){
   var allprice =document.getElementById("allprice");
   var saleprice =document.getElementById("saleprice");
   var salenum =document.getElementById("salenum");
   allprice.value=saleprice.value*salenum.value;
   }
   </script>
  </body>
</html>

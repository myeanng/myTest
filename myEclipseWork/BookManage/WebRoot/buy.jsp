<%@ page language="java" import="java.util.*,com.ss.entity.Book" pageEncoding="utf-8"%>
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
  <h1>图书进货</h1>
        <form action="bookaction_buy.action">
    图书编号:<input name="bookisbn" onblur="ajax()"/><label style="color: red;" id="bookisbnlable"></label><br>
    图书名称:<input name="bookname"/><br>
    图书简介:<textarea rows="5" cols="20" name="bookdesc"></textarea><br>
     图书作者:<input name="author"/><br>  
    出版社:
    <select name="publisherid">
    <option value="">--请选择--</option>
    <s:iterator id="p" value="#attr.publisherList">
    <option value="<s:property value='#p.publisherid'/>"><s:property value="#p.publishername"/></option>
    </s:iterator>
    </select>
    <br>
    类别:
    <select name="categoryid">
    <option value="">--请选择--</option>
    <s:iterator id="c" value="#attr.CategoryList">
    <option value="<s:property value='#c.categoryid'/>"><s:property value="#c.categoryname"/></option>
    </s:iterator>
    </select>
    <br>
    图书定价:<input name="saleprice"/><br>
    图书数量:<input name="nownum"/><br>
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
   			if(str==""){
   			lableajax.innerHTML="该图书编号不存在!";
   				//改变样式
   			}else{
   			var bookname =document.getElementById("bookname");
   			var bookdesc =document.getElementById("bookdesc");
   			var author =document.getElementById("author");
   			var publisherid =document.getElementById("publisherid");
   			var categoryid =document.getElementById("categoryid");
   			var saleprice =document.getElementById("saleprice");
   			//初始化数据
   			//var obj = JSON.parse(str);
   			//var obj = str.parseJSON();
   			var json = eval('(' + str + ')');
   			bookname.value=json.bookname;
   			author.value=json.author;
   			bookdesc.value=json.bookdesc;
   			publisherid.value=json.publisherid;
   			categoryid.value=json.categoryid;
   			saleprice.value=json.saleprice;
   			lableajax.innerHTML="";
   			}
   		}
   	}
   }
   </script>
 
  </body>
</html>

<%@ page language="java" import="java.util.*,com.sl2.entity.*,java.util.List.*" pageEncoding="utf-8"%>
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
   <caption>图书列表</caption>
   <tr>
   <td>ISBN</td>
   <td>图书名称</td>
   <td>图书作者</td>
   <td>出版社</td>
   <td>售价</td>
   <td>库存</td>
   </tr>
   <%
   List<Book> booklist=(List<Book>)request.getAttribute("booklist");
   for(int i=0;i<booklist.size();i++){
   %>
   <tr>
   <td>
   <%=booklist.get(i).getISBN() %>
   </td>
   <td>
   <%=booklist.get(i).getName() %>
   </td>
   <td>
   <%=booklist.get(i).getAuthor() %>
   </td>
   <td>
   <%=booklist.get(i).getPublish() %>
   </td>
   <td>
   <%=booklist.get(i).getPrice() %>
   </td>
   <td>
   <%=booklist.get(i).getCurrcount() %>
   </td>
   </tr>
   <%
   }
     %>
   </table>
  </body>
  <script type="text/javascript">
  </script>
</html>

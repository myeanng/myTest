<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>
<body >
付款成功，请及时到<a href="UpShowUsersServlet">我的订单</a>页面关注订单状态。<span style="color:red;">五秒后自动将跳转到首页</span>
<%
     response.setHeader("refresh", "3;URL=mainShowGoodsServlet");
%>
</body>
</html>
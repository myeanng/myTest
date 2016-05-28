<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<style>
#f{
	margin:100px auto;
	width: 100%;
	text-align: center;
	vertical-align:bottom;
	
}
</style>
<body>
<div id="f">
<form action="../findAmountByMonthServlet" method="post">
请输入查询的月份：<input type="text" name="m"><input type="submit" name="submit" value="查询">
</form>
</div>
</body>
</html>
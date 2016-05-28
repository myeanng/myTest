<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
img{
width:400px;
height:300px;
border:1px solid red;
}
div{
color:red;
}
</style>
</head>
<body>
<div>

<form action="../UpdateGoodsPicServlet" method="post" enctype="multipart/form-data">
<input type="hidden" value="${goods.gid }" name="gid">
<input type="hidden" value="1" name="xuan">
<c:choose>
    <c:when test="${empty goods.pic1 }">
    <div>该商品未上传图片1</div>
    上传图片1：<input type="file" name="pic1"><br>
    </c:when>
    <c:otherwise>
    <img src="../img/${goods.pic1 }"><br>更换图片1:<input type="file" name="pic1"><br>
    </c:otherwise>
</c:choose>
<input type="submit" value="提交" style="width:200px;height:30px;font-size:20px;margin-left:50px;"/><br>
</form>

<form action="../UpdateGoodsPicServlet" method="post" enctype="multipart/form-data">
<input type="hidden" value="${goods.gid }" name="gid">
<input type="hidden" value="2" name="xuan">
<c:choose>
    <c:when test="${empty goods.pic2 }">
    <div>该商品未上传图片2</div>
    上传图片2：<input type="file" name="pic2"><br>
    </c:when>
    <c:otherwise>
    <img src="../img/${goods.pic2 }"><br>更换图片2:<input type="file" name="pic2"><br>
    </c:otherwise>
</c:choose>
<input type="submit" value="提交" style="width:200px;height:30px;font-size:20px;margin-left:50px;"/><br>
</form>
<form action="../UpdateGoodsPicServlet" method="post" enctype="multipart/form-data">
<input type="hidden" value="${goods.gid }" name="gid">
<input type="hidden" value="3" name="xuan">
<c:choose>
    <c:when test="${empty goods.pic3 }">
    <div>该商品未上传图片3</div>
    上传图片3：<input type="file" name="pic3"><br>
    </c:when>
    <c:otherwise>
    <img src="../img/${goods.pic3 }"><br>更换图片3:<input type="file" name="pic3"><br>
    </c:otherwise>
</c:choose>
<input type="submit" value="提交" style="width:200px;height:30px;font-size:20px;margin-left:50px;"/><br>
</form>
</div>
</body>
</html>
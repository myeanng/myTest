<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看订单</title>
<style type="text/css">
table{
border-collapse: collapse;
}
</style>
</head>
<body>
   <table border="1">
   <tr><td>编号</td><td>用户编号</td><td>下单时间</td><td>收货人姓名</td><td>收货人地址</td><td>收货人电话</td><td>订单状态</td><td>备注</td>
   </tr>
  
   <c:choose>
  <c:when test="${empty orderlist} ">
  没有找到数据
  </c:when>
  <c:otherwise>
  <c:forEach items="${orderlist }" var="l">
   <tr>
  <td>${l.oid }</td>
  <td>${l.uid }</td>
  <td>${l.createtime }</td>
  <td>${l.uname }</td>
  <td>${l.address }</td>
  <td>${l.tel }</td>
  <td>${l.status }</td>
  <td>${l.beizhu }</td>
   </tr>
  </c:forEach>
  </c:otherwise>
   </c:choose>
 <tr><td> <a href="../ShowOrder?p=1">首页</a></td>
 <c:choose>
<c:when test="${pn gt 1 }">
 <td><a href="../ShowOrder?p=${pn-1 }">上一页</a></td>
</c:when>
<c:otherwise>
<td>上一页</td>
</c:otherwise>
 </c:choose>

<c:choose>
<c:when test="${row>pn  }">
 <td><a href="../ShowOrder?p=${pn+1 }">下一页</a></td>
</c:when>
<c:otherwise>
<td>下一页</td>
</c:otherwise>
 </c:choose>
 <td><a href="../ShowOrder?p=${row }">尾页</a></td>
 </tr>
   </table>
</body>
</html>
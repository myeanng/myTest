<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<jsp:include flush="true" page="../header.jsp" />

		
		<c:forEach var="board" items="${boardList }">
			${board.name }: ${board.name }, ${board.description } 
			<a href="${pageContext.request.contextPath}/Board_enter.action?board.id=${board.id }">设置版主</a> <BR />
		</c:forEach>
		
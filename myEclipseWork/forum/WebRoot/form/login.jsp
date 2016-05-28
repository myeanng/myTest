<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<jsp:include flush="true" page="../header.jsp"></jsp:include>


<div id="main">

	<!-- Thread Start -->
	<div class="t" style="margin-bottom:0px; border-bottom:0">
		<table cellspacing="0" cellpadding="0" width="100%">
			<tr>
				<th class="h">
					<strong class="fl w">请登录</strong> &nbsp;
					<span style="color: red; font-weight: bold; ">${exception.message }</span>
				</th>
			</tr>
		</table>
	</div>

	<form action="Person_login.action" method="post">
	
		<div class="t t2">
			<table cellspacing="0" cellpadding="0" width="100%"
				style="table-layout:fixed;border-top:0">
				<tr class="tr3">
					<td style="width: 120px; ">
						帐号:
					</td>
					<td>
						<input type="text" name="account" />
					</td>
				</tr>

				<tr class="tr3">
					<td style="width: 120px; ">
						密码:
					</td>
					<td>
						<input type="password" name="password" />
					</td>
				</tr>

				<tr class="tr3">
					<td colspan="2">
						<input type="submit" value="登陆" class="btn"/>
					</td>
				</tr>
			</table>
		</div>
	</form>
</div>
	<jsp:include flush="true" page="../footer.jsp" />
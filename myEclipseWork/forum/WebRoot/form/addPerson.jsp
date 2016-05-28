<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>

<s:include value="../header.jsp"></s:include>

<div id="main">

	<!-- Thread Start -->
	<div class="t" style="margin-bottom:0px; border-bottom:0">
		<table cellspacing="0" cellpadding="0" width="100%">
			<tr>
				<th class="h">
					<strong class="fl w">注册用户</strong> &nbsp;
					<span style="color: red; font-weight: bold; ">${ message }</span>
				</th>
			</tr>
		</table>
	</div>

	<form action="Person_register.action" method="post">
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
					<td>
						密码:
					</td>
					<td>
						<input type="password" name="password" />
					</td>
				</tr>
				<tr class="tr3">
					<td>
						确认密码:
					</td>
					<td>
						<input type="password" name="repassword" />
					</td>
				</tr>
				<tr class="tr3">
					<td>
						姓名:
					</td>
					<td>
						<input type="text" name="name"/>
						
					</td>
				</tr>
				<tr class="tr3">
					<td>
						性别:
					</td>
					<td>
						<select name="sex">
							<option value="男">男</option>
							<option value="女">女</option>
						</select>
					</td>
				</tr>
				<tr class="tr3">
					<td>
						电子邮件:
					</td>
					<td>
						<input type="text" name="email"/>
					</td>
				</tr>
				<tr class="tr3">
					<td>
						生日:
					</td>
					<td>
							<input type="text" name="birthday"/>
					</td>
				</tr>
				<tr class="tr3">
					<td colspan="2">
						<input type="submit" value="注册" class="btn"/>
					</td>
				</tr>
			</table>
		</div>
	</form>
</div>
	<s:include value="../footer.jsp"></s:include>
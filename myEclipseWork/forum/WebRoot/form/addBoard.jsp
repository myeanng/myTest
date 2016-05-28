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
					<strong class="fl w">添加版面</strong> &nbsp;
					<span style="color: red; font-weight: bold; ">${
						exception.message }</span>
				</th>
			</tr>
		</table>
	</div>


	<s:form action="Board_add" method="post">
		<div class="t t2">
			<table cellspacing="0" cellpadding="0" width="100%"
				style="table-layout:fixed;border-top:0">
				<tr class="tr3">
					<td style="width: 120px; ">
						类别:
					</td>
					<td>
						<s:select list="#attr.categoryList" listKey="id" listValue="name" name="category.id"></s:select>
					</td>
				</tr>
				<tr class="tr3">
					<td style="width: 120px; ">
						名称:
					</td>
					<td>
						<input type="text" name="board.name" style="width:200px;"/>
					</td>
				</tr>
				<tr class="tr3">
					<td style="width: 120px; ">
						描述:
					</td>
					<td>
							<textarea style="width: 200px; height: 50px; " name="board.description" ></textarea>
					</td>
				</tr>

				<tr class="tr3">
					<td colspan="2">
						<input type="submit" value="添加" class="btn"/>
					</td>
				</tr>

			</table>
		</div>
	</s:form>
</div>

<jsp:include flush="true" page="../footer.jsp" />

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<jsp:include flush="true" page="../header.jsp"></jsp:include>

<div class="contentwrap z">
	<c:forEach var="category" items="${categoryList }">
		<div class="t">
			<table cellspacing="0" cellpadding="0" width="100%">
				<tr>
					<th class="h" colspan="6">
						<a class="closeicon fr" style="cursor:pointer;"
							onclick="return IndexDeploy('85',0)">
							<img id="img_85" src="form/images/yellow/index/cate_fold.gif" /></a>
						<h2>
							&raquo;
							<a href="Category_enter.action?category.id=${category.id }"	class="cfont">${ category.name }</a>
						</h2>
					</th>
				</tr>
				<tr></tr>
				<tr class="tr2">
					<td width="*" colspan="2" class="tac">
						论坛
					</td>
					<td class="tal y-style e" style="width:5%">
						主题
					</td>
					<td class="tal y-style e" style="width:5%">
						文章
					</td>
					<td class="tal y-style f" style="width:40%">
						最后发表
					</td>
					<td class="y-style" style="width:10%">
						版主
					</td>
				</tr>
				<tbody id="cate_85" style="display:;">
					<c:forEach var="board" items="${category.boards }">
						<tr class="tr3 f_one">
							<td class="icon tac" width="45">
								<a href="#"><img src="form/images/yellow/new.gif" /> </a><!-- 新闻 -->
							</td>
							<th>
								<h3 class="b">
<!--									板块名称-->
									<a href="#">${board.name }</a> 
								</h3>
								<br />
								<span class="smalltxt gray">${ board.description }</span>
							</th>
							<td class="tal y-style e">
								<span class="f10">${ board.threadCount }</span>
								<br />
							</td>
							<td class="tal y-style e">
								<span class="f10">${ board.replyCount }</span>
								<br />
							</td>
							<th>
								<c:if test="${board.lastThread != null }">
									<a href="#" class="a2">${board.lastThread.title }</a>
									<br />
									<span class="f12">
										<a href="#">${board.lastThread.author.account }</a> 
									</span>
									<span class="f9 gray">${ board.lastThread.dateCreated }</span>
								</c:if>
								<c:if test="${board.lastReply != null }">
									<a
										href="#" class="a2">${board.lastReply.title }</a>
									<br />
									<span class="f12">
										<a href="#">${board.lastReply.author.account }</a> 
									</span>
									<span class="f9 gray">${board.lastReply.dateCreated }</span>
								</c:if>
								&nbsp;
							</th>
							<td class="y-style"
								style="word-break: keep-all;word-wrap:no-wrap">
								<c:forEach var="person" items="${board.administrators }">
									<a href="#">${person.account }</a>
								</c:forEach>
								&nbsp;
							</td>
						</tr>
					</c:forEach>
					<tr>
						<td class="f_one" colspan="6" style="height:8px"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</c:forEach>
</div>

<jsp:include flush="true" page="../footer.jsp"></jsp:include>


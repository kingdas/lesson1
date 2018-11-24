<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table width="500">
			<thead>
				<tr>
					<th>标题</th>
					<th>借款金额</th>
					<th>借款日期</th>
					<th>状态</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ls }" var="l">
					<tr>
						<td>${l.title }</td>
						<td>${l.amount }</td>
						<td><fmt:formatDate value="${l.applyDate }"
								pattern="yyyy-MM-dd" /></td>
						<td>${l.status==0?'未审批':l.status==1?'审批通过':l.status==2?'审批驳回':''
							}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
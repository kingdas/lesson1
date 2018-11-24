<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/myJs.js"></script>
</head>
<body>
	<div align="center">
		<p>
			<a href="#" onclick="openPage('user/add','增加')">增加用户</a>
		</p>
		<form action="${pageContext.request.contextPath}/user/findByNameOrStatus">
			<table width="640" border="0">
				<tr>
					<td>按姓名查询</td>
					<td><input type="text" name="name" /></td>
					<td><select name="status">
							<option value="-1">---</option>
							<option value="1">有效</option>
							<option value="0">无效</option>
					</select></td>
					<td><input type="submit" value="查询" /></td>
				</tr>
			</table>
		</form>
		<table width="640" border="0">
			<tr>
				<th>账号</th>
				<th>姓名</th>
				<th>密码</th>
				<th>状态</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<c:forEach items="${us}" var="u">
				<tr>
					<td>${u.operator_id}</td>
					<td>${u.name }</td>
					<td>${u.password }</td>
					<td>${u.status==1?'有效':'无效' }</td>
					<td><a
						href="${pageContext.request.contextPath}/user/update/${u.operator_id}">修改</a></td>
					<td><a href="#" onclick="del(${u.operator_id},'${u.name }')">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
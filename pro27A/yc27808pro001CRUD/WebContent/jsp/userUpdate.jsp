<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>修改用户</h3>
		<form action="UserController" method="post">
			<input type="hidden" name="m" value="doUpdate" />
			<table width="640" border="1">
				<tr>
					<td>账号</td>
					<td><input type="text" name="operator_id"
						value="${u.operator_id}" readonly="readonly" /></td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><input type="text" name="name" value="${u.name}" /></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" name="password"
						value="${u.password}" /></td>
				</tr>
				<tr>
					<td>状态</td>
					<td><select name="status">
							<option value="1">有效</option>
							<option value="0" ${u.status==0? 'selected="selected"':''} >无效</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="修改" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/res/js/myJs.js"></script>

</head>
<body>
	<div align="center">
		<h3>增加用户</h3>
		<form action="${pageContext.request.contextPath}/user/add"
			method="post" onsubmit="return checkNameAndPwd();">
			<table width="420" border="0">
				<tr>
					<td colspan="2"><font color="#ff0000"><span id="err">
						</span></font></td>
				</tr>
				<tr>
					<td>账号</td>
					<td><input type="text" name="operator_id"
						onblur="checkId(this.value)" /></td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><input type="text" id="name" name="name"
						onblur="nameExists(this.value)" /></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" id="password" name="password" /></td>
				</tr>
				<tr>
					<td>状态</td>
					<td><select name="status">
							<option value="1">有效</option>
							<option value="0">无效</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="增加" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
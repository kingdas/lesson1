<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/res/js/jquery-1.9.1.js"></script>

<script type="text/javascript">
	$(function() {
		$("tr").hover(function() {
			$(this).addClass("test");
		}, function() {
			$(this).removeClass("test");
		});
	});
</script>
<style type="text/css">
.test {
	background-color: #4f5e6d
}
</style>

</head>
<body>
	<table>
		<thead>
			<tr>
				<th>A1</th>
				<th>A2</th>
				<th>A3</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>A</td>
				<td>B</td>
				<td>C</td>
			</tr>
			<tr>
				<td>AA</td>
				<td>BB</td>
				<td>CC</td>
			</tr>
			<tr>
				<td>AAA</td>
				<td>BBB</td>
				<td>CCC</td>
			</tr>
		</tbody>
	</table>
</body>
</html>
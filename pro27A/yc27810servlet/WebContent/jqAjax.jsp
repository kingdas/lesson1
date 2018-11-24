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
	function chk(name) {
		$.ajax({
			url : "http://localhost:8060/yc27810servlet/ms?t="+Math.random()+"&name="+name,
			type : "get",
			success : function(msg) {
				if (msg % 2 == 0) {
					$("#err").html("用户名已存在");
				} else {
					$("#err").html("");
				}
			}
		});
	}
</script>
</head>
<body>
	<div id="err"></div>
	<input name="xx" onblur="chk(this.value)" />
</body>
</html>
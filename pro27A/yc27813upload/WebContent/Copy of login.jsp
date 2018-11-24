<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:set var="basePath" value="${pageContext.request.contextPath }"
	scope="application"></c:set>
<script type="text/javascript">
	function chgImg(ig) {
		ig.src = "${basePath}/ImgServlet?t=" + Math.random();
	}
</script>
</head>
<body>
	<form action="login" method="post">
		用户名： <input type="text" name="name"/> <br /> 密码： <input type="text" name="password"/> <br />
		验证码： <input type="text" name="vc" /> <img alt="验证码"
			src="${basePath}/ImgServlet" onclick="chgImg(this)" /><br /> <input
			type="submit" value="登录" /> <br />
	</form>
</body>
</html>
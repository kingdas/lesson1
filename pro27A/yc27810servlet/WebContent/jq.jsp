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
	function init() {
		alert("init");
	}
	function t() {
		alert("tt");
		document.getElementById("err").innerHTML = "...";
	}

	var a = function a() {
		alert("a..");
	};
	function b(a) {
		a();
	}
	//b(a);
	/* b(function() {
		alert("***");
	}); */

	/* $(document).ready(function() {
		alert("..");
	}); */
	$(function() {
		//alert("....");
		$("a").click(function() {
			alert("www");
		});
	});
</script>

</head>
<body>
	<!-- onload="init()" -->
	<a href="#">点点看</a>
	<br>
	<!-- onclick="t()" -->
	<span id="err"></span>
	<br>
	<a href="#">点看看</a>
	<br>
</body>
</html>
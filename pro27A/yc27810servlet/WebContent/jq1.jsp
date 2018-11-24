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
	/* $(function() {
		$("p").css("background-color", "orange");
		$("#p").css("background-color", "#ccc");
		$(".p").css("background-color", "#4f5e6d");
		alert($("div > p").html());
		$("div > p").html("zz");

	}); */
	var flg = true;
	function jq() {
		if (flg) {
			$(form1.elements).hide();
		} else {
			//$(form1.elements).show();
			$(form1.elements).fadeIn(3000);
		}
		$("#test").html(flg == true ? "显示" : "隐藏");
		flg = !flg;
	}

	function jq1() {
		$("img").each(function() {
			this.src = "res/img/2.bmp";
		});
	}
</script>

<!-- <style type="text/css">
* {
	background-color: orange;
}
</style> -->
</head>
<body>
	<p>x</p>
	<div>
		<p>xx</p>
	</div>
	<p id="p">xxx</p>
	<p class="p">yy</p>
	<p class="p">yyy</p>
	<hr />
	<form id="form1">
		<input type="text" name="textfield"> <input type="submit"
			name="Submit" value="提1交">
	</form>
	<a href="#" id="test" onClick="jq()">隐藏</a>
	<hr />
	<img src="res/img/1.bmp" />
	<img src="res/img/1.bmp" />
	<a href="#" id="t1" onClick="jq1()">jQuery</a>
</body>
</html>
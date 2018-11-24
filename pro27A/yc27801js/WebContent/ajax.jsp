<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function checkName(name) {
		//alert(name);
		/* if ("zs" == name) {
			document.getElementById("err").innerHTML = "用户名已存在";
		} else {
			document.getElementById("err").innerHTML = "*";
		} */

		var xhr = new XMLHttpRequest();//异步请求对象
		//xhr.readyState 0初始化,1open,2send,3请求正在服务中处理,4请求完成，服务器响应回数据
		xhr.onreadystatechange = function() {
			//alert(xhr.readyState);
			if (xhr.readyState == 4) {
				if (xhr.responseText == 1) {
					document.getElementById("err").innerHTML = "用户名已存在";
				} else {
					document.getElementById("err").innerHTML = "*";
				}
			}
		};//当readyState值改变时，onreadystatechange指定的方法会被调用

		xhr.open("get", "http://localhost:8088/yc27801js/MyServlet?t="
				+ Math.random() + "&name=" + name, "true");//请求方式，请求地址，同步|异步
		xhr.send(null);//发送请求

	}
</script>
</head>
<body>
	<font color="red"><span id="err">*</span></font>
	<br />
	<input type="text" name="username" onblur="checkName(this.value)" />
</body>
</html>
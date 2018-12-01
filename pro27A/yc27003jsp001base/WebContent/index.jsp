<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp=html+java</h1>
	<hr />
	<%
		//System.out.print(Math.random());
		String c;
		for (int i = 1; i <= 10; i++) {
			//System.out.print(Math.random());
			c = "color=#" + i + i + "0000";
	%>
	<hr size="<%=i%>" <%=c%> />
	<%
		}
	%>
</body>
</html>

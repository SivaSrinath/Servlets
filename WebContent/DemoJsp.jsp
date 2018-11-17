<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!public int add(int a, int b) {
		return a + b;
	}%>

	<%
		int num1 = 10;
		int num2 = 20;
	%>

	<h1>Final Sum</h1>
	</br>
	<%=add(num1, num2)%>


</body>
</html>
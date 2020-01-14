<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<body>
	<h3>入门成功</h3>
	${user.username }
	${user.password }
	${user.age }
	<% System.out.println("interceptor execute");  %>
</body>
</html>

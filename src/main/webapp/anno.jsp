<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
	<title>Title</title>
</head>
<body>
	<!-- <a href="anno/testRequestParam?name=haha">RequestParam</a> -->
	
	<form action="anno/testRequestBody" method="post">
		姓名：<input type="text" name="username"/><br/>
		年龄：<input type="text" name="age"/><br/>
		<input type="submit" value="submit"/>
	</form>
	
	<a href="anno/testPathVariable/10">PathVaribale</a>
	<br/>
	<a href="anno/testRequestHeader">RequestHeader</a>
	<br/>
	<a href="anno/testCookieValue">CookieValue</a>
	<br/>
	
	<form action="anno/testModelAttribute" method="post">
		姓名：<input type="text" name="uname"/><br/>
		年龄：<input type="text" name="age"/><br/>
		<input type="submit" value="submit"/>
	</form>
	
	<a href="anno/testSessionAttributes">SessionAttributes</a>
	<br/>
	<a href="anno/getSessionAttributes">getSessionAttributes</a>
	<br/>
	<a href="anno/delSessionAttributes">delSessionAttributes</a>
</body>
</html>
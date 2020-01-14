<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
	<h3>文件上传</h3>
	<%--
		<a href="hello">入门程序</a>
	<a href="user/testRequestMapping?username=tom">RequestMapping</a>
	--%>
	
	<%-- 
	<form action="/user/fileupload1" method="post" enctype="multipart/form-data">
		select file:<input type="file" name="upload" /><br/>
		<input type="submit" value="upload" />
	</form>
	--%>
	
	<form action="/user/fileupload2" method="post" enctype="multipart/form-data">
		select file:<input type="file" name="upload" /><br/>
		<input type="submit" value="upload" />
	</form>
	
	<a href="user/testException">testException</a>
	<br/>
	<a href="user/testInterceptor">testInterceptor</a>
</body>
</html>

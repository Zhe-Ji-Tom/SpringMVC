<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
	<script src="js/jquery.min.js"></script>
	<script>
		$(function(){
			$("#btn").click(function(){
				//alert("hello btn");
				$.ajax({
					url:"user/testAjax",
					contentType:"application/json;charset=UTF-8",
					data:'{"username":"tom", "password":"1", "age":20}',
					dataType:"json",
					type:"post",
					success:function(data){
						alert(data);
						alert(data.username);
						alert(data.password);
						alert(data.age);
					}
				});
			});
		});
	</script>
</head>
<body>
	<h3>入门程序</h3>
	<%--
		<a href="hello">入门程序</a>
	--%>
	<a href="user/testString">testString</a>
	<br/>
	<a href="user/testVoid">testVoid</a>
	<br/>
	<a href="user/testModelAndView">testModelAndView</a>
	<br/>
	<a href="user/testForwardOrRedirect">testForwardOrRedirect</a>
	<br/>
	<button id="btn">ajax</button>
</body>
</html>

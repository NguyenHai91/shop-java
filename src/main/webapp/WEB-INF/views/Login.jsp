<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<jsp:include page="Header.jsp" />
</head>
<body>
	<div id="login">
		<h2>login</h2>
		<form action="" method="POST">
			<div class="form-element"><input type="text" name="email" placeholder="email" /></div>
			<div class="form-element"><input type="password" name="password" placeholder="password" /></div>
			<div class="form-element"><input type="submit" value="Login" /></div>
		</form>
	</div>
	
</body>
</html>
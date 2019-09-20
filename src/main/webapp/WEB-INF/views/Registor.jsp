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
	<div id="registor">
		<h2>registor</h2>
		<form action="" method="post">
			<div class="form-element"><input type="text" name="name" placeholder="full name" /></div>
			<div class="form-element"><input type="text" name="address" placeholder="address" /></div>
			<div class="form-element"><input type="text" name="email" placeholder="email" /></div>
			<div class="form-element"><input type="password" name="password" placeholder="password" /></div>
			<div class="form-element"><input type="password" name="repassword" placeholder="re-password" /></div>
			<div class="form-element"><input type="submit" value="Submit" /></div>
		</form>
	</div>
	
</body>
</html>
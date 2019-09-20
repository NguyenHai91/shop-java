<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Shopping</title>
	<jsp:include page="Header.jsp"></jsp:include>
</head>
<body>
	<header id="header-page" class="header-page">
		<jsp:include page="Navbar.jsp"></jsp:include>
		<div class="content-center container">
			<p>slogan</p>
			<button type="button">More</button>
		</div>
	</header>
	
	<main id="main-page" class="main-page">
		<div class="container">
			<div class="row">
				<div class="col-4">
					<div class="cover-image">
						<a href="#"><img class="image-product" src="" alt="image"></a>
					</div>
					<div class="info-product">
						<p class="name-product"><a href="">name product</a></p>
						<p class="brand-product">brand</p>
						<p class="price-product">$200,0</p>
					</div>
				</div>
			</div>
		</div>
	</main>
	<footer id="footer-page" class="footer-page">
		
	</footer>

	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
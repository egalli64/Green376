<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="index.css">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">
<title>Admin</title>
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-success">
		<a class="navbar-brand" href="." id="Title">GreenAir</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		

		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				
				<li class="nav-item active"><a class="nav-link"
					href="logged.jsp">Home<span class="sr-only">(current)</span></a></li>
				<li class="nav-item active"><a class="nav-link"
					href="presentation.html">Chi siamo</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="#contact-form">Contattaci</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="sessionKiller">Logout</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="viewUsers">Utenti</a></li>
			</ul>
			<ul class="nav justify-content-end">
			<li class="nav-item active text-white">admin</li>
			</ul>
		</div>
	</nav>

	<div class="jumbotron mt-5 text-dark">
		<div class="container">
			<h1 class="display-3 font-weight-bolder" id="Shadow">Bentornato, scopri l'aria che respiri</h1>
		</div>
	</div>
	<section class="container-fluid">


		<!-- Image Map Generated by http://www.image-map.net/ -->
		<img src="mappa(1).png" usemap="#image-map">
		<map name="image-map">
			<area coords="396,241,23" shape="circle"
				href="http://localhost:8080/green/data?station=1">
			<area coords="294,568,23" shape="circle"
				href="http://localhost:8080/green/data?station=2">
			<area coords="847,641,24" shape="circle"
				href="http://localhost:8080/green/data?station=3">
			<area coords="523,461,23" shape="circle"
				href="http://localhost:8080/green/data?station=4">
			<area coords="655,334,23" shape="circle"
				href="http://localhost:8080/green/data?station=5">
		</map>
	</section>



	<footer class="footer bg-secondary text-white mb-0">

		<div class="container-fluid text-center pt-3">


			<h5 class="text-uppercase font-weight-bold">GreenTeam Project</h5>

			<p>Il GreenTeam project � una societ� senza fini di lucro che
				vuole condividere con i suoi utenti la qualit� dell'aria nelle
				diverse zone di Milano</p>


		</div>

		<div class=" text-center py-3">
			<p>&copy; 2020 Copyright: GreenTeam</p>

		</div>

	</footer>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')
	</script>
	<script src="../../assets/js/vendor/popper.min.js"></script>
	<script src="../../dist/js/bootstrap.min.js"></script>


</body>
</html>
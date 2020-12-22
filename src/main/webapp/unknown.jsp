<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="index.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Can't login</title>
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
			</ul>
			<ul class="nav justify-content-end">
				<li class="nav-item active text-white">${user.username}</li>
			</ul>
		</div>
	</nav>

	<div class="jumbotron mt-5 text-dark">
		<div class="container">
			<h1 class="display-3 font-weight-bolder" id="Shadow">Login for "${username}" rejected</h1>
		</div>
	</div>
      
    	<footer class="footer bg-secondary text-white mb-0">

		<div class="container-fluid text-center pt-3">


			<h5 class="text-uppercase font-weight-bold">GreenTeam Project</h5>

			<p>Il GreenTeam project è una società senza fini di lucro che
				vuole condividere con i suoi utenti la qualità dell'aria nelle
				diverse zone di 上海.</p>


		</div>

		<div class=" text-center py-3">
			<p>&copy; 2020 Copyright: GreenTeam</p>

		</div>

	</footer>  
     
</body>
</html>
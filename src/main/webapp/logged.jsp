<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Welcome</title>
</head>
<body>
<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-success">
		<a class="navbar-brand" href="." id="Title">GreenAir</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
		  <span class="navbar-toggler-icon"></span>
		</button>
  
		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
		  <ul class="navbar-nav mr-auto">
			<li class="nav-item active">
			  <a class="nav-link" href="login.html">Accedi<span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item active">
			  <a class="nav-link" href="presentation.html">Chi siamo</a>
			</li>
			<li class="nav-item active">
			  <a class="nav-link" href="#contact-form">Contattaci</a>
			</li>
		  </ul>
		</div>
	  </nav>
  <div class="container-fluid mt-5">
     <h1>Benvenuto utente:"${username}"</h1>
	<p>
 		Back <a href="index.html">Logout</a>
	</p>
  </div>
	<section class="container-fluid">
	
	<form action="data">
	<input type="radio" id="1" name="station" value="1" checked>
	<label for="1">Station 1</label>
	<input type="radio" id="2" name="station" value="2">
	<label for="2">Station 2</label>
	<input type="radio" id="3" name="station" value="3">
	<label for="3">Station 3</label>
	<input type="radio" id="4" name="station" value="4">
	<label for="4">Station 4</label>
	<input type="radio" id="5" name="station" value="5">
	<label for="5">Station 5</label>
	<button type="submit">cerca</button>
	</form>
	</section>
	
	
	
	<footer class="footer bg-secondary text-white mb-0">

		<div class="container-fluid text-center pt-3">


			<h5 class="text-uppercase font-weight-bold">GreenTeam Project</h5>

			<p>Il GreenTeam project è una società senza fini di lucro che
				vuole condividere con i suoi utenti la qualità dell'aria nelle
				diverse zone di Milano</p>


		</div>

		<div class=" text-center py-3">
			<p>&copy; 2020 Copyright: GreenTeam</p>

		</div>

	</footer>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="../../assets/js/vendor/popper.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
	

</body>
</html>
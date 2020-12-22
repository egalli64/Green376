<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="index.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Your air</title>
<style type="text/css"></style>
</head>
<body
	style="background-image: url('https://cdn.vox-cdn.com/thumbor/YE-2wEfqfJovM_wtLhFnOv2n-jU=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/15788040/20150428-cloud-computing.0.1489222360.jpg');">



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
					href="index.html">Home<span class="sr-only">(current)</span></a></li>
				<li class="nav-item active"><a class="nav-link"
					href="logged.jsp">Back<span class="sr-only">(current)</span></a></li>
				<li class="nav-item active"><a class="nav-link"
					href="presentation.html">Chi siamo</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="#contact-form">Contattaci</a></li>
			</ul>
		</div>
	</nav>

	<div class="jumbotron mt-5 text-dark">
		<div class="container">
			<h1 class="display-3 font-weight-bolder" id="Shadow">Scopri
				l'aria che respiri</h1>
		</div>
	</div>



	<div class="container-fluid" style="margin-bottom: 50px;">
		<div class="row">
			<div class="col"></div>
			<div class="col mb-5 mt-5">
				<button type="button" class="btn btn-success">Good</button>
				<button type="button" class="btn btn-warning">Warning</button>
				<button type="button" class="btn btn-danger">Danger</button>
			</div>
			<div class="col"></div>
		</div>

		<div class="row">
			<div class="col"></div>
			<div class="card col" style="width: 15rem;">
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/1/1f/Methane-CRC-MW-3D-balls.png"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h2 class="card-title">Metano</h2>
					<p class="card-text">${averageCH4}ppm</p>
					<a href="https://it.wikipedia.org/wiki/Metano"
						class="btn btn-primary ${aqCH4} " target="blank">CH<sub>4</sub></a>
				</div>
			</div>
			<div class="card col" style="width: 15rem;">
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Carbon-monoxide-3D-vdW.png/500px-Carbon-monoxide-3D-vdW.png"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h2 class="card-title">Monossido di carbonio</h2>
					<p class="card-text">${averageCO}ppm</p>
					<a href="https://it.wikipedia.org/wiki/Monossido_di_carbonio"
						class="btn btn-primary ${aqCO}" target="blank">CO</a>
				</div>
			</div>
			<div class="card col" style="width: 15rem;">
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/9/93/Sulfur-dioxide-3D-vdW.png"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h2 class="card-title">Anidride solforosa</h2>
					<p class="card-text">${averageSO2}ppm</p>
					<a href="https://it.wikipedia.org/wiki/Anidride_solforosa"
						class="btn btn-primary ${aqSO2}" target="blank">SO<sub>2</sub></a>
				</div>
			</div>
			<div class="col"></div>
		</div>


		<div class="row">
			<div class="col"></div>
			<div class="card col" style="width: 15rem;">
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/7/73/Nitric-oxide-3D-vdW.png"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h2 class="card-title">Monossido di azoto</h2>
					<p class="card-text">${averageNO}ppm</p>
					<a href="https://it.wikipedia.org/wiki/Monossido_di_azoto"
						class="btn btn-primary ${aqNO}" target="blank">NO</a>
				</div>
			</div>
			<div class="card col" style="width: 15rem;">
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/1/1a/Nitrogen-dioxide-3D-vdW.png"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h2 class="card-title">Diossido di azoto</h2>
					<p class="card-text">${averageNO2}ppm</p>
					<a href="https://it.wikipedia.org/wiki/Diossido_di_azoto"
						class="btn btn-primary ${aqNO2}" target="blank">NO<sub>2</sub></a>
				</div>
			</div>
			<div class="card col" style="width: 15rem;">
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/1/1e/Ozone-CRC-MW-3D-vdW.png"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h2 class="card-title">Ozono</h2>
					<p class="card-text">${averageO3}ppm</p>
					<a href="https://it.wikipedia.org/wiki/Ozono"
						class="btn btn-primary ${aqO3}" target="blank">O<sub>3</sub></a>
				</div>
			</div>
			<div class="col"></div>
		</div>



	</div>


	<footer class="footer bg-secondary text-white">

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





</body>
</html>
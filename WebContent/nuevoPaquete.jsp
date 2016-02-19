<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="assets/css/main-two.css" />
<style>
      #map {
        width: 500px;
        height: 400px;
      }
    </style>
</head>
<body>
<form action="NuevoPaquete.do" method="post">
	<input type="text" name="txtNombre" placeholder="Nombre del paquete"/>
	<select name="txtTipoPaquete">
		<option value="">Tipo de paquete</option>
		<option value="1">Ropa</option>
		<option value="2">Comida</option>
		<option value="3">Electrónicos</option>
	</select>
	<br>
	<input type="text" name="txtPeso" placeholder="Peso"/>
	<input type="text" name="txtDestino" placeholder="Calle, ciudad"/>
	<br>
	<input type="submit" value="pedir"/>
</form>
<div id="map"></div>
    <script>
      function initMap() {
        var mapDiv = document.getElementById('map');
        var map = new google.maps.Map(mapDiv, {
          center: {lat: 44.540, lng: -78.546},
          zoom: 8
        });
      }
    </script>
    <script src="https://maps.googleapis.com/maps/api/js?callback=initMap"
        async defer></script>
<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main-two.js"></script>
</body>
</html>
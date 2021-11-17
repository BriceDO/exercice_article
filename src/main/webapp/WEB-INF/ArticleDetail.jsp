<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Article Detail</title>
</head>
<body>
	
	<h1>Voici le contenu de l'article dont l'id est ${article.getId()}</h1>
	
	<h3>Voici mon titre : ${article.getTitre()}</h3>
	<p>${article.getContenu()}</p>
	<p>Ecrit par : ${visiteur.getUsername()}</p>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page d'acceuil</title>
</head>
<body>
	<h1> Bienvenue </h1>
	<a href="<%= request.getContextPath() %>/userinfo">Vers les informations utilisateurs</a><br>
	<a href="<%= request.getContextPath() %>/articletitre">Vers la liste de tous les articles</a>
</body>
</html>
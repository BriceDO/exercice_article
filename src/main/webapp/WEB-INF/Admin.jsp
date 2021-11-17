<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<h1>Bienvenue sur la page admin</h1>
	
	<h1>Information utilisateur</h1>
	<p>Pseudo : ${admin.getUsername()}</p>
	<p>Adresse email : ${admin.getEmail()}</p>
	<p>Nom d'article : ${admin.getNbArticle()}</p>
	<p>Role : ${admin.getRole()}</p>
</body>
</html>
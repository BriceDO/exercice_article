<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserInfo</title>
</head>
<body>

<h1>Information utilisateur</h1>
<p>Pseudo : ${visiteur.getUsername()}</p>
<p>Adresse email : ${visiteur.getEmail()}</p>
<p>Nom d'article : ${visiteur.getNbArticle()}</p>
<p>Role : ${visiteur.getRole()}</p>

</body>
</html>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="model.Article"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Article</title>
</head>
<body>
	<h1>Voici la liste des articles</h1>
	<ul>
	
	<%--boucle sur les articles de l'utilisateur, qui va générer une ligne HTML pour chaque titre --%>
	
	<%
	User user = (User) request.getAttribute("utilisateur");

	for (Article article : user.getArticles()) {
	%>
		<li><a href="<%= request.getContextPath() %>/article?id=<%=article.getId()%>"><%=article.getTitre()%></a></li>
	<% } %>
	
	</ul>
	
</body>
</html>
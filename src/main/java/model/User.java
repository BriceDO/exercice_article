package model;

import java.util.List;

/**
 * Classe User de l'exercice exoArticle
 * @author brice
 *
 */

public class User {

	String username;
	int nbArticle;
	private String email;
	private boolean role;
	List<Article> articles;
	
	
	public User(String username, int nbArticle, String email, boolean role) {
		super();
		this.username = username;
		this.nbArticle = nbArticle;
		this.email = email;
		this.role = role;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getNbArticle() {
		// todo recupérer la taille de la liste d'article
		// articles.size()
		return nbArticle;
	}


	public void setNbArticle(int nbArticle) {
		this.nbArticle = nbArticle;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean getRole() {
		return role;
	}


	public void setRole(boolean role) {
		this.role = role;
	}


	public List<Article> getArticles() {
		return articles;
	}


	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", nbArticle=" + nbArticle + ", email=" + email + ", role=" + role
				+ ", articles=" + articles + "]";
	}
	
}

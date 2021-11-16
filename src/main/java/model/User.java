package model;

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


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
}

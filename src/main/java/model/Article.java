package model;

import java.util.List;

/**
 * Il s'agit de la classe article, article écrit par un utilisateur
 * @author brice
 *
 */

public class Article {
	int id;
	String titre;
	String contenu;
	User user;
	
	public Article(int id, String titre, String contenu, User user) {
		super();
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.user = user;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}

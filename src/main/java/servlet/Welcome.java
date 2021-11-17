package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.catalina.authenticator.Constants;
import org.apache.tomcat.jakartaee.bcel.Const;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import model.Article;
import model.User;

/**
 * Servlet implementation class Welcome
 */

@WebServlet("/acceuil")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Welcome() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); // objet session
		
		User contributeur = new User("Toto", 3, "toto@toto.fr", false);
		
		Article article1 = new Article(1, "Mon titre, c'est le premier !", "Mon contenu, c'est le premier aussi !", contributeur);
		Article article2 = new Article(2, "Mon méga titre", "Mon méga contenu", contributeur);
		Article article3 = new Article(3, "Mon troisième titre", "Le contenu du troisième article !", contributeur);
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(article1);
		articles.add(article2);
		articles.add(article3);
		
		User admin = new User("Titi", 0, "titi@titi.fr", true);
		
		contributeur.setArticles(articles);

		session.setAttribute("USER", contributeur);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

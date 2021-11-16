package servlet;

import java.io.IOException;
import java.util.List;
import java.io.IOException;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import model.Article;
import model.User;


/**
 * Servlet implementation class ArticleInfo
 */
@WebServlet("/article")
public class ArticleInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ArticleInfo() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); // objet session
		int id = Integer.parseInt(request.getParameter("id"));
		User contributeur = (User) session.getAttribute("USER");
		List<Article> articles = contributeur.getArticles();
		
		contributeur.getArticles();
		
		// Parcourir la liste des articles du contributeur et trouver celui dont l'ID est égale à ID de la barre de recherche et le retourner.
		
		
		ServletOutputStream out = response.getOutputStream();
		out.println(id);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

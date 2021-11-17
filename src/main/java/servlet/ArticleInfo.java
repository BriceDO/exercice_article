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
		
		User contributeur = (User) session.getAttribute("USER");
		
		// Variable articles contenant tous les articles du contributeur
		List<Article> articles = contributeur.getArticles();
		
		// Variable de l'id dans la barre de recherche
		int id = Integer.parseInt(request.getParameter("id"));
		
		// Parcourir la liste des articles du contributeur
		for (int i = 0; i < articles.size(); i++) {
			// trouver celui dont l'ID est égale à ID de la barre de recherche
			if(id == articles.get(i).getId()) {
				// et le retourner
				request.setAttribute("article", articles.get(i));
			}
			
		}
		
		request.setAttribute("visiteur", contributeur);
		request.getRequestDispatcher("/WEB-INF/ArticleDetail.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

package servlet;

import java.io.IOException;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import model.Article;
import model.User;

/**
 * Servlet implementation class ArticleTitre
 */

@WebServlet(urlPatterns = "/articletitre")
public class ArticleTitre extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ArticleTitre() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// objet session
		HttpSession session = request.getSession(); 
		// recupère l'objet user sur la page UserInfo
		User contributeur = (User) session.getAttribute("USER");
		
		request.setAttribute("utilisateur", contributeur);
	
		
		request.getRequestDispatcher("/WEB-INF/Article.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

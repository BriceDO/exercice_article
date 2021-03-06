package servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import model.User;

/**
 * Servlet implementation class UserIinfo
 */

@WebServlet(urlPatterns = "/userinfo")
public class UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserInfo() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// objet session
		HttpSession session = request.getSession(); 
		
		// recup?re l'objet user sur la page UserInfo
		User visiteur = (User) session.getAttribute("USER");

		// Si pas d'utilisateur, retour ? la page d'acceuil
		if (visiteur == null) {
			response.sendRedirect(this.getServletContext().getContextPath() + "/acceuil");
			return;
		}
		
		request.setAttribute("visiteur", visiteur);
		request.getRequestDispatcher("/WEB-INF/UserInfo.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

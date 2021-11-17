package servlet;

import java.io.IOException;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import model.User;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Admin() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// objet session
		HttpSession session = request.getSession(); 
		
		// recupère l'objet admin sur la page admin
		User visiteur = (User) session.getAttribute("USER");
		
		request.setAttribute("visiteur", visiteur);
		request.getRequestDispatcher("/WEB-INF/UserInfo.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

package servlet;

import java.io.IOException;

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
import model.User;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Welcome() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); // objet session
		
		User contributeur = new User("Toto", 3, "toto@toto.fr", false);
		User admin = new User("Titi", 0, "titi@titi.fr", true);
		
		session.setAttribute("USER", contributeur);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

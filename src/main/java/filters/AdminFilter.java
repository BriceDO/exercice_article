package filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.*;
import model.User;

/**
 * Servlet Filter implementation class Admin
 */

//@WebFilter (urlPatterns = {"/*"})
//public class AdminFilter implements Filter {
//
//    public AdminFilter() {}
//
//	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
//
//		HttpServletRequest request = (HttpServletRequest) req;
//		
//		// objet session
//		HttpSession session = request.getSession();
//		// Je récupère mes user pour vérifier si il est admin ou pas
//		User contributeur = (User) session.getAttribute("USER");
//		
//		// Je vérifie s'il y a un utilisateur
//		if (contributeur == null) {
//			System.out.println("pas d'utilisateur");
//			
//		} else { // donc s'il y a un utilisateur
//			
//			// Je vérifie son role
//			if (contributeur.getRole() == false) {
//				// Si faux c'est un utilisateur, on l'amène vers login
//				req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
//			} else {
//				// Si True donc admin, On le redirige vers une page admin
//				req.getRequestDispatcher("/WEB-INF/Admin.jsp").forward(req, resp);
//			}
//			
//		}
//		
//		
//		
//		chain.doFilter(req, resp);
//	}
//	
//	public void init(FilterConfig fConfig) throws ServletException {
//		
//	}
//
//}

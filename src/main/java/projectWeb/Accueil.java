package projectWeb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/accueil")
public class Accueil extends HttpServlet{
	
	public Accueil() {};
	
	@Override 
	protected void doGet(
				HttpServletRequest request,
				HttpServletResponse response) 
				throws ServletException, IOException {
		
		HttpSession accueil = request.getSession();

		User user = new User("Dupont",2,"a.dupont@yahoo.com","user"); 
		accueil.setAttribute("USER",user);
		
		List<Article> list = new ArrayList<Article>(); 
		Article article1 = new Article("Les ellipses",1);
		list.add(article1);
		accueil.setAttribute("TITLE1",article1);
		Article article2 = new Article("Les hyperboles",2);
		list.add(article2);
		accueil.setAttribute("TITLE2",article2);
		

		ServletOutputStream out = response.getOutputStream();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Accueil</h1>");
		out.println("<h3>Vous êtes bien connecté sur notre site</h3>");
		out.println("<a href='user-quality'>Accéder aux qualités utilisateur <br></a>");
		out.println("<a href='paper-list'>Accéder à la liste des articles</a>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
		
	}

}

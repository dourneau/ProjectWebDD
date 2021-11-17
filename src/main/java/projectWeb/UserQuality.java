package projectWeb;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/user-quality"})
public class UserQuality extends HttpServlet {
	
	public UserQuality(){
		
	}
	
	
	@Override
	protected void doGet (HttpServletRequest request,
						  HttpServletResponse response) 
						  throws ServletException, IOException {
		
		HttpSession accueil = request.getSession();
		User user = (User) accueil.getAttribute("USER");
		
		if(user == null) {
			response.sendRedirect(this.getServletContext().getContextPath() +"/accueil");
			return;
		}
		
		
		ServletOutputStream out = response.getOutputStream();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Qualités utilisateur</h1>");
		out.println("<p>Nom de l'utilisateur : "+ user.getUsername() + "</p>");
		out.println("<p>Nombre d'articles : "+ user.getNombreArticle() + "</p>");
		out.println("<p>Adresse email : "+ user.getEmail() + "</p>");
		out.println("<p>Role : "+ user.getRole() + "</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

	@Override
	protected void doPost (HttpServletRequest request,
						  HttpServletResponse Response) 
						  throws ServletException, IOException {
		
	}

}

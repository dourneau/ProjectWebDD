package projectWeb;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/paper-list"})
public class ArticleList extends HttpServlet {
	
	public ArticleList(){
		
	}
	
	
	@Override
	protected void doGet (HttpServletRequest request,
						  HttpServletResponse response) 
						  throws ServletException, IOException {
		
		HttpSession accueil = request.getSession();
		User user = (User) accueil.getAttribute("USER");
		
		Article article = (Article) accueil.getAttribute("TITLE");
		
		if(user == null) {
			response.sendRedirect(this.getServletContext().getContextPath() +"/accueil");
			return;
		}
		
		
		ServletOutputStream out = response.getOutputStream();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Liste des articles</h1>");
		out.println("<p>Titre : "+ article.getTitle() +", ID : " + article.getId() + "</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

	@Override
	protected void doPost (HttpServletRequest request,
						  HttpServletResponse Response) 
						  throws ServletException, IOException {
		
	}

}

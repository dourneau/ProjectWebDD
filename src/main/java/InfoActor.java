import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InfoActor {
	
	public InfoActor(){
		
	}
	
	@Override
	protected void doGet (HttpServletRequest request,
			  HttpServletResponse response) 
			  throws ServletException, IOException {

	ServletOutputStream out = response.getOutputStream();

	out.println("<html>");
	out.println("<head>");
	out.println("</head>");
	out.println("<body>");
	
	

	}
	
	

}

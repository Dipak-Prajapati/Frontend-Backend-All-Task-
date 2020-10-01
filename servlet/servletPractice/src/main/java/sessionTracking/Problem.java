package sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Problem extends HttpServlet {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException , ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		out.println("<html><body><h1>Hello , "+ name + " Welcome to Servlet1");
		out.println("<a href = 'Problem2' >GoTo Servlet2 </a>");
		out.println("</h1></body></html>");
		
		
	}

}

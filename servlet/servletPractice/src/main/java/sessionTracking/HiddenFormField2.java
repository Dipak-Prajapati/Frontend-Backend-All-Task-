package sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenFormField2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException , ServletException
	{
		response.setContentType("text/html");
		String name = request.getParameter("uname");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h1> Hello , "+ name + " Welcome to Servlet2 </h1></body></html>");
	}



}



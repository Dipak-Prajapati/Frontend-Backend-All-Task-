package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<h1>Welcome To Servlet</h1>");
	}
}

package sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenFormField1 extends HttpServlet {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");

		out.println("<h1>Hello , " + name + " Welcome to Servlet1</h1>");

		out.print("<form action='hidden1'>");
		out.print("<input type='hidden' name='uname' value='" + name + "'>");
		out.print("<input type='submit' value='Go to Servlet2'>");
		out.print("</form>");

	}

}

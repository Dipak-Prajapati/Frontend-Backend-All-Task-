package servletPracticePackage;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/welcome")
public class SRequest extends HttpServlet {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String name = req.getParameter("name");// will return value
		pw.println("Welcome " + name);

		pw.close();
	}
}
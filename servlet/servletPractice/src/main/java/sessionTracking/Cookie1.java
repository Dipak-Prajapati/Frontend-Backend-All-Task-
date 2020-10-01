package sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie1")
public class Cookie1 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException , ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		Cookie ck = new Cookie("user_name",name);
		response.addCookie(ck);
		
		out.println("<html><body><h1>Hello , "+ name + " Welcome to Servlet1");
		out.println("<a href = 'Cookie2' >GoTo Servlet2 </a>");
		out.println("</h1></body></html>");
	}

}

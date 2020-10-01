package sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HSession2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		HttpSession session = req.getSession();
		String name = (String)session.getAttribute("uname");
		
		out.println("<h1>Hello , "+name+"Welcome To Servlet2</h1></br>");
	}

}

package expressionLanguage;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class El_Servlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException
	{
		String name = req.getParameter("uname");
		String surname = req.getParameter("surname");
		String company = req.getParameter("company");
		
		System.out.println(name + surname + company);
		
		req.setAttribute("uname", name);
		
		HttpSession session = req.getSession();
		session.setAttribute("surname", surname);
		
		getServletContext().setAttribute("age", 20);
		
		Cookie ck = new Cookie("server","Tomcat");
		res.addCookie(ck);

		RequestDispatcher rd = req.getRequestDispatcher("/el_DisplayData.jsp");
		rd.forward(req, res);
		
	}

}

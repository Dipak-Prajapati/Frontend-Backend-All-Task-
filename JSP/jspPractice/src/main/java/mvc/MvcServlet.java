package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MvcServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException
	{
		res.setContentType("text/html");
		
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");
		req.setAttribute("email", email);
		MvcPojo pojo = new MvcPojo();
		pojo.setEmail(email);
		pojo.setPassword(password);
		
		req.setAttribute("bean", pojo);
		
		boolean status = pojo.validate();
		
		if(status)
		{
			RequestDispatcher rd = req.getRequestDispatcher("mvcLoginSuccess.jsp");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("mvcLoginError.jsp");
			rd.forward(req, res);
		}
	}
}

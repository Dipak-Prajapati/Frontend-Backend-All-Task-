package servletPracticePackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SConfig extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init()
	{
		System.out.println("SConfig Load-on-Startup-4 is loaded");
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		ServletConfig config = getServletConfig();

		String n = config.getInitParameter("name");
		out.println("Config Parameter Value :" + n + "<br>");

		out.println("Config Servlet Name :" + config.getServletName() + "<br>");

		Enumeration<String> e = config.getInitParameterNames();

		String str = "";
		while (e.hasMoreElements()) {
			str = e.nextElement();
			out.print("<br>Name:<b> " + str + "</b>");
			out.print(" value:<b> " + config.getInitParameter(str)+"</b>");
		}
		
		ServletContext context = getServletContext();
		String n1 = context.getInitParameter("Global");
		out.println("<br>Context Parameter Value :<b>" + n1 + "</b><br>");

	}
}

package sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie2")
public class Cookie2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doPost(request , response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();

		Cookie[] cookie = request.getCookies();

		boolean flag = false;
		String name = "";

		for (Cookie ck : cookie) {
			if (ck.getName().equals("user_name")) {
				flag = true;
				name = ck.getValue();
			}
		}
		if (flag) {
			out.println("<html><body><h1> Hello , " + name + " Welcome to Servlet2 </h1></body></html>");
		}
	}

}

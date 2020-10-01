package login_logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		request.getRequestDispatcher("link.jsp").include(request, response);

		Cookie cookie[] = request.getCookies();

		for (Cookie ck : cookie) {
			if (ck != null) {
				String name = ck.getName();
				if (!name.equals("") || name != null) {
					name = ck.getValue();
					out.print("<b>Welcome to Profile</b>");
					out.print("<br>Welcome, " + name);
				}
			} else {
				out.print("Please login first");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
		}
		out.close();
	}
}
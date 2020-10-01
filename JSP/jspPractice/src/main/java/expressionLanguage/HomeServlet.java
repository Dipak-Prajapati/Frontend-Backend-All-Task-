package expressionLanguage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Person person = new Employee();
		person.setName("Dipak");
		
		request.setAttribute("person", person);
		
		Employee emp = new Employee();
		Address add = new Address();
		
		add.setAddress("Ahmedabad");
		emp.setAddress(add);
		emp.setId(1);
		emp.setName("Dips");
		
		HttpSession session = request.getSession();
		session.setAttribute("employee", emp);
		
		Cookie ck = new Cookie("UserCookie","TomcatUser");
		response.addCookie(ck);
		
		getServletContext().setAttribute("UserCookie", "TomcatUser");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/el_Data.jsp");
		rd.forward(request, response);
		
		
	}
}
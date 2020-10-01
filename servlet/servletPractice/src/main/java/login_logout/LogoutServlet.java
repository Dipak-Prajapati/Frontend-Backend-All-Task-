package login_logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                        throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
          
        request.getRequestDispatcher("link.jsp").include(request, response);  
          
        Cookie ck=new Cookie("name","");  
        ck.setMaxAge(0);  
        response.addCookie(ck);  
          
        out.print("you are successfully logged out!");  
    }  
}  
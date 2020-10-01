package servletPracticePackage;

import java.io.IOException;  
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  

public class MySeracher extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init()
	{
		System.out.println("Searcher Load-on-Startup-4 is loaded");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
        String name=request.getParameter("name");  
        response.sendRedirect("https://www.google.co.in/#q="+name);  
    }  
}  
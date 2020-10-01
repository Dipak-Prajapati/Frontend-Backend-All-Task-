package servletPracticePackage;

import java.io.*;  
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
  
//@WebServlet("/StaticLogin")
public class StaticLogin extends HttpServlet {  
  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init()
	{
		System.out.println("Stating Login Load-on-Startup-0 is loaded");
	}

public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    String p=request.getParameter("userPass");  
    if(p.equals("password")){   
        RequestDispatcher rd=request.getRequestDispatcher("go");  
        rd.forward(request, response);  
    }  
    else{  
        out.print("Sorry UserName or Password Error!!!!!!");  
        RequestDispatcher rd=request.getRequestDispatcher("/staticLogin.jsp");  
        rd.include(request, response);  
                      
        }  
    }  
  
}  

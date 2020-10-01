package com.hb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.service.HBPracticeService;
import com.hb.service.HBPracticeServiceImpl;

@WebServlet("/OO")
public class OneToOne extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException , ServletException
	{
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		
		HBPracticeService hbService = new HBPracticeServiceImpl();
		hbService.ooStoredData(name,address);
		response.sendRedirect("OneToOne.jsp");
	}
}

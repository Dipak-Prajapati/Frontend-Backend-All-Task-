package com.hb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.service.HBPracticeService;
import com.hb.service.HBPracticeServiceImpl;

@WebServlet("/Testing")
public class Testing extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException , ServletException
	{
		String name = request.getParameter("fname");
		
		HBPracticeService hbService = new HBPracticeServiceImpl();
		
		hbService.storedData(name);
	}

}

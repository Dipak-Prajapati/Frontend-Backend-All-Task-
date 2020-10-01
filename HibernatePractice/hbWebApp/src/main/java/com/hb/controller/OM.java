package com.hb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.service.HBPracticeService;
import com.hb.service.HBPracticeServiceImpl;

@WebServlet("/OM")
public class OM extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException , ServletException
	{
		String question = request.getParameter("question");
		String answer[] = request.getParameterValues("answer");
		
		System.out.println("Question : " + question + "Answer : " + answer);
		HBPracticeService hbService  = new HBPracticeServiceImpl();
		hbService.oneToMany(question,answer);
		
		response.sendRedirect("OneToMany.jsp");
	}
}

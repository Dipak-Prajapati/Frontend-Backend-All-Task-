package com.hb.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hb.model.Answer;
import com.hb.model.Question;
import com.hb.service.HBPracticeService;
import com.hb.service.HBPracticeServiceImpl;

@WebServlet("/Display")
public class Display extends HttpServlet{

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException , ServletException
	{
		HBPracticeService hbService = new HBPracticeServiceImpl();
		/*
		 * OOEmp emp = new OOEmp(); OOAddress add = new OOAddress();
		 * 
		 * List<List<Object>> data = new ArrayList<List<Object>>(); data =
		 * hbService.displayData(emp,add);
		 */
		
		Question q = new Question();
		Answer ans = new Answer();
		List<List<Object>> data = new ArrayList<List<Object>>();
		data = hbService.displayDataOM(q,ans);
		
		HttpSession session = request.getSession();
		session.setAttribute("one", data);
		response.sendRedirect("displalyData.jsp");
	}
	
}

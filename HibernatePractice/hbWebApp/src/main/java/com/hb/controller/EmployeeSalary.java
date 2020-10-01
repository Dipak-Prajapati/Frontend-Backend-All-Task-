package com.hb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.service.HBPracticeService;
import com.hb.service.HBPracticeServiceImpl;

@WebServlet("/EmployeeSalary")
public class EmployeeSalary extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException , ServletException
	{
		
		String name = request.getParameter("name");
		String salary = request.getParameter("salary");
		String bonus = request.getParameter("bonus");
		String pay_per_hour = request.getParameter("pph");
		String contract_period = request.getParameter("cp");
		
		System.out.println("Name :" + name + "Salary :" + salary + "Bonus :" + bonus + "pay_per_hour : " + pay_per_hour + "contract_period : " + contract_period);
		
		HBPracticeService hbService = new HBPracticeServiceImpl();
		if(salary == "" && bonus == "" && pay_per_hour == "" && contract_period == "")
		//if(salary == null && bonus == null && pay_per_hour == null && contract_period == null)
		{
			//Employee
			System.out.println("Employee :)");
			hbService.employee(name);
			response.sendRedirect("TPH.jsp");
		}
		else if(pay_per_hour == "" && contract_period == "")
		//else if(pay_per_hour == null && contract_period == null)
		{
			//Regular Employee
			System.out.println("Regular Employee :)");
			hbService.regularEmployee(name,salary,bonus);
			response.sendRedirect("TPH.jsp");
		}
		else if(salary == "" && bonus == "")
		//else if(salary == null && bonus == null)
		{
			//Contract Employee
			System.out.println("Contract Employee :)");
			hbService.contractEmployee(name,pay_per_hour,contract_period);
			response.sendRedirect("TPH.jsp");
		}
		else
		{
			
		}
		
	}

}

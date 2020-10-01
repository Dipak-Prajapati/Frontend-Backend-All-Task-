package com.dips.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("demo.beans.xml");
		
		EmployeeBean emp = (EmployeeBean)context.getBean("employee");
		
		System.out.println(emp.getFullName());
		
		System.out.println(emp.getDepartmentBean().getName());
		
	}
	
}

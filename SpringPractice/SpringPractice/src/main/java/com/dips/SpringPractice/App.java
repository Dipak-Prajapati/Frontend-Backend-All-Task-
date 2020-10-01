package com.dips.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		/*
		 * Demo d = new Demo(); d.setId(777); d.setName("Dipak"); d.msg();
		 */
		// ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("demo.beans.xml");

		/*
		 * Demo demo = context.getBean("demo", Demo.class);
		 * 
		 * System.out.println("------------Using Spring Bean-------------");
		 * demo.setId(777); demo.setName("Dipak"); demo.msg();
		 * demo.setMsg("Testing Scope"); demo.getMsg(); System.out.println(demo);
		 * 
		 * Demo demo2 = context.getBean("demo", Demo.class);
		 * 
		 * System.out.println("------------Using Spring Bean2-------------");
		 */		/*
		 * demo2.setId(7778); demo2.setName("Dipakl");
		 */

		/*
		 * demo2.msg(); demo2.getMsg();
		 * 
		 * System.out.println(demo);
		 * 
		 * context.close();
		 */
		System.out.println("------------Using Spring Bean-------------");
		Demo demo = context.getBean("demo", Demo.class);
		demo.msg();
		System.out.println(context.getMessage("gretting",null,null));
		((ConfigurableApplicationContext)context).close();
		//context.registerShutdownHook();
	}
}

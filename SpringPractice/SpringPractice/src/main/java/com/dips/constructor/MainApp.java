package com.dips.constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("demo.beans.xml");
	
		System.out.println("------ExamplelBean------");
		
		ExampleBean bean = context.getBean("constructor",ExampleBean.class);
		
		
		System.out.println("------TextEditor and SpellChecker------");
		
		TextEditor te = context.getBean("textEditor" , TextEditor.class);
		te.spellCheck();
		context.close();
	}
	
}

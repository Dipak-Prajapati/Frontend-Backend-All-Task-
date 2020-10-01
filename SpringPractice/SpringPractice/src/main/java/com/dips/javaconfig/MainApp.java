package com.dips.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld hw = context.getBean(HelloWorld.class);
		hw.setMessage("Spring Java Configuration");
		hw.getMessage();
	}
}

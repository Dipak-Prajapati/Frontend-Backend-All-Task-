package com.dips.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotation.beans.xml");

		Student student = context.getBean("student", Student.class);

		System.out.println(student.getName());
		System.out.println(student.getAge());

		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();

		Profile profile = context.getBean("profile", Profile.class);
		profile.printAge();
		profile.printName();

		context.registerShutdownHook();

	}

}

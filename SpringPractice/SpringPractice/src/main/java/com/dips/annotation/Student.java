package com.dips.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import javax.annotation.*;

public class Student {

	private Integer age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	//@Autowired with (required = false) option
	//@Autowired(required = false)
	@Required
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	//@Autowired
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * @PostConstruct public void init() { System.out.println("Init method"); }
	 * 
	 * @PreDestroy public void destroy() { System.out.println("Destroy Method"); }
	 */
	
	
	
}

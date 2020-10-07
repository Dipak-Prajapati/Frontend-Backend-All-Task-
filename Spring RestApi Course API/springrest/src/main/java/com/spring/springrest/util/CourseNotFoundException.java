package com.spring.springrest.util;

public class CourseNotFoundException extends RuntimeException  {

	public CourseNotFoundException(String id) {
		super("Could Not Find Course " + id);
		// TODO Auto-generated constructor stub
	}	
}

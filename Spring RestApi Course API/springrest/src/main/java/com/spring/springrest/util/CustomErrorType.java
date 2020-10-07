package com.spring.springrest.util;

public class CustomErrorType {

	private String errorMessage;
	
	public CustomErrorType(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage()
	{
		return errorMessage;
	}
}

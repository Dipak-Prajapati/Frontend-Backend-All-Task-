package com.dips.dto;

import javax.validation.constraints.NotEmpty;

public class EmployeeDto {
	
	
	private long id;
	
	@NotEmpty(message = "{Name.Not.Empty}")
	private String name;
	
	@NotEmpty(message = "{Email.Not.Empty}")
	private String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}

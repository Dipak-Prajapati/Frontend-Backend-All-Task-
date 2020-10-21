package com.spring.springrest.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CourseDto {

	int id;

	@NotEmpty(message = "{title.Not.Empty}")	
	//@Size(min = 3, max = 50)
	String title;
	
	@NotEmpty(message = "{description.Not.Empty}")
	//@Pattern(regexp = "^[a-zA-Z]*")
	//@Size(min = 5, max = 50)
	@Column(nullable = false,length = 50)	
	String description;
	
	@NotEmpty(message = "{empty.Not.Empty}")	
	@Email
	@Column(nullable = false,length = 65)
	String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
}

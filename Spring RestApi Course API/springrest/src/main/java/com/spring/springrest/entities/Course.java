package com.spring.springrest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	int id;

	//@NotEmpty
	//@Pattern(regexp = "^[a-zA-Z]*")
	//@Size(min = 3, max = 15,message = "{course.title.empty}")
	//@Column(nullable = false,length = 50)	
	String title;
	
	//@NotEmpty
	//@Pattern(regexp = "^[a-zA-Z]*")
	//@Size(min = 5, max = 50,message = "{course.description.empty}")
	//@Column(nullable = false,length = 50)	
	String description;
	
	//@NotEmpty	
	//@Email(message = "{course.email.empty}")
	//@Column(nullable = false,length = 65)
	String email;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Course(int id, String title, String description, String email) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.email = email;
	}


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

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", email=" + email + "]";
	}
	
}
	
	
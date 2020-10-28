package com.example.springsocial.payload;

import javax.validation.constraints.NotEmpty;

public class UserDto {

	private Long id;
	
	@NotEmpty
	private String name;

	//@Email
	@NotEmpty
	private String email;

	@NotEmpty
	private String password;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

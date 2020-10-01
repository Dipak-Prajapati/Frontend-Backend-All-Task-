package com.dips.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	@Bean
	//@Primary
	public User getAdminUser()
	{
		return new AdminUser();
	}
	
	@Bean
	@Primary
	public User getGuestUser()
	{
		return new GuestUser();
	}
}

package com.dips.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public HelloWorld helloWorld()
	{
		return new HelloWorld();
	}
}

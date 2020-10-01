package com.dips.stack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {

	@Bean
	public Operation operation()
	{
		Operation operation = new Operation();
		operation.setAddremove(addRemove());
		return operation;
	}
	
	@Bean
	public AddRemove addRemove()
	{
		return new AddRemove();
	}
}

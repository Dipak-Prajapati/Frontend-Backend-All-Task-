package com.dips.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.dips")
public class AppConfig extends WebMvcConfigurerAdapter{

	/*
	 * @Override public void configureViewResolvers(ViewResolverRegistry registry) {
	 * InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	 * resolver.setPrefix("/WEB-INF/views/"); resolver.setSuffix(".jsp");
	 * resolver.setViewClass(JstlView.class); registry.viewResolver(resolver); }
	 */

	@Bean
	public ViewResolver viewResolver() {

		/*
		 * InternalResourceViewResolver viewResolver = new
		 * InternalResourceViewResolver(); viewResolver.setViewClass(JstlView.class);
		 * viewResolver.setPrefix("/WEB-INF/views/"); viewResolver.setSuffix(".jsp");
		 * return viewResolver;
		 */
		InternalResourceViewResolver bean = new InternalResourceViewResolver();

		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/jsp/");
		bean.setSuffix(".jsp");
		System.out.println("viewResolver");
		return bean;
	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}
}

/*
 * public class AppConfig implements WebMvcConfigurer {
 * 
 * public void addViewControllers(ViewControllerRegistry registry) { // TODO
 * Auto-generated method stub
 * registry.addViewController("/").setViewName("allemployees"); }
 * 
 * @Bean public ViewResolver viewResolver() { InternalResourceViewResolver bean
 * = new InternalResourceViewResolver();
 * 
 * bean.setViewClass(JstlView.class); bean.setPrefix("/WEB-INF/jsp/");
 * bean.setSuffix(".jsp");
 * 
 * return bean; }
 * 
 * @Bean public MessageSource messageSource() { ResourceBundleMessageSource
 * messageSource = new ResourceBundleMessageSource();
 * messageSource.setBasename("messages"); return messageSource; }
 * 
 * }
 */
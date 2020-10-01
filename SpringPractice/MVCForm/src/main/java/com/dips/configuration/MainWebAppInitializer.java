package com.dips.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MainWebAppInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		
		webCtx.register(WebConfig.class);
		webCtx.setServletContext(servletContext);
		ServletRegistration.Dynamic appServlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webCtx));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");
	}

}

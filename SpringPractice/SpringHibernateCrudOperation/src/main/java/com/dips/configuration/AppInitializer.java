package com.dips.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * @Configuration public class AppInitializer implements
 * WebApplicationInitializer {
 * 
 * public void onStartup(ServletContext servletContext) throws ServletException
 * { // TODO Auto-generated method stub
 * 
 * AnnotationConfigWebApplicationContext webCtx = new
 * AnnotationConfigWebApplicationContext();
 * 
 * webCtx.register(AppConfig.class); webCtx.setServletContext(servletContext);
 * ServletRegistration.Dynamic appServlet =
 * servletContext.addServlet("dispatcher", new DispatcherServlet(webCtx));
 * appServlet.setLoadOnStartup(1); appServlet.addMapping("/"); }
 * 
 * }
 */

@Configuration
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override 
	protected Class<?>[] getRootConfigClasses() { 
		//return new Class[]{AppConfig.class };
		System.out.println("root");
		return new Class[]{};

	}

	@Override protected Class<?>[] getServletConfigClasses() { // return null;
		System.out.println("AppInitializer Appconfig");
  return new Class[] { AppConfig.class }; }

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}

/*
 * public void onStartup(ServletContext container) throws ServletException {
 * 
 * AnnotationConfigWebApplicationContext ctx = new
 * AnnotationConfigWebApplicationContext(); ctx.register(AppConfig.class);
 * ctx.setServletContext(container);
 * 
 * ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new
 * DispatcherServlet(ctx));
 * 
 * servlet.setLoadOnStartup(1); servlet.addMapping("/"); }
 */

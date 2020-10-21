package com.spring.springrest.exception;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@Configuration
//@EnableWebMvc
public class CustomLocaleResolver extends AcceptHeaderLocaleResolver implements WebMvcConfigurer {

   List<Locale> LOCALES = Arrays.asList(
         new Locale("en"),
         new Locale("fr"));

   @Override
   public Locale resolveLocale(HttpServletRequest request) {
      String headerLang = request.getHeader("Accept-Language");
      return headerLang == null || headerLang.isEmpty() ? Locale.getDefault()
            : Locale.lookup(Locale.LanguageRange.parse(headerLang), LOCALES);
   }
/*   @Override
	public Locale resolveLocale(HttpServletRequest request) {
		String headerLang = request.getHeader("Accept-Language");
		return headerLang == null || headerLang.isEmpty() ? Locale.getDefault()
				: Locale.lookup(Locale.LanguageRange.parse(headerLang), ApplicationConstants.LOCALES);
	}*/

  /* @Bean
   public ResourceBundleMessageSource messageSource() {
	  ResourceBundleMessageSource rs = new ResourceBundleMessageSource();
      rs.setBasename("messages");
      rs.setDefaultEncoding("UTF-8");
      rs.setUseCodeAsDefaultMessage(true);
      return rs;
   }*/   
   @Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(-1);
		messageSource.setUseCodeAsDefaultMessage(true);
		return messageSource;
	}
   
   
   @Bean
   public LocalValidatorFactoryBean validator() {
	   System.out.println("lllllllllllllllllllllllllll*******");
      LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
      bean.setValidationMessageSource(this.messageSource());
      return bean;
   }
   
 
   
   /*@Bean
   public MessageSource messageSource() {
      ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
      messageSource.setBasename("classpath:messages");
      messageSource.setDefaultEncoding("UTF-8");
      return messageSource;
   }*/
   
   
   /*@Bean
   public javax.validation.Validator localValidatorFactoryBean() {
	   LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
       bean.setValidationMessageSource(messageSource());
       return bean;
   }*/
   
   
}
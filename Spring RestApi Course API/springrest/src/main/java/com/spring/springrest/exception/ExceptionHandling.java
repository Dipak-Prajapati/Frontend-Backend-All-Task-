package com.spring.springrest.exception;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandling extends ResponseEntityExceptionHandler{
	
	@Autowired   
	private MessageSource messageSource;
	

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		      HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		//Locale locale = LocaleContextHolder.getLocale();
		
		Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDate.now());
        body.put("status", status.value());
       
		
		List<ObjectError> code = ex.getBindingResult().getAllErrors();
		for(ObjectError error:code) {
			System.out.println("*********##########"+error.getDefaultMessage()+"**********#########");
		}
        //System.out.println("Code :" + code + "  ;;;;;;; Locale ::::::" + locale);
        System.out.println("LocaleContextHolder.getLocale() : "+LocaleContextHolder.getLocale());
    	String data = ex.getBindingResult().getAllErrors().stream().map(error -> this.messageSource.getMessage(error.getDefaultMessage(), null, LocaleContextHolder.getLocale()))
				.collect(Collectors.joining(","));
        
		
        //List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(x -> Translator.toLocale(x.getDefaultMessage())).collect(Collectors.toList());
        
        
        //List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.toList());
        
        
        //System.out.println("List<String> errors : " + errors + "ex.getBindingResult().getFieldErrors()" + ex.getBindingResult().getFieldErrors());
       /* String delim = " , ";

		String res =null; //String.join(delim, errors);
		System.out.println(res);
        */
		body.put("errors", data);
        //body.put("errors", Translator.toLocale(res));
		//body.put("errors", messageSource.getMessage(code, null, locale));
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
		
	}
	
}


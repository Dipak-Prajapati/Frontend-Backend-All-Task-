package com.spring.springrest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springrest.dto.CourseDto;
import com.spring.springrest.entities.Course;
import com.spring.springrest.service.CourseService;
import com.spring.springrest.util.CustomErrorType;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
	
	@Autowired   
	private MessageSource messageSource; 

	@GetMapping("/test")
	public String show() {
		return "Hello!!!!!!";
	}

	@GetMapping("/Course")
	public ResponseEntity<List<Course>> getAllCourse() {
		List<Course> course = courseService.getAllCourse();
		if (course.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Course>>(course, HttpStatus.OK);
		//return courseService.getAllCourse();
	}

	@GetMapping("/Course/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable String id) {
		Course course = courseService.getCourse(Integer.parseInt(id));
		System.out.println("Course is : : : : :"+course);
		if(course == null)
		{
			return new ResponseEntity(new CustomErrorType("Course with id "+id+" not found "),HttpStatus.NOT_FOUND);
			//return new ResponseEntity(new CourseNotFoundException(id),HttpStatus.NOT_FOUND);
			//throw new CourseNotFoundException(id);
		}
		return new ResponseEntity<Course>(course,HttpStatus.OK);
		//return courseService.getCourse(Integer.parseInt(id));
	}

	@PostMapping("/Course")
	public Course addCourse(@Valid @RequestBody CourseDto courseDto) {
		
		//,BindingResult result
/*		System.out.println(result.getFieldError());
		System.out.println("haserror : "+result.hasErrors());
		if(result.hasErrors())
		{
			System.out.println("In HasError :" + result.hasErrors());
			return (Course) result;
		}*/
		return courseService.addCourse(courseDto);
		
		//return messageSource.getMessage(courseService.addCourse(courseDto), null, locale);
	}

	@PutMapping("/Course")
	public Course updateCourse(@RequestBody CourseDto courseDto) {
		return courseService.updateCourse(courseDto);
	}

	@DeleteMapping("/Course/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id) {
		try {
			courseService.deleteCourse(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

package com.spring.springrest.service;

import java.util.List;

import com.spring.springrest.dto.CourseDto;
import com.spring.springrest.entities.Course;

public interface CourseService {

	List<Course> getAllCourse();

	Course getCourse(int id);

	Course addCourse(CourseDto courseDto);

	Course updateCourse(CourseDto courseDto);

	void deleteCourse(int id);

}

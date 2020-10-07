package com.spring.springrest.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springrest.dao.CourseDao;
import com.spring.springrest.dto.CourseDto;
import com.spring.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(int id) {
		// TODO Auto-generated method stub
		//return courseDao.findById(id).get();
		return courseDao.findById(id).orElse(null);
	}

	@Override
	public Course addCourse(CourseDto courseDto) {
		// TODO Auto-generated method stub
		Course course = modelMapper.map(courseDto,Course.class);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(CourseDto courseDto) {
		// TODO Auto-generated method stub
		Course course = modelMapper.map(courseDto, Course.class);
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		Course course = courseDao.getOne(id);
		courseDao.delete(course);
	}

}

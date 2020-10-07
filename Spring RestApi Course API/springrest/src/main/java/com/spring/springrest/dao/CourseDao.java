package com.spring.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {

}

package com.springboot.cicd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cicd.model.Course;
import com.springboot.cicd.repository.CourseRepository;

@RestController
public class CourseController {
	@Autowired
	CourseRepository courseRepository;
	
	@PostMapping("/course")
	public Course save(@RequestBody Course course) {
		return courseRepository.save(course);
	}
	@GetMapping("/course")
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
}

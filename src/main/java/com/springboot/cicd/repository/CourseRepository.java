package com.springboot.cicd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.cicd.model.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{

}

package com.dailycodebuffer.springdata.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.springdata.jpa.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
    

}

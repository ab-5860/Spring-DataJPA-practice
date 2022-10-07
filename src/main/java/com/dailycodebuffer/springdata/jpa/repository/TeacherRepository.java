package com.dailycodebuffer.springdata.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.springdata.jpa.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long>{
    
}

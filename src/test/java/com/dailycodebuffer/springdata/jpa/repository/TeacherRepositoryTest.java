package com.dailycodebuffer.springdata.jpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.springdata.jpa.entity.Course;
import com.dailycodebuffer.springdata.jpa.entity.Teacher;

@SpringBootTest
public class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;


    @Test
    public void saveTeacher()
    {

        Course courseDBA = Course.builder()
                        .title("DBA")
                        .credit(5)
                        .build();
        
        Course courseJava = Course.builder()
                        .title("Java")
                        .credit(6)
                        .build();


        Teacher teacher = Teacher.builder()
                            .firstName("Ramesh")
                            .lastName("kumar")
                            .courses(List.of(courseDBA, courseJava))
                            .build();

        teacherRepository.save(teacher);
    }
}

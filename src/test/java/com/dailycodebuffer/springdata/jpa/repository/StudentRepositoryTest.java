package com.dailycodebuffer.springdata.jpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.springdata.jpa.entity.Guardian;
import com.dailycodebuffer.springdata.jpa.entity.Student;



@SpringBootTest
public class StudentRepositoryTest {


    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent()
    {
        Student student = Student.builder()
                            .emailId("kmrabhi9987@gmail.com")
                            .firstName("Kumar")
                            .lastName("Abhishek")
                            //.guardianName("Satish")
                            //.guardianEmail("satish@gmail.com")
                            //.guardianMobile("99999999999")
                            .build();

            studentRepository.save(student);
                        }

        @Test
        public void saveStudentWithGuardian()
        {

            Guardian guardian  = Guardian.builder()
                                    .email("Satish123@gmail.com")
                                    .name("Satish")
                                    .mobile("99999997667")
                                    .build();


            Student student = Student.builder()
                                .firstName("Kumar")
                                .emailId("kumar@gmail.com")
                                .lastName("Abhijit")
                                .guardian(guardian)
                                .build();

                studentRepository.save(student);
        }

        @Test
        public void printAllStudent()
        {
            List<Student> studentList = 
                        studentRepository.findAll();
            
            System.out.println("studentList = " +studentList);
        }

        @Test
        public void printStudentByFirstName()
        {
            List<Student> students = studentRepository.findByFirstName("kumar");

            System.out.println("students = " + students);
        }

        @Test
        public void printStudentByFirstNameContaining()
        {
            List<Student> students = studentRepository.findByFirstNameContaining("ku");

            System.out.println("students = " + students);
        }

        @Test
        public void printStudentBasedOnGuardianName()
        {
            List<Student> students = studentRepository.findByGuardianName("Satish");
            System.out.println("Students = " +students);
        }

        @Test
        public void printgetStudentByEmailAddress()
        {
            Student student = studentRepository.getStudentByEmailAddress(
                                "kumar@gmail.com"   
            );

        System.out.println("Student = " +student);
        }

        @Test
        public void printgetStudentFirstNameByEmailAddress()
        {
            String student = studentRepository.getStudentFirstNameByEmailAddress(
                                                "kumar@gmail.com");
                                                
            System.out.println("Student = " +student);
        }


        @Test
        public void printgetStudentLastNameByEmailAddress()
        {
            String student = studentRepository.getStudentLastNameByEmailAddress(
                                                "kmrabhi9987@gmail.com"   
            );

            System.out.println("Student = " +student);
        }

        @Test
        public void printgetStudentByEmailAddressNative()
        {
            Student student = studentRepository.getStudentByEmailAddressNative(
                                        "kmrabhi9987@gmail.com");

            System.out.println("Student = " +student);
        }

        @Test
        public void printgetStudentByEmailAddressNativeNamedParam()
        {
            Student student = studentRepository.getStudentByEmailAddressNative(
                "kmrabhi9987@gmail.com");

            System.out.println("Student = " +student);
        }

        @Test
        public void updateStudentNameByEmailIdTest()
        {
            studentRepository.updateStudentNameByEmailId("Sah", 
            "kumar@gmail.com");
            
        }
}

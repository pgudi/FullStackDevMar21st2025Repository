package com.gentech.student.integration;

import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.Student;
import com.gentech.student.mapper.StudentMapper;
import com.gentech.student.repository.StudentRepository;
import org.junit.jupiter.api.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentIntegrationTests {

    @LocalServerPort
    private int port;

    private String baseURL="http://localhost";

    private static RestTemplate restTemplate=null;

    @Autowired
    private StudentRepository studentRepository;

    @BeforeAll
    public static void init()
    {
        restTemplate=new RestTemplate();
    }

    @BeforeEach
    public void beforeSetUp()
    {
        baseURL=baseURL+":"+port+"/api/v1";
    }

    @AfterEach
    public void afterCleanUp()
    {
        studentRepository.deleteAll();
    }

    @Test
    public void createStudentTest()
    {
        Student student1=new Student();
        student1.setFirstName("Adams");
        student1.setCourseName("Computer Science");
        student1.setEmailId("adams@gss.com");

        StudentDto studentDto=StudentMapper.mapToStudentDto(student1);
        StudentDto studentDto1=restTemplate.postForObject(baseURL+"/student",studentDto, StudentDto.class);

        //Validation of Tests
        Assertions.assertNotNull(studentDto1);
        Assertions.assertTrue(studentDto1.getEmailId().contains("adams"));
        Assertions.assertEquals("Computer Science", studentDto1.getCourseName());
    }

    @Test
    public void shouldCreateStudentTest()
    {
        Student student1=new Student(
                "Richard",
                "Python Development",
                "richard@w3schools.com");

        StudentDto studentDto=StudentMapper.mapToStudentDto(student1);
        StudentDto studentDto1=restTemplate.postForObject(baseURL+"/student",studentDto, StudentDto.class);

        //Validation of Tests
        Assertions.assertNotNull(studentDto1);
        Assertions.assertTrue(studentDto1.getEmailId().contains("richard"));
        Assertions.assertEquals("Python Development", studentDto1.getCourseName());
    }
    @Test
    public void displayAllStudentsTest()
    {
        Student student1=new Student();
        student1.setFirstName("Adams");
        student1.setCourseName("Computer Science");
        student1.setEmailId("adams@gss.com");

        Student student2=new Student();
        student2.setFirstName("Santosh");
        student2.setCourseName("Research");
        student2.setEmailId("santosh@gss.com");

        StudentDto studentDto1=StudentMapper.mapToStudentDto(student1);
        StudentDto adams=restTemplate.postForObject(baseURL+"/student",studentDto1, StudentDto.class);

        StudentDto studentDto2=StudentMapper.mapToStudentDto(student2);
        StudentDto santosh=restTemplate.postForObject(baseURL+"/student",studentDto2, StudentDto.class);

        //Perform Get All Students
        List<StudentDto> students=restTemplate.getForObject(baseURL+"/students", List.class);
        int count=students.size();
        Assertions.assertTrue(count!=0);
        Assertions.assertEquals(2, count);
    }

    @Test
    public void displaySpecificStudentTest()
    {
        Student student2=new Student();
        student2.setFirstName("Santosh");
        student2.setCourseName("Research");
        student2.setEmailId("santosh@gss.com");

        StudentDto studentDto2=StudentMapper.mapToStudentDto(student2);
        StudentDto santosh=restTemplate.postForObject(baseURL+"/student",studentDto2, StudentDto.class);

        //Display Specific Student
        StudentDto existingStudent=restTemplate.getForObject(baseURL+"/student/"+santosh.getStudentId(),StudentDto.class);

        //Validation
        Assertions.assertNotNull(existingStudent);
        Assertions.assertEquals("Santosh",existingStudent.getFirstName());

    }

    @Test
    public void modifyStudentTest()
    {
        Student student2=new Student();
        student2.setFirstName("Santosh");
        student2.setCourseName("Research");
        student2.setEmailId("santosh@gss.com");

        StudentDto studentDto2=StudentMapper.mapToStudentDto(student2);
        StudentDto santosh=restTemplate.postForObject(baseURL+"/student",studentDto2, StudentDto.class);

        //Modify the Existing Student Record
        santosh.setCourseName("Science and Technology");
        restTemplate.put(baseURL+"/student/"+santosh.getStudentId(),santosh, StudentDto.class);
        //Validate
        Assertions.assertEquals("Science and Technology", santosh.getCourseName());
    }

    @Test
    public void deleteStudentTest()
    {
        Student student1=new Student();
        student1.setFirstName("Adams");
        student1.setCourseName("Computer Science");
        student1.setEmailId("adams@gss.com");

        Student student2=new Student();
        student2.setFirstName("Santosh");
        student2.setCourseName("Research");
        student2.setEmailId("santosh@gss.com");

        StudentDto studentDto1=StudentMapper.mapToStudentDto(student1);
        StudentDto adams=restTemplate.postForObject(baseURL+"/student",studentDto1, StudentDto.class);

        StudentDto studentDto2=StudentMapper.mapToStudentDto(student2);
        StudentDto santosh=restTemplate.postForObject(baseURL+"/student",studentDto2, StudentDto.class);
        //Delete Student Funcxtionality
        restTemplate.delete(baseURL+"/student/"+adams.getStudentId());

        //Validation of Delete Functionality
        int countOfExistingStudents=studentRepository.findAll().size();

        Assertions.assertEquals(1, countOfExistingStudents);
    }
}

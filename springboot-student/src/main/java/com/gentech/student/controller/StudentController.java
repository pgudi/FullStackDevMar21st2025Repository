package com.gentech.student.controller;

import com.gentech.student.dto.StudentDto;
import com.gentech.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {
    @Autowired
    private StudentService studService;

    @PostMapping("/student")
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto)
    {
        return new ResponseEntity<>(studService.createStudent(studentDto), HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentDto>> getAllStudents()
    {
        return new ResponseEntity<>(studService.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<StudentDto> getSpecificStudent(@PathVariable Integer id)
    {
        return new ResponseEntity<>(studService.getStudent(id),HttpStatus.OK);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<StudentDto> modifySpecificStudent(@PathVariable Integer id,
                                                           @RequestBody StudentDto studentDto)
    {
        return new ResponseEntity<>(studService.editStudent(id, studentDto), HttpStatus.OK);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteSpecificStudent(@PathVariable Integer id)
    {
        studService.deleteStudent(id);
        return new ResponseEntity<>("The Student with student Id "+id+" has deleted successfullly", HttpStatus.OK);
    }
}

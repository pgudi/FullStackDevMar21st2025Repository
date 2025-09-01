package com.gentech.student.service;

import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.Student;

import java.util.List;

public interface StudentService {

    StudentDto createStudent(StudentDto studentdto);

    List<StudentDto> getAllStudents();

    StudentDto getStudent(Integer id);

    StudentDto editStudent(Integer id, StudentDto studentDto);

    void deleteStudent(Integer id);
}

package com.gentech.student.mapper;
import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student)
    {

        StudentDto studentDto=new StudentDto(
                student.getStudentId(),
                student.getFirstName(),
                student.getCourseName(),
                student.getEmailId(),
                student.getCreatedDate(),
                student.getModifiedDate()
        );
        return studentDto;
    }

    public static Student mapToStudent(StudentDto studentDto)
    {
        Student student=new Student(
                studentDto.getStudentId(),
                studentDto.getFirstName(),
                studentDto.getCourseName(),
                studentDto.getEmailId(),
                studentDto.getCreatedDate(),
                studentDto.getModifiedDate()
        );
        return student;
    }
}

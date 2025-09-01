package com.gentech.student.serviceimpl;

import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.Student;
import com.gentech.student.exception.ResourceNotFoundException;
import com.gentech.student.mapper.StudentMapper;
import com.gentech.student.repository.StudentRepository;
import com.gentech.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepo;
    @Override
    public StudentDto createStudent(StudentDto studentdto) {
        Student student= StudentMapper.mapToStudent(studentdto);
        Student savedStudent=studentRepo.save(student);
        return StudentMapper.mapToStudentDto(savedStudent);
    }

    @Override
    public List<StudentDto> getAllStudents() {

        return  studentRepo.findAll()
                .stream().map((student) -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());

    }

    @Override
    public StudentDto getStudent(Integer id) {

        Student existingStudent=studentRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("The Student with id "+id+" has not found in the database"));

        return StudentMapper.mapToStudentDto(existingStudent);
    }

    @java.lang.Override
    public StudentDto editStudent(Integer id, StudentDto studentDto) {
        Student existingStudent=studentRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("The Student with id "+id+" has not found in the database"));

        existingStudent.setFirstName(studentDto.getFirstName());
        existingStudent.setCourseName(studentDto.getCourseName());
        existingStudent.setEmailId(studentDto.getEmailId());

        Student savedStudent=studentRepo.save(existingStudent);
        return StudentMapper.mapToStudentDto(savedStudent);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("The Student with id "+id+" has not found in the database"));

        studentRepo.deleteById(id);
    }
}

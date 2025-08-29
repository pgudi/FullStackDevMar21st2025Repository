package com.gentech.relationship;

import com.gentech.relationship.entity.Courses;
import com.gentech.relationship.entity.Students;
import com.gentech.relationship.repository.CoursesRepository;
import com.gentech.relationship.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringManytomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringManytomanyApplication.class, args);
	}

	@Autowired
	private StudentsRepository studRepo;

	@Autowired
	private CoursesRepository coursesRepo;

	@Override
	public void run(String... args) throws Exception {
		// create Students
		Students student1=new Students("Santosh","santosh@gmail","Dallas");
		Students student2=new Students("Vinith","vinith@gmail","New York");
		//Create Courses
		Courses course1=new Courses("Full Stack Development","Front and Backend Development Course");
		Courses course2=new Courses("QA Automation","Automation using Playwright and JavaScript");

		//Add Courses to Each Student
		student1.getCourses().add(course1);
		student1.getCourses().add(course2);

		student2.getCourses().add(course1);
		student2.getCourses().add(course2);

		//Add Students to Each Course
		course1.getStudents().add(student1);
		course1.getStudents().add(student2);

		course2.getStudents().add(student1);
		course2.getStudents().add(student2);

		studRepo.save(student1);
		studRepo.save(student2);


	}
}

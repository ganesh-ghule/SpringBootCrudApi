package com.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.Student;
import com.springrest.services.StudentService;

@RestController
public class MyController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to Student Service..!!";
	}

	@GetMapping("/getAllStudent")
	public List<Student> getCourses() {
		System.out.println("Return all courses");
		return this.studentService.getStudents();
	}

	@GetMapping("/student/{id}")
	public Student getCourse(@PathVariable String id) {
		return this.studentService.getStudent(Integer.parseInt(id));
	}

	@PostMapping("/addstudent")
	public Student addCourse(@RequestBody Student c) {
		return this.studentService.addStudent(c);
	}

	@PostMapping("/students/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {

		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setEmail(student.getEmail());

		existingStudent.setAddress(student.getAddress());


		return studentService.updateStudent(existingStudent);
		
	}

}
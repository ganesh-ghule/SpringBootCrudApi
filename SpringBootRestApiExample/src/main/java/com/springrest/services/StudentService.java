package com.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.entity.Student;

public interface StudentService 
{
	public List<Student> getStudents();
	public Student getStudent(int id);
	public Student addStudent(Student c);
	Student getStudentById(int id);
	public Student updateStudent(Student student);
//	public void deleteStudent(int id);
}

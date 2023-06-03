package com.springrest.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.StudentDao;
import com.springrest.entity.Student;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentDao studentDao;
	
	public StudentServiceImpl() 
	{
		
	}
	@Override
	public List<Student> getStudents() 
	{
		System.out.println("Called");
		return studentDao.findAll();
	}
	
	public Student getStudentById(int id) {
		return studentDao.findById(id).get();
	}
	
	@Override
	public Student getStudent(int id) 
	{
		return studentDao.getOne(id);
	}
	@Override
	public Student addStudent(Student c) 
	{
		return studentDao.save(c);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentDao.save(student);
	}	
}

	
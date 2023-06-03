package com.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}

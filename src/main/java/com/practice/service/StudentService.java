package com.practice.service;

import java.util.List;

import com.practice.entity.Student;

public interface StudentService {
	public void saveStudent(Student student);
	
	public List<Student> findAll();
	
	public void deleteById(long id);
	
	public Student getStudentById(long id);
}

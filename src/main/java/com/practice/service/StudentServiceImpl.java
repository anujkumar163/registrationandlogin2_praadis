package com.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Student;
import com.practice.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repo;
	
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> student = repo.findAll();
		
		return student;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		Optional<Student> findById = repo.findById(id);
		Student student = findById.get();
		return student;
	}

}

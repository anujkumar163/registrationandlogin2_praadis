package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Student;
import com.practice.service.StudentService;


@RestController
@RequestMapping("/api")
public class Studentservice {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public void saveStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	
	@GetMapping("/get")
	public List<Student> getStudent(){
		List<Student> student = service.findAll();
		return student;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable("id") long id) {
		service.deleteById(id);
	}
	
	@PutMapping("/update{id}")
	public void updatestudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	
	
	
	
	
	
	
	
	
	
}

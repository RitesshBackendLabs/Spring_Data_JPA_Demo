package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Student;

public interface StudentService {
	
	public List<Student> getAll();
	public Optional<Student> getById(int id);
	public Student addOrupdate(Student stud);
	public void deleteById(int id);
	
}

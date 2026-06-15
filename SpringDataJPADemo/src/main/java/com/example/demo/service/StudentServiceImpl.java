package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAll() {
	return studentRepository.findAll(); 
	}

	@Override
	public Optional<Student> getById(int id) {
		return studentRepository.findById(id);
	}

	@Override
	public Student addOrupdate(Student stud) {
		studentRepository.save(stud);
		return stud;
	}

	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}
}

package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students/{id}")
	public Optional<Student> findStudentById(@PathVariable int id){
		return studentService.getById(id);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAll();
	}

	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.addOrupdate(student); // JSON object
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student stud) {
		return studentService.addOrupdate(stud); 
	}
	
	@DeleteMapping("/students/{id}")
	public String deleteStudentById(@PathVariable int id) {
		studentService.deleteById(id);
		return "Student with ID: "+id+" is deleted!" ;
	
	}
}

package com.student.controller;

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

import com.student.dto.StudentDto;
import com.student.entity.StudentEntity;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public Boolean saveStudent(@RequestBody StudentDto StudentDto) {
		Boolean b=studentService.saveCreateStudentData(StudentDto);
		return b;
	}
	
	@GetMapping
    public List<StudentEntity> getStudent(){
    	return studentService.getStudent();
    }  
	
	@GetMapping("/{id}")
	public StudentEntity fetchById(@PathVariable Integer id) {
		return studentService.fetchById(id);
	}
	@PutMapping
	public boolean updateStudent(@RequestBody StudentDto entity) {
		boolean b =studentService.updateStudent(entity);
		System.out.println(entity+" entity");
		return b;
	}
	@DeleteMapping("/{id}")
	public boolean removeStudent(@PathVariable Integer id) {
	boolean b = studentService.removeStudent(id);
	return b;
	}

}

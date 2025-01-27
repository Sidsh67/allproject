package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.student.dto.StudentDto;
import com.student.entity.StudentEntity;

public interface StudentService {

	public Boolean saveCreateStudentData(StudentDto studentDto);
	
	public List<StudentEntity> getStudent();
	
	public StudentEntity fetchById(Integer id);
	
	public boolean updateStudent(StudentDto dto);
	
	public boolean removeStudent(Integer id);
  }

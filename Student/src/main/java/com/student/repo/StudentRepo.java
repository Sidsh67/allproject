package com.student.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

//	List<StudentEntity> FindByStudentName(String StudentName);
}

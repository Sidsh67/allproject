package com.student.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.dto.StudentDto;
import com.student.entity.StudentEntity;
import com.student.repo.StudentRepo;
import com.student.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Boolean saveCreateStudentData(StudentDto studentDto) {
		try {
		StudentEntity studentEntity=new StudentEntity(studentDto.getFirst_name(), 
				studentDto.getLast_name(), studentDto.getRoll_number(),studentDto.getCourse(), studentDto.getEmail(),
				studentDto.getPhone_number(), studentDto.getDob());

		studentRepo.save(studentEntity);
		
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<StudentEntity> getStudent(){
		
			return (List<StudentEntity>)studentRepo.findAll();
		
	}
	
	public StudentEntity fetchById(Integer id) {
		return studentRepo.findById(id).get();
	}

	public boolean updateStudent(StudentDto dto) {
		StudentEntity studentEntity=studentRepo.findById(dto.getStud_id()).get();
//		System.out.println(dto+" service entity");
		try {
			studentEntity.setCourse(dto.getCourse());
			studentEntity.setEmail(dto.getEmail());
			studentEntity.setFirst_name(dto.getFirst_name());
			studentEntity.setLast_name(dto.getLast_name());
			studentEntity.setDob(dto.getDob());
			studentEntity.setPhone_number(dto.getPhone_number());
			studentEntity.setRoll_number(dto.getRoll_number());
//			 System.out.println(studentEntity+" old service entity");
			
			StudentEntity entity= studentRepo.save(studentEntity);
			 System.out.println(entity+" new service entity");
			return true;
			}catch(Exception e) {
				e.printStackTrace();
				return false;
			}
	}
	
	public boolean removeStudent(Integer id) {
		studentRepo.deleteById(id);
		return true;
	}
	

}

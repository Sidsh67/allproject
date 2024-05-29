package com.employee.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.employee.entity.EmployeeEntity;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public boolean saveEmployee(EmployeeEntity emp) {
		try {
			repo.save(emp);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<EmployeeEntity> getData() {
		List<EmployeeEntity> list = repo.findAll();
		return new ArrayList<>(list);
	}

	public Optional<EmployeeEntity> getById(Long id) {
		Optional<EmployeeEntity> employee = repo.findById(id);
		return repo.findById(id);
	}

	
	
	public boolean updateData( EmployeeEntity emp) {

		EmployeeEntity empl = repo.findById(emp.getEmp_id()).get();
		
		if (empl != null) {
			
			repo.save(emp);
			return true;
		}
		return false;
	}

	public boolean removeEmploye(Long id) {
		repo.deleteById(id);
		return true;
	}
}

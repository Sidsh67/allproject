package com.employee.controller;

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

import com.employee.entity.EmployeeEntity;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping
	public boolean saveEmployee(@RequestBody EmployeeEntity emp) {
		service.saveEmployee(emp);
		return true;
	}

	@GetMapping
	public List<EmployeeEntity> getAll() {
		return service.getData();
	}

	@GetMapping("/{id}")
	public Optional<EmployeeEntity> getById(@PathVariable Long id) {
		return service.getById(id);
	}

	@PutMapping()
	public boolean updateData( @RequestBody EmployeeEntity emp) {

		boolean f=	service.updateData( emp);
	
	
	if(f==true) {
		
		return true;
	}
		return false;

	}

	@DeleteMapping("/{id}")
	public boolean removeEmployee(@PathVariable Long id) {
		boolean b = service.removeEmploye(id);
		return b;
	}

}

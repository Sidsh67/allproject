package com.employee.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity
public class EmployeeEntity {
	@NonNull
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long emp_id;
	@NonNull
	private String designation;
	@NonNull
	private LocalDate date;
	@NonNull
	private long salary;
	public EmployeeEntity(@NonNull String name, @NonNull String designation, @NonNull LocalDate date,
			@NonNull long salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.date = date;
		this.salary = salary;
	}

	
	
	
}

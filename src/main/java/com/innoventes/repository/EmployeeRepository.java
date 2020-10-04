package com.innoventes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innoventes.entity.Address;
import com.innoventes.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	List<Employee> findByName(String name);
	
	
}

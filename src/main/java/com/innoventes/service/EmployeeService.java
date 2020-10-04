package com.innoventes.service;

import java.util.List;
import java.util.Optional;

import com.innoventes.entity.Employee;

public interface EmployeeService {

	List<Employee> saveEmployee(List<Employee> employee);
	
	Optional<?> updateEmployee(Employee emplyee);
	
	List<Employee> fetchAllEmployee();
	
	Optional<?> getByIdEmployee(Long empId);
	
	Optional<?> deleteEmployee(Long empId);
	
	<T> Optional<List<?>> findByName(String name);
	
	
}

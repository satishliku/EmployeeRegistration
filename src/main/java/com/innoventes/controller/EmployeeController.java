package com.innoventes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.innoventes.entity.Employee;
import com.innoventes.service.EmployeeService;

@RestController

public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/allemp")
	public List<Employee> fetchAll(){
		
		return service.fetchAllEmployee();
	}
	
	@PostMapping("/saveEmp")
	public List<Employee> saveEmployee(@RequestBody List<Employee> employee){
		return service.saveEmployee(employee);
	}
	
	@PutMapping("/updateEmp")
	public Optional<?> updateEmployee(@RequestBody Employee emplyee) {
		return service.updateEmployee(emplyee);
	}
	
	@GetMapping("/byIdEmp/{id}")
	public Optional<?> getByIdEmployee(Long id) {
		return service.getByIdEmployee(id);
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public Optional<?> deleteEmployee(@PathVariable Long id){
		return service.deleteEmployee(id);
	}
	
	@GetMapping("name/{name}")
	public <T> Optional<List<?>> findByName(@PathVariable String name){
		return service.findByName(name);
	}
	
}

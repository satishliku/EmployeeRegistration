package com.innoventes.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.entity.Employee;
import com.innoventes.repository.EmployeeRepository;
import com.innoventes.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public List<Employee> saveEmployee(List<Employee> employee) {
		final List<Employee> entity=repo.saveAll(employee);
		return entity;
	}

	@Override
	public Optional<?> updateEmployee(Employee emplyee) {
		
		Optional<Employee> result=repo.findById(emplyee.getId());
		Optional<?> response=repo.findById(emplyee.getId());
		if(result.isPresent()) {
			response=Optional.of(repo.save(emplyee)) ;
			return response;
		}
		else {
			response=Optional.of("Id " +emplyee.getId()+" Is not pressent");
			return response;
		}
		
		
	}

	@Override
	public List<Employee> fetchAllEmployee() {
		final List<Employee> empList=repo.findAll();
		return empList;
	}

	@Override
	public Optional<?> getByIdEmployee(Long empId) {
		Optional<Employee> employee=repo.findById(empId);
		if(employee.isPresent()) {
			return employee;
		}
		else {
			Optional<String> msg=Optional.of("Id not pressent");
			return msg;
		}
		
	}

	@Override
	public Optional<?> deleteEmployee(Long empId) {
		Optional<Employee> result=repo.findById(empId);
		if(result.isPresent()){
			 repo.deleteById(empId);
			 
			 return Optional.of("Employe Id " +empId+" deleted successfully");
		}
		else {
			return Optional.of("Employe Id " +empId+" Not Exist");
		}
		
		
	}

	@Override
	public <T> Optional<List<?>> findByName(String name) {
		Optional<List<?>> result=Optional.of(repo.findByName(name));
		
		if(result.isPresent()) {
			return result;
		}
		return Optional.empty();
		
		
	}

	

	

}

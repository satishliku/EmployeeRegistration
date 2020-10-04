package com.innoventes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.innoventes.entity.EmployeeAddress;
import com.innoventes.service.EmployeeAddressService;

@RestController
public class EmployeeAddressController {

	@Autowired
	private EmployeeAddressService service;
	
	@PostMapping("/saveEmpAddr")
	public List<EmployeeAddress> saveEmployeeAddress(@RequestBody List<EmployeeAddress> empAddress) {
		return service.saveEmployeeAddress(empAddress);
	}
	
	@GetMapping("/getEmpAddr")
	public List<EmployeeAddress> fetchAll(){
		return service.fetchAll();
	}
}

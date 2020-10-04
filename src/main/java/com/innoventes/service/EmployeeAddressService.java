package com.innoventes.service;

import java.util.List;

import com.innoventes.entity.EmployeeAddress;

public interface EmployeeAddressService {

	List<EmployeeAddress> saveEmployeeAddress(List<EmployeeAddress> empAddress);
	
	public List<EmployeeAddress> fetchAll();
}

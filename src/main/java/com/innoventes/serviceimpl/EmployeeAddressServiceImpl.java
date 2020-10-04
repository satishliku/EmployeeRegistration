package com.innoventes.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.entity.EmployeeAddress;
import com.innoventes.repository.EmployeeAddressRepository;
import com.innoventes.service.EmployeeAddressService;

@Service
public class EmployeeAddressServiceImpl implements EmployeeAddressService {

	@Autowired
	private EmployeeAddressRepository repo;
	
	@Override
	public List<EmployeeAddress> saveEmployeeAddress(List<EmployeeAddress> empAddress) {
		final List<EmployeeAddress> empAddrressList=repo.saveAll(empAddress);
		return empAddrressList;
	}
	
	@Override
	public List<EmployeeAddress> fetchAll(){
		return repo.findAll();
	}
}

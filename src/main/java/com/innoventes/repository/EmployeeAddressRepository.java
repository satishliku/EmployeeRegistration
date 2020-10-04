package com.innoventes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innoventes.entity.EmployeeAddress;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, Long>{
	
}

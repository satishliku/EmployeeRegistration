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

import com.innoventes.entity.Address;
import com.innoventes.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService service;
	
	@GetMapping("/alladdr")
	public List<Address> fetchAll(){
		
		return service.fetchAllAddress();
	}
	
	@PostMapping("/saveAddr")
	public List<Address> saveAddress(@RequestBody List<Address> address){
		return service.saveAddress(address);
	}
	
	@PutMapping("/updateAddr")
	public Optional<?> updateAddress(@RequestBody Address address) {
		return service.updateAddress(address);
	}
	
	@GetMapping("/byIdAddr/{id}")
	public Optional<?> getByIdAddress(Long id) {
		return service.getByIdAddress(id);
	}
	
	@DeleteMapping("/deleteAddr/{id}")
	public Optional<?> deleteAddress(@PathVariable Long id){
		return service.deleteAddress(id);
	}
	
}

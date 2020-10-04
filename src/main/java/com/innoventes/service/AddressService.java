package com.innoventes.service;

import java.util.List;
import java.util.Optional;

import com.innoventes.entity.Address;

public interface AddressService {
	
	List<Address> saveAddress(List<Address> address);
	
	Optional<?> updateAddress(Address address);
	
	List<Address> fetchAllAddress();
	
	Optional<?> getByIdAddress(Long empId);
	
	Optional<?> deleteAddress(Long empId);
	
}

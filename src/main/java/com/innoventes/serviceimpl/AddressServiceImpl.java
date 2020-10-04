package com.innoventes.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.entity.Address;
import com.innoventes.repository.AddressRepository;
import com.innoventes.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepository repo;

	@Override
	public List<Address> saveAddress(List<Address> address) {
		final List<Address> entity=repo.saveAll(address);
		return entity;
	}

	@Override
	public Optional<?> updateAddress(Address address) {
		Optional<Address> result=repo.findById(address.getId());
		Optional<?> response=repo.findById(address.getId());
		if(result.isPresent()) {
			response=Optional.of(repo.save(address)) ;
			return response;
		}
		else {
			response=Optional.of("Id " +address.getId()+" Is not pressent");
			return response;
		}
	}

	@Override
	public List<Address> fetchAllAddress() {
		final List<Address> addrList=repo.findAll();
		return addrList;
	}

	@Override
	public Optional<?> getByIdAddress(Long addrId) {
		Optional<Address> address=repo.findById(addrId);
		if(address.isPresent()) {
			return address;
		}
		else {
			Optional<String> msg=Optional.of("Id not pressent");
			return msg;
		}
	}

	@Override
	public Optional<?> deleteAddress(Long addrId) {
		Optional<Address> result=repo.findById(addrId);
		if(result.isPresent()){
			 repo.deleteById(addrId);
			 
			 return Optional.of("Employe Id " +addrId+" deleted successfully");
		}
		else {
			return Optional.of("Employe Id " +addrId+" Not Exist");
		}
	}

	

	

}

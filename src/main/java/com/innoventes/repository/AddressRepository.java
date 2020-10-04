package com.innoventes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innoventes.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

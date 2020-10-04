package com.innoventes.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank(message = "Address One is mandatory")
	private String addrLineOne;
	
	@Nullable
	private String addrLineTwo;
	
	@NotNull
	@NotBlank(message = "City is mandatory")
	private String city;

	@OneToMany(mappedBy = "addres",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<EmployeeAddress> empAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddrLineOne() {
		return addrLineOne;
	}

	public void setAddrLineOne(String addrLineOne) {
		this.addrLineOne = addrLineOne;
	}

	public String getAddrLineTwo() {
		return addrLineTwo;
	}

	public void setAddrLineTwo(String addrLineTwo) {
		this.addrLineTwo = addrLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<EmployeeAddress> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(List<EmployeeAddress> empAddress) {
		this.empAddress = empAddress;
	}

	
	
	
}

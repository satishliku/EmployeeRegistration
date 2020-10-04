package com.innoventes.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

@Entity
@Table(name="EmployeeAddress")
public class EmployeeAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Embedded
	private EmployeeAddressId empAddrId;
	
	@ManyToOne
	@MapsId("employeeId")
	@JoinColumn(name="employee_Id")
	@NotNull
	
	private Employee employe;
	
	@ManyToOne
	@MapsId("addressId")
	@JoinColumn(name="address_Id")
	@NotNull
	private Address addres;
	
	@Nullable
	@Column(name="address_Type")
	private String addressType;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public EmployeeAddressId getEmpAddrId() {
		return empAddrId;
	}

	public void setEmpAddrId(EmployeeAddressId empAddrId) {
		this.empAddrId = empAddrId;
	}

	public Employee getEmploye() {
		return employe;
	}

	public void setEmploye(Employee employe) {
		this.employe = employe;
	}

	public Address getAddres() {
		return addres;
	}

	public void setAddres(Address addres) {
		this.addres = addres;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	

	
}

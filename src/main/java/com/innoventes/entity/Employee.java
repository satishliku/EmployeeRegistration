package com.innoventes.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

@Entity

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3)
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	@Nullable
	private LocalDate dateOfBirth;
	
	@OneToMany(mappedBy = "employe",cascade = CascadeType.ALL)
	private List<EmployeeAddress> address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<EmployeeAddress> getAddress() {
		return address;
	}

	public void setAddress(List<EmployeeAddress> address) {
		this.address = address;
	}

	

}

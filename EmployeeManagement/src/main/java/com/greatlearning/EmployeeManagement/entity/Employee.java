package com.greatlearning.EmployeeManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private int id;

	private String FirstName;

	private String LastName;

	private String email;

}

package com.packt.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

 @Entity
 @Table(name= "Employee")
public class Employee {

	@Id
	@GeneratedValue
 	private int id;
	
	private String firstName;
	
	private String lastName;
 
	private int age;
	
	private String title;
 
	private int employeeNumber;
	
	@OneToOne
	@JoinColumn(name = "ADDRESS_Id")
	private Address address;
	
	@OneToOne
	@JoinColumn(name ="USERNAME")
	private Credentials credential;
	
	
 	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
 	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Credentials getCredential() {
		return credential;
	}
	public void setCredential(Credentials credential) {
		this.credential = credential;
	}
 
}

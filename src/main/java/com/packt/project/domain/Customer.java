package com.packt.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer{

	@Id @GeneratedValue
	private Long id;

	@NotEmpty(message="Firstname cannot be empty!")
	@Column(name = "firstname", nullable=false)
	private String firstname;

	
	@NotEmpty(message="Lastname cannot be empty!")
	@Column(name = "lastname", nullable=false)
	private String lastname;
	
	

	@NotEmpty(message="Username cannot be empty!")
	@Column(name = "username", nullable=false)
	private String userName;
	
	@NotEmpty(message ="password cannot be empty!")
	@Column(name = "password", nullable = false)
	private String password;
	

	@NotEmpty(message="Phone cannot be empty!")
	@Column(name = "phone")
	private String phone;

		

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	
}

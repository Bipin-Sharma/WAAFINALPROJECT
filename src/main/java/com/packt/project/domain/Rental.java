package com.packt.project.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Rental {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Date leaseStartDate;
	
	private Date leaseEndDate;
	
	private double monthlyRent;
	
	private double securityDeposit;
	
	@OneToOne
	@JoinColumn(name="propertyId")
	private Property property;
	
	@OneToOne
	@JoinColumn(name="customerId")
	private Customer leaser;

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Customer getLeaser() {
		return leaser;
	}

	public void setLeaser(Customer leaser) {
		this.leaser = leaser;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLeaseStartDate() {
		return leaseStartDate;
	}

	public void setLeaseStartDate(Date leaseStartDate) {
		this.leaseStartDate = leaseStartDate;
	}

	public Date getLeaseEndDate() {
		return leaseEndDate;
	}

	public void setLeaseEndDate(Date leaseEndDate) {
		this.leaseEndDate = leaseEndDate;
	}

	public double getMonthlyRent() {
		return monthlyRent;
	}

	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

	public double getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}
	
	
}

package com.example.myapp.data.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	@Id
	@Column(name="CUSTOMER_ID", unique=true, nullable=false)
	@SequenceGenerator(name="CUSTOMER_SEQUENCE", sequenceName="CUSTOMER_SEQUENCE_ID", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CUSTOMER_SEQUENCE") 
	private Long customer_id;
	@Column(name="NAME", unique=true, nullable=false)
	private String name;
	@Column(name="SURNAME")
	private String surname;
	@Column(name="EMAIL")
	private String email;
	@Column(name="BIRTHDATE")
	private String birthDate;
//	@OneToMany(mappedBy="customer")
//	private Set<Order> order;
	

	//Getters and Setters
	
	
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return this.name;
	}
	public void setCustomer_name(String customer_name) {
		this.name = customer_name;
	}
	public String getSurname() {
		return this.surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String bithDate) {
		this.birthDate = bithDate;
	}
	
}

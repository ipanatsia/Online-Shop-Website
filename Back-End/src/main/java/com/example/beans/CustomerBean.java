package com.example.beans;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerBean implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	
	@JsonProperty("id")
	Long customer_id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("surname")
	private String surname;
	@JsonProperty("email")
	private String email;
	@JsonProperty("birthDate")
	private String birthDate;
	
	
	
	//Getters and Setters
	
	@JsonProperty("id")
	public Long getCustomer_id() {
		return customer_id;
	}
	@JsonProperty("id")
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	@JsonProperty("name")
	public String getCustomer_name() {
		return this.name;
	}
	@JsonProperty("name")
	public void setCustomer_name(String customer_name) {
		this.name = customer_name;
	}
	@JsonProperty("surname")
	public String getSurname() {
		return this.surname;
	}
	@JsonProperty("surname")
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@JsonProperty("email")
	public String getEmail() {
		return this.email;
	}
	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}
	@JsonProperty("birthDate")
	public String getBirthDate() {
		return this.birthDate;
	}
	@JsonProperty("birthDate")
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
}

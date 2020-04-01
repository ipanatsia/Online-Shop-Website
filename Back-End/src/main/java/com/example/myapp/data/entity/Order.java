package com.example.myapp.data.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERORDER")
public class Order {
	@Id
	@Column(name="ORDER_ID", unique=true, nullable=false)
	@SequenceGenerator(name="ORDER_SEQUENCE", sequenceName="ORDER_SEQUENCE_ID", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ORDER_SEQUENCE")
	private Long order_id;
	@Column(name="ORDERNAME")
	private String order_name;
	@Column(name="COST")
	private String cost;
	@Column(name="CLIENT_ID")
//	,insertable=false, updatable=false
	private Long client_id;
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn (name="CLIENT_ID", referencedColumnName="CUSTOMER_ID")
//	private Customer customer;
	
	
	
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public long getClient_id() {
		return client_id;
	}
	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}
	
	
	
}

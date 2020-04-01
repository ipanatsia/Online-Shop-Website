package com.example.beans;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderBean {
	@JsonProperty("id")
	private long order_id;
	@JsonProperty("name")
	private String order_name;
	@JsonProperty("cost")
	private String cost;
	@JsonProperty("client_id")
	private long client_id;
	
	
	
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
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
	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}
	
	
	
}

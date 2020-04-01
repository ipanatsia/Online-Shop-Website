package com.example.myapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.business.service.CustomerService;
import com.example.beans.CustomerBean;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {

	@Autowired
	CustomerService customerservice;
	
	@RequestMapping (method = RequestMethod.GET, value="/getAllCustomers")
	public List <CustomerBean> getAllCustomers() {
		return customerservice.getAllCustomers();
		
	}

	@RequestMapping (method = RequestMethod.GET ,value="customer/{id}")
	public CustomerBean  getCustomer(@PathVariable("id") long id) {
		return customerservice.getCustomerByID(id);
	}
	
	
	
	@RequestMapping (method = RequestMethod.POST ,value="/addCustomer")
	public void postCustomer(@RequestBody CustomerBean customerBean) {
		customerservice.postCustomer(customerBean);
	}
	
	
//	@RequestMapping (method = RequestMethod.GET, value="/getTopCustomers")
//	public List <CustomerBean> getTopCustomers() {
//		return customerservice.getTopCustomers();
//		
//	}
//	
	
}
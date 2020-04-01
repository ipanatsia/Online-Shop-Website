package com.example.myapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.beans.OrderBean;
import com.example.myapp.business.service.OrderService;



@RestController
@RequestMapping(value="/orders")
public class OrderController {
	
	@Autowired
	OrderService orderservice;
	
	@RequestMapping (method = RequestMethod.GET, value="/getAllOrders")
	public List <OrderBean> getAllCustomers() {
		return orderservice.getAllOrders();
		
	}

	@RequestMapping (method = RequestMethod.GET ,value="getOrdersByIdy/{id}")
	public OrderBean  getOrder(@PathVariable("id") long id) {
		return orderservice.getOrderByID(id);
	}
	
	@RequestMapping (method = RequestMethod.POST ,value="/addOrder")
	public void postOrder(@RequestBody OrderBean orderBean) {
		orderservice.postOrder(orderBean);
	}
}
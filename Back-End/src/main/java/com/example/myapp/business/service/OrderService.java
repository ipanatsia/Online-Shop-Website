package com.example.myapp.business.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.myapp.data.repository.OrderRepository;
import com.example.beans.OrderBean;
import com.example.myapp.data.entity.Order;

@Service
public class OrderService {

	OrderRepository rep;
	
	@Autowired
	public OrderService(OrderRepository repository) {
		this.rep = repository;
	}
	
	
	public List<OrderBean> getAllOrders(){
		List <Order> orders = this.rep.findAll();  
		List <OrderBean> ordersBean = new ArrayList<>();
		
		for (Order order :  orders) {
			ordersBean.add(this.translatetoBean(order));
		}
		return ordersBean;
	}
	
	public OrderBean getOrderByID(long id) {
		Order a = this.rep.getOne(id);
		return this.translatetoBean(a);
		
	}
	
	public void postOrder(OrderBean a) {
		rep.save(translatetoEntity(a));
		
	}
	
	public OrderBean translatetoBean(Order a) {
		OrderBean b = new OrderBean();
		b.setOrder_id(a.getOrder_id());
		b.setOrder_name(a.getOrder_name());
		b.setCost(a.getCost());
		b.setClient_id(a.getClient_id());
		return b;
	}
	
	public Order translatetoEntity (OrderBean a) {
		Order b = new Order();
		b.setOrder_name(a.getOrder_name());
		b.setCost(a.getCost());
		b.setClient_id(a.getClient_id());
		return b;
	}
		
}

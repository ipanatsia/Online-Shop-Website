package com.example.myapp.business.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.myapp.data.repository.CustomerRepository;
import com.example.beans.CustomerBean;
import com.example.myapp.data.entity.Customer;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository rep;

	public List<CustomerBean> getAllCustomers(){
		List <Customer> customers = this.rep.findAll();  
		List <CustomerBean> customersBean = new ArrayList<>();
		
		for (Customer cust :  customers) {
			customersBean.add(this.translatetoBean(cust));
		}
		return customersBean;
	}
	
//	public List<CustomerBean> getTopCustomers(){
//		List <Customer> customers = this.rep.findAllOrderBy();  
//		List <CustomerBean> customersBean = new ArrayList<>();
//		
//		for (Customer cust :  customers) {
//			customersBean.add(this.translatetoBean(cust));
//		}
//		return customersBean;
//	}
	
	public CustomerBean getCustomerByID(long id) {
		Customer a = this.rep.getOne(id);
		
		return this.translatetoBean(a);
	}
	
	public void postCustomer(CustomerBean a) {
		rep.save(translatetoEntity(a));
		
	}
	
	public CustomerBean translatetoBean (Customer a) {
		
		CustomerBean b=new CustomerBean();
		b.setCustomer_id(a.getCustomer_id());
		b.setCustomer_name(a.getCustomer_name());
		b.setSurname(a.getSurname());
		b.setEmail(a.getEmail());
		b.setBirthDate(a.getBirthDate());
		
		return b;
		
	}
	
	public Customer translatetoEntity (CustomerBean a) {
		Customer b = new Customer();
//		b.setCustomer_id(a.getCustomer_id());
		b.setCustomer_name(a.getCustomer_name());
		b.setSurname(a.getSurname());
		b.setEmail(a.getEmail());
		b.setBirthDate(a.getBirthDate());
		
		return b;
	}
}

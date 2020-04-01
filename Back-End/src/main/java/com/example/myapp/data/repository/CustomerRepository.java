package com.example.myapp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.myapp.data.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer,Long>{
		
}

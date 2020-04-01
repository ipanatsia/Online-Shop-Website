package com.example.myapp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.myapp.data.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository <Order, Long> {

}
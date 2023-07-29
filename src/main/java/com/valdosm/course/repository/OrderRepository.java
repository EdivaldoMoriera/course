package com.valdosm.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdosm.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    
}

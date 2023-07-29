package com.valdosm.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdosm.course.entities.Order;
import com.valdosm.course.repository.OrderRepository;
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> findAll(){
        return orderRepository.findAll(); 
    }
    public Order findById(Integer id){
        Optional<Order> order = orderRepository.findById(id);
        return order.get();

    }
}

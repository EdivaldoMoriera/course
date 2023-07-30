package com.valdosm.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdosm.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}

package com.valdosm.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdosm.course.entities.Product;
import com.valdosm.course.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll(){
        return productRepository.findAll();        
    }

    public Product findById(Integer id){
        Optional<Product> list = productRepository.findById(id);
        return list.get();

    }
}

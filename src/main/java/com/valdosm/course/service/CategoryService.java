package com.valdosm.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdosm.course.entities.Category;
import com.valdosm.course.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> findAll(){
        return categoryRepository.findAll();  
    }
    public Category findById(Integer id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
        
    }
}

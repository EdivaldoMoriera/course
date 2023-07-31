package com.valdosm.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdosm.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}

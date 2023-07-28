package com.valdosm.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdosm.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}

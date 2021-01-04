package com.example.December.repository;

import com.example.December.model.Flower;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Long> {
    
}
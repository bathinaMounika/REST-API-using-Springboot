package com.example.December.repository;

import com.example.December.model.Countries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CountryJpaRepository extends JpaRepository<Countries, Long>{
    
    Countries findByName(String name);
}

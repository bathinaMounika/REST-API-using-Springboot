package com.example.December.service;

import java.util.List;

import com.example.December.model.Flower;
import com.example.December.repository.FlowerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {

    @Autowired
    FlowerRepository flowerRepository;

    public void create(Flower flower){
        flowerRepository.save(flower);
    }

    public List<Flower> getAll(){
        return flowerRepository.findAll();
    }
}

package com.example.December.resource;

import java.util.List;

import com.example.December.model.Flower;
import com.example.December.service.FlowerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/flower")
public class FlowerResource {
    
    @Autowired
    FlowerService flowerService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE , 
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Flower> create(@RequestBody final Flower flower){

        flowerService.create(flower);
        return flowerService.getAll();
    }

    @GetMapping
    public List<Flower> getAll() {
        return flowerService.getAll();
    }
}

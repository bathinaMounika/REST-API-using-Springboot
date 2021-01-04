package com.example.December.controller;

import java.util.List;
import java.util.Optional;

import com.example.December.model.Countries;
import com.example.December.repository.CountryJpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {
    
    @Autowired
    private CountryJpaRepository countryJpaRepository;

    @GetMapping(value="/all")
    public List<Countries> findAll(){
       return  countryJpaRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public Countries findByName(@PathVariable final String name){
        return countryJpaRepository.findByName(name);
    }

    @PostMapping(value = "/load")
    public Countries load(@RequestBody final Countries countries) {
        countryJpaRepository.save(countries);
        return countryJpaRepository.findByName(countries.getName());
    }

    @DeleteMapping(value = "/delete/{name}")
    public List<Countries> delete(@PathVariable final String name){
        countryJpaRepository.delete(countryJpaRepository.findByName(name));
        return countryJpaRepository.findAll(); 
    }

    @PutMapping(value = "/{id}")
    public List<Countries> updateCountries(@RequestBody Countries country, @PathVariable final Long id){
        Optional<Countries> countryOptional = countryJpaRepository.findById(id);
        if(!countryOptional.isPresent()){
            return countryJpaRepository.findAll();
        }

        country.setId(id);
        countryJpaRepository.save(country);
        return countryJpaRepository.findAll();
    }
}

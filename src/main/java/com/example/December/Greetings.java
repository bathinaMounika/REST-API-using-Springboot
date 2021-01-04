package com.example.December;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {
    
    @GetMapping("/greetings")
    public String hello() {
        return "<p style='text-align: center; vertical-align: middle; font-family: monospace; font-size: 50px'>All the best dear</p>";
    }
}

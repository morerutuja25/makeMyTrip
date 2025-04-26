package com.example.makeMyTrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bus {
    public Bus(){

    }
    @GetMapping("/bus")
    public String getData(){
        return "Book you Bus now from Pune to Mumbai";
    }
}

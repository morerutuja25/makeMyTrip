package com.example.makeMyTrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hotels {
    public Hotels(){
    }
    @GetMapping("/hotels")
    public String getData(){
        return "Book your Hotel for Goa location, get 10% discount!!";
    }
}

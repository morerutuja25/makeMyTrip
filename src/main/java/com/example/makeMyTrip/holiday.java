package com.example.makeMyTrip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
public class holiday {

    @GetMapping("/holiday")
    public String getData(){
        return "Book your holiday package for Goa location";
    }
}

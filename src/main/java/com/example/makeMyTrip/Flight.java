package com.example.makeMyTrip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flight {
    @GetMapping ("/Flights")
    public String getData(){
        return "Book your flights from Mumbai to Pune!!";
    }
}

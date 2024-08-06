package com.example.yatra_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotels {

    @GetMapping("/hotels")
    public String getData() {
        return  "Please book your hotels ticket from yatra app on 10% discount" ;
    }
}
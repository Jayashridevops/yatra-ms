package com.example.yatra_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  cabs {

    @GetMapping("/cabs")
    public String getData() {
        return  "Please book your cabs ticket from yatra app on 12% discount" ;
    }
}
package com.example.yatra_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  travalinsurance {

    @GetMapping("/travalinsurance")
    public String getData() {
        return  "Please book your  travalinsurance from yatra app on 25% discount" ;
    }
}
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CTFController {

    @Value("${response1}")
    private String resp1;

    @Value("${response2}")
    private String resp2;

    @Value("${response3}")
    private String resp3;

    @GetMapping("${request1}")
    public String response1(){
        return resp1;
    }

    @GetMapping("${request2}")
    public String response2(){
        return resp2;
    }

    @GetMapping("${request3}")
    public String response3(){
        return resp3;
    }
}

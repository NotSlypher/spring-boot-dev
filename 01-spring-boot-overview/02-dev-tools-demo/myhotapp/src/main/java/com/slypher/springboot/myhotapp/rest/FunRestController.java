package com.slypher.springboot.myhotapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/review")
    public String getReview(){
        return "nice very nice";
    }
}

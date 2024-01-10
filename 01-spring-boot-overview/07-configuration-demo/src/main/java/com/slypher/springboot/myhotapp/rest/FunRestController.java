package com.slypher.springboot.myhotapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Inject property created in application.properties
    @Value("${coach.name}")
    public String coachName;

    @Value("${team.name}")
    public String teamName;

    @GetMapping("/team")
    public String getCoachName() { return "Coach: " + coachName + ", Team: " + teamName; }

    //expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/review")
    public String showReview() { return "yo bro!!!!"; }
}

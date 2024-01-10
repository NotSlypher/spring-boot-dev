package com.slypher.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    private coach class for injection
    private Coach theCoach;

    // Constructor injection
    @Autowired
    public DemoController(Coach coach){
        theCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return theCoach.getDailyWorkout();
    }
}

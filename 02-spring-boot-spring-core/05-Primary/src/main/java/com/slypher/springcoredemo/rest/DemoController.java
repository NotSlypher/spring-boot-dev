package com.slypher.springcoredemo.rest;

import com.slypher.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    private coach class for injection
    private Coach theCoach;

    // Constructor injection with Qualifier
    @Autowired
    public DemoController(Coach coach){
        theCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return theCoach.getDailyWorkout();
    }
}

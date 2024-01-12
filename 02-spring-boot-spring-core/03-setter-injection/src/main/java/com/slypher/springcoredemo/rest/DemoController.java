package com.slypher.springcoredemo.rest;

import com.slypher.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    private coach class for injection
    private Coach theCoach;

    // Setter injection
    @Autowired
    public void setCoach(Coach coach){
        theCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return theCoach.getDailyWorkout();
    }
}

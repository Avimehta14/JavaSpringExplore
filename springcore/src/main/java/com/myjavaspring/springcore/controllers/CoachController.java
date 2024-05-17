package com.myjavaspring.springcore.controllers;

import com.myjavaspring.springcore.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private final Coach myCoach;

    @Autowired
    public CoachController(Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping ("/foorballWorkout")
    public String getDailywork()
    {
        return myCoach.getDailyWorkout();
    }
}

package com.myjavaspring.springcore.controllers;

import com.myjavaspring.springcore.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private final Coach myCoach;

    @Autowired
    public CoachController(@Qualifier("tennisCoach") Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping ("/Workout")
    public String getDailywork()
    {
        return myCoach.getDailyWorkout();
    }
}

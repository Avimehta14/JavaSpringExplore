package com.myjavaspring.springcore.utils;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout()
    {
        return "Best cricket team is India";
    }
}

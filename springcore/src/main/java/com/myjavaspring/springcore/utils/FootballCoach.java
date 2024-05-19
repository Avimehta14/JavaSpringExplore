package com.myjavaspring.springcore.utils;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout()
    {
        return "Practice Kicks daily";
    }
}

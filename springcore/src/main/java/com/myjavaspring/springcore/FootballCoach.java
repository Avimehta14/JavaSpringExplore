package com.myjavaspring.springcore;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout()
    {
        return "Practice Kicks daily";
    }
}

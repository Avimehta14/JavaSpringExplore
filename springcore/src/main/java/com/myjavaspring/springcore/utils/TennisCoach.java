package com.myjavaspring.springcore.utils;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Tennis is a waste sport";
    }
}

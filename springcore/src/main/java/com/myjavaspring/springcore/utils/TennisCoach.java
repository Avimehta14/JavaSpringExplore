package com.myjavaspring.springcore.utils;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {

        System.out.println("HI Tennis");
        return "Tennis is a waste sport";
    }
}

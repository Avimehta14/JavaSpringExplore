package com.myjavaspring.springcore.utils;

import org.springframework.stereotype.Component;

public interface Coach {

    String getDailyWorkout();

    @Component
    class FootballCoach implements Coach {

        @Override
        public String getDailyWorkout()
        {
            return "Practice Kicks daily";
        }
    }
}

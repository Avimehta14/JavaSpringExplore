package com.myjavaspring.springcore.utils;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout()
    {
        return "Best cricket team is India";
    }

    @PostConstruct
    public void afterConstruct()
    {
        System.out.println("Annotation to define any logic to run after bean construction");
    }

    @PreDestroy
    public void beforeDestroy()
    {
        System.out.println("Annotation to define any logic to run before bean destruction");
    }
}

package com.myjavaspring.springcore.config;

import com.myjavaspring.springcore.utils.Coach;
import com.myjavaspring.springcore.utils.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swim()
    {
        return new SwimCoach();
    }
}

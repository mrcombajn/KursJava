package org.example.configurations;

import org.example.beans.coaches.BrandNewCoach;
import org.example.beans.coaches.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public Coach brandNewCoach() {
        return new BrandNewCoach();
    }
}

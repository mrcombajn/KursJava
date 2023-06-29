package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Do ...";
    }
}

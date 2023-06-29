package org.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Qualifier jest ważniejszy od @Primary
//defaultowo inicjalizacja nie jest leniwa

@Component
@Primary
@Lazy
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println(this.getClass().getSimpleName());
    }

    @PostConstruct
    public void startDo() {
        System.out.println("start " + getClass().getSimpleName());
    }

    @PreDestroy
    public void endDo() {
        System.out.println("end " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Do ...";
    }
}

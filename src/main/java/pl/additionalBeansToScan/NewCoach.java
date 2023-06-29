package pl.additionalBeansToScan;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.beans.coaches.Coach;
import org.springframework.stereotype.Component;

@Component
public class NewCoach implements Coach {

    public NewCoach() {
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
        return "Hello I'm new coach";
    }
}

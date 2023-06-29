package pl.additionalBeansToScan;


import org.example.beans.coaches.Coach;
import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {
    @Override
    public String getWorkout() {
        return "Play golf!";
    }
}

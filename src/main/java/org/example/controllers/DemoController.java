package org.example.controllers;

import org.example.beans.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCouch;

    @Autowired
    public DemoController(@Qualifier("newCoach")  Coach coach) {
        this.myCouch = coach;
    }

    @GetMapping("/workout")
    String getWorkout() {
        return myCouch.getWorkout();
    }

}

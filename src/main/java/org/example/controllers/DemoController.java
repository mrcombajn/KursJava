package org.example.controllers;

import org.example.beans.coaches.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCouch;
    private Coach myCouch2;


    //by default both coaches are singletons
    @Autowired
    public DemoController(@Qualifier("newCoach")  Coach coach, @Qualifier("newCoach") Coach coach2) {
        this.myCouch = coach;
        this.myCouch2 = coach2;
    }

    @GetMapping("/workout")
    String getWorkout() {
        return myCouch.getWorkout();
    }

    @GetMapping("/check")
    String getSingletonBeans() {
        return "Comparing beans: myCouch == myCouch2, " + (myCouch == myCouch2);
    }
}
package org.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("Spring")
    private String topicName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello 2";
    }

    @GetMapping("/ok")
    public String getHomeMapping() {
        return "Hello!";
    }

    @GetMapping("/topic")
    public String getTopic() {
        return "Topic " + topicName;
    }

}

package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DateController {

    @GetMapping("/current-time")
    @ResponseBody
    String currentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-dd-MM HH:mm:ss"));
    }

    @GetMapping("/current-year")
    @ResponseBody
    String currentYear() {
        return String.valueOf(LocalDateTime.now().getYear());
    }
}

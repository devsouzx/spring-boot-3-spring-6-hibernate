package com.devsouzx.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workouts")
    public String getDailyWorkout() {
        return "run a hard";
    }

    @GetMapping("/fortune")
    public String lucky() {
        return "today is your lucky day";
    }
}

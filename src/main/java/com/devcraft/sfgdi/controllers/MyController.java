package com.devcraft.sfgdi.controllers;

import com.devcraft.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld() {
        return greetingService.sayGreeting();
    }
}

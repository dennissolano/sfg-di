package com.solanodennis.sfdi.controllers;

import com.solanodennis.sfdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingsService greetingsService;

    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return this.greetingsService.sayGreeting();
    }
}
